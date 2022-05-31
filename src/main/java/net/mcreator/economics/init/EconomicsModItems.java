
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.economics.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.economics.item.SilvercoinItem;
import net.mcreator.economics.item.GoldcoinItem;
import net.mcreator.economics.item.EventcoinItem;
import net.mcreator.economics.item.CoppercoinItem;
import net.mcreator.economics.EconomicsMod;

public class EconomicsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, EconomicsMod.MODID);
	public static final RegistryObject<Item> COPPERCOIN = REGISTRY.register("coppercoin", () -> new CoppercoinItem());
	public static final RegistryObject<Item> SILVERCOIN = REGISTRY.register("silvercoin", () -> new SilvercoinItem());
	public static final RegistryObject<Item> GOLDCOIN = REGISTRY.register("goldcoin", () -> new GoldcoinItem());
	public static final RegistryObject<Item> EVENTCOIN = REGISTRY.register("eventcoin", () -> new EventcoinItem());
	public static final RegistryObject<Item> COLLECTOR = block(EconomicsModBlocks.COLLECTOR, EconomicsModTabs.TAB_ECONOMY);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
