package flyinmyeye.interium;

import flyinmyeye.interium.block.ModBlocks;
import flyinmyeye.interium.item.ModItemGroups;
import flyinmyeye.interium.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Interium implements ModInitializer {
	public static final String MOD_ID = "interium";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();
		LOGGER.info("Hello Fabric world!");
	}
}