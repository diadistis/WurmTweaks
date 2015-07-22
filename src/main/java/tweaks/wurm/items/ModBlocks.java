package tweaks.wurm.items;

import tconstruct.library.crafting.FluidType;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks {
	
	 public static Block CompressedRedstoneBlock;
	 
	 public static Block BismuthBlock;
	 public static Block TinBlock;
	 public static Block ZincBlock;
	 public static Block CopperBlock;
	 public static Block BronzeBlock;
	 public static Block BismuthBronzeBlock;
	 public static Block BlackBronzeBlock;
	 public static Block BrassBlock;
	 public static Block LeadBlock;
	 public static Block GoldBlock;
	 public static Block RoseGoldBlock;
	 public static Block SilverBlock;
	 public static Block SterlingSilverBlock;
	 public static Block PlatinumBlock;
	 public static Block WroughtIronBlock;
	 public static Block NickelBlock;
	 public static Block PigIronBlock;
	 public static Block SteelBlock;
	 public static Block BlackSteelBlock;
	 public static Block BlueSteelBlock;
	 public static Block RedSteelBlock;
	 
	 public static Fluid moltenBismuthFluid;
	 public static Fluid moltenTinFluid;
	 public static Fluid moltenZincFluid;
	 public static Fluid moltenCopperFluid;
	 public static Fluid moltenBronzeFluid;
	 public static Fluid moltenBismuthBronzeFluid;
	 public static Fluid moltenBlackBronzeFluid;
	 public static Fluid moltenBrassFluid;
	 public static Fluid moltenLeadFluid;
	 public static Fluid moltenGoldFluid;
	 public static Fluid moltenRoseGoldFluid;
	 public static Fluid moltenSilverFluid;
	 public static Fluid moltenSterlingSilverFluid;
	 public static Fluid moltenPlatinumFluid;
	 public static Fluid moltenWroughtIronFluid;
	 public static Fluid moltenNickelFluid;
	 public static Fluid moltenPigIronFluid;
	 public static Fluid moltenSteelFluid;
	 public static Fluid moltenBlackSteelFluid;
	 public static Fluid moltenBlueSteelFluid;
	 public static Fluid moltenRedSteelFluid;
	 
	 public static Fluid AntiMatter;
	 public static Block AntiMatterBlockFluid;
	 
	 public static Block moltenBismuth;
	 public static Block moltenTin;
	 public static Block moltenZinc;
	 public static Block moltenCopper;
	 public static Block moltenBronze;
	 public static Block moltenBimsuthBronze;
	 public static Block moltenBlackBronze;
	 public static Block moltenBrass;
	 public static Block moltenLead;
	 public static Block moltenGold;
	 public static Block moltenRoseGold;
	 public static Block moltenSilver;
	 public static Block moltenSterlingSilver;
	 public static Block moltenPlatinum;
	 public static Block moltenWroughtIron;
	 public static Block moltenNickel;
	 public static Block moltenPigIron;
	 public static Block moltenSteel;
	 public static Block moltenBlackSteel;
	 public static Block moltenBlueSteel;
	 public static Block moltenRedSteel;
	 
	 public static Block AgateBlock;
	 public static Block AmethystBlock;
	 public static Block BerylBlock;
	 public static Block DiamondBlock;
	 public static Block EmeraldBlock;
	 public static Block GarnetBlock;
	 public static Block JadeBlock;
	 public static Block JasperBlock;
	 public static Block OpalBlock;
	 public static Block RubyBlock;
	 public static Block SapphireBlock;
	 public static Block TopazBlock;
	 public static Block TourmalineBlock;
	 
	 public static Block ZirconiumGlass;
	 public static Block PaladiumOre;
	 public static Block ZirconOre;
	 public static Block FranciumOre;
	 public static Block TitaniumOre;
	 
	 public static void registerBlocks() {
		 
		 CompressedRedstoneBlock = new WurmBlock(Material.iron).setBlockName("CompressedRedstoneBlock").setBlockTextureName("wurmtweaks" + ":" + "CompressedRedstoneBlock");
		 BismuthBlock = new WurmBlock(Material.iron).setBlockName("Bismuth").setBlockTextureName("wurmtweaks:" + "Bismuth");
		 TinBlock = new WurmBlock(Material.iron).setBlockName("Tin").setBlockTextureName("wurmtweaks:" + "Tin");
		 ZincBlock = new WurmBlock(Material.iron).setBlockName("Zinc").setBlockTextureName("wurmtweaks:" + "Zinc");
		 CopperBlock = new WurmBlock(Material.iron).setBlockName("Copper").setBlockTextureName("wurmtweaks:" + "Copper");
		 BronzeBlock = new WurmBlock(Material.iron).setBlockName("Bronze").setBlockTextureName("wurmtweaks:" + "Bronze");
		 BismuthBronzeBlock = new WurmBlock(Material.iron).setBlockName("BismuthBronze").setBlockTextureName("wurmtweaks:" + "BismuthBronze");
		 BlackBronzeBlock = new WurmBlock(Material.iron).setBlockName("BlackBronze").setBlockTextureName("wurmtweaks:" + "BlackBronze");
		 BrassBlock = new WurmBlock(Material.iron).setBlockName("Brass").setBlockTextureName("wurmtweaks:" + "Brass");
		 LeadBlock = new WurmBlock(Material.iron).setBlockName("Lead").setBlockTextureName("wurmtweaks:" + "Lead");
		 GoldBlock = new WurmBlock(Material.iron).setBlockName("Gold").setBlockTextureName("wurmtweaks:" + "Gold");
		 RoseGoldBlock = new WurmBlock(Material.iron).setBlockName("RoseGold").setBlockTextureName("wurmtweaks:" + "RoseGold");
		 SilverBlock = new WurmBlock(Material.iron).setBlockName("Silver").setBlockTextureName("wurmtweaks:" + "Silver");
		 SterlingSilverBlock = new WurmBlock(Material.iron).setBlockName("SterlingSilver").setBlockTextureName("wurmtweaks:" + "Bismuth");
		 PlatinumBlock = new WurmBlock(Material.iron).setBlockName("Platinum").setBlockTextureName("wurmtweaks:" + "Platinum");
		 WroughtIronBlock = new WurmBlock(Material.iron).setBlockName("WroughtIron").setBlockTextureName("wurmtweaks:" + "WroughtIron");
		 NickelBlock = new WurmBlock(Material.iron).setBlockName("Nickel").setBlockTextureName("wurmtweaks:" + "Nickel");
		 PigIronBlock = new WurmBlock(Material.iron).setBlockName("PigIron").setBlockTextureName("wurmtweaks:" + "PigIron");
		 SteelBlock = new WurmBlock(Material.iron).setBlockName("Steel").setBlockTextureName("wurmtweaks:" + "Steel");
		 BlackSteelBlock = new WurmBlock(Material.iron).setBlockName("BlackSteel").setBlockTextureName("wurmtweaks:" + "BlackSteel");
		 BlueSteelBlock = new WurmBlock(Material.iron).setBlockName("BlueSteel").setBlockTextureName("wurmtweaks:" + "BlueSteel");
		 RedSteelBlock = new WurmBlock(Material.iron).setBlockName("RedSteel").setBlockTextureName("wurmtweaks:" + "RedSteel");
		 
		 AgateBlock = new WurmBlock(Material.iron).setBlockName("Agate").setBlockTextureName("wurmtweaks:" + "Agate");
		 AmethystBlock = new WurmBlock(Material.iron).setBlockName("Amethyst").setBlockTextureName("wurmtweaks:"  + "Amethyst");
		 BerylBlock = new WurmBlock(Material.iron).setBlockName("Beryl").setBlockTextureName("wurmtweaks:" + "Beryl");
		 DiamondBlock = new WurmBlock(Material.iron).setBlockName("Diamond").setBlockTextureName("wurmtweaks:" + "Diamond");
		 EmeraldBlock = new WurmBlock(Material.iron).setBlockName("Emerald").setBlockTextureName("wurmtweaks:"+ "Emerald");
		 GarnetBlock = new WurmBlock(Material.iron).setBlockName("Garnet").setBlockTextureName("wurmtweaks:" + "Garnet");
		 JadeBlock = new WurmBlock(Material.iron).setBlockName("Jade").setBlockTextureName("wurmtweaks:" + "Jade");
		 JasperBlock = new WurmBlock(Material.iron).setBlockName("Jasper").setBlockTextureName("wurmtweaks:"+ "Jasper");
		 OpalBlock = new WurmBlock(Material.iron).setBlockName("Opal").setBlockTextureName("wurmtweaks:"+ "Opal");
		 RubyBlock = new WurmBlock(Material.iron).setBlockName("Ruby").setBlockTextureName("wurmtweaks:" + "Ruby");
		 SapphireBlock = new WurmBlock(Material.iron).setBlockName("Sapphire").setBlockTextureName("wurmtweaks:" + "Sapphire");
		 TopazBlock = new WurmBlock(Material.iron).setBlockName("Topaz").setBlockTextureName("wurmtweaks:" + "Topaz");
		 TourmalineBlock = new WurmBlock(Material.iron).setBlockName("Tourmaline").setBlockTextureName("wurmtweaks:" + "Tourmaline");
		 ZirconiumGlass = new WurmGlass(Material.glass, true).setBlockName("ZirconiumGlass").setBlockTextureName("wurmtweaks:" + "ZirconiumGlass");
		 PaladiumOre = new WurmBlock(Material.ground).setBlockName("PaladiumOre").setBlockTextureName("wurmtweaks:" + "PaladiumOre");
		 ZirconOre = new WurmBlock(Material.ground).setBlockName("ZirconOre").setBlockTextureName("wurmtweaks:" + "ZirconOre");
		 FranciumOre = new WurmBlock(Material.ground).setBlockName("FranciumOre").setBlockTextureName("wurmtweaks:" + "FranciumOre");
		 TitaniumOre = new WurmBlock(Material.ground).setBlockName("TitaniumOre").setBlockTextureName("wurmtweaks:" + "TitaniumOre");
		 
		 GameRegistry.registerBlock(TitaniumOre, TitaniumOre.getUnlocalizedName());
		 GameRegistry.registerBlock(FranciumOre, FranciumOre.getUnlocalizedName());
		 GameRegistry.registerBlock(ZirconOre, ZirconOre.getUnlocalizedName());
		 GameRegistry.registerBlock(PaladiumOre, PaladiumOre.getUnlocalizedName());
		 GameRegistry.registerBlock(ZirconiumGlass, ZirconiumGlass.getUnlocalizedName());
		 GameRegistry.registerBlock(CompressedRedstoneBlock, CompressedRedstoneBlock.getUnlocalizedName());
		 
		 GameRegistry.registerBlock(BismuthBlock, BismuthBlock.getUnlocalizedName());
		 GameRegistry.registerBlock(TinBlock, TinBlock.getUnlocalizedName());
		 GameRegistry.registerBlock(ZincBlock, ZincBlock.getUnlocalizedName());
		 GameRegistry.registerBlock(CopperBlock, CopperBlock.getUnlocalizedName());
		 GameRegistry.registerBlock(BronzeBlock, BronzeBlock.getUnlocalizedName());
		 GameRegistry.registerBlock(BismuthBronzeBlock, BismuthBronzeBlock.getUnlocalizedName());
		 GameRegistry.registerBlock(BlackBronzeBlock, BlackBronzeBlock.getUnlocalizedName());
		 GameRegistry.registerBlock(BrassBlock, BrassBlock.getUnlocalizedName());
		 GameRegistry.registerBlock(LeadBlock, LeadBlock.getUnlocalizedName());
		 GameRegistry.registerBlock(GoldBlock, GoldBlock.getUnlocalizedName());
		 GameRegistry.registerBlock(RoseGoldBlock, RoseGoldBlock.getUnlocalizedName());
		 GameRegistry.registerBlock(SilverBlock, SilverBlock.getUnlocalizedName());
		 GameRegistry.registerBlock(SterlingSilverBlock, SterlingSilverBlock.getUnlocalizedName());
		 GameRegistry.registerBlock(PlatinumBlock, PlatinumBlock.getUnlocalizedName());
		 GameRegistry.registerBlock(WroughtIronBlock, WroughtIronBlock.getUnlocalizedName());
		 GameRegistry.registerBlock(NickelBlock, NickelBlock.getUnlocalizedName());
		 GameRegistry.registerBlock(PigIronBlock, PigIronBlock.getUnlocalizedName());
		 GameRegistry.registerBlock(SteelBlock, SteelBlock.getUnlocalizedName());
		 GameRegistry.registerBlock(BlackSteelBlock, BlackSteelBlock.getUnlocalizedName());
		 GameRegistry.registerBlock(BlueSteelBlock, BlueSteelBlock.getUnlocalizedName());
		 GameRegistry.registerBlock(RedSteelBlock, RedSteelBlock.getUnlocalizedName());
		 
		 GameRegistry.registerBlock(AgateBlock, AgateBlock.getUnlocalizedName());
		 GameRegistry.registerBlock(AmethystBlock, AmethystBlock.getUnlocalizedName());
		 GameRegistry.registerBlock(BerylBlock, BerylBlock.getUnlocalizedName());
		 GameRegistry.registerBlock(DiamondBlock, DiamondBlock.getUnlocalizedName());
		 GameRegistry.registerBlock(EmeraldBlock, EmeraldBlock.getUnlocalizedName());
		 GameRegistry.registerBlock(GarnetBlock, GarnetBlock.getUnlocalizedName());
		 GameRegistry.registerBlock(JadeBlock, JadeBlock.getUnlocalizedName());
		 GameRegistry.registerBlock(JasperBlock, JasperBlock.getUnlocalizedName());
		 GameRegistry.registerBlock(OpalBlock, OpalBlock.getUnlocalizedName());
		 GameRegistry.registerBlock(RubyBlock, RubyBlock.getUnlocalizedName());
		 GameRegistry.registerBlock(SapphireBlock, SapphireBlock.getUnlocalizedName());
		 GameRegistry.registerBlock(TopazBlock, TopazBlock.getUnlocalizedName());
		 GameRegistry.registerBlock(TourmalineBlock, TourmalineBlock.getUnlocalizedName());
		 
		 // AntiMatter
		 AntiMatter = new Fluid("antimatter");
		 FluidRegistry.registerFluid(AntiMatter);
		 AntiMatterBlockFluid = new WurmFluid(AntiMatter, Material.lava).setBlockName("antimatter").setBlockTextureName("wurmtweaks:" + "antimatter");
		 GameRegistry.registerBlock(AntiMatterBlockFluid, AntiMatterBlockFluid.getUnlocalizedName());
		 
		 // Bismuth
		 moltenBismuthFluid = new Fluid("molten.wurmbismuth");
		 FluidRegistry.registerFluid(moltenBismuthFluid);
		 moltenBismuth = new WurmFluid(moltenBismuthFluid, Material.water).setBlockName("moltenBismuth").setBlockTextureName("wurmtweaks:" + "moltenBismuth");
		 moltenBismuthFluid.setBlock(moltenBismuth);
		 GameRegistry.registerBlock(moltenBismuth, moltenBismuth.getUnlocalizedName());
		 FluidType.registerFluidType("wurmBismuth", BismuthBlock, 0, 400, moltenBismuthFluid, false);

		 // Tin
		 moltenTinFluid = new Fluid("molten.wurmtin");
		 FluidRegistry.registerFluid(moltenTinFluid);
		 moltenTin = new WurmFluid(moltenTinFluid, Material.water).setBlockName("moltenTin").setBlockTextureName("wurmtweaks:" + "moltenTin");
		 moltenTinFluid.setBlock(moltenTin);
		 GameRegistry.registerBlock(moltenTin, moltenTin.getUnlocalizedName());
		 FluidType.registerFluidType("wurmTin", TinBlock, 0, 400, moltenTinFluid, false);

		 // Zinc
		 moltenZincFluid = new Fluid("molten.wurmzinc");
		 FluidRegistry.registerFluid(moltenZincFluid);
		 moltenZinc = new WurmFluid(moltenZincFluid, Material.water).setBlockName("moltenZinc").setBlockTextureName("wurmtweaks:" + "moltenZinc");
		 moltenZincFluid.setBlock(moltenZinc);
		 GameRegistry.registerBlock(moltenZinc, moltenZinc.getUnlocalizedName());
		 FluidType.registerFluidType("wurmZinc", ZincBlock, 0, 400, moltenZincFluid, false);
		 
		 // Copper
		 moltenCopperFluid = new Fluid("molten.wurmcopper");
		 FluidRegistry.registerFluid(moltenCopperFluid);
		 moltenCopper = new WurmFluid(moltenCopperFluid, Material.water).setBlockName("moltenCopper").setBlockTextureName("wurmtweaks:" + "moltenCopper");
		 moltenCopperFluid.setBlock(moltenCopper);
		 GameRegistry.registerBlock(moltenCopper, moltenCopper.getUnlocalizedName());
		 FluidType.registerFluidType("wurmCopper", CopperBlock, 0, 400, moltenCopperFluid, true);
		 
		 // Bronze
		 moltenBronzeFluid = new Fluid("molten.wurmBronze");
		 FluidRegistry.registerFluid(moltenBronzeFluid);
		 moltenBronze = new WurmFluid(moltenBronzeFluid, Material.water).setBlockName("moltenBronze").setBlockTextureName("wurmtweaks:" + "moltenBronze");
		 moltenBronzeFluid.setBlock(moltenBronze);
		 GameRegistry.registerBlock(moltenBronze, moltenBronze.getUnlocalizedName());
		 FluidType.registerFluidType("wurmBronze", BronzeBlock, 0, 400, moltenBronzeFluid, true);
		 
		 // BismuthBronze
		 moltenBismuthBronzeFluid = new Fluid("molten.wurmBismuthBronze");
		 FluidRegistry.registerFluid(moltenBismuthBronzeFluid);
		 moltenBimsuthBronze = new WurmFluid(moltenBismuthBronzeFluid, Material.water).setBlockName("moltenBismuthBronze").setBlockTextureName("wurmtweaks:" + "moltenBismuthBronze");
		 moltenBismuthBronzeFluid.setBlock(moltenBimsuthBronze);
		 GameRegistry.registerBlock(moltenBimsuthBronze, moltenBimsuthBronze.getUnlocalizedName());
		 FluidType.registerFluidType("wurmBismuthBronze", BismuthBronzeBlock, 0, 400, moltenBismuthBronzeFluid, true);
		 
		 // BlackBronze
		 moltenBlackBronzeFluid = new Fluid("molten.wurmBlackBronze");
		 FluidRegistry.registerFluid(moltenBlackBronzeFluid);
		 moltenBlackBronze = new WurmFluid(moltenBlackBronzeFluid, Material.water).setBlockName("moltenBlackBronze").setBlockTextureName("wurmtweaks:" + "moltenBlackBronze");
		 moltenBlackBronzeFluid.setBlock(moltenBlackBronze);
		 GameRegistry.registerBlock(moltenBlackBronze, moltenBlackBronze.getUnlocalizedName());
		 FluidType.registerFluidType("wurmBlackBronze", BlackBronzeBlock, 0, 400, moltenBlackBronzeFluid, true);
		 
		 // Brass
		 moltenBrassFluid = new Fluid("molten.wurmBrass");
		 FluidRegistry.registerFluid(moltenBrassFluid);
		 moltenBrass = new WurmFluid(moltenBrassFluid, Material.water).setBlockName("moltenBrass").setBlockTextureName("wurmtweaks:" + "moltenBrass");
		 moltenBrassFluid.setBlock(moltenBrass);
		 GameRegistry.registerBlock(moltenBrass, moltenBrass.getUnlocalizedName());
		 FluidType.registerFluidType("wurmBrass", BrassBlock, 0, 400, moltenBrassFluid, false);
		 
		 // Lead
		 moltenLeadFluid = new Fluid("molten.wurmLead");
		 FluidRegistry.registerFluid(moltenLeadFluid);
		 moltenLead = new WurmFluid(moltenLeadFluid, Material.water).setBlockName("moltenLead").setBlockTextureName("wurmtweaks:" + "moltenLead");
		 moltenLeadFluid.setBlock(moltenLead);
		 GameRegistry.registerBlock(moltenLead, moltenLead.getUnlocalizedName());
		 FluidType.registerFluidType("wurmLead", LeadBlock, 0, 400, moltenLeadFluid, false);
		 
		 // Gold
		 moltenGoldFluid = new Fluid("molten.wurmGold");
		 FluidRegistry.registerFluid(moltenGoldFluid);
		 moltenGold = new WurmFluid(moltenGoldFluid, Material.water).setBlockName("moltenGold").setBlockTextureName("wurmtweaks:" + "moltenGold");
		 moltenGoldFluid.setBlock(moltenGold);
		 GameRegistry.registerBlock(moltenGold, moltenGold.getUnlocalizedName());
		 FluidType.registerFluidType("wurmGold", GoldBlock, 0, 400, moltenGoldFluid, false);
		 
		 // RoseGold
		 moltenRoseGoldFluid = new Fluid("molten.wurmRoseGold");
		 FluidRegistry.registerFluid(moltenRoseGoldFluid);
		 moltenRoseGold = new WurmFluid(moltenRoseGoldFluid, Material.water).setBlockName("moltenRoseGold").setBlockTextureName("wurmtweaks:" + "moltenRoseGold");
		 moltenRoseGoldFluid.setBlock(moltenRoseGold);
		 GameRegistry.registerBlock(moltenRoseGold, moltenRoseGold.getUnlocalizedName());
		 FluidType.registerFluidType("wurmRoseGold", RoseGoldBlock, 0, 400, moltenRoseGoldFluid, false);
		 
		 // Silver
		 moltenSilverFluid = new Fluid("molten.wurmSilver");
		 FluidRegistry.registerFluid(moltenSilverFluid);
		 moltenSilver = new WurmFluid(moltenSilverFluid, Material.water).setBlockName("moltenSilver").setBlockTextureName("wurmtweaks:" + "moltenSilver");
		 moltenSilverFluid.setBlock(moltenSilver);
		 GameRegistry.registerBlock(moltenSilver, moltenSilver.getUnlocalizedName());
		 FluidType.registerFluidType("wurmSilver", SilverBlock, 0, 400, moltenSilverFluid, false);
		 
		 // SterlingSilver
		 moltenSterlingSilverFluid = new Fluid("molten.wurmSterlingSilver");
		 FluidRegistry.registerFluid(moltenSterlingSilverFluid);
		 moltenSterlingSilver = new WurmFluid(moltenSterlingSilverFluid, Material.water).setBlockName("moltenSterlingSilver").setBlockTextureName("wurmtweaks:" + "moltenSterlingSilver");
		 moltenSterlingSilverFluid.setBlock(moltenSterlingSilver);
		 GameRegistry.registerBlock(moltenSterlingSilver, moltenSterlingSilver.getUnlocalizedName());
		 FluidType.registerFluidType("wurmSterlingSilver", SterlingSilverBlock, 0, 400, moltenSterlingSilverFluid, false);
		 
		 // Platinum
		 moltenPlatinumFluid = new Fluid("molten.wurmPlatinum");
		 FluidRegistry.registerFluid(moltenPlatinumFluid);
		 moltenPlatinum = new WurmFluid(moltenPlatinumFluid, Material.water).setBlockName("moltenPlatinum").setBlockTextureName("wurmtweaks:" + "moltenPlatinum");
		 moltenPlatinumFluid.setBlock(moltenPlatinum);
		 GameRegistry.registerBlock(moltenPlatinum, moltenPlatinum.getUnlocalizedName());
		 FluidType.registerFluidType("wurmPlatinum", PlatinumBlock, 0, 400, moltenPlatinumFluid, false);
		 
		 // WroughtIron
		 moltenWroughtIronFluid = new Fluid("molten.wurmWroughtIron");
		 FluidRegistry.registerFluid(moltenWroughtIronFluid);
		 moltenWroughtIron = new WurmFluid(moltenWroughtIronFluid, Material.water).setBlockName("moltenWroughtIron").setBlockTextureName("wurmtweaks:" + "moltenWroughtIron");
		 moltenWroughtIronFluid.setBlock(moltenWroughtIron);
		 GameRegistry.registerBlock(moltenWroughtIron, moltenWroughtIron.getUnlocalizedName());
		 FluidType.registerFluidType("wurmWroughtIron", WroughtIronBlock, 0, 400, moltenWroughtIronFluid, true);
		 
		 // Nickel
		 moltenNickelFluid = new Fluid("molten.wurmNickel");
		 FluidRegistry.registerFluid(moltenNickelFluid);
		 moltenNickel = new WurmFluid(moltenNickelFluid, Material.water).setBlockName("moltenNickel").setBlockTextureName("wurmtweaks:" + "moltenNickel");
		 moltenNickelFluid.setBlock(moltenNickel);
		 GameRegistry.registerBlock(moltenNickel, moltenNickel.getUnlocalizedName());
		 FluidType.registerFluidType("wurmNickel", NickelBlock, 0, 400, moltenNickelFluid, false);
		 
		 // PigIron
		 moltenPigIronFluid = new Fluid("molten.wurmPigIron");
		 FluidRegistry.registerFluid(moltenPigIronFluid);
		 moltenPigIron = new WurmFluid(moltenPigIronFluid, Material.water).setBlockName("moltenPigIron").setBlockTextureName("wurmtweaks:" + "moltenPigIron");
		 moltenPigIronFluid.setBlock(moltenPigIron);
		 GameRegistry.registerBlock(moltenPigIron, moltenPigIron.getUnlocalizedName());
		 FluidType.registerFluidType("wurmPigIron", PigIronBlock, 0, 400, moltenPigIronFluid, false);
		 
		 // Steel
		 moltenSteelFluid = new Fluid("molten.wurmSteel");
		 FluidRegistry.registerFluid(moltenSteelFluid);
		 moltenSteel = new WurmFluid(moltenSteelFluid, Material.water).setBlockName("moltenSteel").setBlockTextureName("wurmtweaks:" + "moltenSteel");
		 moltenSteelFluid.setBlock(moltenSteel);
		 GameRegistry.registerBlock(moltenSteel, moltenSteel.getUnlocalizedName());
		 FluidType.registerFluidType("wurmSteel", SteelBlock, 0, 400, moltenSteelFluid, true);
		 
		 // BlackSteel
		 moltenBlackSteelFluid = new Fluid("molten.wurmBlackSteel");
		 FluidRegistry.registerFluid(moltenBlackSteelFluid);
		 moltenBlackSteel = new WurmFluid(moltenBlackSteelFluid, Material.water).setBlockName("moltenBlackSteel").setBlockTextureName("wurmtweaks:" + "moltenBlackSteel");
		 moltenBlackSteelFluid.setBlock(moltenBlackSteel);
		 GameRegistry.registerBlock(moltenBlackSteel, moltenBlackSteel.getUnlocalizedName());
		 FluidType.registerFluidType("wurmBlackSteel", BlackSteelBlock, 0, 400, moltenBlackSteelFluid, true);
		 
		 // BlueSteel
		 moltenBlueSteelFluid = new Fluid("molten.wurmBlueSteel");
		 FluidRegistry.registerFluid(moltenBlueSteelFluid);
		 moltenBlueSteel = new WurmFluid(moltenBlueSteelFluid, Material.water).setBlockName("moltenBlueSteel").setBlockTextureName("wurmtweaks:" + "moltenBlueSteel");
		 moltenBlueSteelFluid.setBlock(moltenBlueSteel);
		 GameRegistry.registerBlock(moltenBlueSteel, moltenBlueSteel.getUnlocalizedName());
		 FluidType.registerFluidType("wurmBlueSteel", BlueSteelBlock, 0, 400, moltenBlueSteelFluid, true);
		 
		 // RedSteel
		 moltenRedSteelFluid = new Fluid("molten.wurmRedSteel");
		 FluidRegistry.registerFluid(moltenRedSteelFluid);
		 moltenRedSteel = new WurmFluid(moltenRedSteelFluid, Material.water).setBlockName("moltenRedSteel").setBlockTextureName("wurmtweaks:" + "moltenRedSteel");
		 moltenRedSteelFluid.setBlock(moltenRedSteel);
		 GameRegistry.registerBlock(moltenRedSteel, moltenRedSteel.getUnlocalizedName());
		 FluidType.registerFluidType("wurmRedSteel", RedSteelBlock, 0, 400, moltenRedSteelFluid, true);
	 } 
}
