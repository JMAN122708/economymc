
/*
*    MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.economics.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.entity.npc.VillagerProfession;

import java.util.List;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class EconomicsModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
		if (event.getType() == VillagerProfession.CLERIC) {
			trades.get(3).add(new BasicItemListing(new ItemStack(EconomicsModItems.SILVERCOIN.get(), 5),
					new ItemStack(EconomicsModItems.COPPERCOIN.get(), 10), new ItemStack(EconomicsModItems.GOLDCOIN.get()), 10, 5, 0.05f));
			trades.get(2).add(new BasicItemListing(new ItemStack(EconomicsModItems.COPPERCOIN.get(), 10),
					new ItemStack(EconomicsModItems.GOLDCOIN.get()), new ItemStack(EconomicsModItems.SILVERCOIN.get(), 5), 10, 5, 0.05f));
			trades.get(1).add(new BasicItemListing(new ItemStack(EconomicsModItems.SILVERCOIN.get(), 5),
					new ItemStack(EconomicsModItems.GOLDCOIN.get()), new ItemStack(EconomicsModItems.COPPERCOIN.get(), 10), 10, 5, 0.05f));
		}
	}
}
