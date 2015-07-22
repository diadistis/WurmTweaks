package tweaks.wurm.event;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import tweaks.wurm.items.ModItems;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.ItemCraftedEvent;

public class Crafting {
	
	@SubscribeEvent
	public void Craft(ItemCraftedEvent e) {
		EntityPlayer player = e.player;
		if (e.crafting.getItem() == ModItems.LeadPallet) {
			for(int i=0; i < e.craftMatrix.getSizeInventory(); i++)  {         
			    if(e.craftMatrix.getStackInSlot(i) != null)  {
			    	
			       ItemStack j = e.craftMatrix.getStackInSlot(i);
			       if(j.getItem() != null && j.getItem() == ModItems.UnstableMatter)  {
			    	   World world = player.worldObj;
			    	   int x = (int)player.posX;
			    	   int y = (int)player.posY;
			    	   int z = (int)player.posZ;
			    	  
			    	   if (world.canMineBlock(player, x, y,z))  {
	                       if(world.canMineBlock(player, x+-20, y,z+-20)) {
	                    	   world.createExplosion(player, x, y, z, 50, true);
	                       }
	                    }
			       }
			    }  
			}
		}
	}
}
