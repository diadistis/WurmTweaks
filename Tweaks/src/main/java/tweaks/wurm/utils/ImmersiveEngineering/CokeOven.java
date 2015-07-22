package tweaks.wurm.utils.ImmersiveEngineering;

import com.bioxx.tfc.api.TFCItems;

import net.minecraft.item.ItemStack;
import blusunrize.immersiveengineering.api.CokeOvenRecipe;
import blusunrize.immersiveengineering.common.IEContent;

public class CokeOven {
	
	public static void fixRecipes() {
		
		CokeOvenRecipe.recipeList.clear();
		
		CokeOvenRecipe.addRecipe(new ItemStack(IEContent.itemMaterial,1,6), "wurmfuel", 800, 100);
		CokeOvenRecipe.addRecipe(new ItemStack(TFCItems.Coal,1,1), "wurmlog", 800, 50);
		
	}
}
