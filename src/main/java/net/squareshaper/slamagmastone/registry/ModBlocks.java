package net.squareshaper.slamagmastone.registry;

import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.squareshaper.slamagmastone.SLAMagmastone;

public class ModBlocks {
    public static final Block MAGMASTONE = registerBlock("magmastone",
            new Block(AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.STONE).mapColor(MapColor.DARK_CRIMSON).strength(3.0F, 6.0F)
                    .requiresTool()));


    public static void registerModBlocks() {
        SLAMagmastone.LOGGER.info("Registering Mod Blocks for " + SLAMagmastone.MOD_ID);
    }

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, SLAMagmastone.id(name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, SLAMagmastone.id(name),
                new BlockItem(block, new Item.Settings()));
    }
}
