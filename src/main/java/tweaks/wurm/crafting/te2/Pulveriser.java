package tweaks.wurm.crafting.te2;

import micdoodle8.mods.galacticraft.core.blocks.GCBlocks;
import micdoodle8.mods.galacticraft.planets.mars.blocks.MarsBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import tweaks.wurm.utils.TE.TERecipes;
import blusunrize.immersiveengineering.common.IEContent;
import cofh.thermalexpansion.util.crafting.PulverizerManager;

import com.bioxx.tfc.api.TFCItems;

public class Pulveriser {
	
	public static void Register() {
		
		TERecipes.addPulverizerRecipe(5000, new ItemStack(TFCItems.OreChunk,1,56), new ItemStack(tweaks.wurm.items.ModItems.aCred_bismuth), new ItemStack(tweaks.wurm.items.ModItems.aCred_bismuth), 15);
		TERecipes.addPulverizerRecipe(5000, new ItemStack(TFCItems.OreChunk,1,7), new ItemStack(tweaks.wurm.items.ModItems.bCred_bismuth), new ItemStack(tweaks.wurm.items.ModItems.bCred_bismuth), 10);
		TERecipes.addPulverizerRecipe(5000, new ItemStack(TFCItems.OreChunk,1,42), new ItemStack(tweaks.wurm.items.ModItems.cCred_bismuth), new ItemStack(tweaks.wurm.items.ModItems.cCred_bismuth), 5);
		TERecipes.addPulverizerRecipe(5000, new ItemStack(TFCItems.OreChunk,1,54), new ItemStack(tweaks.wurm.items.ModItems.aCred_tin), new ItemStack(tweaks.wurm.items.ModItems.aCred_tin), 15);
		TERecipes.addPulverizerRecipe(5000, new ItemStack(TFCItems.OreChunk,1,5), new ItemStack(tweaks.wurm.items.ModItems.bCred_tin), new ItemStack(tweaks.wurm.items.ModItems.bCred_tin), 10);
		TERecipes.addPulverizerRecipe(5000, new ItemStack(TFCItems.OreChunk,1,40), new ItemStack(tweaks.wurm.items.ModItems.cCred_tin), new ItemStack(tweaks.wurm.items.ModItems.cCred_tin), 5);
		TERecipes.addPulverizerRecipe(5000, new ItemStack(TFCItems.OreChunk,1,8), new ItemStack(tweaks.wurm.items.ModItems.cCred_nickel), new ItemStack(tweaks.wurm.items.ModItems.aCred_nickel), 15);
		TERecipes.addPulverizerRecipe(5000, new ItemStack(TFCItems.OreChunk,1,57), new ItemStack(tweaks.wurm.items.ModItems.cCred_nickel), new ItemStack(tweaks.wurm.items.ModItems.cCred_nickel), 5);
		TERecipes.addPulverizerRecipe(5000, new ItemStack(TFCItems.OreChunk,1,43), new ItemStack(tweaks.wurm.items.ModItems.bCred_nickel), new ItemStack(tweaks.wurm.items.ModItems.bCred_nickel), 10);
		TERecipes.addPulverizerRecipe(5000, new ItemStack(TFCItems.OreChunk,1,60), new ItemStack(tweaks.wurm.items.ModItems.aCred_iron), new ItemStack(tweaks.wurm.items.ModItems.aCred_iron), 15);
		TERecipes.addPulverizerRecipe(5000, new ItemStack(TFCItems.OreChunk,1,52), new ItemStack(tweaks.wurm.items.ModItems.aCred_iron), new ItemStack(tweaks.wurm.items.ModItems.aCred_iron), 15);
		TERecipes.addPulverizerRecipe(5000, new ItemStack(TFCItems.OreChunk,1,59), new ItemStack(tweaks.wurm.items.ModItems.aCred_iron), new ItemStack(tweaks.wurm.items.ModItems.aCred_iron), 15);
		TERecipes.addPulverizerRecipe(5000, new ItemStack(TFCItems.OreChunk,1,10), new ItemStack(tweaks.wurm.items.ModItems.bCred_iron), new ItemStack(tweaks.wurm.items.ModItems.bCred_iron), 15);
		TERecipes.addPulverizerRecipe(5000, new ItemStack(TFCItems.OreChunk,1,11), new ItemStack(tweaks.wurm.items.ModItems.bCred_iron), new ItemStack(tweaks.wurm.items.ModItems.bCred_iron), 15);
		TERecipes.addPulverizerRecipe(5000, new ItemStack(TFCItems.OreChunk,1,3), new ItemStack(tweaks.wurm.items.ModItems.bCred_iron), new ItemStack(tweaks.wurm.items.ModItems.bCred_iron), 15);
		TERecipes.addPulverizerRecipe(5000, new ItemStack(TFCItems.OreChunk,1,38), new ItemStack(tweaks.wurm.items.ModItems.cCred_iron), new ItemStack(tweaks.wurm.items.ModItems.cCred_iron), 15);
		TERecipes.addPulverizerRecipe(5000, new ItemStack(TFCItems.OreChunk,1,46), new ItemStack(tweaks.wurm.items.ModItems.cCred_iron), new ItemStack(tweaks.wurm.items.ModItems.cCred_iron), 15);
		TERecipes.addPulverizerRecipe(5000, new ItemStack(TFCItems.OreChunk,1,45), new ItemStack(tweaks.wurm.items.ModItems.cCred_iron), new ItemStack(tweaks.wurm.items.ModItems.cCred_iron), 15);
		TERecipes.addPulverizerRecipe(5000, new ItemStack(TFCItems.OreChunk,1,58), new ItemStack(tweaks.wurm.items.ModItems.aCred_copper), new ItemStack(tweaks.wurm.items.ModItems.aCred_copper), 15);
		TERecipes.addPulverizerRecipe(5000, new ItemStack(TFCItems.OreChunk,1,62), new ItemStack(tweaks.wurm.items.ModItems.aCred_copper), new ItemStack(tweaks.wurm.items.ModItems.aCred_copper), 15);
		TERecipes.addPulverizerRecipe(5000, new ItemStack(TFCItems.OreChunk,1,49), new ItemStack(tweaks.wurm.items.ModItems.aCred_copper), new ItemStack(tweaks.wurm.items.ModItems.aCred_copper), 15);
		TERecipes.addPulverizerRecipe(5000, new ItemStack(TFCItems.OreChunk,1,0), new ItemStack(tweaks.wurm.items.ModItems.bCred_copper), new ItemStack(tweaks.wurm.items.ModItems.bCred_copper), 15);
		TERecipes.addPulverizerRecipe(5000, new ItemStack(TFCItems.OreChunk,1,13), new ItemStack(tweaks.wurm.items.ModItems.bCred_copper), new ItemStack(tweaks.wurm.items.ModItems.bCred_copper), 15);
		TERecipes.addPulverizerRecipe(5000, new ItemStack(TFCItems.OreChunk,1,9), new ItemStack(tweaks.wurm.items.ModItems.bCred_copper), new ItemStack(tweaks.wurm.items.ModItems.bCred_copper), 15);
		TERecipes.addPulverizerRecipe(5000, new ItemStack(TFCItems.OreChunk,1,44), new ItemStack(tweaks.wurm.items.ModItems.cCred_copper), new ItemStack(tweaks.wurm.items.ModItems.cCred_copper), 15);
		TERecipes.addPulverizerRecipe(5000, new ItemStack(TFCItems.OreChunk,1,48), new ItemStack(tweaks.wurm.items.ModItems.cCred_copper), new ItemStack(tweaks.wurm.items.ModItems.cCred_copper), 15);
		TERecipes.addPulverizerRecipe(5000, new ItemStack(TFCItems.OreChunk,1,35), new ItemStack(tweaks.wurm.items.ModItems.cCred_copper), new ItemStack(tweaks.wurm.items.ModItems.cCred_copper), 15);
		TERecipes.addPulverizerRecipe(5000, new ItemStack(TFCItems.OreChunk,1,50), new ItemStack(tweaks.wurm.items.ModItems.aCred_gold), new ItemStack(tweaks.wurm.items.ModItems.aCred_gold), 15);
		TERecipes.addPulverizerRecipe(5000, new ItemStack(TFCItems.OreChunk,1,1), new ItemStack(tweaks.wurm.items.ModItems.bCred_gold), new ItemStack(tweaks.wurm.items.ModItems.bCred_gold), 10);
		TERecipes.addPulverizerRecipe(5000, new ItemStack(TFCItems.OreChunk,1,36), new ItemStack(tweaks.wurm.items.ModItems.cCred_gold), new ItemStack(tweaks.wurm.items.ModItems.cCred_gold), 5);
		TERecipes.addPulverizerRecipe(5000, new ItemStack(TFCItems.OreChunk,1,53), new ItemStack(tweaks.wurm.items.ModItems.aCred_silver), new ItemStack(tweaks.wurm.items.ModItems.aCred_silver), 15);
		TERecipes.addPulverizerRecipe(5000, new ItemStack(TFCItems.OreChunk,1,4), new ItemStack(tweaks.wurm.items.ModItems.bCred_silver), new ItemStack(tweaks.wurm.items.ModItems.bCred_silver), 10);
		TERecipes.addPulverizerRecipe(5000, new ItemStack(TFCItems.OreChunk,1,39), new ItemStack(tweaks.wurm.items.ModItems.cCred_silver), new ItemStack(tweaks.wurm.items.ModItems.cCred_silver), 5);
		TERecipes.addPulverizerRecipe(5000, new ItemStack(TFCItems.OreChunk,1,61), new ItemStack(tweaks.wurm.items.ModItems.aCred_zinc), new ItemStack(tweaks.wurm.items.ModItems.aCred_zinc), 15);
		TERecipes.addPulverizerRecipe(5000, new ItemStack(TFCItems.OreChunk,1,12), new ItemStack(tweaks.wurm.items.ModItems.bCred_zinc), new ItemStack(tweaks.wurm.items.ModItems.bCred_zinc), 10);
		TERecipes.addPulverizerRecipe(5000, new ItemStack(TFCItems.OreChunk,1,47), new ItemStack(tweaks.wurm.items.ModItems.cCred_zinc), new ItemStack(tweaks.wurm.items.ModItems.cCred_zinc), 5);
		TERecipes.addPulverizerRecipe(5000, new ItemStack(TFCItems.OreChunk,1,55), new ItemStack(tweaks.wurm.items.ModItems.aCred_lead), new ItemStack(tweaks.wurm.items.ModItems.aCred_lead), 15);
		TERecipes.addPulverizerRecipe(5000, new ItemStack(TFCItems.OreChunk,1,6), new ItemStack(tweaks.wurm.items.ModItems.bCred_lead), new ItemStack(tweaks.wurm.items.ModItems.bCred_lead), 10);
		TERecipes.addPulverizerRecipe(5000, new ItemStack(TFCItems.OreChunk,1,41), new ItemStack(tweaks.wurm.items.ModItems.cCred_lead), new ItemStack(tweaks.wurm.items.ModItems.cCred_lead), 5);
		TERecipes.addPulverizerRecipe(5000, new ItemStack(TFCItems.OreChunk,1,51), new ItemStack(tweaks.wurm.items.ModItems.aCred_platinum), new ItemStack(tweaks.wurm.items.ModItems.aCred_platinum), 15);
		TERecipes.addPulverizerRecipe(5000, new ItemStack(TFCItems.OreChunk,1,2), new ItemStack(tweaks.wurm.items.ModItems.bCred_platinum), new ItemStack(tweaks.wurm.items.ModItems.bCred_platinum), 10);
		TERecipes.addPulverizerRecipe(5000, new ItemStack(TFCItems.OreChunk,1,37), new ItemStack(tweaks.wurm.items.ModItems.cCred_platinum), new ItemStack(tweaks.wurm.items.ModItems.cCred_platinum), 5);
		TERecipes.addPulverizerRecipe(8000,new ItemStack(tweaks.wurm.items.ModBlocks.BismuthBlock,1,0),new ItemStack(TFCItems.BismuthIngot,32));
		TERecipes.addPulverizerRecipe(8000,new ItemStack(tweaks.wurm.items.ModBlocks.TinBlock,1,0),new ItemStack(TFCItems.TinIngot,32));
		TERecipes.addPulverizerRecipe(8000,new ItemStack(tweaks.wurm.items.ModBlocks.ZincBlock,1,0),new ItemStack(TFCItems.ZincIngot,32));
		TERecipes.addPulverizerRecipe(8000,new ItemStack(tweaks.wurm.items.ModBlocks.CopperBlock,1,0),new ItemStack(TFCItems.CopperIngot,32));
		TERecipes.addPulverizerRecipe(8000,new ItemStack(tweaks.wurm.items.ModBlocks.BronzeBlock,1,0),new ItemStack(TFCItems.BronzeIngot,32));
		TERecipes.addPulverizerRecipe(8000,new ItemStack(tweaks.wurm.items.ModBlocks.BismuthBronzeBlock,1,0),new ItemStack(TFCItems.BismuthBronzeIngot,32));
		TERecipes.addPulverizerRecipe(8000,new ItemStack(tweaks.wurm.items.ModBlocks.BlackBronzeBlock,1,0),new ItemStack(TFCItems.BlackBronzeIngot,32));
		TERecipes.addPulverizerRecipe(8000,new ItemStack(tweaks.wurm.items.ModBlocks.BrassBlock,1,0),new ItemStack(TFCItems.BrassIngot,32));
		TERecipes.addPulverizerRecipe(8000,new ItemStack(tweaks.wurm.items.ModBlocks.LeadBlock,1,0),new ItemStack(TFCItems.LeadIngot,32));
		TERecipes.addPulverizerRecipe(8000,new ItemStack(tweaks.wurm.items.ModBlocks.GoldBlock,1,0),new ItemStack(TFCItems.GoldIngot,32));
		TERecipes.addPulverizerRecipe(8000,new ItemStack(tweaks.wurm.items.ModBlocks.RoseGoldBlock,1,0),new ItemStack(TFCItems.RoseGoldIngot,32));
		TERecipes.addPulverizerRecipe(8000,new ItemStack(tweaks.wurm.items.ModBlocks.SilverBlock,1,0),new ItemStack(TFCItems.SilverIngot,32));
		TERecipes.addPulverizerRecipe(8000,new ItemStack(tweaks.wurm.items.ModBlocks.SterlingSilverBlock,1,0),new ItemStack(TFCItems.SterlingSilverIngot,32));
		TERecipes.addPulverizerRecipe(8000,new ItemStack(tweaks.wurm.items.ModBlocks.PlatinumBlock,1,0),new ItemStack(TFCItems.PlatinumIngot,32));
		TERecipes.addPulverizerRecipe(8000,new ItemStack(tweaks.wurm.items.ModBlocks.WroughtIronBlock,1,0),new ItemStack(TFCItems.WroughtIronIngot,32));
		TERecipes.addPulverizerRecipe(8000,new ItemStack(tweaks.wurm.items.ModBlocks.NickelBlock,1,0),new ItemStack(TFCItems.NickelIngot,32));
		TERecipes.addPulverizerRecipe(8000,new ItemStack(tweaks.wurm.items.ModBlocks.PigIronBlock,1,0),new ItemStack(TFCItems.PigIronIngot,32));
		TERecipes.addPulverizerRecipe(8000,new ItemStack(tweaks.wurm.items.ModBlocks.SteelBlock,1,0),new ItemStack(TFCItems.SteelIngot,32));
		TERecipes.addPulverizerRecipe(8000,new ItemStack(tweaks.wurm.items.ModBlocks.BlackSteelBlock,1,0),new ItemStack(TFCItems.BlackSteelIngot,32));
		TERecipes.addPulverizerRecipe(8000,new ItemStack(tweaks.wurm.items.ModBlocks.BlueSteelBlock,1,0),new ItemStack(TFCItems.BlueSteelIngot,32));
		TERecipes.addPulverizerRecipe(8000,new ItemStack(tweaks.wurm.items.ModBlocks.RedSteelBlock,1,0),new ItemStack(TFCItems.RedSteelIngot,32));
		TERecipes.addPulverizerRecipe(8000,new ItemStack(tweaks.wurm.items.ModBlocks.AgateBlock,1,0),new ItemStack(TFCItems.GemAgate,32,4));
		TERecipes.addPulverizerRecipe(8000,new ItemStack(tweaks.wurm.items.ModBlocks.AmethystBlock,1,0),new ItemStack(TFCItems.GemAmethyst,32,4));
		TERecipes.addPulverizerRecipe(8000,new ItemStack(tweaks.wurm.items.ModBlocks.BerylBlock,1,0),new ItemStack(TFCItems.GemBeryl,32,4));
		TERecipes.addPulverizerRecipe(8000,new ItemStack(tweaks.wurm.items.ModBlocks.DiamondBlock,1,0),new ItemStack(TFCItems.GemDiamond,32,4));
		TERecipes.addPulverizerRecipe(8000,new ItemStack(tweaks.wurm.items.ModBlocks.EmeraldBlock,1,0),new ItemStack(TFCItems.GemEmerald,32,4));
		TERecipes.addPulverizerRecipe(8000,new ItemStack(tweaks.wurm.items.ModBlocks.GarnetBlock,1,0),new ItemStack(TFCItems.GemGarnet,32,4));
		TERecipes.addPulverizerRecipe(8000,new ItemStack(tweaks.wurm.items.ModBlocks.JadeBlock,1,0),new ItemStack(TFCItems.GemJade,32,4));
		TERecipes.addPulverizerRecipe(8000,new ItemStack(tweaks.wurm.items.ModBlocks.JasperBlock,1,0),new ItemStack(TFCItems.GemJasper,32,4));
		TERecipes.addPulverizerRecipe(8000,new ItemStack(tweaks.wurm.items.ModBlocks.OpalBlock,1,0),new ItemStack(TFCItems.GemOpal,32,4));
		TERecipes.addPulverizerRecipe(8000,new ItemStack(tweaks.wurm.items.ModBlocks.RubyBlock,1,0),new ItemStack(TFCItems.GemRuby,32,4));
		TERecipes.addPulverizerRecipe(8000,new ItemStack(tweaks.wurm.items.ModBlocks.SapphireBlock,1,0),new ItemStack(TFCItems.GemSapphire,32,4));
		TERecipes.addPulverizerRecipe(8000,new ItemStack(tweaks.wurm.items.ModBlocks.TopazBlock,1,0),new ItemStack(TFCItems.GemTopaz,32,4));
		TERecipes.addPulverizerRecipe(8000,new ItemStack(tweaks.wurm.items.ModBlocks.TourmalineBlock,1,0),new ItemStack(TFCItems.GemTourmaline,32,4));
		TERecipes.addPulverizerRecipe(8000,new ItemStack(Blocks.quartz_block,1,0),new ItemStack(Items.quartz,32,0));
		TERecipes.addPulverizerRecipe(8000,new ItemStack(tweaks.wurm.items.ModBlocks.TitaniumOre,1,0),new ItemStack(tweaks.wurm.items.ModItems.Titanium,2,0));
		TERecipes.addPulverizerRecipe(8000,new ItemStack(tweaks.wurm.items.ModBlocks.FranciumOre,1,0),new ItemStack(tweaks.wurm.items.ModItems.Francium,2,0));
		TERecipes.addPulverizerRecipe(8000,new ItemStack(tweaks.wurm.items.ModBlocks.PaladiumOre,1,0),new ItemStack(tweaks.wurm.items.ModItems.Paladium,2,0));
		TERecipes.addPulverizerRecipe(8000,new ItemStack(tweaks.wurm.items.ModBlocks.ZirconOre,1,0),new ItemStack(tweaks.wurm.items.ModItems.Zircon,1,0));
		TERecipes.addPulverizerRecipe(8000,new ItemStack(tweaks.wurm.items.ModItems.Zircon,1,0),new ItemStack(tweaks.wurm.items.ModItems.ZirconDust,1,0));
		TERecipes.addPulverizerRecipe(8000,new ItemStack(MarsBlocks.marsBlock,1,0),new ItemStack(TFCItems.CopperIngot,1,0));
		TERecipes.addPulverizerRecipe(8000,new ItemStack(MarsBlocks.marsBlock,1,1),new ItemStack(TFCItems.TinIngot,1,0));
		TERecipes.addPulverizerRecipe(8000,new ItemStack(MarsBlocks.marsBlock,1,3),new ItemStack(TFCItems.WroughtIronIngot,1,0));
		TERecipes.addPulverizerRecipe(8000,new ItemStack(GCBlocks.blockMoon,1,0),new ItemStack(TFCItems.CopperIngot,1,0));
		TERecipes.addPulverizerRecipe(8000,new ItemStack(GCBlocks.blockMoon,1,1),new ItemStack(TFCItems.TinIngot,1,0));
		TERecipes.addPulverizerRecipe(8000,new ItemStack(Items.blaze_rod,1,0),new ItemStack(Items.blaze_powder,4,0));
		TERecipes.addPulverizerRecipe(8000,new ItemStack(IEContent.blockStoneDevice,1,3),new ItemStack(IEContent.itemMaterial,32,6));
		
		
		
		PulverizerManager.refreshRecipes();
	}
}
