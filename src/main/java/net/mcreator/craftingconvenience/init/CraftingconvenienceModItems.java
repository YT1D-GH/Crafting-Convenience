/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftingconvenience.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.craftingconvenience.item.*;
import net.mcreator.craftingconvenience.CraftingconvenienceMod;

public class CraftingconvenienceModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CraftingconvenienceMod.MODID);
	public static final RegistryObject<Item> EMERALD_NUGGET;
	public static final RegistryObject<Item> CHAINMAIL_PICKAXE;
	public static final RegistryObject<Item> CHAINMAIL_AXE;
	public static final RegistryObject<Item> CHAINMAIL_SWORD;
	public static final RegistryObject<Item> CHAINMAIL_SHOVEL;
	public static final RegistryObject<Item> CHAINMAIL_HOE;
	public static final RegistryObject<Item> GLUE_STICK;
	static {
		EMERALD_NUGGET = REGISTRY.register("emerald_nugget", EmeraldNuggetItem::new);
		CHAINMAIL_PICKAXE = REGISTRY.register("chainmail_pickaxe", ChainmailPickaxeItem::new);
		CHAINMAIL_AXE = REGISTRY.register("chainmail_axe", ChainmailAxeItem::new);
		CHAINMAIL_SWORD = REGISTRY.register("chainmail_sword", ChainmailSwordItem::new);
		CHAINMAIL_SHOVEL = REGISTRY.register("chainmail_shovel", ChainmailShovelItem::new);
		CHAINMAIL_HOE = REGISTRY.register("chainmail_hoe", ChainmailHoeItem::new);
		GLUE_STICK = REGISTRY.register("glue_stick", GlueStickItem::new);
	}
	// Start of user code block custom items
	// End of user code block custom items
}