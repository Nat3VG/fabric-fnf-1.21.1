package net.natevg.fnf.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Items;

public class FnFFoodComponents {
    //For potion effect duration, every second = 20 tick
    public static final int FLASH = 60;    // 3 seconds
    public static final int EX_BRIEF = 200;    // 10 seconds
    public static final int BRIEF = 600;    // 30 seconds
    public static final int SHORT = 1200;    // 1 minute
    public static final int MEDIUM = 3600;    // 3 minutes
    public static final int LONG = 6000;    // 5 minutes
    public static final int EX_LONG = 9600;    // 8 minutes

    //FnF Food Items
    public static final FoodComponent CARROT_BREAD = new FoodComponent.Builder()
            .nutrition(6)
            .saturationModifier(0.6F)
            .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION,SHORT),1.0F)
            .build();
    public static final FoodComponent COOKED_CARROT = new FoodComponent.Builder()
            .nutrition(5)
            .saturationModifier(0.6F)
            .build();
    public static final FoodComponent COOKED_TROPICAL_FISH = new FoodComponent.Builder()
            .nutrition(5)
            .saturationModifier(0.6F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING,EX_BRIEF),1.0F)
            .build();
    public static final FoodComponent ROASTED_BEETROOT = new FoodComponent.Builder()
            .nutrition(5)
            .saturationModifier(0.6F)
            .build();
    public static final FoodComponent SWEET_MELON_SMOOTHIE = new FoodComponent.Builder()
            .nutrition(6).alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,BRIEF),1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE,SHORT),1.0F)
            .build();

    //Honeyed
    public static final FoodComponent HONEYED_BREAD = fnfHoneyed(5).saturationModifier(0.6F)
            .statusEffect(new StatusEffectInstance(StatusEffects.SATURATION,40),1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED,SHORT),1.0F)
            .build();
    public static final FoodComponent HONEYED_CHICKEN = fnfHoneyed(6).saturationModifier(0.6F)
            .statusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING,EX_BRIEF),1.0F)
            .build();
    public static final FoodComponent HONEYED_COOKIE = fnfHoneyed(2).saturationModifier(0.1F)
            .snack().alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED,MEDIUM),1.0F)
            .build();
    public static final FoodComponent HONEYED_MUTTON = fnfHoneyed(6).saturationModifier(0.8F)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE,SHORT),1.0F)
            .build();
    public static final FoodComponent HONEYED_PORKCHOP = fnfHoneyed(8).saturationModifier(0.8F)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,MEDIUM),1.0F)
            .build();
    public static final FoodComponent HONEYED_POTATO = fnfHoneyed(5).saturationModifier(0.6F)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE,SHORT),1.0F)
            .build();
    public static final FoodComponent HONEYED_RABBIT = fnfHoneyed(5).saturationModifier(0.6F)
            .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST,SHORT),1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED,SHORT,1),1.0F)
            .build();
    public static final FoodComponent HONEYED_STEAK = fnfHoneyed(8).saturationModifier(0.8F)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH,MEDIUM),1.0F)
            .build();
    public static final FoodComponent HONEY_POPPED_CHORUS_FRUIT = fnfHoneyed(4).saturationModifier(0.3F)
            .statusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING,SHORT),1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.LEVITATION,BRIEF),1.0F)
            .alwaysEdible()
            .build();

    //Kelp-Wrapped
    public static final FoodComponent KELP_WRAPPED_COD = new FoodComponent.Builder()
            .nutrition(2)
            .saturationModifier(0.2F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING,EX_BRIEF),1.0F)
            .build();
    public static final FoodComponent DRIED_KELP_WRAPPED_COD = new FoodComponent.Builder()
            .nutrition(8)
            .saturationModifier(0.8F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING,2400),1.0F)
            .build();
    public static final FoodComponent KELP_WRAPPED_SALMON = new FoodComponent.Builder()
            .nutrition(2)
            .saturationModifier(0.2F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING,400),1.0F)
            .build();
    public static final FoodComponent DRIED_KELP_WRAPPED_SALMON = new FoodComponent.Builder()
            .nutrition(8)
            .saturationModifier(0.8F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING,MEDIUM),1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE,2400),1.0F)
            .build();
    public static final FoodComponent KELP_WRAPPED_TROPICAL_FISH = new FoodComponent.Builder()
            .nutrition(2)
            .saturationModifier(0.2F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING,BRIEF),1.0F)
            .build();
    public static final FoodComponent DRIED_KELP_WRAPPED_TROPICAL_FISH = new FoodComponent.Builder()
            .nutrition(8)
            .saturationModifier(0.8F)
            .statusEffect(new StatusEffectInstance(StatusEffects.CONDUIT_POWER,LONG),1.0F)
            .build();
    public static final FoodComponent KELP_WRAPPED_VEGGIE_STICKS = new FoodComponent.Builder()
            .nutrition(4)
            .saturationModifier(0.3F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING,EX_BRIEF),1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE,100),1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION,100),1.0F)
            .build();
    public static final FoodComponent DRIED_KELP_WRAPPED_VEGGIE_STICKS = new FoodComponent.Builder()
            .nutrition(6)
            .saturationModifier(0.7F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING,SHORT),1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE,BRIEF),1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION,BRIEF),1.0F)
            .build();

    //Soup N Stew
    public static final FoodComponent VEGGIE_SOUP = fnfStew(6)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED,MEDIUM),1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE,SHORT),1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION,SHORT),1.0F)
            .build();
    public static final FoodComponent MUSHROOM_BEEF_STEW = fnfStew(8)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH,LONG,2),1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,MEDIUM),1.0F)
            .build();
    public static final FoodComponent MUSHROOM_CHICKEN_STEW = fnfStew(8)
            .statusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING,SHORT),1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,MEDIUM),1.0F)
            .build();
    public static final FoodComponent MUSHROOM_MUTTON_STEW = fnfStew(8)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE,LONG,1),1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,MEDIUM),1.0F)
            .build();
    public static final FoodComponent MUSHROOM_PORK_STEW = fnfStew(8)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION,LONG,2),1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,MEDIUM),1.0F)
            .build();
    public static final FoodComponent PIPING_HOT_BEETROOT_SOUP = fnfStew(8)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED,MEDIUM),1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,MEDIUM),1.0F)
            .build();
    public static final FoodComponent PIPING_HOT_MUSHROOM_STEW = fnfStew(8)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION,MEDIUM),1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,MEDIUM),1.0F)
            .build();
    public static final FoodComponent PIPING_HOT_RABBIT_STEW = fnfStew(8)
            .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST,MEDIUM),1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,MEDIUM),1.0F)
            .build();
    public static final FoodComponent PIPING_HOT_VEGGIE_SOUP = fnfStew(8)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED,LONG),1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE,MEDIUM,2),1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION,MEDIUM),1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,MEDIUM),1.0F)
            .build();
    public static final FoodComponent MINERS_DELIGHT = fnfStew(12)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE,EX_LONG,4),1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION,EX_LONG),1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED,LONG,1),1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,LONG),1.0F)
            .build();
    public static final FoodComponent FARMERS_GRACE = fnfStew(12)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED,EX_LONG),1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST,LONG,4),1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH,LONG,4),1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,LONG,2),1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE,LONG,1),1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION,MEDIUM),1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION,MEDIUM),1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING,SHORT),1.0F)
            .build();
    public static final FoodComponent NETHER_DWELLERS_SUBSISTENCE = fnfStew(12)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE,EX_LONG,2),1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE,EX_LONG),1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH,LONG,4),1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION,LONG,4),1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,LONG,3),1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE,LONG,1),1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION,MEDIUM),1.0F)
            .build();
    public static final FoodComponent HIGHLANDERS_MEAL = fnfStew(12)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE,EX_LONG,3),1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST,LONG),1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED,LONG),1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,LONG),1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE,LONG),1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION,LONG),1.0F)
            .build();
    public static final FoodComponent EXPLORERS_FANCY_COOKING = fnfStew(12)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED,EX_LONG),1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST,LONG),1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE,LONG),1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,MEDIUM),1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION,MEDIUM),1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING,MEDIUM),1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.SATURATION,FLASH),1.0F)
            .build();
    public static final FoodComponent LUCKY_STAR = fnfStew(12)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED,EX_LONG,2),1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST,EX_LONG,1),1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.LUCK,LONG,3),1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE,LONG),1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION,LONG),1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING,LONG),1.0F)
            .build();
    public static final FoodComponent FISHERMANS_SECRET_BROTH = fnfStew(12)
            .statusEffect(new StatusEffectInstance(StatusEffects.CONDUIT_POWER,EX_LONG),1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE,LONG),1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,LONG),1.0F)
            .build();

    //Skewer
    public static final FoodComponent RAW_MEAT_SKEWER = fnfRawSkewer(3)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED,EX_BRIEF),1.0F)
            .build();
    public static final FoodComponent RAW_GLOWING_MEAT_SKEWER = fnfRawSkewer(3)
            .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING,EX_BRIEF),1.0F)
            .build();
    public static final FoodComponent COOKED_BEEF_SKEWER = fnfCookedSkewer(6)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH,SHORT),1.0F)
            .build();
    public static final FoodComponent COOKED_CHICKEN_SKEWER = fnfCookedSkewer(6)
            .statusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING,SHORT),1.0F)
            .build();
    public static final FoodComponent COOKED_MUTTON_SKEWER = fnfCookedSkewer(6)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE,SHORT),1.0F)
            .build();
    public static final FoodComponent COOKED_PORK_SKEWER = fnfCookedSkewer(6)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,SHORT),1.0F)
            .build();
    public static final FoodComponent COOKED_RABBIT_SKEWER = fnfCookedSkewer(6)
            .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST,SHORT),1.0F)
            .build();
    public static final FoodComponent COOKED_GLOWING_BEEF_SKEWER = fnfGlowedSkewer(6)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH,SHORT),1.0F)
            .build();
    public static final FoodComponent COOKED_GLOWING_CHICKEN_SKEWER = fnfGlowedSkewer(6)
            .statusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING,SHORT),1.0F)
            .build();
    public static final FoodComponent COOKED_GLOWING_MUTTON_SKEWER = fnfGlowedSkewer(6)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE,SHORT),1.0F)
            .build();
    public static final FoodComponent COOKED_GLOWING_PORK_SKEWER = fnfGlowedSkewer(6)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,SHORT),1.0F)
            .build();
    public static final FoodComponent COOKED_GLOWING_RABBIT_SKEWER = fnfGlowedSkewer(6)
            .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST,SHORT),1.0F)
            .build();

    //Modded Food Item Method
    private static FoodComponent.Builder fnfHoneyed(int hunger) {
        return new FoodComponent.Builder().nutrition(hunger).statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH),1.0F);
    }
    private static FoodComponent.Builder fnfStew(int hunger) {
        return new FoodComponent.Builder().nutrition(hunger).saturationModifier(1F).usingConvertsTo(Items.BOWL);
    }
    private static FoodComponent.Builder fnfRawSkewer(int hunger) {
        return new FoodComponent.Builder().nutrition(hunger).saturationModifier(0.3F).snack().usingConvertsTo(Items.STICK);
    }
    private static FoodComponent.Builder fnfCookedSkewer(int hunger) {
        return new FoodComponent.Builder().nutrition(hunger).saturationModifier(0.3F).snack().usingConvertsTo(Items.STICK)
                .statusEffect(new StatusEffectInstance(StatusEffects.SPEED,SHORT,1),1.0F);
    }
    private static FoodComponent.Builder fnfGlowedSkewer(int hunger) {
        return new FoodComponent.Builder().nutrition(hunger).saturationModifier(0.3F).snack().usingConvertsTo(Items.STICK)
                .statusEffect(new StatusEffectInstance(StatusEffects.HASTE,SHORT,1),1.0F)
                .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION,SHORT),1.0F);
    }
}
