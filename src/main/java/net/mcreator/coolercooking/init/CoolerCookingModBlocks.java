
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.coolercooking.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.coolercooking.block.RollingStationBlock;
import net.mcreator.coolercooking.CoolerCookingMod;

public class CoolerCookingModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, CoolerCookingMod.MODID);
	public static final RegistryObject<Block> ROLLING_STATION = REGISTRY.register("rolling_station", () -> new RollingStationBlock());
}
