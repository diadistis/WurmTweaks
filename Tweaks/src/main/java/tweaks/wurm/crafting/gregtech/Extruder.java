package tweaks.wurm.crafting.gregtech;

import gregtech.api.enums.GT_Values;
import gregtech.api.util.GT_Recipe.GT_Recipe_Map;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import com.bioxx.tfc.api.TFCItems;

public class Extruder {
	
	public static void AddRecipes() {
		GT_Recipe_Map.sExtruderRecipes.mRecipeList.clear();
		
		int Wild = OreDictionary.WILDCARD_VALUE;
		
		GT_Values.RA.addExtruderRecipe(new ItemStack(TFCItems.BismuthSheet,2),new ItemStack(TFCItems.LooseRock,1,Wild), new ItemStack(TFCItems.BismuthSheet2x), 50, 32);
		GT_Values.RA.addExtruderRecipe(new ItemStack(TFCItems.BismuthSheet,2),new ItemStack(TFCItems.LooseRock,1,Wild), new ItemStack(TFCItems.BismuthSheet2x), 50, 32);
		GT_Values.RA.addExtruderRecipe(new ItemStack(TFCItems.BismuthBronzeSheet,2),new ItemStack(TFCItems.LooseRock,1,Wild), new ItemStack(TFCItems.BismuthBronzeSheet2x), 50, 32);
		GT_Values.RA.addExtruderRecipe(new ItemStack(TFCItems.BlackBronzeSheet,2),new ItemStack(TFCItems.LooseRock,1,Wild), new ItemStack(TFCItems.BlackBronzeSheet2x), 50, 32);
		GT_Values.RA.addExtruderRecipe(new ItemStack(TFCItems.BlackSteelSheet,2),new ItemStack(TFCItems.LooseRock,1,Wild), new ItemStack(TFCItems.BlackSteelSheet2x), 50, 32);
		GT_Values.RA.addExtruderRecipe(new ItemStack(TFCItems.BlueSteelSheet,2), new ItemStack(TFCItems.LooseRock,1,Wild),new ItemStack(TFCItems.BlueSteelSheet2x), 50, 32);
		GT_Values.RA.addExtruderRecipe(new ItemStack(TFCItems.BlueSteelSheet,2), new ItemStack(TFCItems.LooseRock,1,Wild),new ItemStack(TFCItems.BlueSteelSheet2x), 50, 32);
		GT_Values.RA.addExtruderRecipe(new ItemStack(TFCItems.BrassSheet,2),new ItemStack(TFCItems.LooseRock,1,Wild), new ItemStack(TFCItems.BrassSheet2x), 50, 32);
		GT_Values.RA.addExtruderRecipe(new ItemStack(TFCItems.BronzeSheet,2),new ItemStack(TFCItems.LooseRock,1,Wild), new ItemStack(TFCItems.BronzeSheet2x), 50, 32);
		GT_Values.RA.addExtruderRecipe(new ItemStack(TFCItems.CopperSheet,2),new ItemStack(TFCItems.LooseRock,1,Wild), new ItemStack(TFCItems.CopperSheet2x), 50, 32);
		GT_Values.RA.addExtruderRecipe(new ItemStack(TFCItems.GoldSheet,2),new ItemStack(TFCItems.LooseRock,1,Wild), new ItemStack(TFCItems.GoldSheet2x), 50, 32);
		GT_Values.RA.addExtruderRecipe(new ItemStack(TFCItems.WroughtIronSheet,2),new ItemStack(TFCItems.LooseRock,1,Wild), new ItemStack(TFCItems.WroughtIronSheet2x), 50, 32);
		GT_Values.RA.addExtruderRecipe(new ItemStack(TFCItems.LeadSheet,2), new ItemStack(TFCItems.LooseRock,1,Wild),new ItemStack(TFCItems.LeadSheet2x), 50, 32);
		GT_Values.RA.addExtruderRecipe(new ItemStack(TFCItems.NickelSheet,2), new ItemStack(TFCItems.LooseRock,1,Wild),new ItemStack(TFCItems.NickelSheet2x), 50, 32);
		GT_Values.RA.addExtruderRecipe(new ItemStack(TFCItems.PigIronSheet,2), new ItemStack(TFCItems.LooseRock,1,Wild),new ItemStack(TFCItems.PigIronSheet2x), 50, 32);
		GT_Values.RA.addExtruderRecipe(new ItemStack(TFCItems.PlatinumSheet,2),new ItemStack(TFCItems.LooseRock,1,Wild), new ItemStack(TFCItems.PlatinumSheet2x), 50, 32);
		GT_Values.RA.addExtruderRecipe(new ItemStack(TFCItems.RedSteelSheet,2), new ItemStack(TFCItems.LooseRock,1,Wild),new ItemStack(TFCItems.RedSteelSheet2x), 50, 32);
		GT_Values.RA.addExtruderRecipe(new ItemStack(TFCItems.RoseGoldSheet,2),new ItemStack(TFCItems.LooseRock,1,Wild), new ItemStack(TFCItems.RoseGoldSheet2x), 50, 32);
		GT_Values.RA.addExtruderRecipe(new ItemStack(TFCItems.SilverSheet,2),new ItemStack(TFCItems.LooseRock,1,Wild), new ItemStack(TFCItems.SilverSheet2x), 50, 32);
		GT_Values.RA.addExtruderRecipe(new ItemStack(TFCItems.SteelSheet,2),new ItemStack(TFCItems.LooseRock,1,Wild), new ItemStack(TFCItems.SteelSheet2x), 50, 32);
		GT_Values.RA.addExtruderRecipe(new ItemStack(TFCItems.BismuthSheet,2),new ItemStack(TFCItems.LooseRock,1,Wild), new ItemStack(TFCItems.BismuthSheet2x), 50, 32);
		GT_Values.RA.addExtruderRecipe(new ItemStack(TFCItems.SterlingSilverSheet,2), new ItemStack(TFCItems.LooseRock,1,Wild),new ItemStack(TFCItems.SterlingSilverSheet2x), 50, 32);
		GT_Values.RA.addExtruderRecipe(new ItemStack(TFCItems.BismuthSheet,2), new ItemStack(TFCItems.LooseRock,1,Wild),new ItemStack(TFCItems.BismuthSheet2x), 50, 32);
		GT_Values.RA.addExtruderRecipe(new ItemStack(TFCItems.TinSheet,2), new ItemStack(TFCItems.LooseRock,1,Wild),new ItemStack(TFCItems.TinSheet2x), 50, 32);
		GT_Values.RA.addExtruderRecipe(new ItemStack(TFCItems.BismuthSheet,2), new ItemStack(TFCItems.LooseRock,1,Wild),new ItemStack(TFCItems.BismuthSheet2x), 50, 32);
		GT_Values.RA.addExtruderRecipe(new ItemStack(TFCItems.ZincSheet,2), new ItemStack(TFCItems.LooseRock,1,Wild),new ItemStack(TFCItems.ZincSheet2x), 50, 32);
		
	}
}
