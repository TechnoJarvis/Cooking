
package net.mcreator.coolercooking.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class RollingPinItem extends Item {
	public RollingPinItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS).stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.BLOCK;
	}
}
