package tweaks.wurm.crafting.gregtech;

import gregtech.api.GregTech_API;
import gregtech.api.util.GT_Recipe.GT_Recipe_Map;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.bioxx.tfc.api.TFCItems;
import com.brandon3055.draconicevolution.common.ModItems;
import com.rwtema.extrautils.ExtraUtils;

public class AlloySmelter {
	
	public static void addRecipe() {
		GT_Recipe_Map.sAlloySmelterRecipes.mRecipeList.clear();
		GregTech_API.sRecipeAdder.addAlloySmelterRecipe(new ItemStack(tweaks.wurm.items.ModItems.Hafmium,4), new ItemStack(tweaks.wurm.items.ModItems.Francium,4),new ItemStack(ModItems.draconiumIngot), 800, 128);
		GregTech_API.sRecipeAdder.addAlloySmelterRecipe(new ItemStack(ExtraUtils.bedrockium,4), new ItemStack(tweaks.wurm.items.ModItems.MixedSheet,4),new ItemStack(ExtraUtils.divisionSigil), 800, 32);
		GregTech_API.sRecipeAdder.addAlloySmelterRecipe(new ItemStack(Items.redstone,16), new ItemStack(TFCItems.WroughtIronIngot,4,0),new ItemStack(tweaks.wurm.items.ModItems.RedAlloyIngot,4,0), 300, 8);
		GregTech_API.sRecipeAdder.addAlloySmelterRecipe(new ItemStack(TFCItems.CopperIngot,3), new ItemStack(TFCItems.TinIngot,1,0),new ItemStack(TFCItems.BronzeIngot,4,0), 800, 128);
		GregTech_API.sRecipeAdder.addAlloySmelterRecipe(new ItemStack(TFCItems.CopperIngot,3), new ItemStack(TFCItems.ZincIngot,1,0),new ItemStack(TFCItems.BrassIngot,4,0), 800, 128);
		GregTech_API.sRecipeAdder.addAlloySmelterRecipe(new ItemStack(TFCItems.CopperIngot,1), new ItemStack(TFCItems.GoldIngot,3,0),new ItemStack(TFCItems.RoseGoldIngot,4,0), 800, 128);
		GregTech_API.sRecipeAdder.addAlloySmelterRecipe(new ItemStack(TFCItems.CopperIngot,2), new ItemStack(TFCItems.SilverIngot,5,0),new ItemStack(TFCItems.SterlingSilverIngot,7,0), 800, 128);
	}
}