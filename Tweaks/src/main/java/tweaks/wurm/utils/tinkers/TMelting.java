package tweaks.wurm.utils.tinkers;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidRegistry;
import tconstruct.library.crafting.Smeltery;
import tweaks.wurm.items.ModBlocks;

import com.bioxx.tfc.api.TFCItems;

public class TMelting {
	
	public TMelting(Item input, Block block, int meta, int temp, String Fluid, int amount) {
		
		Smeltery.addMelting(new ItemStack(input,1),block, meta, temp, FluidRegistry.getFluidStack(Fluid, amount));
		
	}
	
	public TMelting(ItemStack input, Block block, int meta, int temp, String Fluid, int amount) {
		
		Smeltery.addMelting(input,block, meta, temp, FluidRegistry.getFluidStack(Fluid, amount));
		
	}
	
	public TMelting(Block input, Block block, int meta, int temp, String Fluid, int amount) {
		
		Smeltery.addMelting(new ItemStack(input,1),block, meta, temp, FluidRegistry.getFluidStack(Fluid, amount));
		
	}
	
	public static void addRecipes() {
		Smeltery.addSmelteryFuel(FluidRegistry.getFluid("lavatfc"), 1200, 10);
		new TMelting(TFCItems.PigIronSheet2x,ModBlocks.PigIronBlock,0,1270,"molten.wurmsteel",2000);
		new TMelting(TFCItems.PigIronSheet,ModBlocks.PigIronBlock,0,1270,"molten.wurmsteel",1000);
		new TMelting(TFCItems.PigIronIngot,ModBlocks.PigIronBlock,0,1070,"molten.wurmsteel",1000);
		new TMelting(TFCItems.PigIronIngot2x,ModBlocks.PigIronBlock,0,1270,"molten.wurmsteel",2000);
		new TMelting(TFCItems.BismuthIngot,ModBlocks.BismuthBlock,0,300,"molten.wurmbismuth",1000);
		new TMelting(TFCItems.CopperIngot,ModBlocks.CopperBlock,0,500,"molten.wurmcopper",1000);
		new TMelting(TFCItems.BismuthBronzeIngot,ModBlocks.BismuthBronzeBlock,0,450,"molten.wurmbismuthbronze",1000);
		new TMelting(TFCItems.BlackBronzeIngot,ModBlocks.BlackBronzeBlock,0,500,"molten.wurmblackbronze",1000);
		new TMelting(TFCItems.BlackSteelIngot,ModBlocks.BlackSteelBlock,0,1000,"molten.wurmblacksteel",1000);
		new TMelting(TFCItems.BrassIngot,ModBlocks.BrassBlock,0,500,"molten.wurmbrass",1000);
		new TMelting(TFCItems.BronzeIngot,ModBlocks.BronzeBlock,0,500,"molten.wurmbronze",1000);
		new TMelting(TFCItems.BlueSteelIngot,ModBlocks.BlueSteelBlock,0,1500,"molten.wurmbluesteel",1000);
		new TMelting(TFCItems.CopperIngot,ModBlocks.CopperBlock,0,500,"molten.wurmcopper",1000);
		new TMelting(TFCItems.GoldIngot,ModBlocks.GoldBlock,0,650,"molten.wurmgold",1000);
		new TMelting(TFCItems.WroughtIronIngot,ModBlocks.WroughtIronBlock,0,750,"molten.wurmwroughtiron",1000);
		new TMelting(TFCItems.LeadIngot,ModBlocks.LeadBlock,0,350,"molten.wurmlead",1000);
		new TMelting(TFCItems.NickelIngot,ModBlocks.NickelBlock,0,1203,"molten.wurmnickel",1000);
		new TMelting(TFCItems.PlatinumIngot,ModBlocks.PlatinumBlock,0,920,"molten.wurmplatinum",1000);
		new TMelting(TFCItems.RedSteelIngot,ModBlocks.RedSteelBlock,0,1000,"molten.wurmredsteel",1000);
		new TMelting(TFCItems.RoseGoldIngot,ModBlocks.RoseGoldBlock,0,750,"molten.wurmrosegold",1000);
		new TMelting(TFCItems.SilverIngot,ModBlocks.SilverBlock,0,350,"molten.wurmsilver",1000);
		new TMelting(TFCItems.SteelIngot,ModBlocks.SteelBlock,0,1190,"molten.wurmsteel",1000);
		new TMelting(TFCItems.SterlingSilverIngot,ModBlocks.SterlingSilverBlock,0,750,"molten.wurmsterlingsilver",1000);
		new TMelting(TFCItems.TinIngot,ModBlocks.TinBlock,0,250,"molten.wurmtin",1000);
		new TMelting(TFCItems.ZincIngot,ModBlocks.ZincBlock,0,200,"molten.wurmzinc",1000);
		new TMelting(TFCItems.BismuthIngot2x,ModBlocks.BismuthBlock,0,300,"molten.wurmbismuth",2000);
		new TMelting(TFCItems.CopperIngot2x,ModBlocks.CopperBlock,0,500,"molten.wurmcopper",2000);
		new TMelting(TFCItems.BismuthBronzeIngot2x,ModBlocks.BismuthBronzeBlock,0,450,"molten.wurmbismuthbronze",2000);
		new TMelting(TFCItems.BlackBronzeIngot2x,ModBlocks.BlackBronzeBlock,0,500,"molten.wurmblackbronze",2000);
		new TMelting(TFCItems.BlackSteelIngot2x,ModBlocks.BlackSteelBlock,0,1200,"molten.wurmblacksteel",2000);
		new TMelting(TFCItems.BrassIngot2x,ModBlocks.BrassBlock,0,500,"molten.wurmbrass",2000);
		new TMelting(TFCItems.BronzeIngot2x,ModBlocks.BronzeBlock,0,500,"molten.wurmbronze",2000);
		new TMelting(TFCItems.BlueSteelIngot2x,ModBlocks.BlueSteelBlock,0,1200,"molten.wurmbluesteel",2000);
		new TMelting(TFCItems.CopperIngot2x,ModBlocks.CopperBlock,0,500,"molten.wurmcopper",2000);
		new TMelting(TFCItems.GoldIngot2x,ModBlocks.GoldBlock,0,650,"molten.wurmgold",2000);
		new TMelting(TFCItems.WroughtIronIngot2x,ModBlocks.WroughtIronBlock,0,750,"molten.wurmwroughtiron",2000);
		new TMelting(TFCItems.LeadIngot2x,ModBlocks.LeadBlock,0,350,"molten.wurmlead",2000);
		new TMelting(TFCItems.NickelIngot2x,ModBlocks.NickelBlock,0,1253,"molten.wurmnickel",2000);
		new TMelting(TFCItems.PlatinumIngot2x,ModBlocks.PlatinumBlock,0,920,"molten.wurmplatinum",2000);
		new TMelting(TFCItems.RedSteelIngot2x,ModBlocks.RedSteelBlock,0,1200,"molten.wurmredsteel",2000);
		new TMelting(TFCItems.RoseGoldIngot2x,ModBlocks.RoseGoldBlock,0,750,"molten.wurmrosegold",2000);
		new TMelting(TFCItems.SilverIngot2x,ModBlocks.SilverBlock,0,850,"molten.wurmSilver",2000);
		new TMelting(TFCItems.SteelIngot2x,ModBlocks.SteelBlock,0,1290,"molten.wurmsteel",2000);
		new TMelting(TFCItems.SterlingSilverIngot2x,ModBlocks.SterlingSilverBlock,0,750,"molten.wurmsterlingsilver",2000);
		new TMelting(TFCItems.TinIngot2x,ModBlocks.TinBlock,0,250,"molten.wurmtin",2000);
		new TMelting(TFCItems.ZincIngot2x,ModBlocks.ZincBlock,0,200,"molten.wurmzinc",2000);
		new TMelting(TFCItems.BismuthSheet,ModBlocks.BismuthBlock,0,300,"molten.wurmbismuth",1000);
		new TMelting(TFCItems.CopperSheet,ModBlocks.CopperBlock,0,500,"molten.wurmcopper",1000);
		new TMelting(TFCItems.BismuthBronzeSheet,ModBlocks.BismuthBronzeBlock,0,450,"molten.wurmbismuthbronze",1000);
		new TMelting(TFCItems.BlackBronzeSheet,ModBlocks.BlackBronzeBlock,0,500,"molten.wurmblackbronze",1000);
		new TMelting(TFCItems.BlackSteelSheet,ModBlocks.BlackSteelBlock,0,1000,"molten.wurmblacksteel",1000);
		new TMelting(TFCItems.BrassSheet,ModBlocks.BrassBlock,0,500,"molten.wurmbrass",1000);
		new TMelting(TFCItems.BronzeSheet,ModBlocks.BronzeBlock,0,500,"molten.wurmbronze",1000);
		new TMelting(TFCItems.BlueSteelSheet,ModBlocks.BlueSteelBlock,0,1200,"molten.wurmbluesteel",1000);
		new TMelting(TFCItems.CopperSheet,ModBlocks.CopperBlock,0,500,"molten.wurmcopper",1000);
		new TMelting(TFCItems.GoldSheet,ModBlocks.GoldBlock,0,650,"molten.wurmgold",1000);
		new TMelting(TFCItems.WroughtIronSheet,ModBlocks.WroughtIronBlock,0,750,"molten.wurmwroughtiron",1000);
		new TMelting(TFCItems.LeadSheet,ModBlocks.LeadBlock,0,350,"molten.wurmlead",1000);
		new TMelting(TFCItems.NickelSheet,ModBlocks.NickelBlock,0,1253,"molten.wurmnickel",1000);
		new TMelting(TFCItems.PigIronSheet,ModBlocks.PigIronBlock,0,1270,"molten.wurmpigiron",1000);
		new TMelting(TFCItems.PlatinumSheet,ModBlocks.PlatinumBlock,0,920,"molten.wurmplatinum",1000);
		new TMelting(TFCItems.RedSteelSheet,ModBlocks.RedSteelBlock,0,1200,"molten.wurmredsteel",1000);
		new TMelting(TFCItems.RoseGoldSheet,ModBlocks.RoseGoldBlock,0,750,"molten.wurmrosegold",1000);
		new TMelting(TFCItems.SilverSheet,ModBlocks.SilverBlock,0,850,"molten.wurmSilver",1000);
		new TMelting(TFCItems.SteelSheet,ModBlocks.SteelBlock,0,1290,"molten.wurmsteel",1000);
		new TMelting(TFCItems.SterlingSilverSheet,ModBlocks.SterlingSilverBlock,0,750,"molten.wurmsterlingsilver",1000);
		new TMelting(TFCItems.TinSheet,ModBlocks.TinBlock,0,250,"molten.wurmtin",1000);
		new TMelting(TFCItems.ZincSheet,ModBlocks.ZincBlock,0,200,"molten.wurmzinc",1000);
		new TMelting(TFCItems.BismuthSheet2x,ModBlocks.BismuthBlock,0,300,"molten.wurmbismuth",2000);
		new TMelting(TFCItems.CopperSheet2x,ModBlocks.CopperBlock,0,500,"molten.wurmcopper",2000);
		new TMelting(TFCItems.BismuthBronzeSheet2x,ModBlocks.BismuthBronzeBlock,0,450,"molten.wurmbismuthbronze",2000);
		new TMelting(TFCItems.BlackBronzeSheet2x,ModBlocks.BlackBronzeBlock,0,500,"molten.wurmblackbronze",2000);
		new TMelting(TFCItems.BlackSteelSheet2x,ModBlocks.BlackSteelBlock,0,1200,"molten.wurmblacksteel",2000);
		new TMelting(TFCItems.BrassSheet2x,ModBlocks.BrassBlock,0,500,"molten.wurmbrass",2000);
		new TMelting(TFCItems.BronzeSheet2x,ModBlocks.BronzeBlock,0,500,"molten.wurmbronze",2000);
		new TMelting(TFCItems.BlueSteelSheet2x,ModBlocks.BlueSteelBlock,0,1200,"molten.wurmbluesteel",2000);
		new TMelting(TFCItems.CopperSheet2x,ModBlocks.CopperBlock,0,500,"molten.wurmcopper",2000);
		new TMelting(TFCItems.GoldSheet2x,ModBlocks.GoldBlock,0,650,"molten.wurmgold",2000);
		new TMelting(TFCItems.WroughtIronSheet2x,ModBlocks.WroughtIronBlock,0,750,"molten.wurmwroughtiron",2000);
		new TMelting(TFCItems.LeadSheet2x,ModBlocks.LeadBlock,0,350,"molten.wurmlead",2000);
		new TMelting(TFCItems.NickelSheet2x,ModBlocks.NickelBlock,0,1253,"molten.wurmnickel",2000);
		new TMelting(TFCItems.PigIronSheet2x,ModBlocks.PigIronBlock,0,1270,"molten.wurmpigiron",2000);
		new TMelting(TFCItems.PlatinumSheet2x,ModBlocks.PlatinumBlock,0,920,"molten.wurmplatinum",2000);
		new TMelting(TFCItems.RedSteelSheet2x,ModBlocks.RedSteelBlock,0,1200,"molten.wurmredsteel",2000);
		new TMelting(TFCItems.RoseGoldSheet2x,ModBlocks.RoseGoldBlock,0,750,"molten.wurmrosegold",2000);
		new TMelting(TFCItems.SilverSheet2x,ModBlocks.SilverBlock,0,850,"molten.wurmSilver",2000);
		new TMelting(TFCItems.SteelSheet2x,ModBlocks.SteelBlock,0,1290,"molten.wurmsteel",2000);
		new TMelting(TFCItems.SterlingSilverSheet2x,ModBlocks.SterlingSilverBlock,0,750,"molten.wurmsterlingsilver",2000);
		new TMelting(TFCItems.TinSheet2x,ModBlocks.TinBlock,0,250,"molten.wurmtin",2000);
		new TMelting(TFCItems.ZincSheet2x,ModBlocks.ZincBlock,0,200,"molten.wurmzinc",2000);
		new TMelting(ModBlocks.BismuthBlock,ModBlocks.BismuthBlock,0,300,"molten.wurmbismuth",32000);
		new TMelting(ModBlocks.CopperBlock,ModBlocks.CopperBlock,0,500,"molten.wurmcopper",32000);
		new TMelting(ModBlocks.BismuthBronzeBlock,ModBlocks.BismuthBronzeBlock,0,450,"molten.wurmbismuthbronze",32000);
		new TMelting(ModBlocks.BlackBronzeBlock,ModBlocks.BlackBronzeBlock,0,500,"molten.wurmblackbronze",32000);
		new TMelting(ModBlocks.BlackSteelBlock,ModBlocks.BlackSteelBlock,0,1200,"molten.wurmblacksteel",32000);
		new TMelting(ModBlocks.BrassBlock,ModBlocks.BrassBlock,0,500,"molten.wurmbrass",32000);
		new TMelting(ModBlocks.BronzeBlock,ModBlocks.BronzeBlock,0,500,"molten.wurmbronze",32000);
		new TMelting(ModBlocks.BlueSteelBlock,ModBlocks.BlueSteelBlock,0,1500*8,"molten.wurmbluesteel",32000);
		new TMelting(ModBlocks.CopperBlock,ModBlocks.CopperBlock,0,500*8,"molten.wurmcopper",32000);
		new TMelting(ModBlocks.GoldBlock,ModBlocks.GoldBlock,0,650*8,"molten.wurmgold",32000);
		new TMelting(ModBlocks.WroughtIronBlock,ModBlocks.WroughtIronBlock,0,750,"molten.wurmwroughtiron",32000);
		new TMelting(ModBlocks.LeadBlock,ModBlocks.LeadBlock,0,350,"molten.wurmlead",32000);
		new TMelting(ModBlocks.NickelBlock,ModBlocks.NickelBlock,0,1253,"molten.wurmnickel",32000);
		new TMelting(ModBlocks.PigIronBlock,ModBlocks.PigIronBlock,0,1270,"molten.wurmpigiron",32000);
		new TMelting(ModBlocks.PlatinumBlock,ModBlocks.PlatinumBlock,0,920,"molten.wurmplatinum",32000);
		new TMelting(ModBlocks.RedSteelBlock,ModBlocks.RedSteelBlock,0,1200,"molten.wurmredsteel",32000);
		new TMelting(ModBlocks.RoseGoldBlock,ModBlocks.RoseGoldBlock,0,750,"molten.wurmrosegold",32000);
		new TMelting(ModBlocks.SilverBlock,ModBlocks.SilverBlock,0,1200,"molten.wurmSilver",32000);
		new TMelting(ModBlocks.SteelBlock,ModBlocks.SteelBlock,0,1200,"molten.wurmsteel",32000);
		new TMelting(ModBlocks.SterlingSilverBlock,ModBlocks.SterlingSilverBlock,0,1200,"molten.wurmsterlingsilver",32000);
		new TMelting(ModBlocks.TinBlock,ModBlocks.TinBlock,0,1200,"molten.wurmtin",32000);
		new TMelting(ModBlocks.ZincBlock,ModBlocks.ZincBlock,0,1200,"molten.wurmzinc",32000);
		new TMelting(new ItemStack(TFCItems.SmallOreChunk,1,0),ModBlocks.CopperBlock,0,400,"molten.wurmcopper",150);
		new TMelting(new ItemStack(TFCItems.SmallOreChunk,1,1),ModBlocks.GoldBlock,0,400,"molten.wurmgold",150);
		new TMelting(new ItemStack(TFCItems.SmallOreChunk,1,2),ModBlocks.PlatinumBlock,0,400,"molten.wurmplatinum",150);
		new TMelting(new ItemStack(TFCItems.SmallOreChunk,1,3),ModBlocks.WroughtIronBlock,0,400,"molten.wurmwroughtiron",150);
		new TMelting(new ItemStack(TFCItems.SmallOreChunk,1,4),ModBlocks.SilverBlock,0,400,"molten.wurmsilver",150);
		new TMelting(new ItemStack(TFCItems.SmallOreChunk,1,5),ModBlocks.TinBlock,0,400,"molten.wurmtin",150);
		new TMelting(new ItemStack(TFCItems.SmallOreChunk,1,6),ModBlocks.LeadBlock,0,400,"molten.wurmtin",150);
		new TMelting(new ItemStack(TFCItems.SmallOreChunk,1,7),ModBlocks.BismuthBlock,0,400,"molten.wurmbismuth",150);
		new TMelting(new ItemStack(TFCItems.SmallOreChunk,1,8),ModBlocks.NickelBlock,0,400,"molten.wurmlead",150);
		new TMelting(new ItemStack(TFCItems.SmallOreChunk,1,9),ModBlocks.CopperBlock,0,400,"molten.wurmcopper",150);
		new TMelting(new ItemStack(TFCItems.SmallOreChunk,1,10),ModBlocks.WroughtIronBlock,0,400,"molten.wurmwroughtiron",150);
		new TMelting(new ItemStack(TFCItems.SmallOreChunk,1,11),ModBlocks.WroughtIronBlock,0,400,"molten.wurmwroughtiron",150);
		new TMelting(new ItemStack(TFCItems.SmallOreChunk,1,12),ModBlocks.ZincBlock,0,400,"molten.wurmzinc",150);
		new TMelting(new ItemStack(TFCItems.SmallOreChunk,1,13),ModBlocks.CopperBlock,0,400,"molten.wurmcopper",150);
		new TMelting(new ItemStack(TFCItems.OreChunk,1,0),ModBlocks.CopperBlock,0,600,"molten.wurmcopper",300);
		new TMelting(new ItemStack(TFCItems.OreChunk,1,1),ModBlocks.GoldBlock,0,600,"molten.wurmgold",300);
		new TMelting(new ItemStack(TFCItems.OreChunk,1,2),ModBlocks.PlatinumBlock,0,600,"molten.wurmplatinum",300);
		new TMelting(new ItemStack(TFCItems.OreChunk,1,3),ModBlocks.WroughtIronBlock,0,600,"molten.wurmwroughtiron",300);
		new TMelting(new ItemStack(TFCItems.OreChunk,1,4),ModBlocks.SilverBlock,0,600,"molten.wurmsilver",300);
		new TMelting(new ItemStack(TFCItems.OreChunk,1,5),ModBlocks.TinBlock,0,600,"molten.wurmtin",300);
		new TMelting(new ItemStack(TFCItems.OreChunk,1,6),ModBlocks.LeadBlock,0,600,"molten.wurmtin",300);
		new TMelting(new ItemStack(TFCItems.OreChunk,1,7),ModBlocks.BismuthBlock,0,600,"molten.wurmbismuth",300);
		new TMelting(new ItemStack(TFCItems.OreChunk,1,8),ModBlocks.NickelBlock,0,600,"molten.wurmlead",300);
		new TMelting(new ItemStack(TFCItems.OreChunk,1,9),ModBlocks.CopperBlock,0,600,"molten.wurmcopper",300);
		new TMelting(new ItemStack(TFCItems.OreChunk,1,10),ModBlocks.WroughtIronBlock,0,600,"molten.wurmwroughtiron",300);
		new TMelting(new ItemStack(TFCItems.OreChunk,1,11),ModBlocks.WroughtIronBlock,0,600,"molten.wurmwroughtiron",300);
		new TMelting(new ItemStack(TFCItems.OreChunk,1,12),ModBlocks.ZincBlock,0,600,"molten.wurmzinc",300);
		new TMelting(new ItemStack(TFCItems.OreChunk,1,13),ModBlocks.CopperBlock,0,600,"molten.wurmcopper",300);
		new TMelting(new ItemStack(TFCItems.OreChunk,1,35),ModBlocks.CopperBlock,0,800,"molten.wurmcopper",550);
		new TMelting(new ItemStack(TFCItems.OreChunk,1,36),ModBlocks.GoldBlock,0,800,"molten.wurmgold",550);
		new TMelting(new ItemStack(TFCItems.OreChunk,1,37),ModBlocks.PlatinumBlock,0,800,"molten.wurmplatinum",550);
		new TMelting(new ItemStack(TFCItems.OreChunk,1,38),ModBlocks.WroughtIronBlock,0,800,"molten.wurmwroughtiron",550);
		new TMelting(new ItemStack(TFCItems.OreChunk,1,39),ModBlocks.SilverBlock,0,800,"molten.wurmsilver",550);
		new TMelting(new ItemStack(TFCItems.OreChunk,1,40),ModBlocks.TinBlock,0,800,"molten.wurmtin",550);
		new TMelting(new ItemStack(TFCItems.OreChunk,1,41),ModBlocks.LeadBlock,0,800,"molten.wurmtin",550);
		new TMelting(new ItemStack(TFCItems.OreChunk,1,42),ModBlocks.BismuthBlock,0,800,"molten.wurmbismuth",550);
		new TMelting(new ItemStack(TFCItems.OreChunk,1,43),ModBlocks.NickelBlock,0,800,"molten.wurmlead",550);
		new TMelting(new ItemStack(TFCItems.OreChunk,1,44),ModBlocks.CopperBlock,0,800,"molten.wurmcopper",550);
		new TMelting(new ItemStack(TFCItems.OreChunk,1,45),ModBlocks.WroughtIronBlock,0,800,"molten.wurmwroughtiron",550);
		new TMelting(new ItemStack(TFCItems.OreChunk,1,46),ModBlocks.WroughtIronBlock,0,800,"molten.wurmwroughtiron",550);
		new TMelting(new ItemStack(TFCItems.OreChunk,1,47),ModBlocks.ZincBlock,0,800,"molten.wurmzinc",550);
		new TMelting(new ItemStack(TFCItems.OreChunk,1,48),ModBlocks.CopperBlock,0,800,"molten.wurmcopper",550);
		new TMelting(new ItemStack(TFCItems.OreChunk,1,49),ModBlocks.CopperBlock,0,600,"molten.wurmcopper",200);
		new TMelting(new ItemStack(TFCItems.OreChunk,1,50),ModBlocks.GoldBlock,0,600,"molten.wurmgold",200);
		new TMelting(new ItemStack(TFCItems.OreChunk,1,51),ModBlocks.PlatinumBlock,0,600,"molten.wurmplatinum",200);
		new TMelting(new ItemStack(TFCItems.OreChunk,1,52),ModBlocks.WroughtIronBlock,0,600,"molten.wurmwroughtiron",200);
		new TMelting(new ItemStack(TFCItems.OreChunk,1,53),ModBlocks.SilverBlock,0,600,"molten.wurmsilver",200);
		new TMelting(new ItemStack(TFCItems.OreChunk,1,54),ModBlocks.TinBlock,0,600,"molten.wurmtin",200);
		new TMelting(new ItemStack(TFCItems.OreChunk,1,55),ModBlocks.LeadBlock,0,600,"molten.wurmtin",200);
		new TMelting(new ItemStack(TFCItems.OreChunk,1,56),ModBlocks.BismuthBlock,0,600,"molten.wurmbismuth",200);
		new TMelting(new ItemStack(TFCItems.OreChunk,1,57),ModBlocks.NickelBlock,0,600,"molten.wurmlead",200);
		new TMelting(new ItemStack(TFCItems.OreChunk,1,58),ModBlocks.CopperBlock,0,600,"molten.wurmcopper",200);
		new TMelting(new ItemStack(TFCItems.OreChunk,1,59),ModBlocks.WroughtIronBlock,0,600,"molten.wurmwroughtiron",200);
		new TMelting(new ItemStack(TFCItems.OreChunk,1,60),ModBlocks.WroughtIronBlock,0,600,"molten.wurmwroughtiron",200);
		new TMelting(new ItemStack(TFCItems.OreChunk,1,61),ModBlocks.ZincBlock,0,600,"molten.wurmzinc",200);
		new TMelting(new ItemStack(TFCItems.OreChunk,1,62),ModBlocks.CopperBlock,0,600,"molten.wurmcopper",200);
		new TMelting(new ItemStack(tweaks.wurm.items.ModItems.aCred_bismuth,1,0),ModBlocks.BismuthBlock,0,400,"molten.wurmbismuth",300);
		new TMelting(new ItemStack(tweaks.wurm.items.ModItems.bCred_bismuth,1,0),ModBlocks.BismuthBlock,0,800,"molten.wurmbismuth",500);
		new TMelting(new ItemStack(tweaks.wurm.items.ModItems.cCred_bismuth,1,0),ModBlocks.BismuthBlock,0,1200,"molten.wurmbismuth",700);
		new TMelting(new ItemStack(tweaks.wurm.items.ModItems.aCred_tin,1,0),ModBlocks.BismuthBlock,0,400,"molten.wurmtin",300);
		new TMelting(new ItemStack(tweaks.wurm.items.ModItems.bCred_tin,1,0),ModBlocks.BismuthBlock,0,800,"molten.wurmtin",500);
		new TMelting(new ItemStack(tweaks.wurm.items.ModItems.cCred_tin,1,0),ModBlocks.BismuthBlock,0,1200,"molten.wurmtin",700);
		new TMelting(new ItemStack(tweaks.wurm.items.ModItems.aCred_nickel,1,0),ModBlocks.NickelBlock,0,400,"molten.wurmnickel",300);
		new TMelting(new ItemStack(tweaks.wurm.items.ModItems.bCred_nickel,1,0),ModBlocks.NickelBlock,0,800,"molten.wurmnickel",500);
		new TMelting(new ItemStack(tweaks.wurm.items.ModItems.cCred_nickel,1,0),ModBlocks.NickelBlock,0,1200,"molten.wurmnickel",700);
		new TMelting(new ItemStack(tweaks.wurm.items.ModItems.aCred_iron,1,0),ModBlocks.WroughtIronBlock,0,400,"molten.wurmwroughtiron",300);
		new TMelting(new ItemStack(tweaks.wurm.items.ModItems.bCred_iron,1,0),ModBlocks.WroughtIronBlock,0,800,"molten.wurmwroughtiron",500);
		new TMelting(new ItemStack(tweaks.wurm.items.ModItems.cCred_iron,0),ModBlocks.WroughtIronBlock,0,1200,"molten.wurmwroughtiron",700);
		new TMelting(new ItemStack(tweaks.wurm.items.ModItems.aCred_copper,1,0),ModBlocks.CopperBlock,0,400,"molten.wurmcopper",300);
		new TMelting(new ItemStack(tweaks.wurm.items.ModItems.bCred_copper,1,0),ModBlocks.CopperBlock,0,800,"molten.wurmcopper",500);
		new TMelting(new ItemStack(tweaks.wurm.items.ModItems.cCred_copper,0),ModBlocks.CopperBlock,0,1200,"molten.wurmcopper",700);
		new TMelting(new ItemStack(tweaks.wurm.items.ModItems.aCred_gold,1,0),ModBlocks.GoldBlock,0,400,"molten.wurmgold",300);
		new TMelting(new ItemStack(tweaks.wurm.items.ModItems.bCred_gold,1,0),ModBlocks.GoldBlock,0,800,"molten.wurmgold",500);
		new TMelting(new ItemStack(tweaks.wurm.items.ModItems.cCred_gold,0),ModBlocks.GoldBlock,0,1200,"molten.wurmgold",700);
		new TMelting(new ItemStack(tweaks.wurm.items.ModItems.aCred_silver,1,0),ModBlocks.SilverBlock,0,400,"molten.wurmsilver",300);
		new TMelting(new ItemStack(tweaks.wurm.items.ModItems.bCred_silver,1,0),ModBlocks.SilverBlock,0,800,"molten.wurmsilver",500);
		new TMelting(new ItemStack(tweaks.wurm.items.ModItems.cCred_silver,0),ModBlocks.SilverBlock,0,1200,"molten.wurmsilver",700);
		new TMelting(new ItemStack(tweaks.wurm.items.ModItems.aCred_zinc,1,0),ModBlocks.ZincBlock,0,400,"molten.wurmzinc",300);
		new TMelting(new ItemStack(tweaks.wurm.items.ModItems.bCred_zinc,1,0),ModBlocks.ZincBlock,0,800,"molten.wurmzinc",500);
		new TMelting(new ItemStack(tweaks.wurm.items.ModItems.cCred_zinc,0),ModBlocks.ZincBlock,0,1200,"molten.wurmzinc",700);
		new TMelting(new ItemStack(tweaks.wurm.items.ModItems.aCred_lead,1,0),ModBlocks.LeadBlock,0,400,"molten.wurmlead",300);
		new TMelting(new ItemStack(tweaks.wurm.items.ModItems.bCred_lead,1,0),ModBlocks.LeadBlock,0,800,"molten.wurmlead",500);
		new TMelting(new ItemStack(tweaks.wurm.items.ModItems.cCred_lead,0),ModBlocks.LeadBlock,0,1200,"molten.wurmlead",700);
		new TMelting(new ItemStack(tweaks.wurm.items.ModItems.aCred_platinum,1,0),ModBlocks.PlatinumBlock,0,400,"molten.wurmplatinum",300);
		new TMelting(new ItemStack(tweaks.wurm.items.ModItems.bCred_platinum,1,0),ModBlocks.PlatinumBlock,0,800,"molten.wurmplatinum",500);
		new TMelting(new ItemStack(tweaks.wurm.items.ModItems.cCred_platinum,0),ModBlocks.PlatinumBlock,0,1200,"molten.wurmplatinum",700);

	}
}
