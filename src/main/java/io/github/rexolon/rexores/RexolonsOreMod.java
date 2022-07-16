package io.github.rexolon.rexores;

import io.github.rexolon.rexores.block.ModBlocks;
import io.github.rexolon.rexores.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RexolonsOreMod implements ModInitializer {
	public static final String MOD_ID = "rexores";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}
}
