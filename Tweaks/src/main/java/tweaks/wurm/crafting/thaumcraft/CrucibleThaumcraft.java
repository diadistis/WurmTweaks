package tweaks.wurm.crafting.thaumcraft;

import net.minecraft.item.ItemStack;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.common.config.ConfigItems;
import tweaks.wurm.utils.thaumcraft.CrucibleRecipe;
import tweaks.wurm.utils.thaumcraft.Research;

import com.bioxx.tfc.api.TFCItems;

public class CrucibleThaumcraft {
	public static void addCrucible() {
		
		CrucibleRecipe.addRecipe("THAUMATORIUM", new ItemStack(ConfigItems.itemResource,1,2), new ItemStack(TFCItems.RedSteelIngot), new AspectList().add(Aspect.MAGIC,10).add(Aspect.EXCHANGE,5));
		
	}
	
	public static void RefreshBook() {
		
		Research.RefreshResearch("THAUMATORIUM");
		
	}
}
