
package net.mcreator.economics.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.economics.init.EconomicsModTabs;

public class CoppercoinItem extends Item {
	public CoppercoinItem() {
		super(new Item.Properties().tab(EconomicsModTabs.TAB_ECONOMY).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
