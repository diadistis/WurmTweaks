package tweaks.wurm.crafting.ic2;

import ic2.api.recipe.RecipeInputItemStack;
import ic2.api.recipe.Recipes;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import am2.items.ItemsCommonProxy;

import com.bioxx.tfc.api.TFCBlocks;
import com.bioxx.tfc.api.TFCItems;
public class Extractor {
	
	public static void RemoveAll() {
		ic2.api.recipe.Recipes.extractor.getRecipes().clear();
	}
	
	public static void addExtraction() {
		for(int i = 0; i < 16; i++) {
			Recipes.extractor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCBlocks.Dirt,1,i)),null,new ItemStack(Blocks.dirt,1));	
		}
		for(int i = 0; i < 5; i++) {
			Recipes.extractor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCBlocks.Dirt2,1,i)),null,new ItemStack(Blocks.dirt,1));	
		}
		for(int i = 0; i < 16; i++) {
			Recipes.extractor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCBlocks.Sand,1,i)),null,new ItemStack(Blocks.sand,1));	
		}
		for(int i = 0; i < 5; i++) {
			Recipes.extractor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCBlocks.Sand2,1,i)),null,new ItemStack(Blocks.sand,1));	
		}
		for(int i = 0; i < 16; i++) {
			Recipes.extractor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCBlocks.Gravel,1,i)),null,new ItemStack(Blocks.gravel,1));	
		}
		for(int i = 0; i < 5; i++) {
			Recipes.extractor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCBlocks.Gravel2,1,i)),null,new ItemStack(Blocks.gravel,1));	
		}
		for(int i = 0; i < 4; i++) {
			Recipes.extractor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCBlocks.StoneIgExBrick,1,i)),null,new ItemStack(Blocks.stonebrick,1));	
		}
		for(int i = 0; i < 2; i++) {
			Recipes.extractor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCBlocks.StoneIgInBrick,1,i)),null,new ItemStack(Blocks.stonebrick,1));	
		}
		for(int i = 0; i < 5; i++) {
			Recipes.extractor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCBlocks.StoneMMBrick,1,i)),null,new ItemStack(Blocks.stonebrick,1));	
		}
		for(int i = 0; i < 7; i++) {
			Recipes.extractor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCBlocks.StoneSedBrick,1,i)),null,new ItemStack(Blocks.stonebrick,1));	
		}
		Recipes.extractor.addRecipe(new RecipeInputItemStack(new ItemStack(Blocks.stonebrick,1,0)),null,new ItemStack(Blocks.brick_block,1,0));	
		Recipes.extractor.addRecipe(new RecipeInputItemStack(ic2.api.item.IC2Items.getItem("resin")),null, ic2.api.item.IC2Items.getItem("rubber"));	
		Recipes.extractor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.BlueSteelSheet)),null, new ItemStack(ItemsCommonProxy.itemOre,1,5));	
		Recipes.extractor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.RedSteelSheet)),null, new ItemStack(ItemsCommonProxy.itemOre,1,4));	
		Recipes.extractor.addRecipe(new RecipeInputItemStack(new ItemStack(Blocks.dirt)),null, new ItemStack(Blocks.grass,1,0));	

	
	}
}
