package br.alkazuz.terrenos.listeners;

import br.alkazuz.terrenos.Main;
import br.alkazuz.terrenos.utils.TerrenoManager;
import com.sk89q.worldguard.protection.regions.ProtectedRegion;
import net.milkbowl.vault.economy.Economy;
import org.bukkit.Material;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerInteractEvent;
public class SellRegionListener implements org.bukkit.event.Listener {

    @EventHandler(ignoreCancelled = false, priority = org.bukkit.event.EventPriority.HIGHEST)
    public void onBreakSignSell(BlockBreakEvent e) {
        Player player = e.getPlayer();
        if (!player.getWorld().getName().equals("region")) {
            return;
        }
        if (e.getBlock().getType() != org.bukkit.Material.WALL_SIGN && e.getBlock().getType() != org.bukkit.Material.SIGN_POST) {
            return;
        }
        org.bukkit.block.Sign sign = (org.bukkit.block.Sign) e.getBlock().getState();
        if (!isSellSign(sign)) { // if (!isSellSign(sign)) {
            return;
        }
        ProtectedRegion region = TerrenoManager.getProtectedRegion(e.getBlock().getLocation());
        if (region == null) {
            e.getBlock().breakNaturally();
            return;
        }
        e.setCancelled(true);
        if (region.getOwners().contains(player.getName())) {
            e.getBlock().breakNaturally();
            player.sendMessage("§aVocê removeu a placa de venda do seu terreno.");
        }
    }

    @EventHandler(ignoreCancelled = false, priority = org.bukkit.event.EventPriority.HIGHEST)
    public void onRightClickBlockInteract(PlayerInteractEvent e) {
        Player player = e.getPlayer();
        if (!player.getWorld().getName().equals("region")) {
            return;
        }
        if (e.getClickedBlock() == null) {
            return;
        }
        if (e.getClickedBlock().getType() != org.bukkit.Material.WALL_SIGN && e.getClickedBlock().getType() != org.bukkit.Material.SIGN_POST) {
            return;
        }
        if (e.getAction() != org.bukkit.event.block.Action.RIGHT_CLICK_BLOCK) {
            return;
        }
        org.bukkit.block.Sign sign = (org.bukkit.block.Sign) e.getClickedBlock().getState();
        if (!isSellSign(sign)) {
            return;
        }
        e.setCancelled(true);
        ProtectedRegion region = TerrenoManager.getProtectedRegion(e.getClickedBlock().getLocation());
        if (region == null) {
            player.sendMessage("§cEsta placa não está em um terreno.");
            sign.setType(Material.AIR);
            return;
        }

        if (region.getOwners().contains(player.getName())) {
            player.sendMessage("§cVocê  não pode comprar seu próprio terreno.");
            return;
        }

        if (region.getMembers().contains(player.getName())) {
            player.sendMessage("§cVocê  não pode comprar um terreno que você é membro.");
            return;
        }

        int price = Integer.parseInt(sign.getLine(1).replace("§f", "").replace("§a", "").replace(" ", "").replace(".", ""));
        if (price < 0) {
            player.sendMessage("§cO preço deve ser maior que 0.");
            return;
        }

        Economy economy = Main.getInstance().getEconomy();
        if (economy.getBalance(player) < price) {
            player.sendMessage("§cVocê não tem dinheiro suficiente para comprar este terreno.");
            return;
        }

        try {
            TerrenoManager.buyRegion(player, region, price);
            player.sendMessage("§aVocê comprou esse terreno por §f" + economy.format(price) + " coins§a.");
        } catch (Exception ex) {
            ex.printStackTrace();
            player.sendMessage("§c" + ex.getMessage());
        }

    }

    public boolean isSellSign(Sign sign) {
        return sign.getLine(0).equalsIgnoreCase("§e[COMPRAR]");
    }

}
