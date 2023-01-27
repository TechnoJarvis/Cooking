
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.coolercooking.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.coolercooking.item.UncookedpatsaItem;
import net.mcreator.coolercooking.item.RollingPinItem;
import net.mcreator.coolercooking.CoolerCookingMod;

public class CoolerCookingModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CoolerCookingMod.MODID);
	public static final RegistryObject<Item> UNCOOKEDPATSA = REGISTRY.register("uncookedpatsa", () -> new UncookedpatsaItem());
	public static final RegistryObject<Item> ROLLING_PIN = REGISTRY.register("rolling_pin", () -> new RollingPinItem());
	public static final RegistryObject<Item> ROLLING_STATION = block(CoolerCookingModBlocks.ROLLING_STATION, CreativeModeTab.TAB_BUILDING_BLOCKS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
