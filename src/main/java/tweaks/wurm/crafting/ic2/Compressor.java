package tweaks.wurm.crafting.ic2;

import ic2.api.recipe.RecipeInputItemStack;
import ic2.api.recipe.Recipes;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import am2.blocks.BlocksCommonProxy;
import am2.items.ItemsCommonProxy;
import blusunrize.immersiveengineering.common.IEContent;
import cofh.thermalfoundation.block.TFBlocks;
import cofh.thermalfoundation.item.TFItems;

import com.bioxx.tfc.api.TFCItems;
import com.brandon3055.draconicevolution.common.ModBlocks;
import com.brandon3055.draconicevolution.common.ModItems;
import com.rwtema.extrautils.ExtraUtils;

import crazypants.enderio.EnderIO;

public class Compressor {
	
	
	public static void RemoveAll() {
		ic2.api.recipe.Recipes.compressor.getRecipes().clear();
	}
	
	public static void addCompression() {
		for(int i = 0; i < 21; i++) {
			Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.LooseRock,4,i)),null,new ItemStack(Blocks.stone,1));
		}

		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.Logs,4,0)),null,new ItemStack(Blocks.planks,1,0));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.Logs,4,10)),null,new ItemStack(Blocks.planks,1,1));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.Logs,4,2)),null,new ItemStack(Blocks.planks,1,2));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.Logs,4,15)),null,new ItemStack(Blocks.planks,1,3));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.Logs,4,16)),null,new ItemStack(Blocks.planks,1,4));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.Logs,4,4)),null,new ItemStack(Blocks.planks,1,5));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(Items.dye,32,4)),null,new ItemStack(Blocks.lapis_block,1,0));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(Blocks.sand,4)),null,new ItemStack(Blocks.sandstone,1,0));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(Items.string,8,0)),null,new ItemStack(Blocks.web,1,0));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.WoolCloth,3,0)),null,new ItemStack(Blocks.wool,1,0));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.GoldIngot,32,0)),null,new ItemStack(tweaks.wurm.items.ModBlocks.GoldBlock,1,0));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.GoldIngot2x,16,0)),null,new ItemStack(tweaks.wurm.items.ModBlocks.GoldBlock,1,0));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.WroughtIronIngot,32,0)),null,new ItemStack(tweaks.wurm.items.ModBlocks.WroughtIronBlock,1,0));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.WroughtIronIngot2x,16,0)),null,new ItemStack(tweaks.wurm.items.ModBlocks.WroughtIronBlock,1,0));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(Blocks.stone_slab,2,0)),null,new ItemStack(Blocks.stone,1,0));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(Blocks.stone_slab,2,1)),null,new ItemStack(Blocks.sandstone,1,0));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(Blocks.stone_slab,2,3)),null,new ItemStack(Blocks.cobblestone,1,0));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(Blocks.stone_slab,2,4)),null,new ItemStack(Blocks.brick_block,1,0));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(Blocks.stone_slab,2,5)),null,new ItemStack(Blocks.stonebrick,1,0));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(Blocks.stone_slab,2,6)),null,new ItemStack(Blocks.nether_brick,1,0));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(Blocks.stone_slab,2,7)),null,new ItemStack(Blocks.quartz_block,1,0));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(Blocks.wooden_slab,2,0)),null,new ItemStack(Blocks.planks,1,0));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(Blocks.wooden_slab,2,1)),null,new ItemStack(Blocks.planks,1,1));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(Blocks.wooden_slab,2,2)),null,new ItemStack(Blocks.planks,1,2));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(Blocks.wooden_slab,2,3)),null,new ItemStack(Blocks.planks,1,3));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(Blocks.wooden_slab,2,4)),null,new ItemStack(Blocks.planks,1,4));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(Blocks.wooden_slab,2,5)),null,new ItemStack(Blocks.planks,1,5));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.ClayBall,4)),null,new ItemStack(Blocks.hardened_clay,1,0));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(Blocks.ice,16)),null,new ItemStack(Blocks.packed_ice,1,0));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(Blocks.carpet,4,0)),null,new ItemStack(Blocks.wool,1,0));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(Blocks.carpet,4,1)),null,new ItemStack(Blocks.wool,1,1));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(Blocks.carpet,4,2)),null,new ItemStack(Blocks.wool,1,2));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(Blocks.carpet,4,3)),null,new ItemStack(Blocks.wool,1,3));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(Blocks.carpet,4,4)),null,new ItemStack(Blocks.wool,1,4));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(Blocks.carpet,4,5)),null,new ItemStack(Blocks.wool,1,5));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(Blocks.carpet,4,6)),null,new ItemStack(Blocks.wool,1,6));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(Blocks.carpet,4,7)),null,new ItemStack(Blocks.wool,1,7));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(Blocks.carpet,4,8)),null,new ItemStack(Blocks.wool,1,8));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(Blocks.carpet,4,9)),null,new ItemStack(Blocks.wool,1,9));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(Blocks.carpet,4,10)),null,new ItemStack(Blocks.wool,1,10));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(Blocks.carpet,4,11)),null,new ItemStack(Blocks.wool,1,11));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(Blocks.carpet,4,12)),null,new ItemStack(Blocks.wool,1,12));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(Blocks.carpet,4,13)),null,new ItemStack(Blocks.wool,1,13));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(Blocks.carpet,4,14)),null,new ItemStack(Blocks.wool,1,14));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(Blocks.carpet,4,15)),null,new ItemStack(Blocks.wool,1,15));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(Items.redstone,32,0)),null,new ItemStack(Blocks.redstone_block,1,0));
	    //Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.GemDiamond,32,4)),null,new ItemStack(tweaks.wurm.items.ModBlocks.DiamondBlock,1,0));
		//Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.GemEmerald,32,4)),null,new ItemStack(tweaks.wurm.items.ModBlocks.EmeraldBlock,1,0));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(ic2.api.item.IC2Items.getItem("carbonMesh").getItem(),1,0)),null,ic2.api.item.IC2Items.getItem("carbonPlate"));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(ic2.api.item.IC2Items.getItem("energiumDust").getItem(),9,0)),null,ic2.api.item.IC2Items.getItem("energyCrystal"));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(ic2.api.item.IC2Items.getItem("coalBall")),null,ic2.api.item.IC2Items.getItem("compressedCoalBall"));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(ic2.api.item.IC2Items.getItem("coalChunk")),null,ic2.api.item.IC2Items.getItem("industrialDiamond"));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(ModItems.draconiumIngot,32,0)),null,new ItemStack(ModBlocks.draconiumBlock));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(EnderIO.itemAlloy,32,0)),null,new ItemStack(EnderIO.blockIngotStorage,1,0));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(EnderIO.itemAlloy,32,1)),null,new ItemStack(EnderIO.blockIngotStorage,1,1));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(EnderIO.itemAlloy,32,2)),null,new ItemStack(EnderIO.blockIngotStorage,1,2));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(EnderIO.itemAlloy,32,3)),null,new ItemStack(EnderIO.blockIngotStorage,1,3));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(EnderIO.itemAlloy,32,4)),null,new ItemStack(EnderIO.blockIngotStorage,1,4));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(EnderIO.itemAlloy,32,5)),null,new ItemStack(EnderIO.blockIngotStorage,1,5));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(EnderIO.itemAlloy,32,6)),null,new ItemStack(EnderIO.blockIngotStorage,1,6));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(ExtraUtils.bedrockium,32,0)),null,new ItemStack(ExtraUtils.bedrockiumBlock,1,0));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFItems.ingotEnderium.getItem(),32,76)),null,new ItemStack(TFBlocks.blockStorage,1,12));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFItems.ingotEnderium.getItem(),32,74)),null,new ItemStack(TFBlocks.blockStorage,1,10));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.ZincSheet,4,0)),null,OreDictionary.getOres("oc:materialDisk").get(0));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(li.cil.oc.api.Items.get("chamelium").createItemStack(32)),null,li.cil.oc.api.Items.get("chameliumBlock").createItemStack(1));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(wurmatron.voidrpg.items.ModItems.UltimateCPU,32,0)), null, new ItemStack(wurmatron.voidrpg.items.ModItems.UranusCPU));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(Blocks.redstone_block,4,0)),null, new ItemStack(tweaks.wurm.items.ModBlocks.CompressedRedstoneBlock));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.GemAgate,4,0)),null, new ItemStack(TFCItems.GemAgate,1,1));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.GemAgate,4,1)),null, new ItemStack(TFCItems.GemAgate,1,2));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.GemAgate,4,2)),null, new ItemStack(TFCItems.GemAgate,1,3));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.GemAgate,4,3)),null, new ItemStack(TFCItems.GemAgate,1,4));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.GemAmethyst,4,0)),null, new ItemStack(TFCItems.GemAmethyst,1,1));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.GemAmethyst,4,1)),null, new ItemStack(TFCItems.GemAmethyst,1,2));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.GemAmethyst,4,2)),null, new ItemStack(TFCItems.GemAmethyst,1,3));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.GemAmethyst,4,3)),null, new ItemStack(TFCItems.GemAmethyst,1,4));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.GemBeryl,4,0)),null, new ItemStack(TFCItems.GemBeryl,1,1));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.GemBeryl,4,1)),null, new ItemStack(TFCItems.GemBeryl,1,2));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.GemBeryl,4,2)),null, new ItemStack(TFCItems.GemBeryl,1,3));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.GemBeryl,4,3)),null, new ItemStack(TFCItems.GemBeryl,1,4));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.GemGarnet,4,0)),null, new ItemStack(TFCItems.GemGarnet,1,1));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.GemGarnet,4,1)),null, new ItemStack(TFCItems.GemGarnet,1,2));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.GemGarnet,4,2)),null, new ItemStack(TFCItems.GemGarnet,1,3));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.GemGarnet,4,3)),null, new ItemStack(TFCItems.GemGarnet,1,4));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.GemJade,4,0)),null, new ItemStack(TFCItems.GemJade,1,1));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.GemJade,4,1)),null, new ItemStack(TFCItems.GemJade,1,2));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.GemJade,4,2)),null, new ItemStack(TFCItems.GemJade,1,3));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.GemJade,4,3)),null, new ItemStack(TFCItems.GemJade,1,4));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.GemJasper,4,0)),null, new ItemStack(TFCItems.GemJasper,1,1));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.GemJasper,4,1)),null, new ItemStack(TFCItems.GemJasper,1,2));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.GemJasper,4,2)),null, new ItemStack(TFCItems.GemJasper,1,3));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.GemJasper,4,3)),null, new ItemStack(TFCItems.GemJasper,1,4));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.GemOpal,4,0)),null, new ItemStack(TFCItems.GemOpal,1,1));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.GemOpal,4,1)),null, new ItemStack(TFCItems.GemOpal,1,2));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.GemOpal,4,2)),null, new ItemStack(TFCItems.GemOpal,1,3));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.GemOpal,4,3)),null, new ItemStack(TFCItems.GemOpal,1,4));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.GemRuby,4,0)),null, new ItemStack(TFCItems.GemRuby,1,1));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.GemRuby,4,1)),null, new ItemStack(TFCItems.GemRuby,1,2));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.GemRuby,4,2)),null, new ItemStack(TFCItems.GemRuby,1,3));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.GemRuby,4,3)),null, new ItemStack(TFCItems.GemRuby,1,4));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.GemSapphire,4,0)),null, new ItemStack(TFCItems.GemSapphire,1,1));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.GemSapphire,4,1)),null, new ItemStack(TFCItems.GemSapphire,1,2));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.GemSapphire,4,2)),null, new ItemStack(TFCItems.GemSapphire,1,3));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.GemSapphire,4,3)),null, new ItemStack(TFCItems.GemSapphire,1,4));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.GemTopaz,4,0)),null, new ItemStack(TFCItems.GemTopaz,1,1));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.GemTopaz,4,1)),null, new ItemStack(TFCItems.GemTopaz,1,2));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.GemTopaz,4,2)),null, new ItemStack(TFCItems.GemTopaz,1,3));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.GemTopaz,4,3)),null, new ItemStack(TFCItems.GemTopaz,1,4));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.GemTourmaline,4,0)),null, new ItemStack(TFCItems.GemTourmaline,1,1));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.GemTourmaline,4,1)),null, new ItemStack(TFCItems.GemTourmaline,1,2));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.GemTourmaline,4,2)),null, new ItemStack(TFCItems.GemTourmaline,1,3));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.GemTourmaline,4,3)),null, new ItemStack(TFCItems.GemTourmaline,1,4));		
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(ItemsCommonProxy.itemOre,32,6)),null, new ItemStack(BlocksCommonProxy.AMOres,1,8));		
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(ItemsCommonProxy.itemOre,32,7)),null, new ItemStack(BlocksCommonProxy.AMOres,1,5));		
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(Items.gunpowder,5,0)),null, new ItemStack(Blocks.tnt,1));				
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(cofh.thermalexpansion.item.TEItems.itemMaterial,32,44)),null, new ItemStack(TFBlocks.blockStorage,1,12));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(ic2.api.item.IC2Items.getItem("energiumDust").getItem(),9,2)),null, ic2.api.item.IC2Items.getItem("energyCrystal"));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.BismuthIngot,32)),null, new ItemStack(tweaks.wurm.items.ModBlocks.BismuthBlock,1));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.TinIngot,32)),null, new ItemStack(tweaks.wurm.items.ModBlocks.TinBlock,1));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.ZincIngot,32)),null, new ItemStack(tweaks.wurm.items.ModBlocks.ZincBlock,1));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.CopperIngot,32)),null, new ItemStack(tweaks.wurm.items.ModBlocks.CopperBlock,1));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.BronzeIngot,32)),null, new ItemStack(tweaks.wurm.items.ModBlocks.BronzeBlock,1));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.BismuthBronzeIngot,32)),null, new ItemStack(tweaks.wurm.items.ModBlocks.BismuthBronzeBlock,1));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.BlackBronzeIngot,32)),null, new ItemStack(tweaks.wurm.items.ModBlocks.BlackBronzeBlock,1));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.BrassIngot,32)),null, new ItemStack(tweaks.wurm.items.ModBlocks.BrassBlock,1));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.RoseGoldIngot,32)),null, new ItemStack(tweaks.wurm.items.ModBlocks.RoseGoldBlock,1));		
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.SilverIngot,32)),null, new ItemStack(tweaks.wurm.items.ModBlocks.SilverBlock,1));		
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.SterlingSilverIngot,32)),null, new ItemStack(tweaks.wurm.items.ModBlocks.SterlingSilverBlock,1));		
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.PlatinumIngot,32)),null, new ItemStack(tweaks.wurm.items.ModBlocks.PlatinumBlock,1));		
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.NickelIngot,32)),null, new ItemStack(tweaks.wurm.items.ModBlocks.NickelBlock,1));		
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.PigIronIngot,32)),null, new ItemStack(tweaks.wurm.items.ModBlocks.PigIronBlock,1));		
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.SteelIngot,32)),null, new ItemStack(tweaks.wurm.items.ModBlocks.SteelBlock,1));		
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.BlackSteelIngot,32)),null, new ItemStack(tweaks.wurm.items.ModBlocks.BlackSteelBlock,1));		
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.BlueSteelIngot,32)),null, new ItemStack(tweaks.wurm.items.ModBlocks.BlueSteelBlock,1));		
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.RedSteelIngot,32)),null, new ItemStack(tweaks.wurm.items.ModBlocks.RedSteelBlock,1));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.GemAgate,32,4)),null,new ItemStack(tweaks.wurm.items.ModBlocks.AgateBlock));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.GemAmethyst,32,4)),null,new ItemStack(tweaks.wurm.items.ModBlocks.AmethystBlock));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.GemBeryl,32,4)),null,new ItemStack(tweaks.wurm.items.ModBlocks.BerylBlock));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.GemGarnet,32,4)),null,new ItemStack(tweaks.wurm.items.ModBlocks.GarnetBlock));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.GemJade,32,4)),null,new ItemStack(tweaks.wurm.items.ModBlocks.JadeBlock));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.GemJasper,32,4)),null,new ItemStack(tweaks.wurm.items.ModBlocks.JasperBlock));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.GemOpal,32,4)),null,new ItemStack(tweaks.wurm.items.ModBlocks.OpalBlock));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.GemSapphire,32,4)),null,new ItemStack(tweaks.wurm.items.ModBlocks.SapphireBlock));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.GemTopaz,32,4)),null,new ItemStack(tweaks.wurm.items.ModBlocks.TopazBlock));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.GemTourmaline,32,4)),null,new ItemStack(tweaks.wurm.items.ModBlocks.TourmalineBlock));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(tweaks.wurm.items.ModItems.CompressedEnergy2x,5)),null,new ItemStack(tweaks.wurm.items.ModItems.UnstableMatter));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.GemEmerald,4,0)),null, new ItemStack(TFCItems.GemEmerald,1,1));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.GemEmerald,4,1)),null, new ItemStack(TFCItems.GemEmerald,1,2));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.GemEmerald,4,2)),null, new ItemStack(TFCItems.GemEmerald,1,3));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.GemEmerald,4,3)),null, new ItemStack(TFCItems.GemEmerald,1,4));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.GemDiamond,4,0)),null, new ItemStack(TFCItems.GemDiamond,1,1));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.GemDiamond,4,1)),null, new ItemStack(TFCItems.GemDiamond,1,2));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.GemDiamond,4,2)),null, new ItemStack(TFCItems.GemDiamond,1,3));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.GemDiamond,4,3)),null, new ItemStack(TFCItems.GemDiamond,1,4));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(TFCItems.LeadIngot,32)),null, new ItemStack(tweaks.wurm.items.ModBlocks.LeadBlock,1));		
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(IEContent.itemMaterial,32,6)),null, new ItemStack(IEContent.blockStoneDevice,1,3));		
		
	}
}
