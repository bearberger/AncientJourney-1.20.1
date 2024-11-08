package net.bearberger.ancientjourney.item;

import net.bearberger.ancientjourney.AncientJourney;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class AncientJourneyItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AncientJourney.MOD_ID);

    public static final RegistryObject<Item> GLACIALDUST = ITEMS.register("glacial_dust",
            () -> new Item (new Item.Properties()));
    public static final RegistryObject<Item> GLACIALINGOT = ITEMS.register("glacial_ingot",
            () -> new Item (new Item.Properties()));
    public static final RegistryObject<Item> GLACIALSHEET = ITEMS.register("glacial_sheet",
            () -> new Item (new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
