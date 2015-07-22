package tweaks.wurm;

import gregtech.api.util.GT_Recipe.GT_Recipe_Map;

import java.util.logging.Logger;

import modtweaker2.mods.thaumcraft.handlers.Research;
import net.minecraftforge.common.MinecraftForge;
import thaumcraft.api.ThaumcraftApi;
import tweaks.wurm.crafting.OreDict;
import tweaks.wurm.crafting.Shaped;
import tweaks.wurm.crafting.Shapeless;
import tweaks.wurm.crafting.am2.Refiner;
import tweaks.wurm.crafting.gregtech.AlloySmelter;
import tweaks.wurm.crafting.gregtech.AssemblyMachine;
import tweaks.wurm.crafting.gregtech.Centerfuge;
import tweaks.wurm.crafting.gregtech.Electrolyzer;
import tweaks.wurm.crafting.gregtech.Extruder;
import tweaks.wurm.crafting.gregtech.Fusion;
import tweaks.wurm.crafting.gregtech.PlateBender;
import tweaks.wurm.crafting.gregtech.Wiremill;
import tweaks.wurm.crafting.ic2.Canner;
import tweaks.wurm.crafting.ic2.Compressor;
import tweaks.wurm.crafting.ic2.Extractor;
import tweaks.wurm.crafting.ic2.Macerator;
import tweaks.wurm.crafting.ic2.MetalFormer;
import tweaks.wurm.crafting.ic2.Recycler;
import tweaks.wurm.crafting.te2.Crucible;
import tweaks.wurm.crafting.te2.Furnace;
import tweaks.wurm.crafting.te2.Pulveriser;
import tweaks.wurm.crafting.te2.Smelter;
import tweaks.wurm.crafting.thaumcraft.ArcaneThaumcraft;
import tweaks.wurm.crafting.thaumcraft.CrucibleThaumcraft;
import tweaks.wurm.crafting.thaumcraft.InfusionThaumcraft;
import tweaks.wurm.crafting.thaumcraft.JunkThaumcraft;
import tweaks.wurm.crafting.thaumcraft.WorkBenchThaumcraft;
import tweaks.wurm.event.BlockEvent;
import tweaks.wurm.event.Crafting;
import tweaks.wurm.event.HurtEvent;
import tweaks.wurm.items.ModBlocks;
import tweaks.wurm.items.ModItems;
import tweaks.wurm.proxy.Server_Proxy;
import tweaks.wurm.utils.ImmersiveEngineering.BlastFurnace;
import tweaks.wurm.utils.ImmersiveEngineering.CokeOven;
import tweaks.wurm.utils.ImmersiveEngineering.Crusher;
import tweaks.wurm.utils.ImmersiveEngineering.Fermenter;
import tweaks.wurm.utils.ImmersiveEngineering.Squeezer;
import tweaks.wurm.utils.minefactory.MFR;
import tweaks.wurm.utils.thaumcraft.WAspects;
import tweaks.wurm.utils.tinkers.Casting;
import tweaks.wurm.utils.tinkers.TAlloy;
import tweaks.wurm.utils.tinkers.TMelting;
import tweaks.wurm.utils.tinkers.TToolMateral;

import com.yogpc.qp.WorkbenchRecipe;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;

@Mod(modid = "wurmtweaks", name = "WurmTweaks", version = "0.9", dependencies = "after:gregtech_addon")
public class WurmTweaks {
	
	public static boolean ic2 = true;
	public static boolean gregtech = true;
	public static boolean extrautils = true;
	public static boolean projectred = true;
	public static boolean vanilla  = true;
	public static boolean TE = true;
	public static boolean buildcraft = true;
	public static boolean am2 = true;
	public static boolean wurmtweaks = true;
	public static boolean advancedsolarpanels = true;
	public static boolean bigreactors = true;
	public static boolean draconicevolution = true;
	public static boolean enderio = true;
	public static boolean jaba = true;
	public static boolean simplesolar = true;
	public static boolean openblocks = true;
	public static boolean redstoneinmotion = true;
	public static boolean simplejetpack = true;
	public static boolean thermaldynamics = true;
	public static boolean modularturrets = true;
	public static boolean chisel = true;
	public static boolean opencomputers = true;
	public static boolean ae = true;
	public static boolean voidrpg = true;
	public static boolean tfc = true;
	public static boolean vending = true;
	public static boolean coin = true;
	public static boolean tinkers = true;
	public static boolean chickenchunks = true;
	public static boolean shincolle = true;
	public static boolean extracells = true;
	public static boolean enderchest = true;
	public static boolean thaumcraft = true;
	public static boolean gravitysuit = true;
	public static boolean ironchest = true;
	public static boolean glaticraft = true;
	public static boolean craftheraldry = true;
	public static boolean minefactoryreloaded = true;
	public static boolean immersiveengineering = true;
	public static boolean quarryplus = true;
	public static boolean mutipart = true;
	public static boolean alternateworld = true;
	
	 @Instance("wurmtweaks")
	 public static WurmTweaks instance;
	 
	 @SidedProxy(clientSide = "tweaks.wurm.proxy.Client_Proxy", serverSide = "tweaks.wurm.proxy.Server_Proxy")
	 public static Server_Proxy proxy;
	 
	 public static final Logger logger = Logger.getLogger("WurmTweaks");

	 @EventHandler
     public void PreInit(FMLPreInitializationEvent event) {
		 
		ModItems.register();
		ModBlocks.registerBlocks();
		
		Recipes.addSmelting();
		MinecraftForge.EVENT_BUS.register(new BlockEvent());
		FMLCommonHandler.instance().bus().register(new Crafting());
		MinecraftForge.EVENT_BUS.register(new HurtEvent());
		
	 }
	
	 @EventHandler
     public void PostInit(FMLPostInitializationEvent event) {
		 WurmTweaks.logger.info("Post Init");
		 
		 OreDict.addNames();
		 
		 WurmTweaks.logger.info("Adding Recipes");
		 
		 	Recipes.ReWrite();
		 	
		 	if(wurmtweaks) {
		 		Shapeless.addWurmTweaksRecipes();
		 		Shaped.addWurmTweaksRecipes();
		 	}
		 	
		 	if(ic2) {
				 Compressor.RemoveAll();
				 Compressor.addCompression();
				 Extractor.RemoveAll();
				 Extractor.addExtraction();
				 Macerator.RemoveAll();
				 Macerator.addMacerate();
				 Canner.RemoveAll();
				 Canner.addCannerBottle();
				 Canner.addCannerEnrich();
				 Furnace.addRecipes();
				 Recycler.addBlackList();
				 MetalFormer.RemoveAll();
				 MetalFormer.addCutting();
				 MetalFormer.addExtruding();
				 MetalFormer.addRolling();
				 Shapeless.addIC2Recipes();
				 Shaped.addIC2Recipes();
		 	}
		 	
		 	if(gregtech) {
				 AssemblyMachine.addRecipe();
				 AlloySmelter.addRecipe();
				 Centerfuge.addRecipe();
				 Wiremill.addRecipes();
				 Fusion.addRecipes();
				 Shapeless.addGregTechRecipes();
				 Shaped.addGregTechRecipes();
				 PlateBender.AddRecipes();
				 Extruder.AddRecipes();
				 Electrolyzer.AddRecipes();
				 GT_Recipe_Map.sArcFurnaceRecipes.mRecipeList.clear();
				 GT_Recipe_Map.sAutoclaveRecipes.mRecipeList.clear();
				 GT_Recipe_Map.sPolarizerRecipes.mRecipeList.clear();
				 GT_Recipe_Map.sBoxinatorRecipes.mRecipeList.clear();
				 GT_Recipe_Map.sCannerRecipes.mRecipeList.clear();
				 GT_Recipe_Map.sChemicalBathRecipes.mRecipeList.clear();
				 GT_Recipe_Map.sChemicalRecipes.mRecipeList.clear();
				 GT_Recipe_Map.sCNCRecipes.mRecipeList.clear();
				 GT_Recipe_Map.sCutterRecipes.mRecipeList.clear();
				 GT_Recipe_Map.sDistilleryRecipes.mRecipeList.clear();
				 GT_Recipe_Map.sDistillationRecipes.mRecipeList.clear();
				 GT_Recipe_Map.sElectroMagneticSeparatorRecipes.mRecipeList.clear();
				 GT_Recipe_Map.sFermentingRecipes.mRecipeList.clear();
				 GT_Recipe_Map.sElectrolyzerRecipes.mRecipeList.clear();
				 GT_Recipe_Map.sFluidExtractionRecipes.mRecipeList.clear();
				 GT_Recipe_Map.sFluidCannerRecipes.mRecipeList.clear();
				 GT_Recipe_Map.sFluidHeaterRecipes.mRecipeList.clear();
				 GT_Recipe_Map.sHammerRecipes.mRecipeList.clear();
				 GT_Recipe_Map.sImplosionRecipes.mRecipeList.clear();
				 GT_Recipe_Map.sLaserEngraverRecipes.mRecipeList.clear();
				 GT_Recipe_Map.sPressRecipes.mRecipeList.clear();
				 GT_Recipe_Map.sLaserEngraverRecipes.mRecipeList.clear();
				 GT_Recipe_Map.sMicrowaveRecipes.mRecipeList.clear();
				 GT_Recipe_Map.sMixerRecipes.mRecipeList.clear();
				 GT_Recipe_Map.sOreWasherRecipes.mRecipeList.clear();
				 GT_Recipe_Map.sPlasmaArcFurnaceRecipes.mRecipeList.clear();
				 GT_Recipe_Map.sPressRecipes.mRecipeList.clear();
				 GT_Recipe_Map.sPrinterRecipes.mRecipeList.clear();
				 GT_Recipe_Map.sBoxinatorRecipes.mRecipeList.clear();
				 GT_Recipe_Map.sSlicerRecipes.mRecipeList.clear();
				 GT_Recipe_Map.sVacuumRecipes.mRecipeList.clear();
				 GT_Recipe_Map.sUnboxinatorRecipes.mRecipeList.clear();
				 GT_Recipe_Map.sScannerFakeRecipes.mRecipeList.clear();
				 GT_Recipe_Map.sByProductList.mRecipeList.clear();
				 GT_Recipe_Map.sLatheRecipes.mRecipeList.clear();
				 GT_Recipe_Map.sFluidSolidficationRecipes.mRecipeList.clear();
				 GT_Recipe_Map.sBrewingRecipes.mRecipeList.clear();
				 GT_Recipe_Map.sRockBreakerFakeRecipes.mRecipeList.clear();
		 	}
		 	
		 	if(extrautils) {
		 		Shapeless.addExtraUtilitiesRecipes();
		 		Shaped.addExtraUtilsRecipes();
		 	}
		 	
		 	if(projectred) {
		 		Shapeless.addProjectRedRecipes();
		 		Shaped.addProjectRedRecipes();
		 	}
		 	
		 	if(TE) {
		 		Shapeless.addThermalExpansionRecipes();
				Shaped.addThermalExpansion();
				Smelter.addRecipes();
				Furnace.addRecipes();
				Crucible.addRecipe();
				Pulveriser.Register();
				tweaks.wurm.crafting.te2.Fluid.addRecipe();
		 	}
		 	
		 	if(buildcraft) {
		 		Shapeless.addBuildcraftRecipes();
		 		Shaped.addBuildcraftRecipes();
		 	}
		 	
		 	if(am2) {
				 Refiner.addRecipes();
				 Shaped.addAM2Recipes();
		 	}
		 	
		 	if(advancedsolarpanels) {
		 		Shapeless.addAdvancedSolarPanelsRecipes();
		 		Shaped.addAdvanedSolarPanelsRecipes();
		 	}

		 	if(draconicevolution) {
		 		Shaped.addDecronicEvelutionRecipes();
		 	}

		 	if(enderio) {
		 		Shaped.addEnderIORecipes();
		 	}
		 	
		 	if(jaba) {
		 		Shapeless.addJabaRecipes();
		 		Shaped.addJABARecipes();
		 	}
		 	
		 	if(simplesolar) {
		 		Shaped.addBasicSolarRecipes();
		 	}
		 	
		 	if(thermaldynamics) {
		 		Shapeless.addThermalDynamicsRecipes();
		 		Shaped.addThermalDynamicsRecipes();
		 	}
		 	
		 	if(modularturrets) {
		 		Shaped.addModularTurretsRecipes();
		 	}
		 	
		 	if(openblocks) {
		 		Shaped.addOpenBlocksRecipes();
		 	}
		 	
		 	if(redstoneinmotion) {
		 		Shaped.addRedstoneinMotionRecipes();
		 	}
		 	
		 	if(simplejetpack) {
		 		Shaped.addSimpleJetpacksRecipes();
		 	}
		 	
		 	if(chisel) {
		 		Shapeless.addChiselRecipes();
		 		Shaped.addChiselRecipes();
		 	}
		 	
		 	if(opencomputers) {
		 		Shapeless.addOpenComputersRecipes();
		 		Shaped.addOpenComputersRecipes();
		 	}
		 	
		 	if(ae) {
		 		Shapeless.addAERecipes();
		 		Shaped.addAERecipes();
		 		if(extracells) {
		 			Shaped.addExtraCellsRecipes();
		 		}
		 	}
		 	
		 	if(voidrpg) {
		 		Shapeless.addVoidRPGRecipes();
		 		Shaped.addVoidRPGRecipes();
		 	}
		 
		 	if(vending) {
		 		Shaped.addVendingRecipes();
		 	}
		 	
		 	if(tfc) {
		 		Shapeless.addTFCRecipes();
		 		Shaped.addTFCRecipes();
		 	}
		 	
		 	if(coin) {
		 		Shapeless.addCoinRecipes();
		 	}
		 
		 
		 	if(tinkers) {
		 		TAlloy.addRecipes();
		 		TMelting.addRecipes();
		 		TToolMateral.addMaterials();
		 		Casting.addRecipes();
		 		Shaped.addTinkerRecipes();
		 	}
		 
		 	if(chickenchunks) {
		 		Shaped.addChickenChunksRecipes();
		 	}
		 
		 	if(shincolle) {
		 		Shaped.addShinRecipes();
		 	}
		 
		 	if(enderchest) {
		 		Shaped.addEnderChestRecipes();
		 	}
		 	
		 	if(gravitysuit) {
		 		Shaped.addGravitySuitRecipes();
		 	}
		 	
		 	if(ironchest) {
		 		Shaped.addIronchestRecipes();
		 	}
		 	
		 	if(glaticraft){
		 		Shaped.addGlaticraftRecipes();
		 	}
			 
			if(vanilla) {
				 Shapeless.addVanillaRecipes();
				 Shaped.addVinillaRecipes();
			}
			if(craftheraldry) {
				Shaped.addCraftHeraldryRecipes();
			}
			
		 	if(thaumcraft) {
		    	ThaumcraftApi.getCraftingRecipes().clear();
		    	JunkThaumcraft.RemoveResearch();
		 		ArcaneThaumcraft.addRecipes();
		 		ArcaneThaumcraft.refreshBook();
		 		InfusionThaumcraft.addRecipes();
		 		InfusionThaumcraft.refreshBook();
		 		WorkBenchThaumcraft.addRecipes();
		 		CrucibleThaumcraft.addCrucible();
		 		CrucibleThaumcraft.RefreshBook();
		 		WorkBenchThaumcraft.refreshBook();
		 		WAspects.addAspects();
		 	}
		 	
		 	if(minefactoryreloaded) {
		 		MFR.register();
		 		Shapeless.addMFRRecipes();
		 		Shaped.addMFRRecipes();
		 	}
		 	
		 	if(immersiveengineering) {
		 		BlastFurnace.fixRecipes();
		 		CokeOven.fixRecipes();
		 		Fermenter.fixRecipes();
		 		Squeezer.fixRecipes();
		 		Crusher.addRecipes();
		 		Shaped.addImmersiveEngineeringRecipes();
		 	}
		 	
		 	if(quarryplus) {
		 		WorkbenchRecipe.getRecipes().clear();
		 		Shaped.addQuarryPlusRecipes();
		 	}
		 	
		 	if(mutipart) {
		 		Shaped.addMutiPartRecipes();
		 	}
		 	
		 	if(alternateworld) {
		 		Shaped.addAlternateWorldRecipes();
		 	}
		
		 WurmTweaks.logger.info("Recipes Changed Complete");
		 
	 }
	 
	  @EventHandler
	  public void serverLoad(FMLServerStartingEvent event)  {
		  Research.removeTab("GOLEMANCY");
		  
	  }
}
