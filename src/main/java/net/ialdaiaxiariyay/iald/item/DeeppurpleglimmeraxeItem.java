
package net.ialdaiaxiariyay.iald.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.ialdaiaxiariyay.iald.itemgroup.IaldcaItemGroup;
import net.ialdaiaxiariyay.iald.IaldModElements;

@IaldModElements.ModElement.Tag
public class DeeppurpleglimmeraxeItem extends IaldModElements.ModElement {
	@ObjectHolder("iald:deeppurpleglimmer_axe")
	public static final Item block = null;

	public DeeppurpleglimmeraxeItem(IaldModElements instance) {
		super(instance, 15);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 13000;
			}

			public float getEfficiency() {
				return 20f;
			}

			public float getAttackDamage() {
				return 748f;
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
		}, 1, 46f, new Item.Properties().group(IaldcaItemGroup.tab).isImmuneToFire()) {
		}.setRegistryName("deeppurpleglimmer_axe"));
	}
}
