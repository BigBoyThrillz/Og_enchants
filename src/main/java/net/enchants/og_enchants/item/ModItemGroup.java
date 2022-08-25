package net.enchants.og_enchants.item;

import net.enchants.og_enchants.og_enchants;
import net.enchants.og_enchants.item.ModItems;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup ENCHANTS = FabricItemGroupBuilder.build(new Identifier(og_enchants.MOD_ID, "enchants"),
            () -> new ItemStack(ModItems.LOGO));

}
