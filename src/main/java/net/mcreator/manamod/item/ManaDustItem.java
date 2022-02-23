
package net.mcreator.manamod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class ManaDustItem extends Item {
	public ManaDustItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64).rarity(Rarity.UNCOMMON));
		setRegistryName("mana_dust");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
