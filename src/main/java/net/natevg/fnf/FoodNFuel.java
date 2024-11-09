package net.natevg.fnf;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.natevg.fnf.item.ModItemGroups;
import net.natevg.fnf.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FoodNFuel implements ModInitializer {
	public static final String MOD_ID = "fnf";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModItems.registerFuel();

	}
}