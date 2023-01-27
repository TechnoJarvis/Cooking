
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.coolercooking.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.coolercooking.block.entity.RollingStationBlockEntity;
import net.mcreator.coolercooking.CoolerCookingMod;

public class CoolerCookingModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES,
			CoolerCookingMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> ROLLING_STATION = register("rolling_station", CoolerCookingModBlocks.ROLLING_STATION,
			RollingStationBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
