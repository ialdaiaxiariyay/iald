
package net.ialdaiaxiariyay.iald.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ArmorItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.Entity;

import net.ialdaiaxiariyay.iald.itemgroup.IaldcaItemGroup;
import net.ialdaiaxiariyay.iald.IaldModElements;

@IaldModElements.ModElement.Tag
public class DeeppurpleglimmerarmorItem extends IaldModElements.ModElement {
	@ObjectHolder("iald:deeppurpleglimmer_armor_helmet")
	public static final Item helmet = null;
	@ObjectHolder("iald:deeppurpleglimmer_armor_chestplate")
	public static final Item body = null;
	@ObjectHolder("iald:deeppurpleglimmer_armor_leggings")
	public static final Item legs = null;
	@ObjectHolder("iald:deeppurpleglimmer_armor_boots")
	public static final Item boots = null;

	public DeeppurpleglimmerarmorItem(IaldModElements instance) {
		super(instance, 13);
	}

	@Override
	public void initElements() {
		IArmorMaterial armormaterial = new IArmorMaterial() {
			@Override
			public int getDurability(EquipmentSlotType slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 80;
			}

			@Override
			public int getDamageReductionAmount(EquipmentSlotType slot) {
				return new int[]{99, 50, 50, 50}[slot.getIndex()];
			}

			@Override
			public int getEnchantability() {
				return 9;
			}

			@Override
			public net.minecraft.util.SoundEvent getSoundEvent() {
				return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(DeeppurpleglimmerItem.block));
			}

			@OnlyIn(Dist.CLIENT)
			@Override
			public String getName() {
				return "deeppurpleglimmer_armor";
			}

			@Override
			public float getToughness() {
				return 8f;
			}

			@Override
			public float getKnockbackResistance() {
				return 1f;
			}
		};
		elements.items
				.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.HEAD, new Item.Properties().group(IaldcaItemGroup.tab).isImmuneToFire()) {
					@Override
					public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
						return "iald:textures/models/armor/ialdcomeds_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
					}
				}.setRegistryName("deeppurpleglimmer_armor_helmet"));
		elements.items
				.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.CHEST, new Item.Properties().group(IaldcaItemGroup.tab).isImmuneToFire()) {
					@Override
					public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
						return "iald:textures/models/armor/ialdcomeds_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
					}
				}.setRegistryName("deeppurpleglimmer_armor_chestplate"));
		elements.items
				.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.LEGS, new Item.Properties().group(IaldcaItemGroup.tab).isImmuneToFire()) {
					@Override
					public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
						return "iald:textures/models/armor/ialdcomeds_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
					}
				}.setRegistryName("deeppurpleglimmer_armor_leggings"));
		elements.items
				.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.FEET, new Item.Properties().group(IaldcaItemGroup.tab).isImmuneToFire()) {
					@Override
					public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
						return "iald:textures/models/armor/ialdcomeds_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
					}
				}.setRegistryName("deeppurpleglimmer_armor_boots"));
	}

}
