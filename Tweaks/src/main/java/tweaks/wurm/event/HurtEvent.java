package tweaks.wurm.event;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.registry.GameRegistry;

public class HurtEvent {
	private float amount;
	
	private float d = 0;
	private float e = 0;
	private float f = 0;
	private float g = 0;
	
	@SubscribeEvent
	public void Hurt(LivingHurtEvent e) {	
		
		amount = e.ammount;
		//System.out.println("Amount Before: " + e.ammount);
		if(e.entity instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) e.entity;
			if(player.getHealth() == 0) {
				player.setDead();
			}
			
			if(player.inventory.armorItemInSlot(0) != null) {
				if(player.inventory.armorItemInSlot(0).getItem() == ic2.api.item.IC2Items.getItem("nanoBoots").getItem()) {
					Calc(10,0);
				}
				if(player.inventory.armorItemInSlot(0).getItem() == ic2.api.item.IC2Items.getItem("quantumBoots").getItem()) {
					Calc(20,0);
				}
				if(player.inventory.armorItemInSlot(0).getItem() == GameRegistry.findItem("ThaumicTinkerer", "ichorclothBoots")) {
					Calc(12,0);
				}
				if(player.inventory.armorItemInSlot(0).getItem() == GameRegistry.findItem("ThaumicTinkerer", "ichorclothBootsGem")) {
					Calc(20,0);
				}
				if(player.inventory.armorItemInSlot(0).getItem() == GameRegistry.findItem("Thaumcraft", "BootsTraveller")) {
					Calc(15,0);
				}
				if(player.inventory.armorItemInSlot(0).getItem() == GameRegistry.findItem("arsmagica2", "mageBoots")) {
					Calc(10,0);
				}
				if(player.inventory.armorItemInSlot(0).getItem() == GameRegistry.findItem("arsmagica2", "battlemageBoots")) {
					Calc(20,0);
				}
			}
			if(player.inventory.armorItemInSlot(1) != null) {
				if(player.inventory.armorItemInSlot(1).getItem() == ic2.api.item.IC2Items.getItem("nanoLeggings").getItem()) {
					Calc(10,1);
				}
				if(player.inventory.armorItemInSlot(1).getItem() == ic2.api.item.IC2Items.getItem("quantumLeggings").getItem()) {
					Calc(20,1);
				}
				if(player.inventory.armorItemInSlot(1).getItem() == GameRegistry.findItem("ThaumicTinkerer", "ichorclothLegs")) {
					Calc(12,1);
				}
				if(player.inventory.armorItemInSlot(1).getItem() == GameRegistry.findItem("ThaumicTinkerer", "ichorclothLegsGem")) {
					Calc(20,1);
				}
				if(player.inventory.armorItemInSlot(1).getItem() == GameRegistry.findItem("arsmagica2", "mageLeggings")) {
					Calc(10,1);
				}
				if(player.inventory.armorItemInSlot(1).getItem() == GameRegistry.findItem("arsmagica2", "battlemageLeggings")) {
					Calc(20,1);
				}
			}
			if(player.inventory.armorItemInSlot(2) != null) {
				if(player.inventory.armorItemInSlot(2).getItem() == ic2.api.item.IC2Items.getItem("nanoBodyarmor").getItem()) {
					Calc(10,2);
				}
				if(player.inventory.armorItemInSlot(2).getItem() == ic2.api.item.IC2Items.getItem("quantumBodyarmor").getItem()) {
					Calc(20,2);
				}
				if(player.inventory.armorItemInSlot(2).getItem() == GameRegistry.findItem("ThaumicTinkerer", "ichorclothChest")) {
					Calc(12,2);
				}
				if(player.inventory.armorItemInSlot(2).getItem() == GameRegistry.findItem("ThaumicTinkerer", "ichorclothChestGem")) {
					Calc(20,2);
				}
				if(player.inventory.armorItemInSlot(2).getItem() == GameRegistry.findItem("GraviSuite", "graviChestPlate")) {
					Calc(25,2);
				}
				if(player.inventory.armorItemInSlot(2).getItem() == GameRegistry.findItem("GraviSuite", "advNanoChestPlate")) {
					Calc(20,2);
				}
				if(player.inventory.armorItemInSlot(2).getItem() == GameRegistry.findItem("simplyjetpacks", "jetpacks")) {
					Calc(20,2);
				}
				if(player.inventory.armorItemInSlot(2).getItem() == GameRegistry.findItem("arsmagica2", "battlemageArmor")) {
					Calc(20,2);
				}
				if(player.inventory.armorItemInSlot(2).getItem() == GameRegistry.findItem("arsmagica2", "mageArmor")) {
					Calc(15,2);
				}
			}
			if(player.inventory.armorItemInSlot(3) != null) {
				if(player.inventory.armorItemInSlot(3).getItem() == ic2.api.item.IC2Items.getItem("nanoHelmet").getItem()) {
					Calc(10,3);
				}
				if(player.inventory.armorItemInSlot(3).getItem() == ic2.api.item.IC2Items.getItem("quantumHelmet").getItem()) {
					Calc(20,3);
				}
				if(player.inventory.armorItemInSlot(3).getItem() == GameRegistry.findItem("ThaumicTinkerer", "ichorclothHelm")) {
					Calc(12,3);
				}
				if(player.inventory.armorItemInSlot(3).getItem() == GameRegistry.findItem("ThaumicTinkerer", "ichorclothHelmGem")) {
					Calc(20,3);
				}
				if(player.inventory.armorItemInSlot(3).getItem() == GameRegistry.findItem("AdvancedSolarPanel", "advanced_solar_helmet")) {
					Calc(12,3);
				}
				if(player.inventory.armorItemInSlot(3).getItem() == GameRegistry.findItem("AdvancedSolarPanel", "hybrid_solar_helmet")) {
					Calc(15,3);
				}
				if(player.inventory.armorItemInSlot(3).getItem() == GameRegistry.findItem("AdvancedSolarPanel", "ultimate_solar_helmet")) {
					Calc(19,3);
				}
				if(player.inventory.armorItemInSlot(3).getItem() == GameRegistry.findItem("AdvancedSolarPanel", "hybrid_solar_helmet")) {
					Calc(20,3);
				}
				if(player.inventory.armorItemInSlot(3).getItem() == GameRegistry.findItem("arsmagica2", "battlemageHood")) {
					Calc(20,3);
				}
				if(player.inventory.armorItemInSlot(3).getItem() == GameRegistry.findItem("arsmagica2", "mageHood")) {
					Calc(15,3);
				}
			}
			
			if(player.inventory.armorInventory != null) {
				e.ammount = e.ammount * (amount/e.ammount);
			}
		}
	}
	
	private void Calc(float a, int slot) {
		
		if(slot == 0) {
			d = a;
		}
		
		if(slot == 1) {
			e = a;
		}
		
		if(slot == 2) {
			f = a;
		}
		
		if(slot == 3) {
			g = a;
		}
		
		amount = (d + e + f + g);
		
	}
}
