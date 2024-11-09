package net.natevg.fnf.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.natevg.fnf.FoodNFuel;

public class ModItemGroups {
    public static final ItemGroup FNF_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(FoodNFuel.MOD_ID, "logo"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.LOGO))
                    .displayName(Text.translatable("itemgroup.fnf.logo"))
                    .entries((displayContext, entries) -> {
                        //Other Food
                        entries.add(ModItems.CARROT_BREAD);
                        entries.add(ModItems.COOKED_CARROT);
                        entries.add(ModItems.COOKED_TROPICAL_FISH);
                        entries.add(ModItems.ROASTED_BEETROOT);
                        entries.add(ModItems.SWEET_MELON_SMOOTHIE);

                        //Honeyed
                        entries.add(ModItems.HONEYED_BREAD);
                        entries.add(ModItems.HONEYED_CHICKEN);
                        entries.add(ModItems.HONEYED_COOKIE);
                        entries.add(ModItems.HONEYED_MUTTON);
                        entries.add(ModItems.HONEYED_PORKCHOP);
                        entries.add(ModItems.HONEYED_POTATO);
                        entries.add(ModItems.HONEYED_RABBIT);
                        entries.add(ModItems.HONEYED_STEAK);
                        entries.add(ModItems.HONEY_POPPED_CHORUS_FRUIT);

                        //Kelp-Wrapped
                        entries.add(ModItems.KELP_WRAPPED_COD);
                        entries.add(ModItems.KELP_WRAPPED_SALMON);
                        entries.add(ModItems.KELP_WRAPPED_TROPICAL_FISH);
                        entries.add(ModItems.KELP_WRAPPED_VEGGIE_STICKS);
                        entries.add(ModItems.DRIED_KELP_WRAPPED_COD);
                        entries.add(ModItems.DRIED_KELP_WRAPPED_SALMON);
                        entries.add(ModItems.DRIED_KELP_WRAPPED_TROPICAL_FISH);
                        entries.add(ModItems.DRIED_KELP_WRAPPED_VEGGIE_STICKS);

                        //Soup N Stew
                        entries.add(ModItems.VEGGIE_SOUP);
                        entries.add(ModItems.MUSHROOM_BEEF_STEW);
                        entries.add(ModItems.MUSHROOM_CHICKEN_STEW);
                        entries.add(ModItems.MUSHROOM_MUTTON_STEW);
                        entries.add(ModItems.MUSHROOM_PORK_STEW);
                        entries.add(ModItems.PIPING_HOT_VEGGIE_SOUP);
                        entries.add(ModItems.PIPING_HOT_BEETROOT_SOUP);
                        entries.add(ModItems.PIPING_HOT_MUSHROOM_STEW);
                        entries.add(ModItems.PIPING_HOT_RABBIT_STEW);
                        entries.add(ModItems.MINERS_DELIGHT);
                        entries.add(ModItems.FARMERS_GRACE);
                        entries.add(ModItems.NETHER_DWELLERS_SUBSISTENCE);
                        entries.add(ModItems.HIGHLANDERS_MEAL);
                        entries.add(ModItems.EXPLORERS_FANCY_COOKING);
                        entries.add(ModItems.LUCKY_STAR);
                        entries.add(ModItems.FISHERMANS_SECRET_BROTH);

                        //Skewer
                        entries.add(ModItems.RAW_BEEF_SKEWER);
                        entries.add(ModItems.RAW_CHICKEN_SKEWER);
                        entries.add(ModItems.RAW_MUTTON_SKEWER);
                        entries.add(ModItems.RAW_PORK_SKEWER);
                        entries.add(ModItems.RAW_RABBIT_SKEWER);
                        entries.add(ModItems.RAW_GLOWING_BEEF_SKEWER);
                        entries.add(ModItems.RAW_GLOWING_CHICKEN_SKEWER);
                        entries.add(ModItems.RAW_GLOWING_MUTTON_SKEWER);
                        entries.add(ModItems.RAW_GLOWING_PORK_SKEWER);
                        entries.add(ModItems.RAW_GLOWING_RABBIT_SKEWER);
                        entries.add(ModItems.COOKED_BEEF_SKEWER);
                        entries.add(ModItems.COOKED_CHICKEN_SKEWER);
                        entries.add(ModItems.COOKED_MUTTON_SKEWER);
                        entries.add(ModItems.COOKED_PORK_SKEWER);
                        entries.add(ModItems.COOKED_RABBIT_SKEWER);
                        entries.add(ModItems.COOKED_GLOWING_BEEF_SKEWER);
                        entries.add(ModItems.COOKED_GLOWING_CHICKEN_SKEWER);
                        entries.add(ModItems.COOKED_GLOWING_MUTTON_SKEWER);
                        entries.add(ModItems.COOKED_GLOWING_PORK_SKEWER);
                        entries.add(ModItems.COOKED_GLOWING_RABBIT_SKEWER);

                        //Fuel
                        entries.add(ModItems.PAPER_STACK);
                        entries.add(ModItems.BIO_FUEL);
                        entries.add(ModItems.BLAZING_COAL);
                        entries.add(ModItems.BLAZEROD_BUNDLE);
                        entries.add(ModItems.FIRE_CORE);
                        entries.add(ModItems.ENERGIZED_FIRE_CORE);
                        entries.add(ModItems.SOUL_FIRE_CORE);
                        entries.add(ModItems.ENERGIZED_SOUL_FIRE_CORE);
                    })
                    .build());
    public static void registerItemGroups(){
        FoodNFuel.LOGGER.info("Registering Item Groups for " + FoodNFuel.MOD_ID);
    }
}
