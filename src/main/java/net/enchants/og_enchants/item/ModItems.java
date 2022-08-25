package net.enchants.og_enchants.item;

import net.enchants.og_enchants.og_enchants;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.Identifier;


public class ModItems {

    public static final Item LOGO = registerItem("logo", new Item(new FabricItemSettings().group(ModItemGroup.ENCHANTS)));


   private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(og_enchants.MOD_ID, name), item);
    }

    public static void registerModItems(){
        og_enchants.LOGGER.info("Registering Mod Items For " + og_enchants.MOD_ID);
    }

}