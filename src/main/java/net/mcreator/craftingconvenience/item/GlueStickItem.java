package net.mcreator.craftingconvenience.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.craftingconvenience.procedures.GlueStickPlayerFinishesUsingItemProcedure;
import net.mcreator.craftingconvenience.init.CraftingconvenienceModItems;

public class GlueStickItem extends Item {
	public GlueStickItem() {
		super(new Item.Properties().food((new FoodProperties.Builder()).nutrition(1).saturationMod(1f).alwaysEat().build()));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.DRINK;
	}

	@Override
	public boolean hasCraftingRemainingItem() {
		return true;
	}

	@Override
	public ItemStack getCraftingRemainingItem(ItemStack itemstack) {
		return new ItemStack(CraftingconvenienceModItems.GLUE_STICK.get());
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		GlueStickPlayerFinishesUsingItemProcedure.execute(entity);
		return retval;
	}
}