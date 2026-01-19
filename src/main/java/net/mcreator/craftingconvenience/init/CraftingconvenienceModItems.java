/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftingconvenience.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.craftingconvenience.item.EmeraldNuggetItem;
import net.mcreator.craftingconvenience.CraftingconvenienceMod;

public class CraftingconvenienceModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CraftingconvenienceMod.MODID);
	public static final RegistryObject<Item> EMERALD_NUGGET;
	static {
		EMERALD_NUGGET = REGISTRY.register("emerald_nugget", EmeraldNuggetItem::new);
	}
	// Start of user code block custom items
	// End of user code block custom items
}