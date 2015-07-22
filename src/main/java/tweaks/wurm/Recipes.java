package tweaks.wurm;

import gregtech.api.GregTech_API;

import java.util.ArrayList;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import am2.blocks.BlocksCommonProxy;
import am2.items.ItemsCommonProxy;

import com.bioxx.tfc.api.TFCBlocks;
import com.bioxx.tfc.api.TFCItems;
import com.brandon3055.draconicevolution.common.ModItems;

import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes {
	
	public static void ReWrite() { 
		CraftingManager.getInstance().getRecipeList().clear();
	}
	
	public static void addSmelting() {
		
		GameRegistry.addSmelting(new ItemStack(TFCItems.ClayBall), new ItemStack(Items.brick), 10f);
		GameRegistry.addSmelting(ic2.api.item.IC2Items.getItem("rawcrystalmemory"), ic2.api.item.IC2Items.getItem("crystalmemory"), 5f);
		GameRegistry.addSmelting(new ItemStack(ModItems.draconiumDust), new ItemStack(ModItems.draconicIngot,1), 50f);
		GameRegistry.addSmelting(new ItemStack(TFCBlocks.Sand,1,0), new ItemStack(Blocks.glass),10f);
		GameRegistry.addSmelting(new ItemStack(TFCBlocks.Sand,1,1), new ItemStack(Blocks.glass),10f);
		GameRegistry.addSmelting(new ItemStack(TFCBlocks.Sand,1,2), new ItemStack(Blocks.glass),10f);
		GameRegistry.addSmelting(new ItemStack(TFCBlocks.Sand,1,3), new ItemStack(Blocks.glass),10f);
		GameRegistry.addSmelting(new ItemStack(TFCBlocks.Sand,1,4), new ItemStack(Blocks.glass),10f);
		GameRegistry.addSmelting(new ItemStack(TFCBlocks.Sand,1,5), new ItemStack(Blocks.glass),10f);
		GameRegistry.addSmelting(new ItemStack(TFCBlocks.Sand,1,6), new ItemStack(Blocks.glass),10f);
		GameRegistry.addSmelting(new ItemStack(TFCBlocks.Sand,1,7), new ItemStack(Blocks.glass),10f);
		GameRegistry.addSmelting(new ItemStack(TFCBlocks.Sand,1,8), new ItemStack(Blocks.glass),10f);
		GameRegistry.addSmelting(new ItemStack(tweaks.wurm.items.ModBlocks.FranciumOre,1,0), new ItemStack(tweaks.wurm.items.ModItems.Francium),10f);
		GameRegistry.addSmelting(new ItemStack(tweaks.wurm.items.ModBlocks.PaladiumOre,1,0), new ItemStack(tweaks.wurm.items.ModItems.Paladium),10f);
		GameRegistry.addSmelting(new ItemStack(tweaks.wurm.items.ModBlocks.TitaniumOre,1,0), new ItemStack(tweaks.wurm.items.ModItems.Titanium),10f);
		GameRegistry.addSmelting(new ItemStack(TFCBlocks.Sand,1,9), new ItemStack(Blocks.glass),10f);
		GameRegistry.addSmelting(new ItemStack(TFCBlocks.Sand,1,10), new ItemStack(Blocks.glass),10f);
		GameRegistry.addSmelting(new ItemStack(TFCBlocks.Sand,1,11), new ItemStack(Blocks.glass),10f);
		GameRegistry.addSmelting(new ItemStack(TFCBlocks.Sand,1,12), new ItemStack(Blocks.glass),10f);
		GameRegistry.addSmelting(new ItemStack(TFCBlocks.Sand,1,13), new ItemStack(Blocks.glass),10f);
		GameRegistry.addSmelting(new ItemStack(TFCBlocks.Sand,1,14), new ItemStack(Blocks.glass),10f);
		GameRegistry.addSmelting(new ItemStack(TFCBlocks.Sand,1,15), new ItemStack(Blocks.glass),10f);
		GameRegistry.addSmelting(new ItemStack(TFCBlocks.Sand2,1,0), new ItemStack(Blocks.glass),10f);
		GameRegistry.addSmelting(new ItemStack(TFCBlocks.Sand2,1,1), new ItemStack(Blocks.glass),10f);
		GameRegistry.addSmelting(new ItemStack(TFCBlocks.Sand2,1,2), new ItemStack(Blocks.glass),10f);
		GameRegistry.addSmelting(new ItemStack(TFCBlocks.Sand2,1,3), new ItemStack(Blocks.glass),10f);
		GameRegistry.addSmelting(new ItemStack(TFCBlocks.Sand2,1,4), new ItemStack(Blocks.glass),10f);
	    FurnaceRecipes.smelting().func_151394_a(new ItemStack(ItemsCommonProxy.itemOre, 1, 1), new ItemStack(ItemsCommonProxy.itemOre, 2, 2), 0.0F);
	    FurnaceRecipes.smelting().func_151393_a(BlocksCommonProxy.AMOres, new ItemStack(ItemsCommonProxy.itemOre, 1, 0), 0.8F);
	    
	    OreDictionary.registerOre("blockMoonstone", new ItemStack(BlocksCommonProxy.AMOres, 1, 5));
	    OreDictionary.registerOre("blockSunstone", new ItemStack(BlocksCommonProxy.AMOres, 1, 8));
	    
	    GregTech_API.sHardHammerList.add(new ItemStack(TFCItems.BlueSteelHammer));
	    GregTech_API.sHardHammerList.add(new ItemStack(TFCItems.RedSteelHammer));
	  
	   ChestGenHooks.removeItem(ChestGenHooks.DUNGEON_CHEST, new ItemStack(Items.saddle,1,-1));
	   ChestGenHooks.removeItem(ChestGenHooks.DUNGEON_CHEST, new ItemStack(Items.iron_ingot,1,-1));
	   ChestGenHooks.removeItem(ChestGenHooks.DUNGEON_CHEST, new ItemStack(Items.bread,1,-1));
	   ChestGenHooks.removeItem(ChestGenHooks.DUNGEON_CHEST, new ItemStack(Items.wheat,1,-1));
	   ChestGenHooks.removeItem(ChestGenHooks.DUNGEON_CHEST, new ItemStack(Items.string,1,-1));
	   ChestGenHooks.removeItem(ChestGenHooks.DUNGEON_CHEST, new ItemStack(Items.bucket,1,-1));
	   ChestGenHooks.removeItem(ChestGenHooks.DUNGEON_CHEST, new ItemStack(Items.golden_apple,1,-1));
	   ChestGenHooks.removeItem(ChestGenHooks.DUNGEON_CHEST, new ItemStack(Items.redstone,1,-1));
	   ChestGenHooks.removeItem(ChestGenHooks.DUNGEON_CHEST, new ItemStack(Items.record_13,1,-1));
	   ChestGenHooks.removeItem(ChestGenHooks.DUNGEON_CHEST, new ItemStack(Items.record_cat,1,-1));
	   ChestGenHooks.removeItem(ChestGenHooks.DUNGEON_CHEST, new ItemStack(Items.name_tag,1,-1));
	   ChestGenHooks.removeItem(ChestGenHooks.DUNGEON_CHEST, new ItemStack(Items.golden_horse_armor,1,-1));
	   ChestGenHooks.removeItem(ChestGenHooks.DUNGEON_CHEST, new ItemStack(Items.iron_horse_armor,1,-1));
	   ChestGenHooks.removeItem(ChestGenHooks.DUNGEON_CHEST, new ItemStack(Items.diamond_horse_armor,1,-1));
	   ChestGenHooks.removeItem(ChestGenHooks.DUNGEON_CHEST, new ItemStack(Items.enchanted_book,1,-1));
	   
	   ArrayList<ItemStack> tList = OreDictionary.getOres("dustYttrium");
	   for (int i = 0; i < tList.size(); i++) {
	       ItemStack tStack = tList.get(i);
	       tStack = tStack.copy();
	       tStack.stackSize = 1;
	       ChestGenHooks.removeItem(ChestGenHooks.DUNGEON_CHEST, new ItemStack(tStack.getItem(),1,-1));

	   }
	
	}
}
