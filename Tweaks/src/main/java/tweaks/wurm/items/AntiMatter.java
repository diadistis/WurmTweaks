package tweaks.wurm.items;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class AntiMatter extends Item {
	
	@Override
	public void onUpdate(ItemStack item, World world, Entity entity, int p_77663_4_, boolean p_77663_5_) {
		
		if(entity instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) entity;
			if(player.inventory.armorInventory[0] == ic2.api.item.IC2Items.getItem("quantumHelmet") && player.inventory.armorInventory[1] == ic2.api.item.IC2Items.getItem("quantumBodyarmor") && player.inventory.armorInventory[2] == ic2.api.item.IC2Items.getItem("quantumLeggings") && player.inventory.armorInventory[3] == ic2.api.item.IC2Items.getItem("quantumBoots")) {
				
			} else {
				player.addPotionEffect(new PotionEffect(Potion.poison.getId(), 1, 1));
				player.addPotionEffect(new PotionEffect(Potion.blindness.getId(), 1, 1));
				player.addPotionEffect(new PotionEffect(Potion.weakness.getId(), 1, 1));
			}
		}
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public EnumRarity getRarity(ItemStack par1ItemStack){
		return EnumRarity.epic;
	}
}