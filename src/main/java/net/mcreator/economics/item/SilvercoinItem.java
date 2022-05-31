
package net.mcreator.economics.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.economics.init.EconomicsModTabs;

public class SilvercoinItem extends Item {
	public SilvercoinItem() {
		super(new Item.Properties().tab(EconomicsModTabs.TAB_ECONOMY).stacksTo(64).rarity(Rarity.UNCOMMON));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
