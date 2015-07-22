package tweaks.wurm.crafting.gregtech;

import gregtech.api.GregTech_API;
import gregtech.api.util.GT_Recipe.GT_Recipe_Map;
import micdoodle8.mods.galacticraft.core.items.GCItems;
import micdoodle8.mods.galacticraft.planets.mars.items.MarsItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import thaumcraft.common.config.ConfigItems;
import tweaks.wurm.utils.tfc.TFCFood;
import am2.blocks.BlocksCommonProxy;
import am2.items.ItemsCommonProxy;

import com.bioxx.tfc.api.TFCBlocks;
import com.bioxx.tfc.api.TFCItems;
import com.cricketcraft.chisel.init.ChiselBlocks;

public class Centerfuge {
	
	public static void addRecipe() {
		
		GT_Recipe_Map.sCentrifugeRecipes.mRecipeList.clear();
		GregTech_API.sRecipeAdder.addCentrifugeRecipe(new ItemStack(TFCItems.RoseGoldIngot), 0, new ItemStack(Items.glowstone_dust,4), new ItemStack(Items.glowstone_dust,4), new ItemStack(Items.glowstone_dust,4), new ItemStack(Items.glowstone_dust,4), new ItemStack(Items.glowstone_dust,4), new ItemStack(Items.glowstone_dust,4), 400);
		GregTech_API.sRecipeAdder.addCentrifugeRecipe(new ItemStack(TFCItems.BrassIngot), 0, new ItemStack(Items.blaze_rod,4), null, null, null, null, null, 200);
		GregTech_API.sRecipeAdder.addCentrifugeRecipe(new ItemStack(TFCItems.BlueSteelIngot), 0, new ItemStack(Items.ghast_tear,2), null, null, null, null, null, 800);
		GregTech_API.sRecipeAdder.addCentrifugeRecipe(new ItemStack(TFCItems.LeadIngot), 0, new ItemStack(Items.nether_wart,4), null, null, null, null, null, 20);
		GregTech_API.sRecipeAdder.addCentrifugeRecipe(new ItemStack(Blocks.sand, 8), 0, new ItemStack(Blocks.soul_sand,2), null, null, null, null, null, 2000);
		GregTech_API.sRecipeAdder.addCentrifugeRecipe(new ItemStack(TFCItems.TinIngot, 2), 0, new ItemStack(Items.quartz,16), null, null, null, null, null, 20000);
		GregTech_API.sRecipeAdder.addCentrifugeRecipe(new ItemStack(TFCItems.BlackSteelIngot, 2), 0, new ItemStack(ItemsCommonProxy.itemOre, 4, 7), null, null, null, null, null, 20000);
		GregTech_API.sRecipeAdder.addCentrifugeRecipe(new ItemStack(TFCItems.RedSteelIngot,1),0, new ItemStack(ItemsCommonProxy.itemOre,4,6), null, null, null, null, null, 20000);
		GregTech_API.sRecipeAdder.addCentrifugeRecipe(TFCFood.getFood(TFCItems.fishRaw, 160f),0, new ItemStack(BlocksCommonProxy.tarmaRoot,4,0), null, null, null, null, null, 20000);
		GregTech_API.sRecipeAdder.addCentrifugeRecipe(TFCFood.getFood(TFCItems.RedApple, 20f),0, new ItemStack(BlocksCommonProxy.wakebloom,4,0), null, null, null, null, null, 20000);
		GregTech_API.sRecipeAdder.addCentrifugeRecipe(TFCFood.getFood(TFCItems.GreenApple, 20f),0, new ItemStack(BlocksCommonProxy.aum,4,0), null, null, null, null, null, 20000);
		GregTech_API.sRecipeAdder.addCentrifugeRecipe(TFCFood.getFood(TFCItems.BarleyBread, 160f),0, new ItemStack(BlocksCommonProxy.desertNova,4,0), null, null, null, null, null, 20000);
		GregTech_API.sRecipeAdder.addCentrifugeRecipe(TFCFood.getFood(TFCItems.WheatBread, 160f),0, new ItemStack(BlocksCommonProxy.cerublossom,4,0), null, null, null, null, null, 20000);
		GregTech_API.sRecipeAdder.addCentrifugeRecipe(new ItemStack(tweaks.wurm.items.ModItems.MixedSheet,1,0),0, new ItemStack(com.lulan.shincolle.init.ModItems.AbyssMetal,1,1), null, null, null, null, null, 20000);
		GregTech_API.sRecipeAdder.addCentrifugeRecipe(new ItemStack(TFCItems.GemAgate,1,2),0, new ItemStack(ItemsCommonProxy.itemOre,2,0), null, null, null, null, null, 20000);
		GregTech_API.sRecipeAdder.addCentrifugeRecipe(new ItemStack(TFCItems.GemAmethyst,1,2),0, new ItemStack(ConfigItems.itemShard,1,0), null, null, null, null, null, 20000);
		GregTech_API.sRecipeAdder.addCentrifugeRecipe(new ItemStack(TFCItems.GemBeryl,1,2),0, new ItemStack(ConfigItems.itemShard,1,1), null, null, null, null, null, 20000);
		GregTech_API.sRecipeAdder.addCentrifugeRecipe(new ItemStack(TFCItems.GemEmerald,1,2),0, new ItemStack(ConfigItems.itemShard,1,2), null, null, null, null, null, 20000);
		GregTech_API.sRecipeAdder.addCentrifugeRecipe(new ItemStack(TFCItems.GemGarnet,1,2),0, new ItemStack(ConfigItems.itemShard,1,3), null, null, null, null, null, 20000);
		GregTech_API.sRecipeAdder.addCentrifugeRecipe(new ItemStack(TFCItems.GemJade,1,2),0, new ItemStack(ConfigItems.itemShard,1,4), null, null, null, null, null, 20000);
		GregTech_API.sRecipeAdder.addCentrifugeRecipe(new ItemStack(TFCItems.GemJasper,1,2),0, new ItemStack(ConfigItems.itemShard,1,5), null, null, null, null, null, 20000);
		GregTech_API.sRecipeAdder.addCentrifugeRecipe(new ItemStack(Blocks.dirt,16,0),0, new ItemStack(Blocks.grass,16,0), null, null, null, null, null, 20000);
		GregTech_API.sRecipeAdder.addCentrifugeRecipe(new ItemStack(tweaks.wurm.items.ModItems.ZirconDust,8,0),0, new ItemStack(tweaks.wurm.items.ModItems.Hafmium,4,0), null, null, null, null, null, 20000);
		GregTech_API.sRecipeAdder.addCentrifugeRecipe(new ItemStack(TFCItems.PlatinumIngot,8,0),0, new ItemStack(GCItems.basicItem,8,5), null, null, null, null, null, 20000);
		GregTech_API.sRecipeAdder.addCentrifugeRecipe(new ItemStack(MarsItems.marsItemBasic,8,0),0, new ItemStack(TFCItems.PlatinumIngot,4,0), null, null, null, null, null, 20000);
		GregTech_API.sRecipeAdder.addCentrifugeRecipe(new ItemStack(Items.skull,8,2),0, new ItemStack(Items.skull,1,1), null, null, null, null, null, 20000);
		GregTech_API.sRecipeAdder.addCentrifugeRecipe(new ItemStack(TFCBlocks.StoneMMSmooth,8,5),0, new ItemStack(ChiselBlocks.marble,8,0), null, null, null, null, null, 20000);
		GregTech_API.sRecipeAdder.addCentrifugeRecipe(new ItemStack(TFCBlocks.StoneMMSmooth,8,3),0, new ItemStack(ChiselBlocks.limestone,8,0), null, null, null, null, null, 20000);
		GregTech_API.sRecipeAdder.addCentrifugeRecipe(new ItemStack(TFCItems.BronzeIngot),0,new ItemStack(TFCItems.Powder,1,3),null,null,null,null,null, 200);
		GregTech_API.sRecipeAdder.addCentrifugeRecipe(new ItemStack(Items.skull,8,0),0, new ItemStack(Items.skull,1,1), null, null, null, null, null, 20000);
		GregTech_API.sRecipeAdder.addCentrifugeRecipe(new ItemStack(Items.skull,8,3),0, new ItemStack(Items.skull,1,1), null, null, null, null, null, 20000);
		GregTech_API.sRecipeAdder.addCentrifugeRecipe(new ItemStack(tweaks.wurm.items.ModItems.CraftingCore,8,2),0, new ItemStack(Items.skull,1,1), null, null, null, null, null, 20000);
		
	}
}
