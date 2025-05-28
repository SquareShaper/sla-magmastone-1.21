package net.squareshaper.slamagmastone;

import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;
import net.squareshaper.slamagmastone.registry.ModBlocks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SLAMagmastone implements ModInitializer {
	public static final String MOD_ID = "sla-magmastone";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static Identifier id(String name){
		return Identifier.of(MOD_ID, name);
	}

	@Override
	public void onInitialize() {
		ModBlocks.registerModBlocks();
	}
}