package io.github.rexolon.rexores.item;

import io.github.rexolon.rexores.RexolonsOreMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item RAW_ALUMINUM = registerItem("raw_aluminum",
            new Item(new FabricItemSettings().group(ModItemGroup.REXOLONS_ORE_GROUP)));
    public static final Item ALUMINUM_INGOT = registerItem("aluminum_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.REXOLONS_ORE_GROUP)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(RexolonsOreMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        RexolonsOreMod.LOGGER.debug("Registering Mod Items for " + RexolonsOreMod.MOD_ID);
    }
}
