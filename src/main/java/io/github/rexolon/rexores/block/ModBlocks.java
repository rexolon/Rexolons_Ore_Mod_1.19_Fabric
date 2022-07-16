package io.github.rexolon.rexores.block;

import io.github.rexolon.rexores.RexolonsOreMod;
import io.github.rexolon.rexores.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static final Block ALUMINUM_BLOCK = registerBlock("aluminum_block", new Block(FabricBlockSettings
            .of(Material.METAL).strength(4f, 6f).requiresTool()), ModItemGroup.REXOLONS_ORE_GROUP);
    public static final Block RAW_ALUMINUM_BLOCK = registerBlock("raw_aluminum_block", new Block(FabricBlockSettings
            .of(Material.METAL).strength(3.5f, 5.5f).requiresTool()), ModItemGroup.REXOLONS_ORE_GROUP);
    public static final Block ALUMINUM_ORE = registerBlock("aluminum_ore", new OreBlock(FabricBlockSettings
            .of(Material.STONE).strength(3f, 4f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.REXOLONS_ORE_GROUP);
    public static final Block DEEPSLATE_ALUMINUM_ORE = registerBlock("deepslate_aluminum_ore", new OreBlock(FabricBlockSettings
            .of(Material.STONE).strength(4f, 5f).requiresTool(), UniformIntProvider.create(4, 8)), ModItemGroup.REXOLONS_ORE_GROUP);


    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(RexolonsOreMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(RexolonsOreMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks() {
        RexolonsOreMod.LOGGER.debug("Register Mod Blocks for " + RexolonsOreMod.MOD_ID);
    }
}
