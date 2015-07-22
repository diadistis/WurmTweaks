package tweaks.wurm.event;

import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;

import com.bioxx.tfc.TileEntities.TEIngotPile;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class BlockEvent {
	
	@SubscribeEvent
	public void onBreakBlock(BreakEvent event) {
		
		TileEntity entity = event.world.getTileEntity(event.x, event.y, event.z);
		
		if(entity instanceof TEIngotPile){
			event.world.createExplosion(event.getPlayer(), event.x, event.y, event.z, 5, true);
			event.setCanceled(true);

		}
	}
}
