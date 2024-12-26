package flyinmyeye.interium.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import flyinmyeye.interium.Interium;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block CONTAMINATED_CHLOROPHYLL_BLOCK = registerBlock("contaminated_chlorophyll_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(0.5f)
                    .sounds(BlockSoundGroup.SAND)
            ));
    public static final Block PURE_CHLOROPHYLL_BLOCK = registerBlock("pure_chlorophyll_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(0.5f)
                    .sounds(BlockSoundGroup.SAND)
            ));
    public static final Block CHLOROPHYLL_BLOCK = registerBlock("chlorophyll_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(0.5f)
                    .sounds(BlockSoundGroup.SAND)
            ));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Interium.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Interium.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        Interium.LOGGER.info("Registering Mod Blocks for " + Interium.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.CONTAMINATED_CHLOROPHYLL_BLOCK);
            entries.add(ModBlocks.CHLOROPHYLL_BLOCK);
            entries.add(ModBlocks.PURE_CHLOROPHYLL_BLOCK);
        });
    }
}
