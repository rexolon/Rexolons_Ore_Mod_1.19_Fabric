package io.github.rexolon.rexores.item;

import io.github.rexolon.rexores.RexolonsOreMod;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup REXOLONS_ORE_GROUP = FabricItemGroupBuilder.build(new Identifier(RexolonsOreMod.MOD_ID,
            "rexolons_ore_group"), () -> new ItemStack(ModItems.RAW_ALUMINUM));
}
