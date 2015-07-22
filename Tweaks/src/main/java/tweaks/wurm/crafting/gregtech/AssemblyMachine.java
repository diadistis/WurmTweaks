package tweaks.wurm.crafting.gregtech;

import gregtech.api.GregTech_API;
import gregtech.api.util.GT_Recipe.GT_Recipe_Map;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import com.bioxx.tfc.api.TFCBlocks;
import com.bioxx.tfc.api.TFCItems;

public class AssemblyMachine {
	
	public static void addRecipe() {		
		GT_Recipe_Map.sAssemblerRecipes.mRecipeList.clear();
		GregTech_API.sRecipeAdder.addAssemblerRecipe(new ItemStack(Blocks.cobblestone,1,0), new ItemStack(TFCItems.Stick) , new ItemStack(Blocks.lever), 10, 32);
		GregTech_API.sRecipeAdder.addAssemblerRecipe(OreDictionary.getOres("oc:materialTransistor").get(0),new ItemStack(Items.redstone,8,0),OreDictionary.getOres("oc:materialALU").get(0), 10, 32);
		GregTech_API.sRecipeAdder.addAssemblerRecipe(new ItemStack(TFCItems.GoldIngot,8,0),new ItemStack(Items.redstone,8,0),OreDictionary.getOres("oc:materialCU").get(0), 10, 32);
		GregTech_API.sRecipeAdder.addAssemblerRecipe(new ItemStack(TFCItems.WroughtIronSheet,8,0),new ItemStack(Items.redstone,8,0),OreDictionary.getOres("oc:materialTransistor").get(0), 10, 32);
		GregTech_API.sRecipeAdder.addAssemblerRecipe(OreDictionary.getOres("oc:materialTransistor").get(0),OreDictionary.getOres("oc:circuitChip1").get(0),OreDictionary.getOres("oc:ram1").get(0), 10, 32);
		GregTech_API.sRecipeAdder.addAssemblerRecipe(OreDictionary.getOres("oc:ram1").get(0),OreDictionary.getOres("oc:ram1").get(0),OreDictionary.getOres("oc:ram2").get(0), 10, 32);
		GregTech_API.sRecipeAdder.addAssemblerRecipe(OreDictionary.getOres("oc:materialTransistor").get(0),OreDictionary.getOres("oc:circuitChip2").get(0),OreDictionary.getOres("oc:ram3").get(0), 10, 32);
		GregTech_API.sRecipeAdder.addAssemblerRecipe(OreDictionary.getOres("oc:ram3").get(0),OreDictionary.getOres("oc:ram3").get(0),OreDictionary.getOres("oc:ram4").get(0), 10, 32);
		GregTech_API.sRecipeAdder.addAssemblerRecipe(OreDictionary.getOres("oc:materialTransistor").get(0),OreDictionary.getOres("oc:circuitChip3").get(0),OreDictionary.getOres("oc:ram5").get(0), 10, 32);
		GregTech_API.sRecipeAdder.addAssemblerRecipe(OreDictionary.getOres("oc:ram5").get(0),OreDictionary.getOres("oc:ram5").get(0),OreDictionary.getOres("oc:ram6").get(0), 10, 32);
		GregTech_API.sRecipeAdder.addAssemblerRecipe(new ItemStack(TFCBlocks.Planks,8,0),null, new ItemStack(Blocks.chest),10, 32);
		GregTech_API.sRecipeAdder.addAssemblerRecipe(new ItemStack(TFCBlocks.Planks,8,1),null, new ItemStack(Blocks.chest),10, 32);
		GregTech_API.sRecipeAdder.addAssemblerRecipe(new ItemStack(TFCBlocks.Planks,8,2),null, new ItemStack(Blocks.chest),10, 32);
		GregTech_API.sRecipeAdder.addAssemblerRecipe(new ItemStack(TFCBlocks.Planks,8,3),null, new ItemStack(Blocks.chest),10, 32);
		GregTech_API.sRecipeAdder.addAssemblerRecipe(new ItemStack(TFCBlocks.Planks,8,4),null, new ItemStack(Blocks.chest),10, 32);
		GregTech_API.sRecipeAdder.addAssemblerRecipe(new ItemStack(TFCBlocks.Planks,8,5),null, new ItemStack(Blocks.chest),10, 32);
		GregTech_API.sRecipeAdder.addAssemblerRecipe(new ItemStack(TFCBlocks.Planks,8,6),null, new ItemStack(Blocks.chest),10, 32);
		GregTech_API.sRecipeAdder.addAssemblerRecipe(new ItemStack(TFCBlocks.Planks,8,7),null, new ItemStack(Blocks.chest),10, 32);
		GregTech_API.sRecipeAdder.addAssemblerRecipe(new ItemStack(TFCBlocks.Planks,8,8),null, new ItemStack(Blocks.chest),10, 32);
		GregTech_API.sRecipeAdder.addAssemblerRecipe(new ItemStack(TFCBlocks.Planks,8,9),null, new ItemStack(Blocks.chest),10, 32);
		GregTech_API.sRecipeAdder.addAssemblerRecipe(new ItemStack(TFCBlocks.Planks,8,10),null, new ItemStack(Blocks.chest),10, 32);
		GregTech_API.sRecipeAdder.addAssemblerRecipe(new ItemStack(TFCBlocks.Planks,8,11),null, new ItemStack(Blocks.chest),10, 32);
		GregTech_API.sRecipeAdder.addAssemblerRecipe(new ItemStack(TFCBlocks.Planks,8,12),null, new ItemStack(Blocks.chest),10, 32);
		GregTech_API.sRecipeAdder.addAssemblerRecipe(new ItemStack(TFCBlocks.Planks,8,13),null, new ItemStack(Blocks.chest),10, 32);
		GregTech_API.sRecipeAdder.addAssemblerRecipe(new ItemStack(TFCBlocks.Planks,8,14),null, new ItemStack(Blocks.chest),10, 32);
		GregTech_API.sRecipeAdder.addAssemblerRecipe(new ItemStack(TFCBlocks.Planks,8,15),null, new ItemStack(Blocks.chest),10, 32);
		GregTech_API.sRecipeAdder.addAssemblerRecipe(OreDictionary.getOres("oc:circuitChip1").get(0),new ItemStack(TFCItems.SteelIngot),OreDictionary.getOres("oc:materialTransistor").get(0), 10, 32);
		GregTech_API.sRecipeAdder.addAssemblerRecipe(OreDictionary.getOres("oc:circuitChip2").get(0),new ItemStack(TFCItems.SteelIngot),OreDictionary.getOres("oc:circuitChip1").get(0), 10, 32);
		GregTech_API.sRecipeAdder.addAssemblerRecipe(OreDictionary.getOres("oc:circuitChip3").get(0),new ItemStack(TFCItems.SteelIngot),OreDictionary.getOres("oc:circuitChip2").get(0), 10, 32);
		GregTech_API.sRecipeAdder.addAssemblerRecipe(new ItemStack(Blocks.stone_button),null, new ItemStack(Blocks.stone),10, 32);
		GregTech_API.sRecipeAdder.addAssemblerRecipe(new ItemStack(Items.clock),new ItemStack(Items.redstone), new ItemStack(TFCItems.GoldSheet,4),10, 32);
		GregTech_API.sRecipeAdder.addAssemblerRecipe(new ItemStack(Items.compass),new ItemStack(Items.redstone), new ItemStack(TFCItems.WroughtIronSheet,4),10, 32);
		GregTech_API.sRecipeAdder.addAssemblerRecipe(new ItemStack(Blocks.chest), new ItemStack(TFCItems.WroughtIronSheet,5),new ItemStack(Blocks.hopper),10, 32);
		GregTech_API.sRecipeAdder.addAssemblerRecipe(new ItemStack(TFCItems.WoolCloth),new ItemStack(TFCItems.WoolYarn,16),null,10, 32);
		GregTech_API.sRecipeAdder.addAssemblerRecipe(new ItemStack(TFCItems.SilkCloth),new ItemStack(Items.string,24),null,10, 32);
		GregTech_API.sRecipeAdder.addAssemblerRecipe(new ItemStack(Blocks.chest),new ItemStack(TFCItems.Logs,8,0),null,10, 32);
		GregTech_API.sRecipeAdder.addAssemblerRecipe(new ItemStack(Blocks.chest),new ItemStack(TFCItems.Logs,8,1),null,10, 32);
		GregTech_API.sRecipeAdder.addAssemblerRecipe(new ItemStack(Blocks.chest),new ItemStack(TFCItems.Logs,8,2),null,10, 32);
		GregTech_API.sRecipeAdder.addAssemblerRecipe(new ItemStack(Blocks.chest),new ItemStack(TFCItems.Logs,8,3),null,10, 32);
		GregTech_API.sRecipeAdder.addAssemblerRecipe(new ItemStack(Blocks.chest),new ItemStack(TFCItems.Logs,8,4),null,10, 32);
		GregTech_API.sRecipeAdder.addAssemblerRecipe(new ItemStack(Blocks.chest),new ItemStack(TFCItems.Logs,8,5),null,10, 32);
		GregTech_API.sRecipeAdder.addAssemblerRecipe(new ItemStack(Blocks.chest),new ItemStack(TFCItems.Logs,8,6),null,10, 32);
		GregTech_API.sRecipeAdder.addAssemblerRecipe(new ItemStack(Blocks.chest),new ItemStack(TFCItems.Logs,8,7),null,10, 32);
		GregTech_API.sRecipeAdder.addAssemblerRecipe(new ItemStack(Blocks.chest),new ItemStack(TFCItems.Logs,8,8),null,10, 32);
		GregTech_API.sRecipeAdder.addAssemblerRecipe(new ItemStack(Blocks.chest),new ItemStack(TFCItems.Logs,8,9),null,10, 32);
		GregTech_API.sRecipeAdder.addAssemblerRecipe(new ItemStack(Blocks.chest),new ItemStack(TFCItems.Logs,8,10),null,10, 32);
		GregTech_API.sRecipeAdder.addAssemblerRecipe(new ItemStack(Blocks.chest),new ItemStack(TFCItems.Logs,8,11),null,10, 32);
		GregTech_API.sRecipeAdder.addAssemblerRecipe(new ItemStack(Blocks.chest),new ItemStack(TFCItems.Logs,8,12),null,10, 32);
		GregTech_API.sRecipeAdder.addAssemblerRecipe(new ItemStack(Blocks.chest),new ItemStack(TFCItems.Logs,8,13),null,10, 32);
		GregTech_API.sRecipeAdder.addAssemblerRecipe(new ItemStack(Blocks.chest),new ItemStack(TFCItems.Logs,8,14),null,10, 32);
		GregTech_API.sRecipeAdder.addAssemblerRecipe(new ItemStack(Blocks.chest),new ItemStack(TFCItems.Logs,8,15),null,10, 32);
		GregTech_API.sRecipeAdder.addAssemblerRecipe(new ItemStack(TFCItems.WoolCloth),new ItemStack(TFCItems.WoolYarn,16,0),null,10, 32);
		GregTech_API.sRecipeAdder.addAssemblerRecipe(new ItemStack(TFCItems.SilkCloth),new ItemStack(Items.string,24,0),null,10, 32);
		GregTech_API.sRecipeAdder.addAssemblerRecipe(new ItemStack(Blocks.torch),new ItemStack(TFCItems.Coal,1,0),new ItemStack(TFCItems.Stick),10, 32);
		GregTech_API.sRecipeAdder.addAssemblerRecipe(new ItemStack(Blocks.torch),new ItemStack(TFCItems.Coal,1,1),new ItemStack(TFCItems.Stick),10, 32);
		
	}
}
