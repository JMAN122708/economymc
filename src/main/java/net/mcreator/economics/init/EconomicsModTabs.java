
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.economics.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class EconomicsModTabs {
	public static CreativeModeTab TAB_ECONOMY;

	public static void load() {
		TAB_ECONOMY = new CreativeModeTab("tabeconomy") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(EconomicsModBlocks.COLLECTOR.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
