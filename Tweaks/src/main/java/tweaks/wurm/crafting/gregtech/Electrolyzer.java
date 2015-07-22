package tweaks.wurm.crafting.gregtech;

import gregtech.api.enums.GT_Values;
import gregtech.api.util.GT_Recipe.GT_Recipe_Map;
import net.minecraft.item.ItemStack;

import com.bioxx.tfc.api.TFCItems;

public class Electrolyzer {
	
	public static void AddRecipes() {
		GT_Recipe_Map.sElectrolyzerRecipes.mRecipeList.clear();
		
		GT_Values.RA.addElectrolyzerRecipe(new ItemStack(tweaks.wurm.items.ModItems.MixedSheet,1,0),0, new ItemStack(com.lulan.shincolle.init.ModItems.AbyssMetal,2,1), null, null, null, null, null, 100,32);
		GT_Values.RA.addElectrolyzerRecipe(new ItemStack(TFCItems.OreChunk,1,26),0, new ItemStack(TFCItems.OreChunk,1,8),null,null,null,null,null, 200,128);
		GT_Values.RA.addElectrolyzerRecipe(new ItemStack(TFCItems.LeadIngot),0, new ItemStack(TFCItems.SmallOreChunk,1,51),null,null,null,null,null,50,32);
		
	}
}
