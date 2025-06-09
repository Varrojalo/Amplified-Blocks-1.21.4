package com.varrojalo.amplifiedblocksmod.item;

import com.varrojalo.amplifiedblocksmod.AmplifiedBlocksMod;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(AmplifiedBlocksMod.MOD_ID);

    public static final DeferredItem<Item> MESH = ITEMS.registerItem("mesh", Item::new, new Item.Properties());
    public static final DeferredItem<Item> FILTER = ITEMS.registerItem("filter", Item::new, new Item.Properties());
    //public static final DeferredItem<Item> EXAMPLE_ITEM = ITEMS.registerSimpleItem("example_item", new Item.Properties().food(new FoodProperties.Builder().alwaysEdible().nutrition(1).saturationModifier(2f).build()));

    //public static final DeferredItem<BlockItem> EXAMPLE_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("example_block", EXAMPLE_BLOCK);

    //<editor-fold desc="Rubber items registration">
    public static final DeferredItem<Item> RAW_RUBBER = ITEMS.registerItem("raw_rubber", Item::new, new Item.Properties());
    public static final DeferredItem<Item> WHITE_RUBBER = ITEMS.registerItem("white_rubber", Item::new, new Item.Properties());
    public static final DeferredItem<Item> ORANGE_RUBBER = ITEMS.registerItem("orange_rubber", Item::new, new Item.Properties());
    public static final DeferredItem<Item> MAGENTA_RUBBER = ITEMS.registerItem("magenta_rubber", Item::new, new Item.Properties());
    public static final DeferredItem<Item> LIGHT_BLUE_RUBBER = ITEMS.registerItem("light_blue_rubber", Item::new, new Item.Properties());
    public static final DeferredItem<Item> YELLOW_RUBBER = ITEMS.registerItem("yellow_rubber", Item::new, new Item.Properties());
    public static final DeferredItem<Item> LIME_RUBBER = ITEMS.registerItem("lime_rubber", Item::new, new Item.Properties());
    public static final DeferredItem<Item> PINK_RUBBER = ITEMS.registerItem("pink_rubber", Item::new, new Item.Properties());
    public static final DeferredItem<Item> GRAY_RUBBER = ITEMS.registerItem("gray_rubber", Item::new, new Item.Properties());
    public static final DeferredItem<Item> LIGHT_GRAY_RUBBER = ITEMS.registerItem("light_gray_rubber", Item::new, new Item.Properties());
    public static final DeferredItem<Item> CYAN_RUBBER = ITEMS.registerItem("cyan_rubber", Item::new, new Item.Properties());
    public static final DeferredItem<Item> PURPLE_RUBBER = ITEMS.registerItem("purple_rubber", Item::new, new Item.Properties());
    public static final DeferredItem<Item> BLUE_RUBBER = ITEMS.registerItem("blue_rubber", Item::new, new Item.Properties());
    public static final DeferredItem<Item> BROWN_RUBBER = ITEMS.registerItem("brown_rubber", Item::new, new Item.Properties());
    public static final DeferredItem<Item> GREEN_RUBBER = ITEMS.registerItem("green_rubber", Item::new, new Item.Properties());
    public static final DeferredItem<Item> RED_RUBBER = ITEMS.registerItem("red_rubber", Item::new, new Item.Properties());
    public static final DeferredItem<Item> BLACK_RUBBER = ITEMS.registerItem("black_rubber", Item::new, new Item.Properties());
    //</editor-fold>

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
