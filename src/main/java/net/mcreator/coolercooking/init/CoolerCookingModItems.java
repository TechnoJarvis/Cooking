
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.coolercooking.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.coolercooking.item.UncookedPastaItem;
import net.mcreator.coolercooking.item.RollingPinItem;
import net.mcreator.coolercooking.item.RolledPastaItem;
import net.mcreator.coolercooking.CoolerCookingMod;

public class CoolerCookingModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CoolerCookingMod.MODID);
	public static final RegistryObject<Item> ROLLING_PIN = REGISTRY.register("rolling_pin", () -> new RollingPinItem());
	public static final RegistryObject<Item> ROLLED_PASTA = REGISTRY.register("rolled_pasta", () -> new RolledPastaItem());
	public static final RegistryObject<Item> UNCOOKED_PASTA = REGISTRY.register("uncooked_pasta", () -> new UncookedPastaItem());
}
