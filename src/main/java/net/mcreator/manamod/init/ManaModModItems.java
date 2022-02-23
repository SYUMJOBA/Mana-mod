
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.manamod.init;

import net.mcreator.manamod.item.ManaStarItem;
import net.mcreator.manamod.item.ManaDustItem;
import net.mcreator.manamod.item.ManaArmorItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ManaModModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item MANA_DUST = register(new ManaDustItem());
	public static final Item MANA_STAR = register(new ManaStarItem());
	public static final Item MANA_ARMOR_HELMET = register(new ManaArmorItem.Helmet());
	public static final Item MANA_ARMOR_CHESTPLATE = register(new ManaArmorItem.Chestplate());
	public static final Item MANA_ARMOR_LEGGINGS = register(new ManaArmorItem.Leggings());
	public static final Item MANA_ARMOR_BOOTS = register(new ManaArmorItem.Boots());

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
