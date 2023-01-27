package net.mcreator.coolercooking.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.client.gui.components.Checkbox;

import net.mcreator.coolercooking.init.CoolerCookingModItems;

import java.util.function.Supplier;
import java.util.Map;
import java.util.HashMap;

public class RollingStationClickedProcedure {
	public static void execute(Entity entity, HashMap guistate) {
		if (entity == null || guistate == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == CoolerCookingModItems.ROLLING_PIN
				.get()) {
			if (guistate.containsKey("checkbox:penneCheck") ? ((Checkbox) guistate.get("checkbox:penneCheck")).selected() : false) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					((Slot) _slots.get(0)).remove(1);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.ORANGE_CANDLE);
					_setstack.setCount(1);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			}
			if (guistate.containsKey("checkbox:gnocciCheck") ? ((Checkbox) guistate.get("checkbox:gnocciCheck")).selected() : false) {
				if (entity instanceof Player _player) {
					_player.getAbilities().flying = (true);
					_player.onUpdateAbilities();
				}
			}
		}
	}
}
