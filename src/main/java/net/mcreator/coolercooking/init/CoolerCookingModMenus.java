
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.coolercooking.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.coolercooking.world.inventory.RollingStationGUIMenu;
import net.mcreator.coolercooking.CoolerCookingMod;

public class CoolerCookingModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, CoolerCookingMod.MODID);
	public static final RegistryObject<MenuType<RollingStationGUIMenu>> ROLLING_STATION_GUI = REGISTRY.register("rolling_station_gui",
			() -> IForgeMenuType.create(RollingStationGUIMenu::new));
}
