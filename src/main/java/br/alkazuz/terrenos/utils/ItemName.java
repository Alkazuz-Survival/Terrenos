package br.alkazuz.terrenos.utils;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Item;
import org.bukkit.inventory.ItemStack;

@SuppressWarnings("all")
public enum ItemName {

    AIR__0("Ar"),
    STONE__0("Pedra"),
    STONE__1("Granito"),
    STONE__2("Granito Polido"),
    STONE__3("Diorito"),
    STONE__4("Diorito Polido"),
    STONE__5("Andesito"),
    STONE__6("Andesito Polido"),
    GRASS__0("Bloco de Grama"),
    DIRT__0("Terra"),
    DIRT__1("Terra Grossa"),
    DIRT__2("Podzol"),
    COBBLESTONE__0("Pedregulho"),
    WOOD__0("Tábuas de Carvalho"),
    WOOD__1("Tábuas de Pinheiro"),
    WOOD__2("Tábuas de Eucalipto"),
    WOOD__3("Tábuas de Madeira da Selva"),
    WOOD__4("Tábuas de Acácia"),
    WOOD__5("Tábuas de Carvalho Escuro"),
    SAPLING__0("Muda de Carvalho"),
    SAPLING__1("Muda de Pinheiro"),
    SAPLING__2("Muda de Eucalipto"),
    SAPLING__3("Muda de Árvore da Selva"),
    SAPLING__4("Muda de Acácia"),
    SAPLING__5("Muda de Carvalho Escuro"),
    BEDROCK__0("Rocha Matriz"),
    WATER__0("Água"),
    STATIONARY_WATER__0("Água"),
    LAVA__0("Lava"),
    STATIONARY_LAVA__0("Lava"),
    SAND__0("Areia"),
    SAND__1("Areia Vermelha"),
    GRAVEL__0("Cascalho"),
    GOLD_ORE__0("Minério de Ouro"),
    IRON_ORE__0("Minério de Ferro"),
    COAL_ORE__0("Minério de Carvão"),
    LOG__0("Maderia de Carvalho"),
    LOG__1("Maderia de Pinheiro"),
    LOG__2("Maderia de Eucalipto"),
    LOG__3("Maderia da Selva"),
    LEAVES__0("Folhas de Carvalho"),
    LEAVES__1("Folhas de Pinheiro"),
    LEAVES__2("Folhas de Eucalipto"),
    LEAVES__3("Folhas da Selva "),
    SPONGE__0("Esponja"),
    SPONGE__1("Esponja Molhada"),
    GLASS__0("Vidro"),
    LAPIS_ORE__0("Minério de Lápis-Lazúli"),
    LAPIS_BLOCK__0("Bloco de Lápis-Lazúli"),
    DISPENSER__0("Ejetor"),
    SANDSTONE__0("Arenito"),
    SANDSTONE__1("Arenito Talhado"),
    SANDSTONE__2("Arenito Liso"),
    NOTE_BLOCK__0("Bloco Musical"),
    BED_BLOCK__0("Cama"),
    POWERED_RAIL__0("Trilho Elétrico"),
    DETECTOR_RAIL__0("Trilho Detector"),
    PISTON_STICKY_BASE__0("Pistão Grudento"),
    WEB__0("Teia de Aranha"),
    LONG_GRASS__0("Arbusto"),
    LONG_GRASS__1("Grama"),
    LONG_GRASS__2("Samambaia"),
    DEAD_BUSH__0("Arbusto Morto"),
    PISTON_BASE__0("Pistão"),
    PISTON_EXTENSION__0("Pistão"),
    WOOL__0("Lã Branca"),
    WOOL__1("Lã Laranja"),
    WOOL__2("Lã Magenta"),
    WOOL__3("Lã Azul Clara"),
    WOOL__4("Lã Amarela"),
    WOOL__5("Lã Verde Limão"),
    WOOL__6("Lã Rosa"),
    WOOL__7("Lã Cinza"),
    WOOL__8("Lã Cinza Clara"),
    WOOL__9("Lã Ciano"),
    WOOL__10("Lã Roxa"),
    WOOL__11("Lã Azul"),
    WOOL__12("Lã Marrom"),
    WOOL__13("Lã Verde"),
    WOOL__14("Lã Vermelha"),
    WOOL__15("Lã Preta"),
    PISTON_MOVING_PIECE__0("Pistão"),
    YELLOW_FLOWER__0("Dente-de-Leão"),
    RED_ROSE__0("Popula"),
    RED_ROSE__1("Orquídea Azul"),
    RED_ROSE__2("Hortência"),
    RED_ROSE__3("Flor Silvestre Azul"),
    RED_ROSE__4("Tulipa Vermelha"),
    RED_ROSE__5("Tulipa Laranja"),
    RED_ROSE__6("Tulipa Branca"),
    RED_ROSE__7("Tulipa Rosa"),
    RED_ROSE__8("Margarida"),
    BROWN_MUSHROOM__0("Cogumelo"),
    RED_MUSHROOM__0("Cogumelo"),
    GOLD_BLOCK__0("Bloco de Ouro"),
    IRON_BLOCK__0("Bloco de Ferro"),
    DOUBLE_STEP__0("Laje Dupla de Pedra"),
    DOUBLE_STEP__1("Laje Dupla de Arenito"),
    DOUBLE_STEP__2("Laje Dupla de Madeira"),
    DOUBLE_STEP__3("Laje Dupla de Pedregulho"),
    DOUBLE_STEP__4("Laje Dupla de Tijolos"),
    DOUBLE_STEP__5("Laje Dupla de Tijolos de Pedra"),
    DOUBLE_STEP__6("Laje Dupla de Tijolos do Nether"),
    DOUBLE_STEP__7("Laje Dupla de Quartzo"),
    STEP__0("Laje de Pedra"),
    STEP__1("Laje de Arenito"),
    STEP__2("Laje de Madeira"),
    STEP__3("Laje de Pedregulho"),
    STEP__4("Laje de Tijolos"),
    STEP__5("Laje de Tijolos de Pedra"),
    STEP__6("Laje de Tijolos do Nether"),
    STEP__7("Laje de Quartzo"),
    BRICK__0("Tijolos"),
    TNT__0("Dinamite"),
    BOOKSHELF__0("Estante"),
    MOSSY_COBBLESTONE__0("Pedra com Musgo"),
    OBSIDIAN__0("Obsidiana"),
    TORCH__0("Tocha"),
    FIRE__0("Fogo"),
    MOB_SPAWNER__0("Gerador de Monstros"),
    WOOD_STAIRS__0("Escadas de Carvalho"),
    CHEST__0("Baú"),
    REDSTONE_WIRE__0("Pó de Redstone"),
    DIAMOND_ORE__0("Minério de Diamante"),
    DIAMOND_BLOCK__0("Bloco de Diamante"),
    WORKBENCH__0("Bancada de Trabalho"),
    CROPS__0("Plantação"),
    SOIL__0("Terra Arada"),
    FURNACE__0("Fornalha"),
    BURNING_FURNACE__0("Fornalha"),
    SIGN_POST__0("Placa"),
    WOODEN_DOOR__0("Porta de Madeira"),
    LADDER__0("Escada"),
    RAILS__0("Trilho"),
    COBBLESTONE_STAIRS__0("Escadas de Pedra"),
    WALL_SIGN__0("Placa"),
    LEVER__0("Alavanca"),
    STONE_PLATE__0("Placa de Pressão de Pedra"),
    IRON_DOOR_BLOCK__0("Porta de Ferro"),
    WOOD_PLATE__0("Placa de Pressão de Madeira"),
    REDSTONE_ORE__0("Minério de Redstone"),
    GLOWING_REDSTONE_ORE__0("Minério de Redstone"),
    REDSTONE_TORCH_OFF__0("Tocha de Redstone"),
    REDSTONE_TORCH_ON__0("Tocha de Restone"),
    STONE_BUTTON__0("Botão"),
    SNOW__0("Neve"),
    ICE__0("Gelo"),
    SNOW_BLOCK__0("Neve"),
    CACTUS__0("Cacto"),
    CLAY__0("Argila"),
    SUGAR_CANE_BLOCK__0("Canas de Açucar"),
    JUKEBOX__0("Jukebox"),
    FENCE__0("Cerca de Carvalho"),
    PUMPKIN__0("Abóbora"),
    NETHERRACK__0("Rocha do Nether"),
    SOUL_SAND__0("Areia de Almas"),
    GLOWSTONE__0("Pedra Luminosa"),
    PORTAL__0("Portal"),
    JACK_O_LANTERN__0("Abóbora de Halloween"),
    CAKE_BLOCK__0("Bolo"),
    DIODE_BLOCK_OFF__0("Repetidor de Redstone"),
    DIODE_BLOCK_ON__0("Repetidor de Redstone"),
    STAINED_GLASS__0("Vidro Tingido de Branco"),
    STAINED_GLASS__1("Vidro Tingido de Laranja"),
    STAINED_GLASS__2("Vidro Tingido de Magenta"),
    STAINED_GLASS__3("Vidro Tingido de Azul Claro"),
    STAINED_GLASS__4("Vidro Tingido de Amarelo"),
    STAINED_GLASS__5("Vidro Tingido de Verde Limão"),
    STAINED_GLASS__6("Vidro Tingido de Rosa"),
    STAINED_GLASS__7("Vidro Tingido de Cinza"),
    STAINED_GLASS__8("Vidro Tingido de Cinza Claro"),
    STAINED_GLASS__9("Vidro Tingido de Ciano"),
    STAINED_GLASS__10("Vidro Tingido de Lilás"),
    STAINED_GLASS__11("Vidro Tingido de Azul"),
    STAINED_GLASS__12("Vidro Tingido de Marrom"),
    STAINED_GLASS__13("Vidro Tingido de Verde"),
    STAINED_GLASS__14("Vidro Tingido de Vermelho"),
    STAINED_GLASS__15("Vidro Tingido de Preto"),
    LOCKED_CHEST__0("Baú Trancado"),
    TRAP_DOOR__0("Alçapão de Madeira"),
    MONSTER_EGGS__0("Ovo de Monstro de Pedra"),
    MONSTER_EGGS__1("Ovo de Monstro de Pedregulho"),
    MONSTER_EGGS__2("Ovo de Monstro de Tijolos de Pedra"),
    MONSTER_EGGS__3("Ovo de Monstro de Tijolos de Pedra com Musgo"),
    MONSTER_EGGS__4("Ovo de Monstro de Tijolos de Pedra Rachados"),
    MONSTER_EGGS__5("Ovo de Monstro de Tijolos de Pedra Talhados"),
    SMOOTH_BRICK__0("Tijolos de Pedra"),
    SMOOTH_BRICK__1("Tijolos de Pedra com Musgo"),
    SMOOTH_BRICK__2("Tijolos de Pedra Rachados"),
    SMOOTH_BRICK__3("Tijolos de Pedra Talhados"),
    HUGE_MUSHROOM_1__0("Bloco de Cogumelo"),
    HUGE_MUSHROOM_2__0("Bloco de Cogumelo"),
    IRON_FENCE__0("Barras de Ferro"),
    THIN_GLASS__0("Painel de Vidro"),
    MELON_BLOCK__0("Melancia"),
    PUMPKIN_STEM__0("Plantação de Abóbora"),
    MELON_STEM__0("Plantação de Melancia"),
    VINE__0("Vinhas"),
    FENCE_GATE__0("Portão de Carvalho"),
    BRICK_STAIRS__0("Escadas de Tijolos"),
    SMOOTH_STAIRS__0("Escadas de Tijolos de Pedra"),
    MYCEL__0("Micélio"),
    WATER_LILY__0("Vitória-Régia"),
    NETHER_BRICK__0("Tijolos do Nether"),
    NETHER_FENCE__0("Cerca de Tijolos do Nether"),
    NETHER_BRICK_STAIRS__0("Escadas de Tijolos do Nether"),
    NETHER_WARTS__0("Plantação de Fungo do Nether"),
    ENCHANTMENT_TABLE__0("Mesa de Encantamentos"),
    BREWING_STAND__0("Suporte de Poções"),
    CAULDRON__0("Caldeirão"),
    ENDER_PORTAL__0("Portal"),
    ENDER_PORTAL_FRAME__0("Portal do Fim"),
    ENDER_STONE__0("Pedra do Fim"),
    DRAGON_EGG__0("Ovo do dragão"),
    REDSTONE_LAMP_OFF__0("Lâmpada de Redstone"),
    REDSTONE_LAMP_ON__0("Lâmpada de Redstone"),
    WOOD_DOUBLE_STEP__0("Laje Dupla de Carvalho"),
    WOOD_DOUBLE_STEP__1("Laje Dupla de Pinheiro"),
    WOOD_DOUBLE_STEP__2("Laje Dupla de Eucalipto"),
    WOOD_DOUBLE_STEP__3("Laje Dupla de Madeira da Selva"),
    WOOD_DOUBLE_STEP__4("Laje Dupla de Acácia"),
    WOOD_DOUBLE_STEP__5("Laje Dupla de Carvalho Escuro"),
    WOOD_STEP__0("Laje de Carvalho"),
    WOOD_STEP__1("Laje de Pinheiro"),
    WOOD_STEP__2("Laje de Eucalipto"),
    WOOD_STEP__3("Laje de Madeira da Selva"),
    WOOD_STEP__4("Laje de Acácia"),
    WOOD_STEP__5("Laje de Carvalho Escuro"),
    COCOA__0("Cacau"),
    SANDSTONE_STAIRS__0("Escadas de Arenito"),
    EMERALD_ORE__0("Minério de Esmeralda"),
    ENDER_CHEST__0("Baú do Fim"),
    TRIPWIRE_HOOK__0("Gancho de Armadilha"),
    TRIPWIRE__0("Gancho de Armadilha"),
    EMERALD_BLOCK__0("Bloco de Esmeralda"),
    SPRUCE_WOOD_STAIRS__0("Escadas de Pinheiro"),
    BIRCH_WOOD_STAIRS__0("Escadas de Eucalipto"),
    JUNGLE_WOOD_STAIRS__0("Escadas de Madeira da Selva"),
    COMMAND__0("Bloco de Comando"),
    BEACON__0("Sinalizador"),
    COBBLE_WALL__0("Parede de Pedregulho"),
    COBBLE_WALL__1("Parede de Pedregulho com Musgo"),
    FLOWER_POT__0("Vaso de Flor"),
    CARROT__0("Plantação de Cenouras"),
    POTATO__0("Plantação de Batatas"),
    WOOD_BUTTON__0("Botão"),
    SKULL__0("Cabeça"),
    ANVIL__0("Bigorna"),
    ANVIL__1("Bigorna Ligeiramente Danificada"),
    ANVIL__2("Bigorna Muito Danificada"),
    TRAPPED_CHEST__0("Baú com Armadilha"),
    GOLD_PLATE__0("Placa de Pressão de Pesagem (leve)"),
    IRON_PLATE__1("Placa de Pressão de Pesagem (pesada)"),
    REDSTONE_COMPARATOR_OFF__0("Comparador de Redstone"),
    REDSTONE_COMPARATOR_ON__0("Comparador de Redstone"),
    DAYLIGHT_DETECTOR__0("Sensor de Luz Solar"),
    REDSTONE_BLOCK__0("Bloco de Redstone"),
    QUARTZ_ORE__0("Minério de Quartzo"),
    HOPPER__0("Funil"),
    QUARTZ_BLOCK__0("Bloco de Quartzo"),
    QUARTZ_BLOCK__1("Bloco de Quartzo Talhado"),
    QUARTZ_BLOCK__2("Pilar de Quartzo"),
    QUARTZ_STAIRS__0("Escadas de Quartzo"),
    ACTIVATOR_RAIL("Trilho Ativador"),
    DROPPER("Liberador"),
    STAINED_CLAY__0("Argila Tingida de Branco"),
    STAINED_CLAY__1("Argila Tingida de Laranja"),
    STAINED_CLAY__2("Argila Tingida de Magenta"),
    STAINED_CLAY__3("Argila Tingida de Azul Claro"),
    STAINED_CLAY__4("Argila Tingida de Amarelo"),
    STAINED_CLAY__5("Argila Tingida de Verde Limão"),
    STAINED_CLAY__6("Argila Tingida de Rosa"),
    STAINED_CLAY__7("Argila Tingida de Cinza"),
    STAINED_CLAY__8("Argila Tingida de Cinza Claro"),
    STAINED_CLAY__9("Argila Tingida de Ciano"),
    STAINED_CLAY__10("Argila Tingida de Lilás"),
    STAINED_CLAY__11("Argila Tingida de Azul"),
    STAINED_CLAY__12("Argila Tingida de Marrom"),
    STAINED_CLAY__13("Argila Tingida de Verde"),
    STAINED_CLAY__14("Argila Tingida de Vermelho"),
    STAINED_CLAY__15("Argila Tingida de Preto"),
    STAINED_GLASS_PANE__0("Painel de Vidro Tingido de Branco"),
    STAINED_GLASS_PANE__1("Painel de Vidro Tingido de Laranja"),
    STAINED_GLASS_PANE__2("Painel de Vidro Tingido de Magenta"),
    STAINED_GLASS_PANE__3("Painel de Vidro Tingido de Azul Claro"),
    STAINED_GLASS_PANE__4("Painel de Vidro Tingido de Amarelo"),
    STAINED_GLASS_PANE__5("Painel de Vidro Tingido de Verde Limão"),
    STAINED_GLASS_PANE__6("Painel de Vidro Tingido de Rosa"),
    STAINED_GLASS_PANE__7("Painel de Vidro Tingido de Cinza"),
    STAINED_GLASS_PANE__8("Painel de Vidro Tingido de Cinza Claro"),
    STAINED_GLASS_PANE__9("Painel de Vidro Tingido de Ciano"),
    STAINED_GLASS_PANE__10("Painel de Vidro Tingido de Lilás"),
    STAINED_GLASS_PANE__11("Painel de Vidro Tingido de Azul"),
    STAINED_GLASS_PANE__12("Painel de Vidro Tingido de Marrom"),
    STAINED_GLASS_PANE__13("Painel de Vidro Tingido de Verde"),
    STAINED_GLASS_PANE__14("Painel de Vidro Tingido de Vermelho"),
    STAINED_GLASS_PANE__15("Painel de Vidro Tingido de Preto"),
    LEAVES_2__0("Folhas de Acácia"),
    LEAVES_2__1("Folhas de Carvalho Escuro"),
    LOG_2__0("Madeira de Acácia"),
    LOG_2__1("Madeira de Carvalho Escuro"),
    ACACIA_STAIRS__0("Escadas de Acácia"),
    DARK_OAK_STAIRS__0("Escadas de Carvalho Escuro"),
    SLIME_BLOCK__0("Bloco de Slime"),
    BARRIER__0("Barreira"),
    IRON_TRAPDOOR__0("Alçapão de Ferro"),
    PRISMARINE__0("Prismarinho"),
    PRISMARINE__1("Tijolos de Prismarinho"),
    PRISMARINE__2("Prismarinho Escuro"),
    SEA_LANTERN__0("Lanterna do Mar"),
    HAY_BLOCK__0("Fardo de Feno"),
    CARPET__0("Carpete"),
    CARPET__1("Carpete Laranja"),
    CARPET__2("Carpete Magenta"),
    CARPET__3("Carpete Azul Claro"),
    CARPET__4("Carpete Amarelo"),
    CARPET__5("Carpete Verde Limão"),
    CARPET__6("Carpete Rosa"),
    CARPET__7("Carpete Cinza"),
    CARPET__8("Carpete Cinza Claro"),
    CARPET__9("Carpete Ciano"),
    CARPET__10("Carpete Lilás"),
    CARPET__11("Carpete Azul"),
    CARPET__12("Carpete Marrom"),
    CARPET__13("Carpete Verde"),
    CARPET__14("Carpete Vermelho"),
    CARPET__15("Carpete Preto"),
    HARD_CLAY__0("Argila Endurecida"),
    COAL_BLOCK__0("Bloco de Carvão"),
    PACKED_ICE__0("Gelo Compactado"),
    DOUBLE_PLANT__0("Girassol"),
    DOUBLE_PLANT__1("Lilás"),
    DOUBLE_PLANT__2("Grama Alta"),
    DOUBLE_PLANT__3("Samambaia Grande"),
    DOUBLE_PLANT__4("Roseira"),
    DOUBLE_PLANT__5("Peônia"),
    STANDING_BANNER__0("Estandarte"),
    WALL_BANNER__0("Estandarte"),
    DAYLIGHT_DETECTOR_INVERTED__0("Sensor de Luz Solar"),
    RED_SANDSTONE__0("Arenito Vermelho"),
    RED_SANDSTONE__1("Arenito Vermelho Talhado"),
    RED_SANDSTONE__2("Arenito Vermelho Liso"),
    RED_SANDSTONE_STAIRS__0("Escadas de Arenito Vermelho"),
    DOUBLE_STONE_SLAB2__0("Laje Dupla de Arenito Vermelho"),
    STONE_SLAB2__0("Laje de Arenito Vermelho"),
    SPRUCE_FENCE_GATE__0("Portão de Pinheiro"),
    BIRCH_FENCE_GATE__0("Portão de Eucalipto"),
    JUNGLE_FENCE_GATE__0("Portão de Madeira da Selva"),
    DARK_OAK_FENCE_GATE__0("Portão de Carvalho Escuro"),
    ACACIA_FENCE_GATE__0("Portão de Acácia"),
    SPRUCE_FENCE__0("Cerca de Pinhero"),
    BIRCH_FENCE__0("Cerca de Eucalipto"),
    JUNGLE_FENCE__0("Cerca de Madeira da Selva"),
    DARK_OAK_FENCE__0("Cerca de Carvalho Escuro"),
    ACACIA_FENCE__0("Cerca de Acácia"),
    SPRUCE_DOOR__0("Porta de Pinheiro"),
    BIRCH_DOOR__0("Porta de Eucalipto"),
    JUNGLE_DOOR__0("Porta de Madeira da Selva"),
    ACACIA_DOOR__0("Porta de Acácia"),
    DARK_OAK_DOOR__0("Porta de Carvalho Escuro"),
    END_ROD__0("Lâmpada do End"),
    CHORUS_PLANT__0("Planta do Coro"),
    CHORUS_FLOWER__0("Flor do Coro"),
    PURPUR_BLOCK__0("Bloco de Púrpura"),
    PURPUR_PILLAR__0("Pilar de Púrpura"),
    PURPUR_STAIRS__0("Escadas de Púrpura"),
    PURPUR_DOUBLE_SLAB__0("Laje Dupla de Púrpura"),
    PURPUR_SLAB__0("Laje de Púrpura"),
    END_BRICKS__0("Tijolos de Pedra do Fim"),
    BEETROOT_BLOCK__0("Plantação de Beterraba"),
    GRASS_PATH__0("Caminho de Grama"),
    END_GATEWAY__0("Portal do Fim"),
    COMMAND_REPEATING__0("Bloco de Comando em Repetição"),
    COMMAND_CHAIN__0("Bloco de Comando em Cadeia"),
    FROSTED_ICE__0("Gelo Compactado"),
    MAGMA__0("Bloco de Magma"),
    NETHER_WART_BLOCK__0("Bloco de Fungos do Nether"),
    RED_NETHER_BRICK__0("Tijolos Vermelhos do Nether"),
    BONE_BLOCK__0("Bloco de Ossos"),
    STRUCTURE_VOID__0("Vazio da Estrutura"),
    OBSERVER__0("Observador"),
    WHITE_SHULKER_BOX__0("Caixa de Shulker Branca"),
    ORANGE_SHULKER_BOX__0("Caixa de Shulker Laranja"),
    MAGENTA_SHULKER_BOX__0("Caixa de Shulker Magenta"),
    LIGHT_BLUE_SHULKER_BOX__0("Caixa de Shulker Azul Clara"),
    YELLOW_SHULKER_BOX__0("Caixa de Shulker Amarela"),
    LIME_SHULKER_BOX__0("Caixa de Shulker Verde Limão"),
    PINK_SHULKER_BOX__0("Caixa de Shulker Rosa"),
    GRAY_SHULKER_BOX__0("Caixa de Shulker Cinza"),
    SILVER_SHULKER_BOX__0("Caixa de Shulker Cinza Clara"),
    CYAN_SHULKER_BOX__0("Caixa de Shulker Ciano"),
    PURPLE_SHULKER_BOX__0("Caixa de Shulker Roxa"),
    BLUE_SHULKER_BOX__0("Caixa de Shulker Azul"),
    BROWN_SHULKER_BOX__0("Caixa de Shulker Marrom"),
    GREEN_SHULKER_BOX__0("Caixa de Shulker Verde"),
    RED_SHULKER_BOX__0("Caixa de Shulker Vermelha"),
    BLACK_SHULKER_BOX__0("Caixa de Shulker Preta"),
    WHITE_GLAZED_TERRACOTTA__0("Azulejo Branco"),
    ORANGE_GLAZED_TERRACOTTA__0("Azulejo Laranja"),
    MAGENTA_GLAZED_TERRACOTTA__0("Azulejo Magenta"),
    LIGHT_BLUE_GLAZED_TERRACOTTA__0("Azulejo Azul Claro"),
    YELLOW_GLAZED_TERRACOTTA__0("Azulejo Amrelo"),
    LIME_GLAZED_TERRACOTTA__0("Azulejo Verde Limão"),
    PINK_GLAZED_TERRACOTTA__0("Azulejo Rosa"),
    GRAY_GLAZED_TERRACOTTA__0("Azulejo Cinza"),
    SILVER_GLAZED_TERRACOTTA__0("Azulejo Cinza Claro"),
    CYAN_GLAZED_TERRACOTTA__0("Azulejo Ciano"),
    PURPLE_GLAZED_TERRACOTTA__0("Azulejo Roxo"),
    BLUE_GLAZED_TERRACOTTA__0("Azulejo Azul"),
    BROWN_GLAZED_TERRACOTTA__0("Azulejo Marrom"),
    GREEN_GLAZED_TERRACOTTA__0("Azulejo Verde"),
    RED_GLAZED_TERRACOTTA__0("Azulejo Vermelho"),
    BLACK_GLAZED_TERRACOTTA__0("Azulejo Preto"),
    CONCRETE__0("Concreto Branco"),
    CONCRETE__1("Concreto Laranja"),
    CONCRETE__2("Concreto Magenta"),
    CONCRETE__3("Concreto Azul Claro"),
    CONCRETE__4("Concreto Amarelo"),
    CONCRETE__5("Concreto Verde Limão"),
    CONCRETE__6("Concreto Rosa"),
    CONCRETE__7("Concreto Cinza"),
    CONCRETE__8("Concreto Cinza Claro"),
    CONCRETE__9("Concreto Ciano"),
    CONCRETE__10("Concreto Roxo"),
    CONCRETE__11("Concreto Azul"),
    CONCRETE__12("Concreto Marrom"),
    CONCRETE__13("Concreto Verde"),
    CONCRETE__14("Concreto Vermelho"),
    CONCRETE__15("Concreto Preto"),
    CONCRETE_POWDER__0("Cimento Branco"),
    CONCRETE_POWDER__1("Cimento Laranja"),
    CONCRETE_POWDER__2("Cimento Magenta"),
    CONCRETE_POWDER__3("Cimento Azul Claro"),
    CONCRETE_POWDER__4("Cimento Amarelo"),
    CONCRETE_POWDER__5("Cimento Verde Limão"),
    CONCRETE_POWDER__6("Cimento Rosa"),
    CONCRETE_POWDER__7("Cimento Cinza"),
    CONCRETE_POWDER__8("Cimento Cinza Claro"),
    CONCRETE_POWDER__9("Cimento Ciano"),
    CONCRETE_POWDER__10("Cimento Roxo"),
    CONCRETE_POWDER__11("Cimento Azul"),
    CONCRETE_POWDER__12("Cimento Marrom"),
    CONCRETE_POWDER__13("Cimento Verde"),
    CONCRETE_POWDER__14("Cimento Vermelho"),
    CONCRETE_POWDER__15("Cimento Preto"),
    STRUCTURE_BLOCK__0("Bloco de Estrutura"), // 255
    IRON_SPADE__0("Pá de Ferro"),
    IRON_PICKAXE__0("Picareta de Ferro"),
    IRON_AXE__0("Machado de Ferro"),
    FLINT_AND_STEEL__0("Isqueiro"),
    APPLE__0("Maça"),
    BOW__0("Arco"),
    ARROW__0("Flecha"),
    COAL__0("Carvão"),
    COAL__1("Carvão Vegetal"),
    DIAMOND__0("Diamante"),
    IRON_INGOT__0("Barra de Ferro"),
    GOLD_INGOT__0("Barra de Ouro"),
    IRON_SWORD__0("Espada de Ferro"),
    WOOD_SWORD__0("Espara de Madeira"),
    WOOD_SPADE__0("Pá de Madeira"),
    WOOD_PICKAXE__0("Picareta de Madeira"),
    WOOD_AXE__0("Machado de Madeira"),
    STONE_SWORD__0("Espada de Pedra"),
    STONE_SPADE__0("Pá de Pedra"),
    STONE_PICKAXE__0("Picareta de Pedra "),
    STONE_AXE__0("Machado de Pedra"),
    DIAMOND_SWORD__0("Espada de Diamante"),
    DIAMOND_SPADE__0("Pá de Diamante"),
    DIAMOND_PICKAXE__0("Picareta de Diamante"),
    DIAMOND_AXE__0("Machado de Diamante"),
    STICK__0("Graveto"),
    BOWL__0("Tigela"),
    MUSHROOM_SOUP__0("Ensopado de Cogumelos"),
    GOLD_SWORD__0("Espada de Ouro"),
    GOLD_SPADE__0("Pá de Ouro"),
    GOLD_PICKAXE__0("Picareta de Ouro"),
    GOLD_AXE__0("Machado de Ouro"),
    STRING__0("Linha"),
    FEATHER__0("Pena"),
    SULPHUR__0("Pólvora"),
    WOOD_HOE__0("Enxada de Madeira"),
    STONE_HOE__0("Enxada de Pedra"),
    IRON_HOE__0("Enxada de Ferro"),
    DIAMOND_HOE__0("Enxada de Diamante"),
    GOLD_HOE__0("Enxada de Ouro"),
    SEEDS__0("Sementes"),
    WHEAT__0("Trigo"),
    BREAD__0("Pão"),
    LEATHER_HELMET__0("Capuz de Couro"),
    LEATHER_CHESTPLATE__0("Túnica de Couro"),
    LEATHER_LEGGINGS__0("Calças de Couro"),
    LEATHER_BOOTS__0("Botas de Couro"),
    CHAINMAIL_HELMET__0("Capacete de Cota de Malha"),
    CHAINMAIL_CHESTPLATE__0("Peitoral de Cota de Malha"),
    CHAINMAIL_LEGGINGS__0("Calças de Cota de Malha"),
    CHAINMAIL_BOOTS__0("Botas de Cota de Malha"),
    IRON_HELMET__0("Capacete de Ferro"),
    IRON_CHESTPLATE__0("Peitoral de Ferro"),
    IRON_LEGGINGS__0("Calças de Ferro"),
    IRON_BOOTS__0("Botas de Ferro"),
    DIAMOND_HELMET__0("Capacete de Diamante"),
    DIAMOND_CHESTPLATE__0("Peitoral de Diamante"),
    DIAMOND_LEGGINGS__0("Calças de Diamante"),
    DIAMOND_BOOTS__0("Botas de Diamante"),
    GOLD_HELMET__0("Capacete de Ouro"),
    GOLD_CHESTPLATE__0("Peitoral de Ouro"),
    GOLD_LEGGINGS__0("Calças de Ouro"),
    GOLD_BOOTS__0("Botas de Ouro"),
    FLINT__0("Pederneira"),
    PORK__0("Carne de Porco Crua"),
    GRILLED_PORK__0("Carne de Porco Assada"),
    PAINTING__0("Pintura"),
    GOLDEN_APPLE__0("Maça Dourada"),
    GOLDEN_APPLE__1("Maça Dourada"),
    SIGN__0("Placa"),
    WOOD_DOOR__0("Porta de Carvalho"),
    BUCKET__0("Balde"),
    WATER_BUCKET__0("Balde de Água"),
    LAVA_BUCKET__0("Balde de Lava"),
    MINECART__0("Carrinho"),
    SADDLE__0("Sela"),
    IRON_DOOR__0("Porta de Ferro"),
    REDSTONE__0("Redstone"),
    SNOW_BALL__0("Bola de Neve"),
    BOAT__0("Bote"),
    LEATHER__0("Couro"),
    MILK_BUCKET__0("Balde de Leite"),
    CLAY_BRICK__0("Tijolo"),
    CLAY_BALL__0("Argila"),
    SUGAR_CANE__0("Canas de Açucar"),
    PAPER__0("Papel"),
    BOOK__0("Livro"),
    SLIME_BALL__0("Gosma de Slime"),
    STORAGE_MINECART__0("Carrinho Com Baú"),
    POWERED_MINECART__0("Carrinho Com Fornalha"),
    EGG__0("Ovo"),
    COMPASS__0("Bússola"),
    FISHING_ROD__0("Vara de Pescar"),
    WATCH__0("Relógio"),
    GLOWSTONE_DUST__0("Pó de Pedra Luminosa"),
    RAW_FISH__0("Peixe Cru"),
    RAW_FISH__1("Salmão Cru"),
    RAW_FISH__2("Peixe-palhaço"),
    RAW_FISH__3("Baiacu"),
    COOKED_FISH__0("Peixe Assado"),
    COOKED_FISH__1("Salmão Assado"),
    INK_SACK__0("Bolsa de Tinta"),
    INK_SACK__1("Vermelho da Rosa"),
    INK_SACK__2("Verde do Cacto"),
    INK_SACK__3("Sementes de Cacau"),
    INK_SACK__4("Lápis-lazúli"),
    INK_SACK__5("Corante Lilás"),
    INK_SACK__6("Corante Ciano"),
    INK_SACK__7("Corante Cinza Claro"),
    INK_SACK__8("Corante Cinza"),
    INK_SACK__9("Corante Rosa"),
    INK_SACK__10("Corante Verde Limão"),
    INK_SACK__11("Amarelo do Dente-de-Leão"),
    INK_SACK__12("Corante Azul Claro"),
    INK_SACK__13("Corante Magenta"),
    INK_SACK__14("Corante Laranja"),
    INK_SACK__15("Farinha de Osso"),
    BONE__0("Osso"),
    SUGAR__0("Açúcar"),
    CAKE__0("Bolo"),
    BED__0("Cama"),
    DIODE__0("Repetidor de Redstone"),
    COOKIE__0("Biscoito"),
    MAP__0("Mapa"),
    SHEARS__0("Tesourão"),
    MELON__0("Melancia"),
    PUMPKIN_SEEDS__0("Sementes de Abóbora"),
    MELON_SEEDS__0("Sementes de Melancia"),
    RAW_BEEF__0("Bife Cru"),
    COOKED_BEEF__0("Filé"),
    RAW_CHICKEN__0("Frango Cru"),
    COOKED_CHICKEN__0("Frango Assado"),
    ROTTEN_FLESH__0("Carne Podre"),
    ENDER_PEARL__0("Pérola do Fim"),
    BLAZE_ROD__0("Vara incandescente"),
    GHAST_TEAR__0("Lágrima de Ghast"),
    GOLD_NUGGET__0("Pepita de Ouro"),
    NETHER_STALK__0("Fungo do Nether"),
    POTION__0("Poção"),
    GLASS_BOTTLE__0("Frasco de Vidro"),
    SPIDER_EYE__0("Olho de Aranha"),
    FERMENTED_SPIDER_EYE__0("Olho de Aranha Fermentado"),
    BLAZE_POWDER__0("Pó de Blaze"),
    MAGMA_CREAM__0("Creme de Magma"),
    BREWING_STAND_ITEM__0("Suporte de Poções"),
    CAULDRON_ITEM__0("Caldeirão"),
    EYE_OF_ENDER__0("Olho do Fim"),
    SPECKLED_MELON__0("Melancia Reluzente"),
    MONSTER_EGG__0("Ovo de Monstro"),
    EXP_BOTTLE__0("Frasco de Experiência"),
    FIREBALL__0("Bola de Fogo"),
    BOOK_AND_QUILL__0("Pena e Livro"),
    WRITTEN_BOOK__0("Livro Escrito"),
    EMERALD__0("Esmeralda"),
    ITEM_FRAME__0("Moldura"),
    FLOWER_POT_ITEM__0("Vaso de Flor"),
    CARROT_ITEM__0("Cenoura"),
    POTATO_ITEM__0("Batata"),
    BAKED_POTATO__0("Batata Assada"),
    POISONOUS_POTATO__0("Batata Venenosa"),
    EMPTY_MAP__0("Mapa em Branco"),
    GOLDEN_CARROT__0("Cenoura Dourada"),
    SKULL_ITEM__0("Crânio de Esqueleto"),
    SKULL_ITEM__1("Crânio de Esqueleto whiter"),
    SKULL_ITEM__2("Cabeça de zumbi"),
    SKULL_ITEM__3("Cabeça"),
    SKULL_ITEM__4("Cabeça de Creeper"),
    SKULL_ITEM__5("Cabeça de Dragão"),
    CARROT_STICK__0("Vara de Pesca com Cenoura"),
    NETHER_STAR__0("Estrela do Nether"),
    PUMPKIN_PIE__0("Torta de Abóbora"),
    FIREWORK__0("Fogos de Artifício"),
    FIREWORK_CHARGE__0("Estrela de Fogos de Artifício"),
    ENCHANTED_BOOK__0("Livro Encantado"),
    REDSTONE_COMPARATOR__0("Comparador de Redstone"),
    NETHER_BRICK_ITEM__0("Tijolo do Nether"),
    QUARTZ__0("Quartzo do Nether"),
    EXPLOSIVE_MINECART__0("Carrinho com Dinamite"),
    HOPPER_MINECART__0("Carrinho com Funil"),
    PRISMARINE_SHARD__0("Fragmento de Prismarinho"),
    PRISMARINE_CRYSTALS__0("Cristais de Prismarinho"),
    RABBIT__0("Coelho Cru"),
    COOKED_RABBIT__0("Coelho Assado"),
    RABBIT_STEW__0("Ensopado de Coelho"),
    RABBIT_FOOT__0("Pé de Coelho"),
    RABBIT_HIDE__0("Pele de Coelho"),
    ARMOR_STAND__0("Suporte de Armaduras"),
    IRON_BARDING__0("Armadura de Ferro Para Cavalo"),
    GOLD_BARDING__0("Armadura de Ouro Para Cavalo"),
    DIAMOND_BARDING__0("Armadura de Diamante Para Cavalo"),
    LEASH__0("Laço"),
    NAME_TAG__0("Etiqueta"),
    COMMAND_MINECART__0("Carrinho com Bloco de Comando"),
    MUTTON__0("Carneiro Cru"),
    COOKED_MUTTON__0("Carneiro Assado"),
    BANNER__0("Estandarte Preto"),
    BANNER__1("Estandarte Vermelho"),
    BANNER__2("Estandarte Verde"),
    BANNER__3("Estandarte Marrom"),
    BANNER__4("Estandarte Azul"),
    BANNER__5("Estandarte Lilás"),
    BANNER__6("Estandarte Ciano"),
    BANNER__7("Estandarte Cinza Claro"),
    BANNER__8("Estandarte Cinza"),
    BANNER__9("Estandarte Rosa"),
    BANNER__10("Estandarte Verde Limão"),
    BANNER__11("Estandarte Amarelo"),
    BANNER__12("Estandarte Azul Claro"),
    BANNER__13("Estandarte Magenta"),
    BANNER__14("Estandarte Laranja"),
    BANNER__15("Estandarte Branco"),
    END_CRYSTAL__0("Cristal do End"),
    SPRUCE_DOOR_ITEM__0("Porta de Pinheiro"),
    BIRCH_DOOR_ITEM__0("Porta de Eucalipto"),
    JUNGLE_DOOR_ITEM__0("Porta de Madeira da Selva"),
    ACACIA_DOOR_ITEM__0("Porta de Acácia"),
    DARK_OAK_DOOR_ITEM__0("Porta de Carvalho Escuro"),
    CHORUS_FRUIT__0("Fruta do Coro"),
    CHORUS_FRUIT_POPPED__0("Fruta do Coro Estourada"),
    BEETROOT__0("Beterraba"),
    BEETROOT_SEEDS__0("Sementes de Beterraba"),
    BEETROOT_SOUP__0("Sopa de Beterraba"),
    DRAGONS_BREATH__0("Bafo de Dragão"),
    SPLASH_POTION__0("Poção Arremessável"),
    SPECTRAL_ARROW__0("Flecha Espectral"),
    TIPPED_ARROW__0("Flecha Especial"),
    LINGERING_POTION__0("Poção Prolongada"),
    SHIELD__0("Escudo"),
    ELYTRA__0("Élitros"),
    BOAT_SPRUCE__0("Bote de Pinheiro"),
    BOAT_BIRCH__0("Bote Eucalipto"),
    BOAT_JUNGLE__0("Bote de Madeira da Selva"),
    BOAT_ACACIA__0("Bote de Acácia"),
    BOAT_DARK_OAK__0("Bote de Carvalho Escuro"),
    TOTEM__0("Totem da imortalidade"),
    SHULKER_SHELL__0("Casco de Shulker"),
    IRON_NUGGET__0("Pepita de Ferro"),
    KNOWLEDGE_BOOK__0("Livro do Conhecimento"),
    GOLD_RECORD__0("Disco de Música"),
    GREEN_RECORD__0("Disco de Música"),
    RECORD_3__0("Disco de Música"),
    RECORD_4__0("Disco de Música"),
    RECORD_5__0("Disco de Música"),
    RECORD_6__0("Disco de Música"),
    RECORD_7__0("Disco de Música"),
    RECORD_8__0("Disco de Música"),
    RECORD_9__0("Disco de Música"),
    RECORD_10__0("Disco de Música"),
    RECORD_11__0("Disco de Música"),
    RECORD_12__0("Disco de Música");

    private String name;

    ItemName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public static ItemName valueOf(ItemStack item) {
        try {
            return valueOf(item.getType().name() + "__" + item.getDurability());
        } catch (Throwable e) {
            return valueOf(item.getType().name() + "__0");
        }
    }

    public static ItemName valueOf(String name, short durability) {
        try {
            return valueOf(name + "__" + durability);
        } catch (Throwable e) {
            return valueOf(name + "__0");
        }
    }

    public static ItemName valueOf(String name, byte data) {
        try {
            return valueOf(name + "__" + data);
        } catch (Throwable e) {
            return valueOf(name + "__0");
        }
    }

    public static ItemName valueOf(Material material, byte data) {
        try {
            return valueOf(material.name() + "__" + data);
        } catch (Throwable e) {
            return valueOf(material.name() + "__0");
        }
    }

    public static ItemName valueOf(Material material) {
        return valueOf(material.name() + "__0");
    }

    public static ItemName valueOf(Item item) {
        return valueOf(item.getItemStack());
    }

    public static ItemName valueOf(Block block) {
        return valueOf(block.getType(), block.getData());
    }

    @Override
    public String toString() {
        return this.name;
    }

}