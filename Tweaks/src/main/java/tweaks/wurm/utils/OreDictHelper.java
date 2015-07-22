package tweaks.wurm.utils;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import thaumic.tinkerer.common.core.handler.ConfigHandler;

public class OreDictHelper {
	
	   public static Object oreDictOrStack(ItemStack stack, String oreDict) {
		   
	        return OreDictionary.getOres(oreDict).isEmpty() && true ? stack : oreDict;
	        
	    }
}
