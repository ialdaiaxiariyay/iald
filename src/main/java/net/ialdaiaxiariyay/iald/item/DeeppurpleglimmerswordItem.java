
package net.ialdaiaxiariyay.iald.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.ialdaiaxiariyay.iald.itemgroup.IaldcaItemGroup;
import net.ialdaiaxiariyay.iald.IaldModElements;

@IaldModElements.ModElement.Tag
public class DeeppurpleglimmerswordItem extends IaldModElements.ModElement {
	@ObjectHolder("iald:deeppurpleglimmer_sword")
	public static final Item block = null;

	public DeeppurpleglimmerswordItem(IaldModElements instance) {
		super(instance, 14);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 15000;
			}

			public float getEfficiency() {
				return 15f;
			}

			public float getAttackDamage() {
				return 998f;
			}

			public int getHarvestLevel() {
				return 10;
			}

			public int getEnchantability() {
				return 40;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(DeeppurpleglimmerItem.block));
			}
		}, 3, 96f, new Item.Properties().group(IaldcaItemGroup.tab).isImmuneToFire()) {
		}.setRegistryName("deeppurpleglimmer_sword"));
	}
}
