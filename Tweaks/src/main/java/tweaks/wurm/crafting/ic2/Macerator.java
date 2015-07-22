package tweaks.wurm.crafting.ic2;

import gregtech.api.util.GT_Recipe.GT_Recipe_Map;
import ic2.api.recipe.RecipeInputItemStack;
import ic2.api.recipe.Recipes;
import micdoodle8.mods.galacticraft.core.blocks.GCBlocks;
import micdoodle8.mods.galacticraft.planets.mars.blocks.MarsBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import am2.blocks.BlocksCommonProxy;
import am2.items.ItemsCommonProxy;
import blusunrize.immersiveengineering.common.IEContent;
import cofh.thermalfoundation.block.TFBlocks;

import com.bioxx.tfc.api.TFCItems;
import com.brandon3055.draconicevolution.common.ModBlocks;
import com.brandon3055.draconicevolution.common.ModItems;
import com.rwtema.extrautils.ExtraUtils;

import crazypants.enderio.EnderIO;

public class Macerator {
	
	public static void RemoveAll() {
		ic2.api.recipe.Recipes.macerator.getRecipes().clear();
		GT_Recipe_Map.sMaceratorRecipes.mRecipeList.clear();
	}
	
	public static void addMacerate() {

		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(Blocks.stone)),null,new ItemStack(Blocks.cobblestone));	
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(Blocks.gold_block)),null,new ItemStack(TFCItems.GoldIngot,32,0));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(Blocks.iron_block)),null,new ItemStack(TFCItems.WroughtIronIngot,32,0));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(Blocks.obsidian)),null,ic2.api.item.IC2Items.getItem("obsidianDust"));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(Blocks.redstone_block)),null,new ItemStack(Items.redstone,32,0));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(ModBlocks.draconiumBlock)),null,new ItemStack(ModItems.draconiumIngot,32,0));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(EnderIO.blockIngotStorage,1,0)),null,new ItemStack(EnderIO.itemAlloy,32,0));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(EnderIO.blockIngotStorage,1,1)),null,new ItemStack(EnderIO.itemAlloy,32,1));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(EnderIO.blockIngotStorage,1,2)),null,new ItemStack(EnderIO.itemAlloy,32,2));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(EnderIO.blockIngotStorage,1,3)),null,new ItemStack(EnderIO.itemAlloy,32,3));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(EnderIO.blockIngotStorage,1,4)),null,new ItemStack(EnderIO.itemAlloy,32,4));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(EnderIO.blockIngotStorage,1,5)),null,new ItemStack(EnderIO.itemAlloy,32,5));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(EnderIO.blockIngotStorage,1,6)),null,new ItemStack(EnderIO.itemAlloy,32,6));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(ExtraUtils.bedrockiumBlock,1,0)),null,new ItemStack(ExtraUtils.bedrockium,32,0));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(BlocksCommonProxy.AMOres,1,8)),null,new ItemStack(ItemsCommonProxy.itemOre,32,6));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(BlocksCommonProxy.AMOres,1,5)),null,new ItemStack(ItemsCommonProxy.itemOre,32,7));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(TFBlocks.blockStorage,1,12)),null,new ItemStack(cofh.thermalexpansion.item.TEItems.itemMaterial,32,44));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.OreChunk,1,0)),null,new ItemStack(tweaks.wurm.items.ModItems.bCred_copper,1,0));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.OreChunk,1,35)),null,new ItemStack(tweaks.wurm.items.ModItems.cCred_copper,1,0));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.OreChunk,1,49)),null,new ItemStack(tweaks.wurm.items.ModItems.aCred_copper,1,0));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.OreChunk,1,1)),null,new ItemStack(tweaks.wurm.items.ModItems.bCred_gold,1,0));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.OreChunk,1,36)),null,new ItemStack(tweaks.wurm.items.ModItems.cCred_gold,1,0));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.OreChunk,1,50)),null,new ItemStack(tweaks.wurm.items.ModItems.aCred_gold,1,0));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.OreChunk,1,2)),null,new ItemStack(tweaks.wurm.items.ModItems.bCred_platinum,1,0));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.OreChunk,1,37)),null,new ItemStack(tweaks.wurm.items.ModItems.cCred_platinum,1,0));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.OreChunk,1,51)),null,new ItemStack(tweaks.wurm.items.ModItems.aCred_platinum,1,0));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.OreChunk,1,3)),null,new ItemStack(tweaks.wurm.items.ModItems.bCred_iron,1,0));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.OreChunk,1,38)),null,new ItemStack(tweaks.wurm.items.ModItems.cCred_iron,1,0));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.OreChunk,1,52)),null,new ItemStack(tweaks.wurm.items.ModItems.aCred_iron,1,0));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.OreChunk,1,4)),null,new ItemStack(tweaks.wurm.items.ModItems.bCred_silver,1,0));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.OreChunk,1,39)),null,new ItemStack(tweaks.wurm.items.ModItems.cCred_silver,1,0));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.OreChunk,1,53)),null,new ItemStack(tweaks.wurm.items.ModItems.aCred_silver,1,0));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.OreChunk,1,5)),null,new ItemStack(tweaks.wurm.items.ModItems.bCred_tin,1,0));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.OreChunk,1,40)),null,new ItemStack(tweaks.wurm.items.ModItems.cCred_tin,1,0));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.OreChunk,1,54)),null,new ItemStack(tweaks.wurm.items.ModItems.aCred_tin,1,0));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.OreChunk,1,6)),null,new ItemStack(tweaks.wurm.items.ModItems.bCred_lead,1,0));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.OreChunk,1,41)),null,new ItemStack(tweaks.wurm.items.ModItems.cCred_lead,1,0));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.OreChunk,1,55)),null,new ItemStack(tweaks.wurm.items.ModItems.aCred_lead,1,0));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.OreChunk,1,7)),null,new ItemStack(tweaks.wurm.items.ModItems.bCred_bismuth,1,0));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.OreChunk,1,42)),null,new ItemStack(tweaks.wurm.items.ModItems.cCred_bismuth,1,0));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.OreChunk,1,56)),null,new ItemStack(tweaks.wurm.items.ModItems.aCred_bismuth,1,0));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.OreChunk,1,8)),null,new ItemStack(tweaks.wurm.items.ModItems.bCred_nickel,1,0));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.OreChunk,1,43)),null,new ItemStack(tweaks.wurm.items.ModItems.cCred_nickel,1,0));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.OreChunk,1,57)),null,new ItemStack(tweaks.wurm.items.ModItems.aCred_nickel,1,0));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.OreChunk,1,9)),null,new ItemStack(tweaks.wurm.items.ModItems.bCred_copper,1,0));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.OreChunk,1,44)),null,new ItemStack(tweaks.wurm.items.ModItems.cCred_copper,1,0));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.OreChunk,1,58)),null,new ItemStack(tweaks.wurm.items.ModItems.aCred_copper,1,0));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.OreChunk,1,10)),null,new ItemStack(tweaks.wurm.items.ModItems.bCred_iron,1,0));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.OreChunk,1,45)),null,new ItemStack(tweaks.wurm.items.ModItems.cCred_iron,1,0));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.OreChunk,1,59)),null,new ItemStack(tweaks.wurm.items.ModItems.aCred_iron,1,0));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.OreChunk,1,11)),null,new ItemStack(tweaks.wurm.items.ModItems.bCred_iron,1,0));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.OreChunk,1,46)),null,new ItemStack(tweaks.wurm.items.ModItems.cCred_iron,1,0));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.OreChunk,1,60)),null,new ItemStack(tweaks.wurm.items.ModItems.aCred_iron,1,0));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.OreChunk,1,12)),null,new ItemStack(tweaks.wurm.items.ModItems.bCred_zinc,1,0));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.OreChunk,1,47)),null,new ItemStack(tweaks.wurm.items.ModItems.cCred_zinc,1,0));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.OreChunk,1,61)),null,new ItemStack(tweaks.wurm.items.ModItems.aCred_zinc,1,0));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.OreChunk,1,13)),null,new ItemStack(tweaks.wurm.items.ModItems.bCred_copper,1,0));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.OreChunk,1,48)),null,new ItemStack(tweaks.wurm.items.ModItems.cCred_copper,1,0));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.OreChunk,1,62)),null,new ItemStack(tweaks.wurm.items.ModItems.aCred_copper,1,0));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.Coal,1,0)),null,ic2.api.item.IC2Items.getItem("coalDust"));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.Coal,1,1)),null,ic2.api.item.IC2Items.getItem("coalDust"));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.OreChunk,1,27)),null,new ItemStack(Items.redstone,8));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.OreChunk,1,28)),null,new ItemStack(Items.redstone,8));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.OreChunk,1,16)),null,new ItemStack(TFCItems.Powder,4,1));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.OreChunk,1,20)),null,new ItemStack(TFCItems.Powder,4,2));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.OreChunk,1,34)),null,new ItemStack(TFCItems.Powder,4,6));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(tweaks.wurm.items.ModBlocks.BismuthBlock,1,0)),null,new ItemStack(TFCItems.BismuthIngot,32));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(tweaks.wurm.items.ModBlocks.TinBlock,1,0)),null,new ItemStack(TFCItems.TinIngot,32));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(tweaks.wurm.items.ModBlocks.ZincBlock,1,0)),null,new ItemStack(TFCItems.ZincIngot,32));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(tweaks.wurm.items.ModBlocks.CopperBlock,1,0)),null,new ItemStack(TFCItems.CopperIngot,32));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(tweaks.wurm.items.ModBlocks.BronzeBlock,1,0)),null,new ItemStack(TFCItems.BronzeIngot,32));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(tweaks.wurm.items.ModBlocks.BismuthBronzeBlock,1,0)),null,new ItemStack(TFCItems.BismuthBronzeIngot,32));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(tweaks.wurm.items.ModBlocks.BlackBronzeBlock,1,0)),null,new ItemStack(TFCItems.BlackBronzeIngot,32));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(tweaks.wurm.items.ModBlocks.BrassBlock,1,0)),null,new ItemStack(TFCItems.BrassIngot,32));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(tweaks.wurm.items.ModBlocks.LeadBlock,1,0)),null,new ItemStack(TFCItems.LeadIngot,32));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(tweaks.wurm.items.ModBlocks.GoldBlock,1,0)),null,new ItemStack(TFCItems.GoldIngot,32));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(tweaks.wurm.items.ModBlocks.RoseGoldBlock,1,0)),null,new ItemStack(TFCItems.RoseGoldIngot,32));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(tweaks.wurm.items.ModBlocks.SilverBlock,1,0)),null,new ItemStack(TFCItems.SilverIngot,32));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(tweaks.wurm.items.ModBlocks.SterlingSilverBlock,1,0)),null,new ItemStack(TFCItems.SterlingSilverIngot,32));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(tweaks.wurm.items.ModBlocks.PlatinumBlock,1,0)),null,new ItemStack(TFCItems.PlatinumIngot,32));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(tweaks.wurm.items.ModBlocks.WroughtIronBlock,1,0)),null,new ItemStack(TFCItems.WroughtIronIngot,32));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(tweaks.wurm.items.ModBlocks.NickelBlock,1,0)),null,new ItemStack(TFCItems.NickelIngot,32));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(tweaks.wurm.items.ModBlocks.PigIronBlock,1,0)),null,new ItemStack(TFCItems.PigIronIngot,32));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(tweaks.wurm.items.ModBlocks.SteelBlock,1,0)),null,new ItemStack(TFCItems.SteelIngot,32));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(tweaks.wurm.items.ModBlocks.BlackSteelBlock,1,0)),null,new ItemStack(TFCItems.BlackSteelIngot,32));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(tweaks.wurm.items.ModBlocks.BlueSteelBlock,1,0)),null,new ItemStack(TFCItems.BlueSteelIngot,32));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(tweaks.wurm.items.ModBlocks.RedSteelBlock,1,0)),null,new ItemStack(TFCItems.RedSteelIngot,32));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(tweaks.wurm.items.ModBlocks.AgateBlock,1,0)),null,new ItemStack(TFCItems.GemAgate,32,4));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(tweaks.wurm.items.ModBlocks.AmethystBlock,1,0)),null,new ItemStack(TFCItems.GemAmethyst,32,4));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(tweaks.wurm.items.ModBlocks.BerylBlock,1,0)),null,new ItemStack(TFCItems.GemBeryl,32,4));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(tweaks.wurm.items.ModBlocks.DiamondBlock,1,0)),null,new ItemStack(TFCItems.GemDiamond,32,4));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(tweaks.wurm.items.ModBlocks.EmeraldBlock,1,0)),null,new ItemStack(TFCItems.GemEmerald,32,4));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(tweaks.wurm.items.ModBlocks.GarnetBlock,1,0)),null,new ItemStack(TFCItems.GemGarnet,32,4));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(tweaks.wurm.items.ModBlocks.JadeBlock,1,0)),null,new ItemStack(TFCItems.GemJade,32,4));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(tweaks.wurm.items.ModBlocks.JasperBlock,1,0)),null,new ItemStack(TFCItems.GemJasper,32,4));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(tweaks.wurm.items.ModBlocks.OpalBlock,1,0)),null,new ItemStack(TFCItems.GemOpal,32,4));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(tweaks.wurm.items.ModBlocks.RubyBlock,1,0)),null,new ItemStack(TFCItems.GemRuby,32,4));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(tweaks.wurm.items.ModBlocks.SapphireBlock,1,0)),null,new ItemStack(TFCItems.GemSapphire,32,4));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(tweaks.wurm.items.ModBlocks.TopazBlock,1,0)),null,new ItemStack(TFCItems.GemTopaz,32,4));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(tweaks.wurm.items.ModBlocks.TourmalineBlock,1,0)),null,new ItemStack(TFCItems.GemTourmaline,32,4));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(Blocks.quartz_block,1,0)),null,new ItemStack(Items.quartz,32,0));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(tweaks.wurm.items.ModBlocks.TitaniumOre,1,0)),null,new ItemStack(tweaks.wurm.items.ModItems.Titanium,2,0));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(tweaks.wurm.items.ModBlocks.FranciumOre,1,0)),null,new ItemStack(tweaks.wurm.items.ModItems.Francium,2,0));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(tweaks.wurm.items.ModBlocks.PaladiumOre,1,0)),null,new ItemStack(tweaks.wurm.items.ModItems.Paladium,2,0));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(tweaks.wurm.items.ModBlocks.ZirconOre,1,0)),null,new ItemStack(tweaks.wurm.items.ModItems.Zircon,1,0));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(tweaks.wurm.items.ModItems.Zircon,1,0)),null,new ItemStack(tweaks.wurm.items.ModItems.ZirconDust,1,0));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(MarsBlocks.marsBlock,1,0)),null,new ItemStack(TFCItems.CopperIngot,1,0));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(MarsBlocks.marsBlock,1,1)),null,new ItemStack(TFCItems.TinIngot,1,0));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(MarsBlocks.marsBlock,1,3)),null,new ItemStack(TFCItems.WroughtIronIngot,1,0));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(GCBlocks.blockMoon,1,0)),null,new ItemStack(TFCItems.CopperIngot,1,0));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(GCBlocks.blockMoon,1,1)),null,new ItemStack(TFCItems.TinIngot,1,0));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(Items.blaze_rod,1,0)),null,new ItemStack(Items.blaze_powder,4,0));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(IEContent.blockStoneDevice,1,3)),null,new ItemStack(IEContent.itemMaterial,32,6));
		
	}
}
