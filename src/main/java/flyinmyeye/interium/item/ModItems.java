package flyinmyeye.interium.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import flyinmyeye.interium.Interium;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item BIOIRON = registerItem("bioiron", new Item(new Item.Settings()));
    public static final Item CHLOROPHYLL = registerItem("chlorophyll", new Item(new Item.Settings()));
    public static final Item PURE_CHLOROPHYLL = registerItem("pure_chlorophyll", new Item(new Item.Settings()));
    public static final Item CONTAMINATED_CHLOROPHYLL = registerItem("contaminated_chlorophyll", new Item(new Item.Settings()));
    public static final Item BIOSTEEL = registerItem("biosteel", new Item(new Item.Settings()));
    public static final Item MITOCHONDRIA = registerItem("mitochondria", new Item(new Item.Settings()));
    public static final Item MORTAR_AND_PISTLE = registerItem("mortar_and_pestle", new Item(new Item.Settings()));
    public static final Item SPORE = registerItem("spore", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Interium.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Interium.LOGGER.info("Registering Mod Items for " + Interium.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(ModItems.BIOIRON);
            entries.add(ModItems.CHLOROPHYLL);
            entries.add(ModItems.PURE_CHLOROPHYLL);
            entries.add(ModItems.CONTAMINATED_CHLOROPHYLL);
            entries.add(ModItems.BIOSTEEL);
            entries.add(ModItems.MITOCHONDRIA);
            entries.add(ModItems.MORTAR_AND_PISTLE);
            entries.add(ModItems.SPORE);
        });
    }
}
