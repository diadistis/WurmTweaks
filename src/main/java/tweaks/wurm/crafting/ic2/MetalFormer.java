package tweaks.wurm.crafting.ic2;

import ic2.api.recipe.RecipeInputItemStack;
import net.minecraft.item.ItemStack;

import com.bioxx.tfc.api.TFCItems;

public class MetalFormer {
	
	public static void RemoveAll() {
		ic2.api.recipe.Recipes.metalformerCutting.getRecipes().clear();
		ic2.api.recipe.Recipes.metalformerExtruding.getRecipes().clear();
		ic2.api.recipe.Recipes.metalformerRolling.getRecipes().clear();
	}
	
	public static void addCutting() {
		ic2.api.recipe.Recipes.metalformerCutting.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.TinSheet)), null, ic2.api.item.IC2Items.getItem("cell"));
		//ic2.api.recipe.Recipes.metalformerCutting.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.BismuthSheet,2)),null,new ItemStack(TFCItems.BismuthSheet2x));
		//ic2.api.recipe.Recipes.metalformerCutting.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.BismuthBronzeSheet,2)),null,new ItemStack(TFCItems.BismuthBronzeSheet2x));
		//ic2.api.recipe.Recipes.metalformerCutting.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.BlackBronzeSheet,2)),null,new ItemStack(TFCItems.BlackBronzeSheet2x));
		//ic2.api.recipe.Recipes.metalformerCutting.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.BlackSteelSheet,2)),null,new ItemStack(TFCItems.BlackSteelSheet2x));
		//ic2.api.recipe.Recipes.metalformerCutting.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.GoldSheet,2)),null,new ItemStack(TFCItems.GoldSheet2x));
		//ic2.api.recipe.Recipes.metalformerCutting.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.PlatinumSheet,2)),null,new ItemStack(TFCItems.PlatinumSheet2x));
		//ic2.api.recipe.Recipes.metalformerCutting.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.BlueSteelSheet,2)),null,new ItemStack(TFCItems.BlueSteelSheet2x));
		//ic2.api.recipe.Recipes.metalformerCutting.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.BronzeSheet,2)),null,new ItemStack(TFCItems.BronzeSheet2x));
		//ic2.api.recipe.Recipes.metalformerCutting.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.CopperSheet,2)),null,new ItemStack(TFCItems.CopperSheet2x));
		//ic2.api.recipe.Recipes.metalformerCutting.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.WroughtIronSheet,2)),null,new ItemStack(TFCItems.WroughtIronSheet2x));
		//ic2.api.recipe.Recipes.metalformerCutting.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.RedSteelSheet,2)),null,new ItemStack(TFCItems.RedSteelSheet2x));
		//c2.api.recipe.Recipes.metalformerCutting.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.RoseGoldSheet,2)),null,new ItemStack(TFCItems.RoseGoldSheet2x));
		//ic2.api.recipe.Recipes.metalformerCutting.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.SteelSheet,2)),null,new ItemStack(TFCItems.SteelSheet2x));
		//ic2.api.recipe.Recipes.metalformerCutting.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.ZincSheet,2)),null,new ItemStack(TFCItems.ZincSheet2x));
		//ic2.api.recipe.Recipes.metalformerCutting.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.NickelSheet,2)),null,new ItemStack(TFCItems.NickelSheet2x));
		//ic2.api.recipe.Recipes.metalformerCutting.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.BrassSheet,2)),null,new ItemStack(TFCItems.BrassSheet2x));
		//ic2.api.recipe.Recipes.metalformerCutting.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.SilverSheet,2)),null,new ItemStack(TFCItems.SilverSheet2x));
		//ic2.api.recipe.Recipes.metalformerCutting.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.SterlingSilverSheet,2)),null,new ItemStack(TFCItems.SterlingSilverSheet2x));
		//ic2.api.recipe.Recipes.metalformerCutting.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.LeadSheet,2)),null,new ItemStack(TFCItems.LeadSheet2x));

	}
	
	public static void addExtruding() {
		ic2.api.recipe.Recipes.metalformerExtruding.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.CopperIngot)), null,ic2.api.item.IC2Items.getItem("copperCableItem"));
		ic2.api.recipe.Recipes.metalformerExtruding.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.WroughtIronIngot)), null,ic2.api.item.IC2Items.getItem("ironCableItem"));
		ic2.api.recipe.Recipes.metalformerExtruding.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.TinIngot)), null,ic2.api.item.IC2Items.getItem("tinCableItem"));
		ic2.api.recipe.Recipes.metalformerExtruding.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.GoldIngot)), null,ic2.api.item.IC2Items.getItem("goldCableItem"));
	}
	
	public static void addRolling() {
		ic2.api.recipe.Recipes.metalformerRolling.addRecipe(new RecipeInputItemStack(ic2.api.item.IC2Items.getItem("mixedMetalIngot")), null,ic2.api.item.IC2Items.getItem("advancedAlloy"));
		ic2.api.recipe.Recipes.metalformerRolling.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.BismuthIngot,2)), null, new ItemStack(TFCItems.BismuthSheet));
		ic2.api.recipe.Recipes.metalformerRolling.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.BismuthBronzeIngot,2)), null, new ItemStack(TFCItems.BismuthBronzeSheet));
		ic2.api.recipe.Recipes.metalformerRolling.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.BlackBronzeIngot,2)), null, new ItemStack(TFCItems.BlackBronzeSheet));
		ic2.api.recipe.Recipes.metalformerRolling.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.BlackSteelIngot,2)), null, new ItemStack(TFCItems.BlackSteelSheet));
		ic2.api.recipe.Recipes.metalformerRolling.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.GoldIngot,2)), null, new ItemStack(TFCItems.GoldSheet));
		ic2.api.recipe.Recipes.metalformerRolling.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.PlatinumIngot,2)), null, new ItemStack(TFCItems.PlatinumSheet));
		ic2.api.recipe.Recipes.metalformerRolling.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.BlueSteelIngot,2)), null, new ItemStack(TFCItems.BlueSteelSheet));
		ic2.api.recipe.Recipes.metalformerRolling.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.BronzeIngot,2)), null, new ItemStack(TFCItems.BronzeSheet));
		ic2.api.recipe.Recipes.metalformerRolling.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.CopperIngot,2)), null, new ItemStack(TFCItems.CopperSheet));
		ic2.api.recipe.Recipes.metalformerRolling.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.WroughtIronIngot,2)), null, new ItemStack(TFCItems.WroughtIronSheet));
		ic2.api.recipe.Recipes.metalformerRolling.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.RedSteelIngot,2)), null, new ItemStack(TFCItems.RedSteelSheet));
		ic2.api.recipe.Recipes.metalformerRolling.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.RoseGoldIngot,2)), null, new ItemStack(TFCItems.RoseGoldSheet));
		ic2.api.recipe.Recipes.metalformerRolling.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.SteelIngot,2)), null, new ItemStack(TFCItems.SteelSheet));
		ic2.api.recipe.Recipes.metalformerRolling.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.TinIngot,2)), null, new ItemStack(TFCItems.TinSheet));
		ic2.api.recipe.Recipes.metalformerRolling.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.BismuthBronzeIngot2x,2)), null, new ItemStack(TFCItems.BismuthBronzeSheet2x));
		ic2.api.recipe.Recipes.metalformerRolling.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.ZincIngot,2)), null, new ItemStack(TFCItems.ZincSheet));
		ic2.api.recipe.Recipes.metalformerRolling.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.BismuthIngot2x,2)), null, new ItemStack(TFCItems.BismuthSheet2x));
		ic2.api.recipe.Recipes.metalformerRolling.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.BlackBronzeIngot2x,2)), null, new ItemStack(TFCItems.BlackBronzeSheet2x));
		ic2.api.recipe.Recipes.metalformerRolling.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.BlackSteelIngot2x,2)), null, new ItemStack(TFCItems.BlackSteelSheet2x));
		ic2.api.recipe.Recipes.metalformerRolling.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.BlueSteelIngot2x,2)), null, new ItemStack(TFCItems.BlueSteelSheet2x));
		ic2.api.recipe.Recipes.metalformerRolling.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.BronzeIngot2x,2)), null, new ItemStack(TFCItems.BronzeSheet2x));
		ic2.api.recipe.Recipes.metalformerRolling.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.CopperIngot2x,2)), null, new ItemStack(TFCItems.CopperSheet2x));
		ic2.api.recipe.Recipes.metalformerRolling.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.WroughtIronIngot2x,2)), null, new ItemStack(TFCItems.WroughtIronSheet2x));
		ic2.api.recipe.Recipes.metalformerRolling.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.RedSteelIngot2x,2)), null, new ItemStack(TFCItems.RedSteelSheet2x));
		ic2.api.recipe.Recipes.metalformerRolling.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.RoseGoldIngot2x,2)), null, new ItemStack(TFCItems.RoseGoldSheet2x));
		ic2.api.recipe.Recipes.metalformerRolling.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.SteelIngot2x,2)), null, new ItemStack(TFCItems.SteelSheet2x));
		ic2.api.recipe.Recipes.metalformerRolling.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.TinIngot2x,2)), null, new ItemStack(TFCItems.TinSheet2x));
		ic2.api.recipe.Recipes.metalformerRolling.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.ZincIngot2x,2)), null, new ItemStack(TFCItems.ZincSheet2x));
		ic2.api.recipe.Recipes.metalformerRolling.addRecipe(new RecipeInputItemStack(new ItemStack(tweaks.wurm.items.ModItems.RedAlloyIngot,2)),null,new ItemStack(tweaks.wurm.items.ModItems.RedAlloySheet));
		ic2.api.recipe.Recipes.metalformerRolling.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.BrassIngot,2)), null, new ItemStack(TFCItems.BrassSheet));
		ic2.api.recipe.Recipes.metalformerRolling.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.SilverIngot,2)), null, new ItemStack(TFCItems.SilverSheet));
		ic2.api.recipe.Recipes.metalformerRolling.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.SterlingSilverIngot,2)), null, new ItemStack(TFCItems.SterlingSilverSheet));
		ic2.api.recipe.Recipes.metalformerRolling.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.NickelIngot,2)), null, new ItemStack(TFCItems.NickelSheet));
		ic2.api.recipe.Recipes.metalformerRolling.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.LeadIngot,2)), null, new ItemStack(TFCItems.LeadSheet));
		
	}
}
