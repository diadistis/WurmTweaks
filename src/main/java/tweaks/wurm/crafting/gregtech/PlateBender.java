package tweaks.wurm.crafting.gregtech;

import gregtech.api.enums.GT_Values;
import gregtech.api.util.GT_Recipe.GT_Recipe_Map;
import net.minecraft.item.ItemStack;

import com.bioxx.tfc.api.TFCItems;

public class PlateBender {
	
	public static void AddRecipes() {
		
		GT_Recipe_Map.sBenderRecipes.mRecipeList.clear();
		GT_Values.RA.addBenderRecipe(new ItemStack(TFCItems.BismuthIngot,1), new ItemStack(TFCItems.BismuthSheet), 10, 8);
		GT_Values.RA.addBenderRecipe(new ItemStack(TFCItems.BismuthBronzeIngot,1), new ItemStack(TFCItems.BismuthBronzeSheet), 10, 8);
		GT_Values.RA.addBenderRecipe(new ItemStack(TFCItems.BismuthIngot,1), new ItemStack(TFCItems.BismuthSheet), 10, 8);
		GT_Values.RA.addBenderRecipe(new ItemStack(TFCItems.BlackBronzeIngot,1), new ItemStack(TFCItems.BlackBronzeSheet), 10, 8);
		GT_Values.RA.addBenderRecipe(new ItemStack(TFCItems.BismuthIngot,1), new ItemStack(TFCItems.BismuthSheet), 10, 8);
		GT_Values.RA.addBenderRecipe(new ItemStack(TFCItems.BlackSteelIngot,1), new ItemStack(TFCItems.BlackSteelSheet), 10, 8);
		GT_Values.RA.addBenderRecipe(new ItemStack(TFCItems.BlueSteelIngot,1), new ItemStack(TFCItems.BlueSteelSheet), 10, 8);
		GT_Values.RA.addBenderRecipe(new ItemStack(TFCItems.BrassIngot,1), new ItemStack(TFCItems.BrassSheet), 10, 8);
		GT_Values.RA.addBenderRecipe(new ItemStack(TFCItems.BronzeIngot,1), new ItemStack(TFCItems.BronzeSheet), 10, 8);
		GT_Values.RA.addBenderRecipe(new ItemStack(TFCItems.CopperIngot,1), new ItemStack(TFCItems.CopperSheet), 10, 8);
		GT_Values.RA.addBenderRecipe(new ItemStack(TFCItems.GoldIngot,1), new ItemStack(TFCItems.GoldSheet), 10, 8);
		GT_Values.RA.addBenderRecipe(new ItemStack(TFCItems.WroughtIronIngot,1), new ItemStack(TFCItems.WroughtIronSheet), 10, 8);
		GT_Values.RA.addBenderRecipe(new ItemStack(TFCItems.LeadIngot,1), new ItemStack(TFCItems.LeadSheet), 10, 8);
		GT_Values.RA.addBenderRecipe(new ItemStack(TFCItems.NickelIngot,1), new ItemStack(TFCItems.NickelSheet), 10, 8);
		GT_Values.RA.addBenderRecipe(new ItemStack(TFCItems.PigIronIngot,1), new ItemStack(TFCItems.PigIronSheet), 10, 8);
		GT_Values.RA.addBenderRecipe(new ItemStack(TFCItems.PlatinumIngot,1), new ItemStack(TFCItems.PlatinumSheet), 10, 8);
		GT_Values.RA.addBenderRecipe(new ItemStack(TFCItems.RedSteelIngot,1), new ItemStack(TFCItems.RedSteelSheet), 10, 8);
		GT_Values.RA.addBenderRecipe(new ItemStack(TFCItems.RoseGoldIngot,1), new ItemStack(TFCItems.RoseGoldSheet), 10, 8);
		GT_Values.RA.addBenderRecipe(new ItemStack(TFCItems.SilverIngot,1), new ItemStack(TFCItems.SilverSheet), 10, 8);
		GT_Values.RA.addBenderRecipe(new ItemStack(TFCItems.SteelIngot,1), new ItemStack(TFCItems.SteelSheet), 10, 8);
		GT_Values.RA.addBenderRecipe(new ItemStack(TFCItems.SterlingSilverIngot,1), new ItemStack(TFCItems.SterlingSilverSheet), 10, 8);
		GT_Values.RA.addBenderRecipe(new ItemStack(TFCItems.TinIngot,1), new ItemStack(TFCItems.TinSheet), 10, 8);
		GT_Values.RA.addBenderRecipe(new ItemStack(TFCItems.ZincIngot,1), new ItemStack(TFCItems.ZincSheet), 10, 8);
		GT_Values.RA.addBenderRecipe(new ItemStack(TFCItems.BismuthIngot,1), new ItemStack(TFCItems.BismuthSheet), 10, 8);
		GT_Values.RA.addBenderRecipe(new ItemStack(tweaks.wurm.items.ModItems.RedAlloyIngot,1), new ItemStack(tweaks.wurm.items.ModItems.RedAlloySheet), 10, 8);
		
	}
}
