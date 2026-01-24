/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftingconvenience.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.craftingconvenience.CraftingconvenienceMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CraftingconvenienceModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CraftingconvenienceMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(CraftingconvenienceModItems.CHAINMAIL_PICKAXE.get());
			tabData.accept(CraftingconvenienceModItems.CHAINMAIL_AXE.get());
			tabData.accept(CraftingconvenienceModItems.CHAINMAIL_SHOVEL.get());
			tabData.accept(CraftingconvenienceModItems.CHAINMAIL_HOE.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(CraftingconvenienceModItems.CHAINMAIL_SWORD.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(CraftingconvenienceModItems.GLUE_STICK.get());
		}
	}
}