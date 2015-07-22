package tweaks.wurm.crafting.gregtech;

import gregtech.api.enums.GT_Values;
import gregtech.api.enums.ItemList;
import gregtech.api.util.GT_Recipe.GT_Recipe_Map;
import net.minecraft.item.ItemStack;

import com.bioxx.tfc.api.TFCItems;

public class Wiremill {
	
	public static void addRecipes() {
		
		GT_Recipe_Map.sWiremillRecipes.mRecipeList.clear();
		GT_Values.RA.addWiremillRecipe(new ItemStack(ic2.api.item.IC2Items.getItem("coalDust").getItem(),8,2), ic2.api.item.IC2Items.getItem("carbonFiber"), 100, 16);
		GT_Values.RA.addWiremillRecipe(new ItemStack(TFCItems.CopperIngot), new ItemStack(ic2.api.item.IC2Items.getItem("copperCableItem").getItem(),6,1), 100, 32);
		GT_Values.RA.addWiremillRecipe(new ItemStack(TFCItems.TinIngot), new ItemStack(ic2.api.item.IC2Items.getItem("tinCableItem").getItem(),6,10), 100, 32);
		GT_Values.RA.addWiremillRecipe(new ItemStack(TFCItems.GoldIngot), new ItemStack(ic2.api.item.IC2Items.getItem("goldCableItem").getItem(),6,2), 100, 32);
		GT_Values.RA.addWiremillRecipe(new ItemStack(TFCItems.WroughtIronIngot), new ItemStack(ic2.api.item.IC2Items.getItem("ironCableItem").getItem(),6,5), 100, 32);
		GT_Values.RA.addWiremillRecipe(new ItemStack(TFCItems.CopperSheet), new ItemStack(ic2.api.item.IC2Items.getItem("copperCableItem").getItem(),8,1), 100, 32);
		GT_Values.RA.addWiremillRecipe(new ItemStack(TFCItems.TinSheet), new ItemStack(ic2.api.item.IC2Items.getItem("tinCableItem").getItem(),8,10), 100, 32);
		GT_Values.RA.addWiremillRecipe(new ItemStack(TFCItems.GoldSheet), new ItemStack(ic2.api.item.IC2Items.getItem("goldCableItem").getItem(),8,2), 100, 32);
		GT_Values.RA.addWiremillRecipe(new ItemStack(TFCItems.WroughtIronSheet), new ItemStack(ic2.api.item.IC2Items.getItem("ironCableItem").getItem(),8,5), 100, 32);
		GT_Values.RA.addWiremillRecipe(new ItemStack(TFCItems.LeadSheet),new ItemStack(ItemList.Hull_Bronze.getItem(),1,1220), 100,32);
		GT_Values.RA.addWiremillRecipe(new ItemStack(ic2.api.item.IC2Items.getItem("tinCableItem").getItem(),1,10), new ItemStack(ItemList.Hull_Bronze.getItem(),1,1240),100,32);
		GT_Values.RA.addWiremillRecipe(new ItemStack(TFCItems.ZincSheet), new ItemStack(ItemList.Hull_Bronze.getItem(),1,1260),100,32);
		GT_Values.RA.addWiremillRecipe(new ItemStack(ic2.api.item.IC2Items.getItem("ironCableItem").getItem(),1,5), new ItemStack(ItemList.Hull_Bronze.getItem(),1,1300),100,32);
		GT_Values.RA.addWiremillRecipe(new ItemStack(TFCItems.NickelSheet), new ItemStack(ItemList.Hull_Bronze.getItem(),1,1320),100,32);
		GT_Values.RA.addWiremillRecipe(new ItemStack(ic2.api.item.IC2Items.getItem("copperCableItem").getItem(),1,1), new ItemStack(ItemList.Hull_Bronze.getItem(),1,1360),100,32);
		GT_Values.RA.addWiremillRecipe(new ItemStack(ic2.api.item.IC2Items.getItem("goldCableItem").getItem(),1,2), new ItemStack(ItemList.Hull_Bronze.getItem(),1,1420),100,32);
		GT_Values.RA.addWiremillRecipe(new ItemStack(TFCItems.SilverSheet), new ItemStack(ItemList.Hull_Bronze.getItem(),1,1460),100,32);
		GT_Values.RA.addWiremillRecipe(new ItemStack(TFCItems.SteelSheet), new ItemStack(ItemList.Hull_Bronze.getItem(),1,1520),100,32);
		GT_Values.RA.addWiremillRecipe(new ItemStack(TFCItems.PlatinumSheet), new ItemStack(ItemList.Hull_Bronze.getItem(),1,1640),100,32);
		GT_Values.RA.addWiremillRecipe(new ItemStack(tweaks.wurm.items.ModItems.RedAlloySheet), new ItemStack(ItemList.Hull_Bronze.getItem(),1,2000),100,32);
		
	}
}
