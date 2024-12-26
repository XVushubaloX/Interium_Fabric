package flyinmyeye.interium.item;

import flyinmyeye.interium.Interium;
import flyinmyeye.interium.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup INTERIUM = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Interium.MOD_ID, "interium"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.BIOIRON))
                    .displayName(Text.translatable("itemgroup.interium.interium"))
                    .entries((displayContext, entries) -> {

//                      Items
                        entries.add(ModItems.BIOIRON);
                        entries.add(ModItems.CHLOROPHYLL);
                        entries.add(ModItems.PURE_CHLOROPHYLL);
                        entries.add(ModItems.CONTAMINATED_CHLOROPHYLL);
                        entries.add(ModItems.BIOSTEEL);
                        entries.add(ModItems.MITOCHONDRIA);
                        entries.add(ModItems.MORTAR_AND_PISTLE);
                        entries.add(ModItems.SPORE);

//                      Blocks
                        entries.add(ModBlocks.CONTAMINATED_CHLOROPHYLL_BLOCK);
                        entries.add(ModBlocks.CHLOROPHYLL_BLOCK);
                        entries.add(ModBlocks.PURE_CHLOROPHYLL_BLOCK);
                    }).build());


    public static void registerItemGroups() {
        Interium.LOGGER.info("Registering Item Groups for " + Interium.MOD_ID);
    }
}