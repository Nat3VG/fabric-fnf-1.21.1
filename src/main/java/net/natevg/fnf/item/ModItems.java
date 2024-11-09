package net.natevg.fnf.item;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.natevg.fnf.FoodNFuel;

public class ModItems {
    //FnF Logo
    public static final Item LOGO = registerItem("logo", new Item(new Item.Settings()));

    //Honeyed Food
    public static final Item HONEYED_BREAD = registerItem("honeyed_bread", new Item(new Item.Settings().food(FnFFoodComponents.HONEYED_BREAD)));
    public static final Item HONEYED_CHICKEN = registerItem("honeyed_chicken", new Item(new Item.Settings().food(FnFFoodComponents.HONEYED_CHICKEN)));
    public static final Item HONEYED_COOKIE = registerItem("honeyed_cookie", new Item(new Item.Settings().food(FnFFoodComponents.HONEYED_COOKIE)));
    public static final Item HONEYED_MUTTON = registerItem("honeyed_mutton", new Item(new Item.Settings().food(FnFFoodComponents.HONEYED_MUTTON)));
    public static final Item HONEYED_PORKCHOP = registerItem("honeyed_porkchop", new Item(new Item.Settings().food(FnFFoodComponents.HONEYED_PORKCHOP)));
    public static final Item HONEYED_POTATO = registerItem("honeyed_potato", new Item(new Item.Settings().food(FnFFoodComponents.HONEYED_POTATO)));
    public static final Item HONEYED_RABBIT = registerItem("honeyed_rabbit", new Item(new Item.Settings().food(FnFFoodComponents.HONEYED_RABBIT)));
    public static final Item HONEYED_STEAK = registerItem("honeyed_steak", new Item(new Item.Settings().food(FnFFoodComponents.HONEYED_STEAK)));
    public static final Item HONEY_POPPED_CHORUS_FRUIT = registerItem("honey_popped_chorus_fruit", new Item(new Item.Settings().food(FnFFoodComponents.HONEY_POPPED_CHORUS_FRUIT)));

    //Kelp-Wrapped Food
    public static final Item KELP_WRAPPED_COD = registerItem("kelp_wrapped_cod", new Item(new Item.Settings().food(FnFFoodComponents.KELP_WRAPPED_COD)));
    public static final Item KELP_WRAPPED_SALMON = registerItem("kelp_wrapped_salmon", new Item(new Item.Settings().food(FnFFoodComponents.KELP_WRAPPED_SALMON)));
    public static final Item KELP_WRAPPED_TROPICAL_FISH = registerItem("kelp_wrapped_tropical_fish", new Item(new Item.Settings().food(FnFFoodComponents.KELP_WRAPPED_TROPICAL_FISH)));
    public static final Item KELP_WRAPPED_VEGGIE_STICKS = registerItem("kelp_wrapped_veggie_sticks", new Item(new Item.Settings().food(FnFFoodComponents.KELP_WRAPPED_VEGGIE_STICKS)));
    public static final Item DRIED_KELP_WRAPPED_COD = registerItem("dried_kelp_wrapped_cod", new Item(new Item.Settings().food(FnFFoodComponents.DRIED_KELP_WRAPPED_COD)));
    public static final Item DRIED_KELP_WRAPPED_SALMON = registerItem("dried_kelp_wrapped_salmon", new Item(new Item.Settings().food(FnFFoodComponents.DRIED_KELP_WRAPPED_SALMON)));
    public static final Item DRIED_KELP_WRAPPED_TROPICAL_FISH = registerItem("dried_kelp_wrapped_tropical_fish", new Item(new Item.Settings().food(FnFFoodComponents.DRIED_KELP_WRAPPED_TROPICAL_FISH)));
    public static final Item DRIED_KELP_WRAPPED_VEGGIE_STICKS = registerItem("dried_kelp_wrapped_veggie_sticks", new Item(new Item.Settings().food(FnFFoodComponents.DRIED_KELP_WRAPPED_VEGGIE_STICKS)));

    //Soup N Stew
    public static final Item VEGGIE_SOUP = registerItem("veggie_soup", new Item(new Item.Settings().maxCount(16).food(FnFFoodComponents.VEGGIE_SOUP)));
    public static final Item MUSHROOM_BEEF_STEW = registerItem("mushroom_beef_stew", new Item(new Item.Settings().maxCount(16).food(FnFFoodComponents.MUSHROOM_BEEF_STEW)));
    public static final Item MUSHROOM_CHICKEN_STEW = registerItem("mushroom_chicken_stew", new Item(new Item.Settings().maxCount(16).food(FnFFoodComponents.MUSHROOM_CHICKEN_STEW)));
    public static final Item MUSHROOM_MUTTON_STEW = registerItem("mushroom_mutton_stew", new Item(new Item.Settings().maxCount(16).food(FnFFoodComponents.MUSHROOM_MUTTON_STEW)));
    public static final Item MUSHROOM_PORK_STEW = registerItem("mushroom_pork_stew", new Item(new Item.Settings().maxCount(16).food(FnFFoodComponents.MUSHROOM_PORK_STEW)));
    public static final Item PIPING_HOT_BEETROOT_SOUP = registerItem("piping_hot_beetroot_soup", new Item(new Item.Settings().maxCount(16).food(FnFFoodComponents.PIPING_HOT_BEETROOT_SOUP)));
    public static final Item PIPING_HOT_MUSHROOM_STEW = registerItem("piping_hot_mushroom_stew", new Item(new Item.Settings().maxCount(16).food(FnFFoodComponents.PIPING_HOT_MUSHROOM_STEW)));
    public static final Item PIPING_HOT_RABBIT_STEW = registerItem("piping_hot_rabbit_stew", new Item(new Item.Settings().maxCount(16).food(FnFFoodComponents.PIPING_HOT_RABBIT_STEW)));
    public static final Item PIPING_HOT_VEGGIE_SOUP = registerItem("piping_hot_veggie_soup", new Item(new Item.Settings().maxCount(16).food(FnFFoodComponents.PIPING_HOT_VEGGIE_SOUP)));
    public static final Item MINERS_DELIGHT = registerItem("miners_delight", new Item(new Item.Settings().maxCount(16).food(FnFFoodComponents.MINERS_DELIGHT)));
    public static final Item FARMERS_GRACE = registerItem("farmers_grace", new Item(new Item.Settings().maxCount(16).food(FnFFoodComponents.FARMERS_GRACE)));
    public static final Item NETHER_DWELLERS_SUBSISTENCE = registerItem("nether_dwellers_subsistence", new Item(new Item.Settings().maxCount(16).food(FnFFoodComponents.NETHER_DWELLERS_SUBSISTENCE)));
    public static final Item HIGHLANDERS_MEAL = registerItem("highlanders_meal", new Item(new Item.Settings().maxCount(16).food(FnFFoodComponents.HIGHLANDERS_MEAL)));
    public static final Item EXPLORERS_FANCY_COOKING = registerItem("explorers_fancy_cooking", new Item(new Item.Settings().maxCount(16).food(FnFFoodComponents.EXPLORERS_FANCY_COOKING)));
    public static final Item LUCKY_STAR = registerItem("lucky_star", new Item(new Item.Settings().maxCount(16).food(FnFFoodComponents.LUCKY_STAR)));
    public static final Item FISHERMANS_SECRET_BROTH = registerItem("fishermans_secret_broth", new Item(new Item.Settings().maxCount(16).food(FnFFoodComponents.FISHERMANS_SECRET_BROTH)));

    //Skewer
    public static final Item RAW_BEEF_SKEWER = registerItem("raw_beef_skewer", new Item(new Item.Settings().food(FnFFoodComponents.RAW_MEAT_SKEWER)));
    public static final Item RAW_CHICKEN_SKEWER = registerItem("raw_chicken_skewer", new Item(new Item.Settings().food(FnFFoodComponents.RAW_MEAT_SKEWER)));
    public static final Item RAW_MUTTON_SKEWER = registerItem("raw_mutton_skewer", new Item(new Item.Settings().food(FnFFoodComponents.RAW_MEAT_SKEWER)));
    public static final Item RAW_PORK_SKEWER = registerItem("raw_pork_skewer", new Item(new Item.Settings().food(FnFFoodComponents.RAW_MEAT_SKEWER)));
    public static final Item RAW_RABBIT_SKEWER = registerItem("raw_rabbit_skewer", new Item(new Item.Settings().food(FnFFoodComponents.RAW_MEAT_SKEWER)));
    public static final Item RAW_GLOWING_BEEF_SKEWER = registerItem("raw_glowing_beef_skewer", new Item(new Item.Settings().food(FnFFoodComponents.RAW_GLOWING_MEAT_SKEWER)));
    public static final Item RAW_GLOWING_CHICKEN_SKEWER = registerItem("raw_glowing_chicken_skewer", new Item(new Item.Settings().food(FnFFoodComponents.RAW_GLOWING_MEAT_SKEWER)));
    public static final Item RAW_GLOWING_MUTTON_SKEWER = registerItem("raw_glowing_mutton_skewer", new Item(new Item.Settings().food(FnFFoodComponents.RAW_GLOWING_MEAT_SKEWER)));
    public static final Item RAW_GLOWING_PORK_SKEWER = registerItem("raw_glowing_pork_skewer", new Item(new Item.Settings().food(FnFFoodComponents.RAW_GLOWING_MEAT_SKEWER)));
    public static final Item RAW_GLOWING_RABBIT_SKEWER = registerItem("raw_glowing_rabbit_skewer", new Item(new Item.Settings().food(FnFFoodComponents.RAW_GLOWING_MEAT_SKEWER)));
    public static final Item COOKED_BEEF_SKEWER = registerItem("cooked_beef_skewer", new Item(new Item.Settings().food(FnFFoodComponents.COOKED_BEEF_SKEWER)));
    public static final Item COOKED_CHICKEN_SKEWER = registerItem("cooked_chicken_skewer", new Item(new Item.Settings().food(FnFFoodComponents.COOKED_CHICKEN_SKEWER)));
    public static final Item COOKED_MUTTON_SKEWER = registerItem("cooked_mutton_skewer", new Item(new Item.Settings().food(FnFFoodComponents.COOKED_MUTTON_SKEWER)));
    public static final Item COOKED_PORK_SKEWER = registerItem("cooked_pork_skewer", new Item(new Item.Settings().food(FnFFoodComponents.COOKED_PORK_SKEWER)));
    public static final Item COOKED_RABBIT_SKEWER = registerItem("cooked_rabbit_skewer", new Item(new Item.Settings().food(FnFFoodComponents.COOKED_RABBIT_SKEWER)));
    public static final Item COOKED_GLOWING_BEEF_SKEWER = registerItem("cooked_glowing_beef_skewer", new Item(new Item.Settings().food(FnFFoodComponents.COOKED_GLOWING_BEEF_SKEWER)));
    public static final Item COOKED_GLOWING_CHICKEN_SKEWER = registerItem("cooked_glowing_chicken_skewer", new Item(new Item.Settings().food(FnFFoodComponents.COOKED_GLOWING_CHICKEN_SKEWER)));
    public static final Item COOKED_GLOWING_MUTTON_SKEWER = registerItem("cooked_glowing_mutton_skewer", new Item(new Item.Settings().food(FnFFoodComponents.COOKED_GLOWING_MUTTON_SKEWER)));
    public static final Item COOKED_GLOWING_PORK_SKEWER = registerItem("cooked_glowing_pork_skewer", new Item(new Item.Settings().food(FnFFoodComponents.COOKED_GLOWING_PORK_SKEWER)));
    public static final Item COOKED_GLOWING_RABBIT_SKEWER = registerItem("cooked_glowing_rabbit_skewer", new Item(new Item.Settings().food(FnFFoodComponents.COOKED_GLOWING_RABBIT_SKEWER)));

    //Other Food
    public static final Item CARROT_BREAD = registerItem("carrot_bread", new Item(new Item.Settings().food(FnFFoodComponents.CARROT_BREAD)));
    public static final Item COOKED_CARROT = registerItem("cooked_carrot", new Item(new Item.Settings().food(FnFFoodComponents.COOKED_CARROT)));
    public static final Item COOKED_TROPICAL_FISH = registerItem("cooked_tropical_fish", new Item(new Item.Settings().food(FnFFoodComponents.COOKED_TROPICAL_FISH)));
    public static final Item ROASTED_BEETROOT = registerItem("roasted_beetroot", new Item(new Item.Settings().food(FnFFoodComponents.ROASTED_BEETROOT)));
    public static final Item SWEET_MELON_SMOOTHIE = registerItem("sweet_melon_smoothie", new Item(new Item.Settings().food(FnFFoodComponents.SWEET_MELON_SMOOTHIE)));

    //Fuel Registries
    public static final Item PAPER_STACK = registerItem("paper_stack", new Item(new Item.Settings()));
    public static final Item BIO_FUEL = registerItem("bio_fuel", new Item(new Item.Settings()));
    public static final Item BLAZING_COAL = registerItem("blazing_coal", new Item(new Item.Settings()));
    public static final Item BLAZEROD_BUNDLE = registerItem("blazerod_bundle", new Item(new Item.Settings()));
    public static final Item FIRE_CORE = registerItem("fire_core", new Item(new Item.Settings()));
    public static final Item ENERGIZED_FIRE_CORE = registerItem("energized_fire_core", new Item(new Item.Settings()));
    public static final Item SOUL_FIRE_CORE = registerItem("soul_fire_core", new Item(new Item.Settings()));
    public static final Item ENERGIZED_SOUL_FIRE_CORE = registerItem("energized_soul_fire_core", new Item(new Item.Settings()));

    public static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(FoodNFuel.MOD_ID, name), item);
    }
    public static void registerFuel(){
        //200 burn ticks = 1 item
        FuelRegistry.INSTANCE.add(ModItems.PAPER_STACK, 100);
        FuelRegistry.INSTANCE.add(ModItems.BIO_FUEL, 3200);
        FuelRegistry.INSTANCE.add(ModItems.BLAZING_COAL, 6400);
        FuelRegistry.INSTANCE.add(ModItems.BLAZEROD_BUNDLE, 10400);
        FuelRegistry.INSTANCE.add(ModItems.FIRE_CORE, 14400);
        FuelRegistry.INSTANCE.add(ModItems.ENERGIZED_FIRE_CORE, 28800);
        FuelRegistry.INSTANCE.add(ModItems.SOUL_FIRE_CORE, 32000);
        FuelRegistry.INSTANCE.add(ModItems.ENERGIZED_SOUL_FIRE_CORE, 64000);

    }

    public static void registerModItems(){
        FoodNFuel.LOGGER.info("Registering Mod Items for " + FoodNFuel.MOD_ID);
    }
}
