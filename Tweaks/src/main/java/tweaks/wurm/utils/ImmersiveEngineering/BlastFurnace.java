package tweaks.wurm.utils.ImmersiveEngineering;

import net.minecraft.item.ItemStack;
import blusunrize.immersiveengineering.api.BlastFurnaceRecipe;

import com.bioxx.tfc.api.TFCItems;

public class BlastFurnace {
	
	public static void fixRecipes() {
		
		BlastFurnaceRecipe.recipeList.clear();
		BlastFurnaceRecipe.addRecipe(new ItemStack(TFCItems.SteelIngot), "wurmiron", 200);
		BlastFurnaceRecipe.addBlastFuel("wurmfuel", 800);
		
	}
}
