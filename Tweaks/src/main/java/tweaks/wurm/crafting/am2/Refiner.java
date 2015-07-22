package tweaks.wurm.crafting.am2;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import am2.api.IAMRecipeManager;
import am2.blocks.RecipesEssenceRefiner;
import am2.items.ItemsCommonProxy;

import com.bioxx.tfc.api.TFCItems;


public class Refiner implements IAMRecipeManager{
	
	public void add(ItemStack Output, ItemStack a, ItemStack b,ItemStack c,ItemStack d,ItemStack e) {
		

		ItemStack[] stack  = new ItemStack[] { a, b,c,d,e};
	    
		addRefinerRecipe(Output,stack);
		
	}
	
	@Override
	public void addRefinerRecipe(ItemStack arg0, ItemStack[] arg1) {
		
		
	}
	
	public static void addRecipes(){
		
		RecipesEssenceRefiner.essenceRefinement().AddRecipe(new ItemStack[]{new ItemStack(Items.blaze_powder), new ItemStack(TFCItems.Coal,1,0), new ItemStack(TFCItems.Coal), new ItemStack(Items.blaze_powder), new ItemStack(ItemsCommonProxy.itemOre,1,2),new ItemStack(ItemsCommonProxy.essence,1,3)}, new ItemStack(ItemsCommonProxy.essence,1,3));
	
	}
}
	
