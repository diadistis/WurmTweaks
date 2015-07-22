package tweaks.wurm.crafting;

import powercrystals.minefactoryreloaded.setup.MFRThings;
import mcp.mobius.betterbarrels.BetterBarrels;
import mrtjp.projectred.ProjectRedCore;
import mrtjp.projectred.ProjectRedIllumination;
import mrtjp.projectred.ProjectRedTransmission;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import tweaks.wurm.items.ModItems;
import tweaks.wurm.utils.PHead;
import tweaks.wurm.utils.opencomputers.NBTOpenComputers;
import tweaks.wurm.utils.tfc.TFCFood;
import wurm.coin.Coin;
import advsolar.common.AdvancedSolarPanel;
import appeng.api.AEApi;
import appeng.api.util.AEColor;
import buildcraft.BuildCraftTransport;
import cofh.thermaldynamics.duct.TDDucts;
import cofh.thermalfoundation.item.TFItems;

import com.bioxx.tfc.api.TFCBlocks;
import com.bioxx.tfc.api.TFCItems;
import com.cricketcraft.chisel.init.ChiselBlocks;
import com.rwtema.extrautils.ExtraUtils;

import cpw.mods.fml.common.registry.GameRegistry;
import extracells.registries.BlockEnum;
import extracells.registries.ItemEnum;
import gregtech.api.enums.ItemList;


public class Shapeless {
	
	
	public static int Wild = OreDictionary.WILDCARD_VALUE;

	public static void addVanillaRecipes() {
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(PHead.getHead("Wurmatron"), new Object[] {"wurmsstone", Items.sign}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.crafting_table,1,0), new Object[]{TFCBlocks.Workbench, TFCItems.BismuthSheet}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.iron_ingot), new Object[]{TFCItems.WroughtIronIngot}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.gold_ingot), new Object[]{TFCItems.GoldIngot}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.diamond), new Object[]{new ItemStack(TFCItems.GemDiamond,1,2)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.coal), new Object[]{TFCItems.Coal}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.coal), new Object[]{TFCItems.Coal}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.diamond_sword), new Object[]{TFCItems.RedSteelSword}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.clay_ball), new Object[]{TFCItems.ClayBall}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.fish), new Object[]{TFCFood.getFood(TFCItems.fishRaw, 20f)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.leather_boots), new Object[]{TFCItems.LeatherBoots}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.iron_sword), new Object[]{TFCItems.WroughtIronSword}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.emerald), new Object[]{new ItemStack(TFCItems.GemEmerald,1,2)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.fermented_spider_eye,1,0), new Object[] {Items.spider_eye, TFCFood.getFood(TFCItems.Sugar, 160f)}));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.sandstone,1,2), new ItemStack(Blocks.sandstone),new ItemStack(Blocks.sandstone),new ItemStack(Blocks.sandstone),new ItemStack(Blocks.sandstone));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.sticky_piston), new Object[] {"wurmslime", "wurmpiston"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.wool,1,1), new Object[] {"wurmwool", "dyeOrange"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.wool,1,2), new Object[] {"wurmwool", "dyeMagenta"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.wool,1,3), new Object[] {"wurmwool", "dyeLightBlue"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.wool,1,4), new Object[] {"wurmwool", "dyeYellow"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.wool,1,5), new Object[] {"wurmwool", "dyeLime"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.wool,1,6), new Object[] {"wurmwool", "dyePink"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.wool,1,7), new Object[] {"wurmwool", "dyeGray"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.wool,1,8), new Object[] {"wurmwool", "dyeLightGray"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.wool,1,9), new Object[] {"wurmwool", "dyeCyan"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.wool,1,10), new Object[] {"wurmwool", "dyePurple"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.wool,1,11), new Object[] {"wurmwool", "dyeBlue"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.wool,1,12), new Object[] {"wurmwool", "dyeBrown"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.wool,1,13), new Object[] {"wurmwool", "dyeGreen"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.wool,1,14), new Object[] {"wurmwool", "dyeRed"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.wool,1,15), new Object[] {"wurmwool", "dyeBlack"}));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.mossy_cobblestone), new ItemStack(Blocks.cobblestone),new ItemStack(Items.water_bucket),new ItemStack(TFCBlocks.Vine));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.obsidian,4,0), new ItemStack(TFCItems.BlueSteelBucketLava), new ItemStack(TFCItems.BlueSteelBucketLava), new ItemStack(TFCItems.RedSteelBucketWater), new ItemStack(TFCItems.RedSteelBucketWater));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.lever,1,0), new Object[] {"wurmstick", "wurmcobble"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.wooden_button,1,0), new Object[] {"wurmplanks"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.anvil,1,0), new Object[] {new ItemStack(tweaks.wurm.items.ModBlocks.WroughtIronBlock), new ItemStack(Items.book)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.bucket,1,0), new Object[] {new ItemStack(TFCItems.RedSteelBucketEmpty), new ItemStack(TFCItems.BlueSteelBucketEmpty)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.book,1,0), new Object[] {new ItemStack(Items.paper), new ItemStack(Items.paper),new ItemStack(Items.paper),new ItemStack(TFCItems.Leather)}));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.ender_eye), new ItemStack(Items.ender_pearl), new ItemStack(Items.blaze_powder));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.fire_charge,3), new ItemStack(TFCItems.Coal,1,0), new ItemStack(Items.gunpowder), new ItemStack(Items.blaze_powder));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.fire_charge,3), new ItemStack(TFCItems.Coal,1,1), new ItemStack(Items.gunpowder), new ItemStack(Items.blaze_powder));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.writable_book), new ItemStack(Items.feather), new ItemStack(Items.book), new ItemStack(Items.dye));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.magma_cream), new Object[] {"wurmslime", Items.blaze_powder}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(Items.golden_carrot, new Object[] {TFCFood.getFood(TFCItems.Carrot, 160f), "wurmgold"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(Items.name_tag, new Object[] {"wurmchipgem", Items.paper, "dyeBlack"}));
	}
	
	// Add WurmTweaks Shapeless Recipes
	public static void addWurmTweaksRecipes() {

		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(tweaks.wurm.items.ModItems.RedAlloySheet), new Object[] {new ItemStack(TFCItems.StoneHammer),new ItemStack(tweaks.wurm.items.ModItems.RedAlloyIngot), new ItemStack(tweaks.wurm.items.ModItems.RedAlloyIngot)}));
		
	}
	
	// Add VoidRPG Shapeless Recipes
	public static void addVoidRPGRecipes() {
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(wurmatron.voidrpg.items.TFCModItems.UnshapedRhenium), new Object[] {wurmatron.voidrpg.items.TFCModItems.IngotRhenium}));
		
	}
	
	// Minefactory Reloaded Shapeless
	public static void addMFRRecipes() {
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(MFRThings.conveyorBlock,1,0), new Object[] {new ItemStack(MFRThings.conveyorBlock,1,16),"dyeWhite"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(MFRThings.conveyorBlock,1,1), new Object[] {new ItemStack(MFRThings.conveyorBlock,1,16),"dyeOrange"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(MFRThings.conveyorBlock,1,2), new Object[] {new ItemStack(MFRThings.conveyorBlock,1,16),"dyeMagenta"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(MFRThings.conveyorBlock,1,3), new Object[] {new ItemStack(MFRThings.conveyorBlock,1,16),"dyeLightBlue"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(MFRThings.conveyorBlock,1,4), new Object[] {new ItemStack(MFRThings.conveyorBlock,1,16),"dyeYellow"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(MFRThings.conveyorBlock,1,5), new Object[] {new ItemStack(MFRThings.conveyorBlock,1,16),"dyeLime"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(MFRThings.conveyorBlock,1,6), new Object[] {new ItemStack(MFRThings.conveyorBlock,1,16),"dyePink"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(MFRThings.conveyorBlock,1,7), new Object[] {new ItemStack(MFRThings.conveyorBlock,1,16),"dyeGray"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(MFRThings.conveyorBlock,1,8), new Object[] {new ItemStack(MFRThings.conveyorBlock,1,16),"dyeLightGray"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(MFRThings.conveyorBlock,1,9), new Object[] {new ItemStack(MFRThings.conveyorBlock,1,16),"dyeCyan"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(MFRThings.conveyorBlock,1,10), new Object[] {new ItemStack(MFRThings.conveyorBlock,1,16),"dyePurple"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(MFRThings.conveyorBlock,1,11), new Object[] {new ItemStack(MFRThings.conveyorBlock,1,16),"dyeBlue"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(MFRThings.conveyorBlock,1,12), new Object[] {new ItemStack(MFRThings.conveyorBlock,1,16),"dyeBrown"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(MFRThings.conveyorBlock,1,13), new Object[] {new ItemStack(MFRThings.conveyorBlock,1,16),"dyeGreen"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(MFRThings.conveyorBlock,1,14), new Object[] {new ItemStack(MFRThings.conveyorBlock,1,16),"dyeRed"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(MFRThings.conveyorBlock,1,15), new Object[] {new ItemStack(MFRThings.conveyorBlock,1,16),"dyeBlack"}));	
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(MFRThings.upgradeItem,1,1), new Object[] {new ItemStack(MFRThings.upgradeItem,1,0),new ItemStack(MFRThings.upgradeItem,1,0)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(MFRThings.upgradeItem,1,2), new Object[] {new ItemStack(MFRThings.upgradeItem,1,1),new ItemStack(MFRThings.upgradeItem,1,1)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(MFRThings.upgradeItem,1,3), new Object[] {new ItemStack(MFRThings.upgradeItem,1,2),new ItemStack(MFRThings.upgradeItem,1,2)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(MFRThings.upgradeItem,1,4), new Object[] {new ItemStack(MFRThings.upgradeItem,1,3),new ItemStack(MFRThings.upgradeItem,1,3)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(MFRThings.upgradeItem,1,5), new Object[] {new ItemStack(MFRThings.upgradeItem,1,4),new ItemStack(MFRThings.upgradeItem,1,4)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(MFRThings.upgradeItem,1,6), new Object[] {new ItemStack(MFRThings.upgradeItem,1,5),new ItemStack(MFRThings.upgradeItem,1,5)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(MFRThings.upgradeItem,1,7), new Object[] {new ItemStack(MFRThings.upgradeItem,1,6),new ItemStack(MFRThings.upgradeItem,1,6)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(MFRThings.upgradeItem,1,8), new Object[] {new ItemStack(MFRThings.upgradeItem,1,7),new ItemStack(MFRThings.upgradeItem,1,7)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(MFRThings.upgradeItem,1,9), new Object[] {new ItemStack(MFRThings.upgradeItem,1,8),new ItemStack(MFRThings.upgradeItem,1,8)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(MFRThings.upgradeItem,1,10), new Object[] {new ItemStack(MFRThings.upgradeItem,1,9),new ItemStack(MFRThings.upgradeItem,1,9)}));
	
	}
	
	// Add IC2 Shapeless Recipes
	public static void addIC2Recipes() {
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(ic2.api.item.IC2Items.getItem("copperCableItem"), new Object[]{"wurmCopper",new ItemStack(ic2.api.item.IC2Items.getItem("cutter").getItem(),1,Wild)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(ic2.api.item.IC2Items.getItem("goldCableItem"), new Object[]{"wurmGold", new ItemStack(ic2.api.item.IC2Items.getItem("cutter").getItem(),1,Wild)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(ic2.api.item.IC2Items.getItem("tinCableItem"), new Object[]{"wurmTin", new ItemStack(ic2.api.item.IC2Items.getItem("cutter").getItem(),1,Wild)}));
		GameRegistry.addShapelessRecipe(ic2.api.item.IC2Items.getItem("carbonMesh"), ic2.api.item.IC2Items.getItem("carbonFiber"), ic2.api.item.IC2Items.getItem("carbonFiber"));
		GameRegistry.addShapelessRecipe(ic2.api.item.IC2Items.getItem("electricWrench"), ic2.api.item.IC2Items.getItem("advBattery"),ic2.api.item.IC2Items.getItem("wrench"), new ItemStack(TFCItems.RedSteelSheet2x));
		GameRegistry.addShapelessRecipe(ic2.api.item.IC2Items.getItem("electricTreetap"), ic2.api.item.IC2Items.getItem("advBattery"),ic2.api.item.IC2Items.getItem("treetap"), new ItemStack(TFCItems.RedSteelSheet2x));
		GameRegistry.addShapelessRecipe(ic2.api.item.IC2Items.getItem("electricHoe"), ic2.api.item.IC2Items.getItem("advBattery"),new ItemStack(TFCItems.BlueSteelHoe), new ItemStack(TFCItems.RedSteelSheet2x));
		GameRegistry.addShapelessRecipe(ic2.api.item.IC2Items.getItem("frequencyTransmitter"), ic2.api.item.IC2Items.getItem("advancedCircuit"),ic2.api.item.IC2Items.getItem("insulatedCopperCableItem"), new ItemStack(TFCItems.BismuthBronzeSheet));
		GameRegistry.addRecipe(new ShapelessOreRecipe(ic2.api.item.IC2Items.getItem("insulatedCopperCableItem"), "itemRubber",ic2.api.item.IC2Items.getItem("copperCableItem")));
		GameRegistry.addRecipe(new ShapelessOreRecipe(ic2.api.item.IC2Items.getItem("insulatedGoldCableItem"), "itemRubber",ic2.api.item.IC2Items.getItem("goldCableItem")));
		GameRegistry.addRecipe(new ShapelessOreRecipe(ic2.api.item.IC2Items.getItem("doubleInsulatedGoldCableItem"), "itemRubber",ic2.api.item.IC2Items.getItem("goldCableItem"),"itemRubber"));
		GameRegistry.addRecipe(new ShapelessOreRecipe(ic2.api.item.IC2Items.getItem("insulatedIronCableItem"), "itemRubber",ic2.api.item.IC2Items.getItem("ironCableItem")));
		GameRegistry.addRecipe(new ShapelessOreRecipe(ic2.api.item.IC2Items.getItem("doubleInsulatedIronCableItem"), "itemRubber","itemRubber",ic2.api.item.IC2Items.getItem("ironCableItem")));
		GameRegistry.addRecipe(new ShapelessOreRecipe(ic2.api.item.IC2Items.getItem("trippleInsulatedIronCableItem"), "itemRubber","itemRubber","itemRubber",ic2.api.item.IC2Items.getItem("ironCableItem")));
		GameRegistry.addRecipe(new ShapelessOreRecipe(ic2.api.item.IC2Items.getItem("insulatedTinCableItem"), "itemRubber",ic2.api.item.IC2Items.getItem("tinCableItem")));
		GameRegistry.addRecipe(new ShapelessOreRecipe(ic2.api.item.IC2Items.getItem("blackPainter"), new Object[] {ic2.api.item.IC2Items.getItem("painter"),"dyeBlack"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(ic2.api.item.IC2Items.getItem("redPainter"), new Object[] {ic2.api.item.IC2Items.getItem("painter"),"dyeRed"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(ic2.api.item.IC2Items.getItem("greenPainter"), new Object[] {ic2.api.item.IC2Items.getItem("painter"),"dyeGreen"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(ic2.api.item.IC2Items.getItem("brownPainter"), new Object[] {ic2.api.item.IC2Items.getItem("painter"),"dyeBrown"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(ic2.api.item.IC2Items.getItem("bluePainter"), new Object[] {ic2.api.item.IC2Items.getItem("painter"),"dyeBlue"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(ic2.api.item.IC2Items.getItem("purplePainter"), new Object[] {ic2.api.item.IC2Items.getItem("painter"),"dyePurple"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(ic2.api.item.IC2Items.getItem("cyanPainter"), new Object[] {ic2.api.item.IC2Items.getItem("painter"),"dyeCyan"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(ic2.api.item.IC2Items.getItem("lightGreyPainter"), new Object[] {ic2.api.item.IC2Items.getItem("painter"),"dyeLightGray"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(ic2.api.item.IC2Items.getItem("darkGreyPainter"), new Object[] {ic2.api.item.IC2Items.getItem("painter"),"dyeDarkGrey"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(ic2.api.item.IC2Items.getItem("pinkPainter"), new Object[] {ic2.api.item.IC2Items.getItem("painter"),"dyePink"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(ic2.api.item.IC2Items.getItem("limePainter"), new Object[] {ic2.api.item.IC2Items.getItem("painter"),"dyeLime"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(ic2.api.item.IC2Items.getItem("yellowPainter"),new Object[] {ic2.api.item.IC2Items.getItem("painter"),"dyeYellow"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(ic2.api.item.IC2Items.getItem("cloudPainter"), new Object[] {ic2.api.item.IC2Items.getItem("painter"),"dyeLightBlue"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(ic2.api.item.IC2Items.getItem("magentaPainter"), new Object[] {ic2.api.item.IC2Items.getItem("painter"),"dyeMegenta"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(ic2.api.item.IC2Items.getItem("orangePainter"), new Object[] {ic2.api.item.IC2Items.getItem("painter"),"dyeOrange"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(ic2.api.item.IC2Items.getItem("whitePainter"), new Object[] {ic2.api.item.IC2Items.getItem("painter"),"dyeWhite"}));
		
	}
	
	
	// Add Advanced Solar Panels Shapeless Recipes
	public static void addAdvancedSolarPanelsRecipes() {
		
		GameRegistry.addShapelessRecipe(new ItemStack(AdvancedSolarPanel.blockAdvSolarPanel,8,1),new ItemStack(AdvancedSolarPanel.blockAdvSolarPanel,1,2));
		GameRegistry.addShapelessRecipe(new ItemStack(AdvancedSolarPanel.advancedSolarHelmet,1,Wild),new ItemStack(AdvancedSolarPanel.blockAdvSolarPanel,1,0), new ItemStack(ic2.api.item.IC2Items.getItem("nanoHelmet").getItem(),1,Wild));
		GameRegistry.addShapelessRecipe(new ItemStack(AdvancedSolarPanel.hybridSolarHelmet,1,Wild),new ItemStack(AdvancedSolarPanel.blockAdvSolarPanel,1,1), new ItemStack(ic2.api.item.IC2Items.getItem("quantumHelmet").getItem(),1,Wild));
		GameRegistry.addShapelessRecipe(new ItemStack(AdvancedSolarPanel.ultimateSolarHelmet,1,Wild),new ItemStack(AdvancedSolarPanel.blockAdvSolarPanel,1,2), new ItemStack(ic2.api.item.IC2Items.getItem("quantumHelmet").getItem(),1,Wild));
		
	}
	
	
	// Add Java Shapeless Recipes
	public static void addJabaRecipes() {
		
		GameRegistry.addShapelessRecipe(new ItemStack(BetterBarrels.itemUpgradeCore,1,4), new ItemStack(BetterBarrels.itemUpgradeCore,1,0),new ItemStack(BetterBarrels.itemUpgradeCore,1,0),new ItemStack(BetterBarrels.itemUpgradeCore,1,0));
		GameRegistry.addShapelessRecipe(new ItemStack(BetterBarrels.itemUpgradeCore,1,5), new ItemStack(BetterBarrels.itemUpgradeCore,1,4),new ItemStack(BetterBarrels.itemUpgradeCore,1,4),new ItemStack(BetterBarrels.itemUpgradeCore,1,4));
		GameRegistry.addShapelessRecipe(new ItemStack(BetterBarrels.itemUpgradeCore,1,6), new ItemStack(BetterBarrels.itemUpgradeCore,1,5),new ItemStack(BetterBarrels.itemUpgradeCore,1,5),new ItemStack(BetterBarrels.itemUpgradeCore,1,5));
		GameRegistry.addShapelessRecipe(new ItemStack(BetterBarrels.itemUpgradeCore,1,8), new ItemStack(BetterBarrels.itemUpgradeCore,1,6),new ItemStack(BetterBarrels.itemUpgradeCore,1,6),new ItemStack(BetterBarrels.itemUpgradeCore,1,6));
		GameRegistry.addShapelessRecipe(new ItemStack(BetterBarrels.itemUpgradeCore,1,9), new ItemStack(BetterBarrels.itemUpgradeCore,1,8),new ItemStack(BetterBarrels.itemUpgradeCore,1,8),new ItemStack(BetterBarrels.itemUpgradeCore,1,8));
		
	}
	
	// Add Thermal Dynamics Shapeless Recipes
	public static void addThermalDynamicsRecipes() {
		
		GameRegistry.addShapelessRecipe(new ItemStack(TDDucts.energyBasic.itemStack.getItem(),3,1), new ItemStack(TDDucts.energyBasic.itemStack.getItem(),1,0),new ItemStack(TDDucts.energyBasic.itemStack.getItem(),1,0),new ItemStack(TDDucts.energyBasic.itemStack.getItem(),1,0),new ItemStack(Items.redstone), new ItemStack(Items.redstone), new ItemStack(Items.redstone), new ItemStack(TFCItems.LeadSheet));
		GameRegistry.addShapelessRecipe(new ItemStack(TDDucts.energyBasic.itemStack.getItem(),3,4), new ItemStack(TDDucts.energyBasic.itemStack.getItem(),1,2),new ItemStack(TDDucts.energyBasic.itemStack.getItem(),1,2),new ItemStack(TDDucts.energyBasic.itemStack.getItem(),1,2),new ItemStack(Items.redstone), new ItemStack(Items.redstone), new ItemStack(Items.redstone), TFItems.ingotEnderium);
		GameRegistry.addShapelessRecipe(new ItemStack(TDDucts.energyBasic.itemStack.getItem(),3,3), new ItemStack(TDDucts.energyBasic.itemStack.getItem(),1,2),new ItemStack(TDDucts.energyBasic.itemStack.getItem(),1,2),new ItemStack(TDDucts.energyBasic.itemStack.getItem(),1,2),new ItemStack(Items.redstone), new ItemStack(Items.redstone), new ItemStack(Items.redstone), TFItems.ingotEnderium);
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(TDDucts.fluidBasicOpaque.itemStack.getItem(),6,1),new Object[] {new ItemStack(TDDucts.fluidBasic.itemStack.getItem(),1,0),new ItemStack(TDDucts.fluidBasic.itemStack.getItem(),1,0),new ItemStack(TDDucts.fluidBasic.itemStack.getItem(),1,0),new ItemStack(TDDucts.fluidBasic.itemStack.getItem(),1,0),new ItemStack(TDDucts.fluidBasic.itemStack.getItem(),1,0),new ItemStack(TDDucts.fluidBasic.itemStack.getItem(),1,0), "wurmglass"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(TDDucts.fluidBasic.itemStack.getItem(),3,4),new Object[] {new ItemStack(TDDucts.fluidBasic.itemStack.getItem(),6,2),new ItemStack(TDDucts.fluidBasic.itemStack.getItem(),6,2),new ItemStack(TDDucts.fluidBasic.itemStack.getItem(),6,2),TFItems.ingotSignalum,TFItems.ingotSignalum}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(TDDucts.fluidBasicOpaque.itemStack.getItem(),3,5),new Object[] {new ItemStack(TDDucts.fluidBasic.itemStack.getItem(),6,3),new ItemStack(TDDucts.fluidBasic.itemStack.getItem(),6,3),new ItemStack(TDDucts.fluidBasic.itemStack.getItem(),6,3),TFItems.ingotSignalum,TFItems.ingotSignalum}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(TDDucts.itemBasic.itemStack.getItem(),6,2),new Object[] {new ItemStack(TDDucts.itemBasic.itemStack.getItem(),1,3),new ItemStack(TDDucts.itemBasic.itemStack.getItem(),1,3),new ItemStack(TDDucts.itemBasic.itemStack.getItem(),1,3),new ItemStack(TDDucts.itemBasic.itemStack.getItem(),1,3),new ItemStack(TDDucts.itemBasic.itemStack.getItem(),1,3),new ItemStack(TDDucts.itemBasic.itemStack.getItem(),1,3),"wurmglass"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(TDDucts.itemBasic.itemStack.getItem(),6,3),new Object[] {new ItemStack(TDDucts.itemBasic.itemStack.getItem(),1,2),new ItemStack(TDDucts.itemBasic.itemStack.getItem(),1,2),new ItemStack(TDDucts.itemBasic.itemStack.getItem(),1,2),new ItemStack(TDDucts.itemBasic.itemStack.getItem(),1,2),new ItemStack(TDDucts.itemBasic.itemStack.getItem(),1,2),new ItemStack(TDDucts.itemBasic.itemStack.getItem(),1,2),new ItemStack(TFCItems.LeadIngot)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(TDDucts.itemBasic.itemStack.getItem(),6,4),new Object[] {new ItemStack(TDDucts.itemBasic.itemStack.getItem(),1,0),new ItemStack(TDDucts.itemBasic.itemStack.getItem(),1,0),new ItemStack(TDDucts.itemBasic.itemStack.getItem(),1,0),new ItemStack(TDDucts.itemBasic.itemStack.getItem(),1,0),new ItemStack(TDDucts.itemBasic.itemStack.getItem(),1,0),new ItemStack(TDDucts.itemBasic.itemStack.getItem(),1,0),TFItems.ingotEnderium}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(TDDucts.itemBasic.itemStack.getItem(),6,5),new Object[] {new ItemStack(TDDucts.itemBasic.itemStack.getItem(),1,4),new ItemStack(TDDucts.itemBasic.itemStack.getItem(),1,4),new ItemStack(TDDucts.itemBasic.itemStack.getItem(),1,4),new ItemStack(TDDucts.itemBasic.itemStack.getItem(),1,4),new ItemStack(TDDucts.itemBasic.itemStack.getItem(),1,4),new ItemStack(TDDucts.itemBasic.itemStack.getItem(),1,4),new ItemStack(TFCItems.LeadIngot)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(TDDucts.itemBasic.itemStack.getItem(),6,4),new Object[] {new ItemStack(TDDucts.itemBasic.itemStack.getItem(),1,5),new ItemStack(TDDucts.itemBasic.itemStack.getItem(),1,5),new ItemStack(TDDucts.itemBasic.itemStack.getItem(),1,5),new ItemStack(TDDucts.itemBasic.itemStack.getItem(),1,5),new ItemStack(TDDucts.itemBasic.itemStack.getItem(),1,5),new ItemStack(TDDucts.itemBasic.itemStack.getItem(),1,5),new ItemStack(TFCItems.LeadIngot)}));
	
	}
	
	
	public static void addThermalExpansionRecipes() {
		
	    GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(cofh.thermalexpansion.item.TEItems.itemMaterial,4,44), new Object[] {TFCItems.TinSheet, TFCItems.PlatinumSheet, TFCItems.TinSheet, TFCItems.WroughtIronSheet, TFItems.bucketEnder}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(cofh.thermalexpansion.item.TEItems.itemMaterial,4,42), new Object[] {TFCItems.TinSheet, TFCItems.PlatinumSheet, TFCItems.TinSheet, TFCItems.WroughtIronSheet, TFItems.bucketRedstone}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(cofh.thermalexpansion.item.TEItems.itemMaterial,9,106), new Object[] {new ItemStack(cofh.thermalexpansion.item.TEItems.itemMaterial,1,74)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(cofh.thermalexpansion.item.TEItems.diagramSchematic, new Object[] {Items.paper, Items.paper, "dyeBlue" }));
		GameRegistry.addRecipe(new ShapelessOreRecipe(cofh.thermalexpansion.item.TEItems.diagramRedprint, new Object[] { Items.paper, Items.paper, "dustRedstone" }));
	
	}
	
	// Add Buildcraft Shapeless Recipes
	public static void addBuildcraftRecipes() {
		
		GameRegistry.addShapelessRecipe(new ItemStack(BuildCraftTransport.pipeFluidsWood), BuildCraftTransport.pipeItemsWood, BuildCraftTransport.pipeWaterproof);
		GameRegistry.addShapelessRecipe(new ItemStack(BuildCraftTransport.pipeFluidsEmerald),BuildCraftTransport.pipeItemsEmerald, BuildCraftTransport.pipeWaterproof);
		GameRegistry.addShapelessRecipe(new ItemStack(BuildCraftTransport.pipeFluidsCobblestone),BuildCraftTransport.pipeItemsCobblestone,BuildCraftTransport.pipeWaterproof);
		GameRegistry.addShapelessRecipe(new ItemStack(BuildCraftTransport.pipeFluidsStone),BuildCraftTransport.pipeItemsStone,BuildCraftTransport.pipeWaterproof); 
		GameRegistry.addShapelessRecipe(new ItemStack(BuildCraftTransport.pipeFluidsQuartz),BuildCraftTransport.pipeItemsQuartz,BuildCraftTransport.pipeWaterproof); 
		GameRegistry.addShapelessRecipe(new ItemStack(BuildCraftTransport.pipeFluidsIron),BuildCraftTransport.pipeItemsIron,BuildCraftTransport.pipeWaterproof);
		GameRegistry.addShapelessRecipe(new ItemStack(BuildCraftTransport.pipeFluidsGold),BuildCraftTransport.pipeItemsGold,BuildCraftTransport.pipeWaterproof); 
		GameRegistry.addShapelessRecipe(new ItemStack(BuildCraftTransport.pipeFluidsDiamond),BuildCraftTransport.pipeItemsDiamond,BuildCraftTransport.pipeWaterproof); 
		GameRegistry.addShapelessRecipe(new ItemStack(BuildCraftTransport.pipeFluidsSandstone),BuildCraftTransport.pipeWaterproof);
		GameRegistry.addShapelessRecipe(new ItemStack(BuildCraftTransport.pipeFluidsVoid),BuildCraftTransport.pipeItemsVoid,BuildCraftTransport.pipeWaterproof);
		GameRegistry.addShapelessRecipe(new ItemStack(BuildCraftTransport.pipePowerWood), BuildCraftTransport.pipeItemsWood,Items.redstone);
		GameRegistry.addShapelessRecipe(new ItemStack(BuildCraftTransport.pipePowerEmerald),BuildCraftTransport.pipeItemsEmerald,Items.redstone);
		GameRegistry.addShapelessRecipe(new ItemStack(BuildCraftTransport.pipePowerCobblestone),BuildCraftTransport.pipeItemsCobblestone,BuildCraftTransport.pipeWaterproof);
		GameRegistry.addShapelessRecipe(new ItemStack(BuildCraftTransport.pipePowerStone),BuildCraftTransport.pipeItemsStone,BuildCraftTransport.pipeWaterproof); 
		GameRegistry.addShapelessRecipe(new ItemStack(BuildCraftTransport.pipePowerQuartz),BuildCraftTransport.pipeItemsQuartz,BuildCraftTransport.pipeWaterproof); 
		GameRegistry.addShapelessRecipe(new ItemStack(BuildCraftTransport.pipePowerIron),BuildCraftTransport.pipeItemsIron,BuildCraftTransport.pipeWaterproof);
		GameRegistry.addShapelessRecipe(new ItemStack(BuildCraftTransport.pipePowerGold),BuildCraftTransport.pipeItemsGold,BuildCraftTransport.pipeWaterproof); 
		GameRegistry.addShapelessRecipe(new ItemStack(BuildCraftTransport.pipePowerDiamond),BuildCraftTransport.pipeItemsDiamond,BuildCraftTransport.pipeWaterproof); 
		GameRegistry.addShapelessRecipe(new ItemStack(BuildCraftTransport.pipePowerSandstone),BuildCraftTransport.pipeWaterproof);
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(BuildCraftTransport.pipeStructureCobblestone),new Object[] {BuildCraftTransport.pipeItemsCobblestone, "wurmgravel"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(BuildCraftTransport.pipeWaterproof), "dyeGreen"));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(BuildCraftTransport.pipeWaterproof), new ItemStack(Items.slime_ball)));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(BuildCraftTransport.plugItem),new Object[]{"wurmsaw", BuildCraftTransport.pipeStructureCobblestone}));
		
	}
	
	
	// Add OpenComputers Shapeless Recipes
	public static void addOpenComputersRecipes() {
	
		GameRegistry.addRecipe(new ShapelessOreRecipe(li.cil.oc.api.Items.get("internetCard").createItemStack(1),new Object[]{"oc:materialInterweb", "oc:wlanCard"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(li.cil.oc.api.Items.get("inkCartridge").createItemStack(1), new Object[] {"oc:inkCartridgeEmpty", "dyeBlue", "dyePink", "dyeRed", "dyeYellow"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(NBTOpenComputers.getEEProm(),new Object[] {"oc:eeprom", Items.book}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(NBTOpenComputers.getDiskOS(),new Object[] {"oc:floppy", Items.book}));
		
		
	}
	
	// Add Project Red Recipes
	public static void addProjectRedRecipes () {
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ProjectRedIllumination.itemPartIllumarButton(),1,0),new Object[]{new ItemStack(ProjectRedCore.itemPart(),1,19), new ItemStack(ProjectRedCore.itemPart(),1,19), Blocks.stone_button}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ProjectRedIllumination.itemPartIllumarButton(),1,1),new Object[]{new ItemStack(ProjectRedCore.itemPart(),1,20), new ItemStack(ProjectRedCore.itemPart(),1,20), Blocks.stone_button}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ProjectRedIllumination.itemPartIllumarButton(),1,2),new Object[]{new ItemStack(ProjectRedCore.itemPart(),1,21), new ItemStack(ProjectRedCore.itemPart(),1,21), Blocks.stone_button}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ProjectRedIllumination.itemPartIllumarButton(),1,3),new Object[]{new ItemStack(ProjectRedCore.itemPart(),1,22), new ItemStack(ProjectRedCore.itemPart(),1,22), Blocks.stone_button}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ProjectRedIllumination.itemPartIllumarButton(),1,4),new Object[]{new ItemStack(ProjectRedCore.itemPart(),1,23), new ItemStack(ProjectRedCore.itemPart(),1,23), Blocks.stone_button}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ProjectRedIllumination.itemPartIllumarButton(),1,5),new Object[]{new ItemStack(ProjectRedCore.itemPart(),1,24), new ItemStack(ProjectRedCore.itemPart(),1,24), Blocks.stone_button}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ProjectRedIllumination.itemPartIllumarButton(),1,6),new Object[]{new ItemStack(ProjectRedCore.itemPart(),1,25), new ItemStack(ProjectRedCore.itemPart(),1,25), Blocks.stone_button}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ProjectRedIllumination.itemPartIllumarButton(),1,7),new Object[]{new ItemStack(ProjectRedCore.itemPart(),1,26), new ItemStack(ProjectRedCore.itemPart(),1,26), Blocks.stone_button}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ProjectRedIllumination.itemPartIllumarButton(),1,8),new Object[]{new ItemStack(ProjectRedCore.itemPart(),1,27), new ItemStack(ProjectRedCore.itemPart(),1,27), Blocks.stone_button}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ProjectRedIllumination.itemPartIllumarButton(),1,9),new Object[]{new ItemStack(ProjectRedCore.itemPart(),1,28), new ItemStack(ProjectRedCore.itemPart(),1,28), Blocks.stone_button}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ProjectRedIllumination.itemPartIllumarButton(),1,10),new Object[]{new ItemStack(ProjectRedCore.itemPart(),1,29), new ItemStack(ProjectRedCore.itemPart(),1,29), Blocks.stone_button}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ProjectRedIllumination.itemPartIllumarButton(),1,11),new Object[]{new ItemStack(ProjectRedCore.itemPart(),1,30), new ItemStack(ProjectRedCore.itemPart(),1,30), Blocks.stone_button}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ProjectRedIllumination.itemPartIllumarButton(),1,12),new Object[]{new ItemStack(ProjectRedCore.itemPart(),1,31), new ItemStack(ProjectRedCore.itemPart(),1,31), Blocks.stone_button}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ProjectRedIllumination.itemPartIllumarButton(),1,13),new Object[]{new ItemStack(ProjectRedCore.itemPart(),1,32), new ItemStack(ProjectRedCore.itemPart(),1,32), Blocks.stone_button}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ProjectRedIllumination.itemPartIllumarButton(),1,14),new Object[]{new ItemStack(ProjectRedCore.itemPart(),1,33), new ItemStack(ProjectRedCore.itemPart(),1,33), Blocks.stone_button}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ProjectRedIllumination.itemPartIllumarButton(),1,15),new Object[]{new ItemStack(ProjectRedCore.itemPart(),1,34), new ItemStack(ProjectRedCore.itemPart(),1,34), Blocks.stone_button}));
		for(int i = 0; i > 15; i++) {
			GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ProjectRedIllumination.itemPartIllumarFButton(),1,i),new Object[]{new ItemStack(ProjectRedIllumination.itemPartIllumarButton(),1,i),Blocks.redstone_torch}));
		}
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ProjectRedCore.itemPart(),1,18), new Object[] {new ItemStack(ProjectRedTransmission.itemPartWire(),1,17),"dyeBlack"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ProjectRedCore.itemPart(),1,19), new Object[] {new ItemStack(ProjectRedTransmission.itemPartWire(),1,17),"dyeRed"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ProjectRedCore.itemPart(),1,20), new Object[] {new ItemStack(ProjectRedTransmission.itemPartWire(),1,17),"dyeGreen"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ProjectRedCore.itemPart(),1,21), new Object[] {new ItemStack(ProjectRedTransmission.itemPartWire(),1,17),"dyeBrown"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ProjectRedCore.itemPart(),1,22), new Object[] {new ItemStack(ProjectRedTransmission.itemPartWire(),1,17),"dyeBlue"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ProjectRedCore.itemPart(),1,23), new Object[] {new ItemStack(ProjectRedTransmission.itemPartWire(),1,17),"dyePurple"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ProjectRedCore.itemPart(),1,24), new Object[] {new ItemStack(ProjectRedTransmission.itemPartWire(),1,17),"dyeCyan"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ProjectRedCore.itemPart(),1,25), new Object[] {new ItemStack(ProjectRedTransmission.itemPartWire(),1,17),"dyeLightGray"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ProjectRedCore.itemPart(),1,26), new Object[] {new ItemStack(ProjectRedTransmission.itemPartWire(),1,17),"dyeGray"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ProjectRedCore.itemPart(),1,27), new Object[] {new ItemStack(ProjectRedTransmission.itemPartWire(),1,17),"dyePink"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ProjectRedCore.itemPart(),1,28), new Object[] {new ItemStack(ProjectRedTransmission.itemPartWire(),1,17),"dyeLime"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ProjectRedCore.itemPart(),1,29), new Object[] {new ItemStack(ProjectRedTransmission.itemPartWire(),1,17),"dyeYellow"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ProjectRedCore.itemPart(),1,30), new Object[] {new ItemStack(ProjectRedTransmission.itemPartWire(),1,17),"dyeLightBlue"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ProjectRedCore.itemPart(),1,31), new Object[] {new ItemStack(ProjectRedTransmission.itemPartWire(),1,17),"dyeMagenta"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ProjectRedCore.itemPart(),1,32), new Object[] {new ItemStack(ProjectRedTransmission.itemPartWire(),1,17),"dyeOrange"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ProjectRedCore.itemPart(),1,33), new Object[] {new ItemStack(ProjectRedTransmission.itemPartWire(),1,17),"dyeWhite"}));
		
		
	}
	
	// Add Applied Energistics Shapeless Recipes
	@SuppressWarnings("deprecation")
	public static void addAERecipes() {
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(BlockEnum.ECBASEBLOCK.getBlock(),1,1), new Object[] {new ItemStack(BlockEnum.FLUIDCRAFTER.getBlock()),new ItemStack(ItemEnum.PARTITEM.getItem(),1,3)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(BlockEnum.FLUIDCRAFTER.getBlock(),new Object[] {AEApi.instance().blocks().blockMolecularAssembler.block(),new ItemStack(ItemEnum.STORAGECOMPONET.getItem(),1,4)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemEnum.PARTITEM.getItem(),1,1), new Object[] {"wurmpiston", new ItemStack(TDDucts.fluidBasic.itemStack.getItem(),1,0), new ItemStack(AEApi.instance().blocks().blockInterface.block(),1,0)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemEnum.PARTITEM.getItem(),1,1), new Object[] {"wurmpiston", new ItemStack(TDDucts.fluidBasic.itemStack.getItem(),1,0), AEApi.instance().parts().partExportBus.item()}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemEnum.PARTITEM.getItem(),1,3), new Object[] {"wurmglass", new ItemStack(TDDucts.fluidBasic.itemStack.getItem(),1,0), new ItemStack(AEApi.instance().materials().materialAnnihilationCore.item(),1,44), new ItemStack(AEApi.instance().materials().materialAnnihilationCore.item(),1,43)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemEnum.PARTITEM.getItem(),1,7), new Object[] {AEApi.instance().blocks().blockDrive.block(), TFCItems.RedSteelSheet, TFCItems.BlueSteelSheet}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemEnum.PARTITEM.getItem(),1,8), new Object[] {AEApi.instance().blocks().blockEnergyCell.block(), TFCItems.RedSteelSheet, TFCItems.BlueSteelSheet}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemEnum.PARTITEM.getItem(),1,9), new Object[] {new ItemStack(BlockEnum.ECBASEBLOCK.getBlock())}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemEnum.PARTITEM.getItem(),1,10), new Object[] {AEApi.instance().parts().partLevelEmitter.item(), "wurmglass", "dyeBlue"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemEnum.PARTITEM.getItem(),1,11), new Object[] {new ItemStack(ItemEnum.PARTITEM.getItem(),1,10), new ItemStack(AEApi.instance().materials().materialAnnihilationCore.item(),1,44), new ItemStack(AEApi.instance().materials().materialAnnihilationCore.item(),1,43)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemEnum.PARTITEM.getItem(),1,12), new Object[] {AEApi.instance().parts().partExportBus.item(), new ItemStack(TFCItems.OreChunk,1,0),  new ItemStack(TFCItems.OreChunk,1,1), new ItemStack(TFCItems.OreChunk,1,2), new ItemStack(TFCItems.OreChunk,1,3), new ItemStack(TFCItems.OreChunk,1,4)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemEnum.PARTITEM.getItem(),1,4), new Object[] {AEApi.instance().parts().partLevelEmitter.item(), new ItemStack(TDDucts.fluidBasic.itemStack.getItem(),1,2)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemEnum.FLUIDSTORAGEPORTABLE.getItem(),1,0), new Object[] {AEApi.instance().blocks().blockChest.block(),AEApi.instance().blocks().blockEnergyCellDense.block(), new ItemStack(ItemEnum.STORAGECOMPONET.getItem(),1,4)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemEnum.FLUIDWIRELESSTERMINAL.getItem(),1,0), new Object[] {AEApi.instance().materials().materialWireless.item(),AEApi.instance().blocks().blockEnergyCellDense.block(),AEApi.instance().items().itemWirelessTerminal.item()}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemEnum.PHYSICALSTORAGE.getItem(),1,0), new Object[] {new ItemStack(ItemEnum.STORAGECASING.getItem(),1,0), new ItemStack(ItemEnum.STORAGECOMPONET.getItem(),1,0)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemEnum.PHYSICALSTORAGE.getItem(),1,1), new Object[] {new ItemStack(ItemEnum.STORAGECASING.getItem(),1,0), new ItemStack(ItemEnum.STORAGECOMPONET.getItem(),1,1)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemEnum.PHYSICALSTORAGE.getItem(),1,2), new Object[] {new ItemStack(ItemEnum.STORAGECASING.getItem(),1,0), new ItemStack(ItemEnum.STORAGECOMPONET.getItem(),1,2)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemEnum.PHYSICALSTORAGE.getItem(),1,3), new Object[] {new ItemStack(ItemEnum.STORAGECASING.getItem(),1,0), new ItemStack(ItemEnum.STORAGECOMPONET.getItem(),1,3)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemEnum.PHYSICALSTORAGE.getItem(),1,4), new Object[] {AEApi.instance().materials().materialCell1kPart.item(), AEApi.instance().materials().materialEmptyStorageCell.item(), "wurmchest"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemEnum.FLUIDSTORAGE.getItem(),1,0), new Object[] {new ItemStack(ItemEnum.STORAGECASING.getItem(),1,1), new ItemStack(ItemEnum.STORAGECOMPONET.getItem(),1,4)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemEnum.FLUIDSTORAGE.getItem(),1,1), new Object[] {new ItemStack(ItemEnum.STORAGECASING.getItem(),1,1), new ItemStack(ItemEnum.STORAGECOMPONET.getItem(),1,5)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemEnum.FLUIDSTORAGE.getItem(),1,2), new Object[] {new ItemStack(ItemEnum.STORAGECASING.getItem(),1,1), new ItemStack(ItemEnum.STORAGECOMPONET.getItem(),1,6)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemEnum.FLUIDSTORAGE.getItem(),1,3), new Object[] {new ItemStack(ItemEnum.STORAGECASING.getItem(),1,1), new ItemStack(ItemEnum.STORAGECOMPONET.getItem(),1,7)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemEnum.FLUIDSTORAGE.getItem(),1,4), new Object[] {new ItemStack(ItemEnum.STORAGECASING.getItem(),1,1), new ItemStack(ItemEnum.STORAGECOMPONET.getItem(),1,8)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemEnum.FLUIDSTORAGE.getItem(),1,5), new Object[] {new ItemStack(ItemEnum.STORAGECASING.getItem(),1,1), new ItemStack(ItemEnum.STORAGECOMPONET.getItem(),1,9)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemEnum.FLUIDSTORAGE.getItem(),1,6), new Object[] {new ItemStack(ItemEnum.STORAGECASING.getItem(),1,1), new ItemStack(ItemEnum.STORAGECOMPONET.getItem(),1,10)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(AEApi.instance().blocks().blockCraftingUnit.block(),1,1), new Object[] {AEApi.instance().blocks().blockCraftingUnit.block(), new ItemStack(AEApi.instance().materials().materialEngProcessor.item(),1,24)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(AEApi.instance().blocks().blockCraftingMonitor.block(),1,0), new Object[] {AEApi.instance().blocks().blockCraftingUnit.block(), AEApi.instance().parts().partStorageMonitor.item()}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(AEApi.instance().blocks().blockCraftingStorage1k.block(),1,0), new Object[] {AEApi.instance().blocks().blockCraftingUnit.block(), new ItemStack(AEApi.instance().materials().materialCell1kPart.item(),1,35)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(AEApi.instance().blocks().blockCraftingStorage4k.block(),1,1), new Object[] {AEApi.instance().blocks().blockCraftingUnit.block(), new ItemStack(AEApi.instance().materials().materialCell4kPart.item(),1,36)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(AEApi.instance().blocks().blockCraftingStorage16k.block(),1,2), new Object[] {AEApi.instance().blocks().blockCraftingUnit.block(), new ItemStack(AEApi.instance().materials().materialCell16kPart.item(),1,37)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(AEApi.instance().blocks().blockCraftingStorage64k.block(),1,3), new Object[] {AEApi.instance().blocks().blockCraftingUnit.block(), new ItemStack(AEApi.instance().materials().materialCell64kPart.item(),1,38)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(AEApi.instance().parts().partCableGlass.item(AEColor.Black),1,36),new Object[] {new ItemStack(AEApi.instance().parts().partCableGlass.item(AEColor.Black),1,16),"wurmwool"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(AEApi.instance().parts().partCableGlass.item(AEColor.Black),1,56),new Object[] {new ItemStack(AEApi.instance().parts().partCableGlass.item(AEColor.Black),1,16),Items.redstone, Items.glowstone_dust}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(AEApi.instance().materials().materialEngProcessor.item(),1,53), new Object[] {new ItemStack(AEApi.instance().materials().materialEngProcessor.item(),1,25), Blocks.crafting_table}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(AEApi.instance().materials().materialEngProcessor.item(),1,26), new Object[] {new ItemStack(AEApi.instance().materials().materialEngProcessor.item(),1,25), Blocks.redstone_torch}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(AEApi.instance().materials().materialEngProcessor.item(),1,160), new Object[] {new ItemStack(AEApi.instance().materials().materialEngProcessor.item(),1,180)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(AEApi.instance().parts().partAnnihilationPlane.item(),1,360), new Object[] {new ItemStack(AEApi.instance().parts().partAnnihilationPlane.item(),1,380), Blocks.crafting_table, new ItemStack(AEApi.instance().materials().materialEngProcessor.item(),1,23)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(AEApi.instance().parts().partAnnihilationPlane.item(),1,480), new Object[] {"itemIlluminatedPanel", new ItemStack(AEApi.instance().parts().partAnnihilationPlane.item(),1,440), new ItemStack(AEApi.instance().materials().materialEngProcessor.item(),1,24)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(AEApi.instance().parts().partAnnihilationPlane.item(),1,480), new Object[] {"itemIlluminatedPanel", new ItemStack(AEApi.instance().blocks().blockInterface.block(),1,0), new ItemStack(AEApi.instance().materials().materialEngProcessor.item(),1,24)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(AEApi.instance().parts().partAnnihilationPlane.item(),1,100), new Object[] {new ItemStack(AEApi.instance().materials().materialEngProcessor.item(),1,80)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(AEApi.instance().parts().partAnnihilationPlane.item(),1,280), new Object[] {Blocks.redstone_torch, new ItemStack(AEApi.instance().materials().materialEngProcessor.item(),1,23)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(AEApi.instance().parts().partAnnihilationPlane.item(),1,340), new Object[] {new ItemStack(AEApi.instance().materials().materialEngProcessor.item(),1,23), new ItemStack(AEApi.instance().parts().partAnnihilationPlane.item(),1,360)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(AEApi.instance().materials().materialEngProcessor.item(),1,30), new Object[] {new ItemStack(AEApi.instance().materials().materialEngProcessor.item(),1,28), TFCItems.PlatinumSheet}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(AEApi.instance().materials().materialEngProcessor.item(),1,29), new Object[] {new ItemStack(AEApi.instance().materials().materialEngProcessor.item(),1,28), "wurmwool"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(AEApi.instance().materials().materialEngProcessor.item(),1,31), new Object[] {new ItemStack(AEApi.instance().materials().materialEngProcessor.item(),1,28), Blocks.redstone_torch}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(AEApi.instance().materials().materialEngProcessor.item(),1,27), new Object[] {new ItemStack(AEApi.instance().materials().materialEngProcessor.item(),1,25), "wurmchest"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(AEApi.instance().parts().partAnnihilationPlane.item(),1,220), new Object[] {new ItemStack(AEApi.instance().blocks().blockInterface.block(),1,0), "wurmpiston", "wurmpiston"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(AEApi.instance().parts().partAnnihilationPlane.item(),1,400), new Object[] {new ItemStack(AEApi.instance().blocks().blockInterface.block(),1,280), "itemIlluminatedPanel"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(AEApi.instance().parts().partAnnihilationPlane.item(),1,380), new Object[] {tweaks.wurm.items.ModItems.MixedSheet,"itemIlluminatedPanel"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(AEApi.instance().parts().partAnnihilationPlane.item(),1,100), new Object[] {new ItemStack(AEApi.instance().materials().materialEngProcessor.item(),1,80)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(AEApi.instance().parts().partAnnihilationPlane.item(),1,180), new Object[] {new ItemStack(AEApi.instance().parts().partAnnihilationPlane.item(),1,80), new ItemStack(Blocks.glowstone), ModItems.MixedSheet}));
		
	}
	
	// Add Chisel Shapeless Recipes
	public static void addChiselRecipes() {
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ChiselBlocks.present,1,0), new Object[] {Blocks.chest,"dyeBlack"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ChiselBlocks.present,1,1), new Object[] {Blocks.chest,"dyeRed"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ChiselBlocks.present,1,2), new Object[] {Blocks.chest,"dyeGreen"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ChiselBlocks.present,1,3), new Object[] {Blocks.chest,"dyeBrown"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ChiselBlocks.present,1,4), new Object[] {Blocks.chest,"dyeBlue"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ChiselBlocks.present,1,5), new Object[] {Blocks.chest,"dyePurple"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ChiselBlocks.present,1,6), new Object[] {Blocks.chest,"dyeCyan"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ChiselBlocks.present,1,7), new Object[] {Blocks.chest,"dyeLightGray"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ChiselBlocks.present,1,8), new Object[] {Blocks.chest,"dyeGray"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ChiselBlocks.present,1,9), new Object[] {Blocks.chest,"dyePink"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ChiselBlocks.present,1,10), new Object[] {Blocks.chest,"dyeLime"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ChiselBlocks.present,1,11), new Object[] {Blocks.chest,"dyeYellow"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ChiselBlocks.present,1,12), new Object[] {Blocks.chest,"dyeLightBlue"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ChiselBlocks.present,1,13), new Object[] {Blocks.chest,"dyeMagenta"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ChiselBlocks.present,1,14), new Object[] {Blocks.chest,"dyeOrange"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ChiselBlocks.present,1,15), new Object[] {Blocks.chest,"dyeWhite"}));
	
	}
		
	// Add Extra Utilities Shapeless Recipes
	public static void addExtraUtilitiesRecipes() {
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.cobblestone,9,0), new Object[] {new ItemStack(ExtraUtils.cobblestoneCompr,1,0)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ExtraUtils.cobblestoneCompr,9,0), new Object[] {new ItemStack(ExtraUtils.cobblestoneCompr,1,1)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ExtraUtils.cobblestoneCompr,9,1), new Object[] {new ItemStack(ExtraUtils.cobblestoneCompr,1,2)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ExtraUtils.cobblestoneCompr,9,2), new Object[] {new ItemStack(ExtraUtils.cobblestoneCompr,1,3)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ExtraUtils.cobblestoneCompr,9,3), new Object[] {new ItemStack(ExtraUtils.cobblestoneCompr,1,4)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ExtraUtils.cobblestoneCompr,9,4), new Object[] {new ItemStack(ExtraUtils.cobblestoneCompr,1,5)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ExtraUtils.cobblestoneCompr,9,5), new Object[] {new ItemStack(ExtraUtils.cobblestoneCompr,1,6)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ExtraUtils.cobblestoneCompr,9,6), new Object[] {new ItemStack(ExtraUtils.cobblestoneCompr,1,7)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.dirt,9,0), new Object[] {new ItemStack(ExtraUtils.cobblestoneCompr,1,8)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ExtraUtils.cobblestoneCompr,9,8), new Object[] {new ItemStack(ExtraUtils.cobblestoneCompr,1,9)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ExtraUtils.cobblestoneCompr,9,9), new Object[] {new ItemStack(ExtraUtils.cobblestoneCompr,1,10)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ExtraUtils.cobblestoneCompr,9,10), new Object[] {new ItemStack(ExtraUtils.cobblestoneCompr,1,11)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.gravel,9,0), new Object[] {new ItemStack(ExtraUtils.cobblestoneCompr,1,12)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ExtraUtils.cobblestoneCompr,9,12), new Object[] {new ItemStack(ExtraUtils.cobblestoneCompr,1,13)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.sand,9,0), new Object[] {new ItemStack(ExtraUtils.cobblestoneCompr,1,14)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ExtraUtils.cobblestoneCompr,9,14), new Object[] {new ItemStack(ExtraUtils.cobblestoneCompr,1,15)}));
		
	}
	
	
	// Add Shapeless Coin Recipes
	public static void addCoinRecipes() {
		
		GameRegistry.addShapelessRecipe(new ItemStack(Coin.Bismith_credit, 5), new Object[] { new ItemStack(Coin.Zinc_credit) });
	    GameRegistry.addShapelessRecipe(new ItemStack(Coin.Zinc_credit), new Object[] { new ItemStack(Coin.Bismith_credit), new ItemStack(Coin.Bismith_credit), new ItemStack(Coin.Bismith_credit), new ItemStack(Coin.Bismith_credit), new ItemStack(Coin.Bismith_credit) });
	    GameRegistry.addShapelessRecipe(new ItemStack(Coin.Zinc_credit, 2), new Object[] { new ItemStack(Coin.Copper_credit) });
	    GameRegistry.addShapelessRecipe(new ItemStack(Coin.Copper_credit), new Object[] { new ItemStack(Coin.Zinc_credit), new ItemStack(Coin.Zinc_credit) });
	    GameRegistry.addShapelessRecipe(new ItemStack(Coin.Copper_credit, 5), new Object[] { new ItemStack(Coin.Brass_credit) });
	    GameRegistry.addShapelessRecipe(new ItemStack(Coin.Brass_credit), new Object[] { new ItemStack(Coin.Copper_credit), new ItemStack(Coin.Copper_credit), new ItemStack(Coin.Copper_credit), new ItemStack(Coin.Copper_credit), new ItemStack(Coin.Copper_credit) });
	    GameRegistry.addShapelessRecipe(new ItemStack(Coin.Brass_credit, 2), new Object[] { new ItemStack(Coin.Silver_credit) });
	    GameRegistry.addShapelessRecipe(new ItemStack(Coin.Silver_credit), new Object[] { new ItemStack(Coin.Brass_credit), new ItemStack(Coin.Brass_credit) });
	    GameRegistry.addShapelessRecipe(new ItemStack(Coin.Silver_credit, 5), new Object[] { new ItemStack(Coin.Gold_credit) });
	    GameRegistry.addShapelessRecipe(new ItemStack(Coin.Gold_credit), new Object[] { new ItemStack(Coin.Silver_credit), new ItemStack(Coin.Silver_credit), new ItemStack(Coin.Silver_credit), new ItemStack(Coin.Silver_credit), new ItemStack(Coin.Silver_credit) });
	    GameRegistry.addShapelessRecipe(new ItemStack(Coin.Gold_credit, 2), new Object[] { new ItemStack(Coin.Platinum_credit) });
	    GameRegistry.addShapelessRecipe(new ItemStack(Coin.Platinum_credit), new Object[] { new ItemStack(Coin.Gold_credit), new ItemStack(Coin.Gold_credit) });
	    GameRegistry.addShapelessRecipe(new ItemStack(Coin.Platinum_credit, 2), new Object[] { new ItemStack(Coin.Steel_credit) });
	    GameRegistry.addShapelessRecipe(new ItemStack(Coin.Steel_credit), new Object[] { new ItemStack(Coin.Platinum_credit), new ItemStack(Coin.Platinum_credit) });
	    GameRegistry.addShapelessRecipe(new ItemStack(Coin.Platinum_credit, 5), new Object[] { new ItemStack(Coin.RedSteel_credit) });
	    GameRegistry.addShapelessRecipe(new ItemStack(Coin.RedSteel_credit), new Object[] { new ItemStack(Coin.Platinum_credit), new ItemStack(Coin.Platinum_credit), new ItemStack(Coin.Platinum_credit), new ItemStack(Coin.Platinum_credit), new ItemStack(Coin.Platinum_credit) });
	    GameRegistry.addShapelessRecipe(new ItemStack(Coin.RedSteel_credit, 2), new Object[] { new ItemStack(Coin.PurpleSteel_credit) });
	    GameRegistry.addShapelessRecipe(new ItemStack(Coin.PurpleSteel_credit), new Object[] { new ItemStack(Coin.RedSteel_credit), new ItemStack(Coin.RedSteel_credit) });
	    
	}
	
	// Add Shapeless GregTech Recipes
	public static void addGregTechRecipes() {
		
	    GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,168), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,167),new ItemStack(ItemList.Hull_Bronze.getItem(),1,167)}));
	    GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,169), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,168),new ItemStack(ItemList.Hull_Bronze.getItem(),1,168)}));
	    GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,170), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,160),new ItemStack(ItemList.Hull_Bronze.getItem(),1,160),new ItemStack(ItemList.Hull_Bronze.getItem(),1,160),new ItemStack(ItemList.Hull_Bronze.getItem(),1,160)}));
	    GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,171), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,161),new ItemStack(ItemList.Hull_Bronze.getItem(),1,161),new ItemStack(ItemList.Hull_Bronze.getItem(),1,161),new ItemStack(ItemList.Hull_Bronze.getItem(),1,161)}));
	    GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,172), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,162),new ItemStack(ItemList.Hull_Bronze.getItem(),1,162),new ItemStack(ItemList.Hull_Bronze.getItem(),1,162),new ItemStack(ItemList.Hull_Bronze.getItem(),1,162)}));
	    GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,173), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,163),new ItemStack(ItemList.Hull_Bronze.getItem(),1,163),new ItemStack(ItemList.Hull_Bronze.getItem(),1,163),new ItemStack(ItemList.Hull_Bronze.getItem(),1,163)}));
	    GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,174), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,164),new ItemStack(ItemList.Hull_Bronze.getItem(),1,164),new ItemStack(ItemList.Hull_Bronze.getItem(),1,164),new ItemStack(ItemList.Hull_Bronze.getItem(),1,164)}));
	    GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,175), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,165),new ItemStack(ItemList.Hull_Bronze.getItem(),1,165),new ItemStack(ItemList.Hull_Bronze.getItem(),1,165),new ItemStack(ItemList.Hull_Bronze.getItem(),1,165)}));
	    GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,176), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,166),new ItemStack(ItemList.Hull_Bronze.getItem(),1,166),new ItemStack(ItemList.Hull_Bronze.getItem(),1,166),new ItemStack(ItemList.Hull_Bronze.getItem(),1,166)}));
	    GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,177), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,167),new ItemStack(ItemList.Hull_Bronze.getItem(),1,167),new ItemStack(ItemList.Hull_Bronze.getItem(),1,167),new ItemStack(ItemList.Hull_Bronze.getItem(),1,167)}));
	    GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,178), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,168),new ItemStack(ItemList.Hull_Bronze.getItem(),1,168),new ItemStack(ItemList.Hull_Bronze.getItem(),1,168),new ItemStack(ItemList.Hull_Bronze.getItem(),1,168)}));
	    GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,179), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,169),new ItemStack(ItemList.Hull_Bronze.getItem(),1,169),new ItemStack(ItemList.Hull_Bronze.getItem(),1,169),new ItemStack(ItemList.Hull_Bronze.getItem(),1,169)})); 
	    GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,180), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,160),new ItemStack(ItemList.Hull_Bronze.getItem(),1,160),new ItemStack(ItemList.Hull_Bronze.getItem(),1,160),new ItemStack(ItemList.Hull_Bronze.getItem(),1,160),new ItemStack(ItemList.Hull_Bronze.getItem(),1,160),new ItemStack(ItemList.Hull_Bronze.getItem(),1,160),new ItemStack(ItemList.Hull_Bronze.getItem(),1,160),new ItemStack(ItemList.Hull_Bronze.getItem(),1,160),new ItemStack(ItemList.Hull_Bronze.getItem(),1,160)}));
	    GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,181), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,161),new ItemStack(ItemList.Hull_Bronze.getItem(),1,161),new ItemStack(ItemList.Hull_Bronze.getItem(),1,161),new ItemStack(ItemList.Hull_Bronze.getItem(),1,161),new ItemStack(ItemList.Hull_Bronze.getItem(),1,161),new ItemStack(ItemList.Hull_Bronze.getItem(),1,161),new ItemStack(ItemList.Hull_Bronze.getItem(),1,161),new ItemStack(ItemList.Hull_Bronze.getItem(),1,161),new ItemStack(ItemList.Hull_Bronze.getItem(),1,161)}));
	    GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,182), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,162),new ItemStack(ItemList.Hull_Bronze.getItem(),1,162),new ItemStack(ItemList.Hull_Bronze.getItem(),1,162),new ItemStack(ItemList.Hull_Bronze.getItem(),1,162),new ItemStack(ItemList.Hull_Bronze.getItem(),1,162),new ItemStack(ItemList.Hull_Bronze.getItem(),1,162),new ItemStack(ItemList.Hull_Bronze.getItem(),1,162),new ItemStack(ItemList.Hull_Bronze.getItem(),1,162),new ItemStack(ItemList.Hull_Bronze.getItem(),1,162)}));
	    GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,183), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,163),new ItemStack(ItemList.Hull_Bronze.getItem(),1,163),new ItemStack(ItemList.Hull_Bronze.getItem(),1,163),new ItemStack(ItemList.Hull_Bronze.getItem(),1,163),new ItemStack(ItemList.Hull_Bronze.getItem(),1,163),new ItemStack(ItemList.Hull_Bronze.getItem(),1,163),new ItemStack(ItemList.Hull_Bronze.getItem(),1,163),new ItemStack(ItemList.Hull_Bronze.getItem(),1,163),new ItemStack(ItemList.Hull_Bronze.getItem(),1,163)}));
	    GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,184), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,164),new ItemStack(ItemList.Hull_Bronze.getItem(),1,164),new ItemStack(ItemList.Hull_Bronze.getItem(),1,164),new ItemStack(ItemList.Hull_Bronze.getItem(),1,164),new ItemStack(ItemList.Hull_Bronze.getItem(),1,164),new ItemStack(ItemList.Hull_Bronze.getItem(),1,164),new ItemStack(ItemList.Hull_Bronze.getItem(),1,164),new ItemStack(ItemList.Hull_Bronze.getItem(),1,164),new ItemStack(ItemList.Hull_Bronze.getItem(),1,164)}));
	    GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,185), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,165),new ItemStack(ItemList.Hull_Bronze.getItem(),1,165),new ItemStack(ItemList.Hull_Bronze.getItem(),1,165),new ItemStack(ItemList.Hull_Bronze.getItem(),1,165),new ItemStack(ItemList.Hull_Bronze.getItem(),1,165),new ItemStack(ItemList.Hull_Bronze.getItem(),1,165),new ItemStack(ItemList.Hull_Bronze.getItem(),1,165),new ItemStack(ItemList.Hull_Bronze.getItem(),1,165),new ItemStack(ItemList.Hull_Bronze.getItem(),1,165)}));
	    GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,186), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,166),new ItemStack(ItemList.Hull_Bronze.getItem(),1,166),new ItemStack(ItemList.Hull_Bronze.getItem(),1,166),new ItemStack(ItemList.Hull_Bronze.getItem(),1,166),new ItemStack(ItemList.Hull_Bronze.getItem(),1,166),new ItemStack(ItemList.Hull_Bronze.getItem(),1,166),new ItemStack(ItemList.Hull_Bronze.getItem(),1,166),new ItemStack(ItemList.Hull_Bronze.getItem(),1,166),new ItemStack(ItemList.Hull_Bronze.getItem(),1,166)}));
	    GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,187), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,167),new ItemStack(ItemList.Hull_Bronze.getItem(),1,167),new ItemStack(ItemList.Hull_Bronze.getItem(),1,167),new ItemStack(ItemList.Hull_Bronze.getItem(),1,167),new ItemStack(ItemList.Hull_Bronze.getItem(),1,167),new ItemStack(ItemList.Hull_Bronze.getItem(),1,167),new ItemStack(ItemList.Hull_Bronze.getItem(),1,167),new ItemStack(ItemList.Hull_Bronze.getItem(),1,167),new ItemStack(ItemList.Hull_Bronze.getItem(),1,167)}));
	    GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,188), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,168),new ItemStack(ItemList.Hull_Bronze.getItem(),1,168),new ItemStack(ItemList.Hull_Bronze.getItem(),1,168),new ItemStack(ItemList.Hull_Bronze.getItem(),1,168),new ItemStack(ItemList.Hull_Bronze.getItem(),1,168),new ItemStack(ItemList.Hull_Bronze.getItem(),1,168),new ItemStack(ItemList.Hull_Bronze.getItem(),1,168),new ItemStack(ItemList.Hull_Bronze.getItem(),1,168),new ItemStack(ItemList.Hull_Bronze.getItem(),1,168)}));
	    GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,189), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,169),new ItemStack(ItemList.Hull_Bronze.getItem(),1,169),new ItemStack(ItemList.Hull_Bronze.getItem(),1,169),new ItemStack(ItemList.Hull_Bronze.getItem(),1,169),new ItemStack(ItemList.Hull_Bronze.getItem(),1,169),new ItemStack(ItemList.Hull_Bronze.getItem(),1,169),new ItemStack(ItemList.Hull_Bronze.getItem(),1,169),new ItemStack(ItemList.Hull_Bronze.getItem(),1,169),new ItemStack(ItemList.Hull_Bronze.getItem(),1,169)}));
	    GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,180), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,170),new ItemStack(ItemList.Hull_Bronze.getItem(),1,170),new ItemStack(ItemList.Hull_Bronze.getItem(),1,160)}));
	    GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,181), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,171),new ItemStack(ItemList.Hull_Bronze.getItem(),1,171),new ItemStack(ItemList.Hull_Bronze.getItem(),1,161)}));
	    GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,182), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,172),new ItemStack(ItemList.Hull_Bronze.getItem(),1,172),new ItemStack(ItemList.Hull_Bronze.getItem(),1,162)}));
	    GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,183), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,173),new ItemStack(ItemList.Hull_Bronze.getItem(),1,173),new ItemStack(ItemList.Hull_Bronze.getItem(),1,163)}));
	    GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,184), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,174),new ItemStack(ItemList.Hull_Bronze.getItem(),1,174),new ItemStack(ItemList.Hull_Bronze.getItem(),1,164)}));
	    GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,185), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,175),new ItemStack(ItemList.Hull_Bronze.getItem(),1,175),new ItemStack(ItemList.Hull_Bronze.getItem(),1,165)}));
	    GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,186), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,176),new ItemStack(ItemList.Hull_Bronze.getItem(),1,176),new ItemStack(ItemList.Hull_Bronze.getItem(),1,166)}));
	    GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,187), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,177),new ItemStack(ItemList.Hull_Bronze.getItem(),1,177),new ItemStack(ItemList.Hull_Bronze.getItem(),1,167)}));
	    GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,188), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,178),new ItemStack(ItemList.Hull_Bronze.getItem(),1,178),new ItemStack(ItemList.Hull_Bronze.getItem(),1,168)}));
	    GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,189), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,179),new ItemStack(ItemList.Hull_Bronze.getItem(),1,179),new ItemStack(ItemList.Hull_Bronze.getItem(),1,169)}));
	    GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,190), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,170),new ItemStack(ItemList.Hull_Bronze.getItem(),1,170),new ItemStack(ItemList.Hull_Bronze.getItem(),1,170),new ItemStack(ItemList.Hull_Bronze.getItem(),1,170)}));
	    GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,191), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,171),new ItemStack(ItemList.Hull_Bronze.getItem(),1,171),new ItemStack(ItemList.Hull_Bronze.getItem(),1,171),new ItemStack(ItemList.Hull_Bronze.getItem(),1,171)}));
	    GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,192), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,172),new ItemStack(ItemList.Hull_Bronze.getItem(),1,172),new ItemStack(ItemList.Hull_Bronze.getItem(),1,172),new ItemStack(ItemList.Hull_Bronze.getItem(),1,172)}));
	    GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,193), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,173),new ItemStack(ItemList.Hull_Bronze.getItem(),1,173),new ItemStack(ItemList.Hull_Bronze.getItem(),1,173),new ItemStack(ItemList.Hull_Bronze.getItem(),1,173)}));
	    GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,194), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,174),new ItemStack(ItemList.Hull_Bronze.getItem(),1,174),new ItemStack(ItemList.Hull_Bronze.getItem(),1,174),new ItemStack(ItemList.Hull_Bronze.getItem(),1,174)}));
	    GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,195), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,175),new ItemStack(ItemList.Hull_Bronze.getItem(),1,175),new ItemStack(ItemList.Hull_Bronze.getItem(),1,175),new ItemStack(ItemList.Hull_Bronze.getItem(),1,175)}));
	    GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,196), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,176),new ItemStack(ItemList.Hull_Bronze.getItem(),1,176),new ItemStack(ItemList.Hull_Bronze.getItem(),1,176),new ItemStack(ItemList.Hull_Bronze.getItem(),1,176)}));
	    GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,197), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,177),new ItemStack(ItemList.Hull_Bronze.getItem(),1,177),new ItemStack(ItemList.Hull_Bronze.getItem(),1,177),new ItemStack(ItemList.Hull_Bronze.getItem(),1,177)}));
	    GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,198), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,178),new ItemStack(ItemList.Hull_Bronze.getItem(),1,178),new ItemStack(ItemList.Hull_Bronze.getItem(),1,178),new ItemStack(ItemList.Hull_Bronze.getItem(),1,178)}));
	    GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,199), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,179),new ItemStack(ItemList.Hull_Bronze.getItem(),1,179),new ItemStack(ItemList.Hull_Bronze.getItem(),1,179),new ItemStack(ItemList.Hull_Bronze.getItem(),1,179)})); 
	    GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,190), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,180),new ItemStack(ItemList.Hull_Bronze.getItem(),1,160),new ItemStack(ItemList.Hull_Bronze.getItem(),1,160),new ItemStack(ItemList.Hull_Bronze.getItem(),1,160),new ItemStack(ItemList.Hull_Bronze.getItem(),1,160),new ItemStack(ItemList.Hull_Bronze.getItem(),1,160),new ItemStack(ItemList.Hull_Bronze.getItem(),1,160),new ItemStack(ItemList.Hull_Bronze.getItem(),1,160)}));
	    GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,191), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,181),new ItemStack(ItemList.Hull_Bronze.getItem(),1,161),new ItemStack(ItemList.Hull_Bronze.getItem(),1,161),new ItemStack(ItemList.Hull_Bronze.getItem(),1,161),new ItemStack(ItemList.Hull_Bronze.getItem(),1,161),new ItemStack(ItemList.Hull_Bronze.getItem(),1,161),new ItemStack(ItemList.Hull_Bronze.getItem(),1,161),new ItemStack(ItemList.Hull_Bronze.getItem(),1,161)}));
	    GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,191), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,181),new ItemStack(ItemList.Hull_Bronze.getItem(),1,161),new ItemStack(ItemList.Hull_Bronze.getItem(),1,161),new ItemStack(ItemList.Hull_Bronze.getItem(),1,161),new ItemStack(ItemList.Hull_Bronze.getItem(),1,161),new ItemStack(ItemList.Hull_Bronze.getItem(),1,161),new ItemStack(ItemList.Hull_Bronze.getItem(),1,161),new ItemStack(ItemList.Hull_Bronze.getItem(),1,161)}));
	    GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,193), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,183),new ItemStack(ItemList.Hull_Bronze.getItem(),1,163),new ItemStack(ItemList.Hull_Bronze.getItem(),3,163),new ItemStack(ItemList.Hull_Bronze.getItem(),1,163),new ItemStack(ItemList.Hull_Bronze.getItem(),1,163),new ItemStack(ItemList.Hull_Bronze.getItem(),1,163),new ItemStack(ItemList.Hull_Bronze.getItem(),1,163),new ItemStack(ItemList.Hull_Bronze.getItem(),1,163)}));
	    GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,194), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,184),new ItemStack(ItemList.Hull_Bronze.getItem(),1,164),new ItemStack(ItemList.Hull_Bronze.getItem(),3,164),new ItemStack(ItemList.Hull_Bronze.getItem(),1,164),new ItemStack(ItemList.Hull_Bronze.getItem(),1,164),new ItemStack(ItemList.Hull_Bronze.getItem(),1,164),new ItemStack(ItemList.Hull_Bronze.getItem(),1,164),new ItemStack(ItemList.Hull_Bronze.getItem(),1,164)}));
	    GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,195), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,185),new ItemStack(ItemList.Hull_Bronze.getItem(),1,165),new ItemStack(ItemList.Hull_Bronze.getItem(),3,165),new ItemStack(ItemList.Hull_Bronze.getItem(),1,165),new ItemStack(ItemList.Hull_Bronze.getItem(),1,165),new ItemStack(ItemList.Hull_Bronze.getItem(),1,165),new ItemStack(ItemList.Hull_Bronze.getItem(),1,165),new ItemStack(ItemList.Hull_Bronze.getItem(),1,165)}));
	    GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,196), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,186),new ItemStack(ItemList.Hull_Bronze.getItem(),1,166),new ItemStack(ItemList.Hull_Bronze.getItem(),3,166),new ItemStack(ItemList.Hull_Bronze.getItem(),1,166),new ItemStack(ItemList.Hull_Bronze.getItem(),1,166),new ItemStack(ItemList.Hull_Bronze.getItem(),1,166),new ItemStack(ItemList.Hull_Bronze.getItem(),1,166),new ItemStack(ItemList.Hull_Bronze.getItem(),1,166)}));
	    GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,197), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,187),new ItemStack(ItemList.Hull_Bronze.getItem(),1,167),new ItemStack(ItemList.Hull_Bronze.getItem(),3,167),new ItemStack(ItemList.Hull_Bronze.getItem(),1,167),new ItemStack(ItemList.Hull_Bronze.getItem(),1,167),new ItemStack(ItemList.Hull_Bronze.getItem(),1,167),new ItemStack(ItemList.Hull_Bronze.getItem(),1,167),new ItemStack(ItemList.Hull_Bronze.getItem(),1,167)}));
	    GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,198), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,188),new ItemStack(ItemList.Hull_Bronze.getItem(),1,168),new ItemStack(ItemList.Hull_Bronze.getItem(),3,168),new ItemStack(ItemList.Hull_Bronze.getItem(),1,168),new ItemStack(ItemList.Hull_Bronze.getItem(),1,168),new ItemStack(ItemList.Hull_Bronze.getItem(),1,168),new ItemStack(ItemList.Hull_Bronze.getItem(),1,168),new ItemStack(ItemList.Hull_Bronze.getItem(),1,168)}));
	    GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,199), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,185),new ItemStack(ItemList.Hull_Bronze.getItem(),1,169),new ItemStack(ItemList.Hull_Bronze.getItem(),3,169),new ItemStack(ItemList.Hull_Bronze.getItem(),1,169),new ItemStack(ItemList.Hull_Bronze.getItem(),1,169),new ItemStack(ItemList.Hull_Bronze.getItem(),1,169),new ItemStack(ItemList.Hull_Bronze.getItem(),1,169),new ItemStack(ItemList.Hull_Bronze.getItem(),1,169)}));
	    GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,60), new Object[] {"wurmglass","wurmstick", new ItemStack(ItemList.Hull_Bronze.getItem(),1,2000)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,61), new Object[] {"wurmglass","wurmstick", new ItemStack(ItemList.Hull_Bronze.getItem(),1,1246)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,62), new Object[] {"wurmglass","wurmstick", new ItemStack(ItemList.Hull_Bronze.getItem(),1,1366)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,63), new Object[] {"wurmglass","wurmstick", new ItemStack(ItemList.Hull_Bronze.getItem(),1,1426)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,64), new Object[] {"wurmglass","wurmstick", new ItemStack(ItemList.Hull_Bronze.getItem(),1,1526)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,65), new Object[] {"wurmglass","wurmstick", ic2.api.item.IC2Items.getItem("glassFiberCableItem")}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,66), new Object[] {"wurmglass","wurmstick", new ItemStack(ItemList.Hull_Bronze.getItem(),1,65),new ItemStack(ItemList.Hull_Bronze.getItem(),1,65)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,67), new Object[] {"wurmglass","wurmstick", new ItemStack(ItemList.Hull_Bronze.getItem(),1,66), new ItemStack(ItemList.Hull_Bronze.getItem(),1,66)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,68), new Object[] {"wurmglass","wurmstick", new ItemStack(ItemList.Hull_Bronze.getItem(),1,67),new ItemStack(ItemList.Hull_Bronze.getItem(),1,67)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,69), new Object[] {"wurmglass","wurmstick", new ItemStack(ItemList.Hull_Bronze.getItem(),1,68),new ItemStack(ItemList.Hull_Bronze.getItem(),1,68)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,80), new Object[] {"wurmchest","wurmstick", new ItemStack(ItemList.Hull_Bronze.getItem(),1,2000)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,81), new Object[] {"wurmchest","wurmstick", new ItemStack(ItemList.Hull_Bronze.getItem(),1,1246)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,82), new Object[] {"wurmchest","wurmstick", new ItemStack(ItemList.Hull_Bronze.getItem(),1,1366)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,83), new Object[] {"wurmchest","wurmstick", new ItemStack(ItemList.Hull_Bronze.getItem(),1,1426)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,84), new Object[] {"wurmchest","wurmstick", new ItemStack(ItemList.Hull_Bronze.getItem(),1,1526)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,85), new Object[] {"wurmchest","wurmstick", ic2.api.item.IC2Items.getItem("glassFiberCableItem")}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,86), new Object[] {"wurmchest","wurmstick", new ItemStack(ItemList.Hull_Bronze.getItem(),1,65),new ItemStack(ItemList.Hull_Bronze.getItem(),1,65)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,87), new Object[] {"wurmchest","wurmstick", new ItemStack(ItemList.Hull_Bronze.getItem(),1,66), new ItemStack(ItemList.Hull_Bronze.getItem(),1,66)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,88), new Object[] {"wurmchest","wurmstick", new ItemStack(ItemList.Hull_Bronze.getItem(),1,67),new ItemStack(ItemList.Hull_Bronze.getItem(),1,67)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,89), new Object[] {"wurmchest","wurmstick", new ItemStack(ItemList.Hull_Bronze.getItem(),1,68),new ItemStack(ItemList.Hull_Bronze.getItem(),1,68)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,90), new Object[] {new ItemStack(TDDucts.fluidBasic.itemStack.getItem(),6,0), new ItemStack(ItemList.Hull_Bronze.getItem(),1,2000)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,91), new Object[] {new ItemStack(TDDucts.fluidBasic.itemStack.getItem(),6,0), new ItemStack(ItemList.Hull_Bronze.getItem(),1,1246)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,92), new Object[] {new ItemStack(TDDucts.fluidBasic.itemStack.getItem(),6,0), new ItemStack(ItemList.Hull_Bronze.getItem(),1,1366)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,93), new Object[] {new ItemStack(TDDucts.fluidBasic.itemStack.getItem(),6,0), new ItemStack(ItemList.Hull_Bronze.getItem(),1,1426)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,94), new Object[] {new ItemStack(TDDucts.fluidBasic.itemStack.getItem(),6,0), new ItemStack(ItemList.Hull_Bronze.getItem(),1,1526)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,95), new Object[] {new ItemStack(TDDucts.fluidBasic.itemStack.getItem(),6,0), ic2.api.item.IC2Items.getItem("glassFiberCableItem")}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,96), new Object[] {new ItemStack(TDDucts.fluidBasic.itemStack.getItem(),6,0), new ItemStack(ItemList.Hull_Bronze.getItem(),1,65),new ItemStack(ItemList.Hull_Bronze.getItem(),1,65)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,97), new Object[] {new ItemStack(TDDucts.fluidBasic.itemStack.getItem(),6,0), new ItemStack(ItemList.Hull_Bronze.getItem(),1,66), new ItemStack(ItemList.Hull_Bronze.getItem(),1,66)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,98), new Object[] {new ItemStack(TDDucts.fluidBasic.itemStack.getItem(),6,0), new ItemStack(ItemList.Hull_Bronze.getItem(),1,67),new ItemStack(ItemList.Hull_Bronze.getItem(),1,67)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,99), new Object[] {new ItemStack(TDDucts.fluidBasic.itemStack.getItem(),6,0), new ItemStack(ItemList.Hull_Bronze.getItem(),1,68),new ItemStack(ItemList.Hull_Bronze.getItem(),1,68)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,40), new Object[] {new ItemStack(TDDucts.energyBasic.itemStack.getItem(),1,0), new ItemStack(ItemList.Hull_Bronze.getItem(),1,2000)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,41), new Object[] {new ItemStack(TDDucts.energyBasic.itemStack.getItem(),1,0), new ItemStack(ItemList.Hull_Bronze.getItem(),1,1246)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,42), new Object[] {new ItemStack(TDDucts.energyBasic.itemStack.getItem(),1,0), new ItemStack(ItemList.Hull_Bronze.getItem(),1,1366)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,43), new Object[] {new ItemStack(TDDucts.energyBasic.itemStack.getItem(),1,0), new ItemStack(ItemList.Hull_Bronze.getItem(),1,1426)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,44), new Object[] {new ItemStack(TDDucts.energyBasic.itemStack.getItem(),1,0), new ItemStack(ItemList.Hull_Bronze.getItem(),1,1526)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,45), new Object[] {new ItemStack(TDDucts.energyBasic.itemStack.getItem(),1,0), ic2.api.item.IC2Items.getItem("glassFiberCableItem")}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,46), new Object[] {new ItemStack(TDDucts.energyBasic.itemStack.getItem(),1,0), new ItemStack(ItemList.Hull_Bronze.getItem(),1,65),new ItemStack(ItemList.Hull_Bronze.getItem(),1,65)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,47), new Object[] {new ItemStack(TDDucts.energyBasic.itemStack.getItem(),1,0), new ItemStack(ItemList.Hull_Bronze.getItem(),1,66), new ItemStack(ItemList.Hull_Bronze.getItem(),1,66)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,48), new Object[] {new ItemStack(TDDucts.energyBasic.itemStack.getItem(),1,0), new ItemStack(ItemList.Hull_Bronze.getItem(),1,67),new ItemStack(ItemList.Hull_Bronze.getItem(),1,67)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,49), new Object[] {new ItemStack(TDDucts.energyBasic.itemStack.getItem(),1,0), new ItemStack(ItemList.Hull_Bronze.getItem(),1,68),new ItemStack(ItemList.Hull_Bronze.getItem(),1,68)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,30), new Object[] {new ItemStack(TDDucts.energyBasic.itemStack.getItem(),1,0), new ItemStack(Items.redstone), new ItemStack(ItemList.Hull_Bronze.getItem(),1,2000)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,31), new Object[] {new ItemStack(TDDucts.energyBasic.itemStack.getItem(),1,0), new ItemStack(Items.redstone), new ItemStack(ItemList.Hull_Bronze.getItem(),1,1246)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,32), new Object[] {new ItemStack(TDDucts.energyBasic.itemStack.getItem(),1,0), new ItemStack(Items.redstone), new ItemStack(ItemList.Hull_Bronze.getItem(),1,1366)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,33), new Object[] {new ItemStack(TDDucts.energyBasic.itemStack.getItem(),1,0), new ItemStack(Items.redstone), new ItemStack(ItemList.Hull_Bronze.getItem(),1,1426)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,34), new Object[] {new ItemStack(TDDucts.energyBasic.itemStack.getItem(),1,0), new ItemStack(Items.redstone), new ItemStack(ItemList.Hull_Bronze.getItem(),1,1526)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,35), new Object[] {new ItemStack(TDDucts.energyBasic.itemStack.getItem(),1,0), new ItemStack(Items.redstone), ic2.api.item.IC2Items.getItem("glassFiberCableItem")}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,36), new Object[] {new ItemStack(TDDucts.energyBasic.itemStack.getItem(),1,0), new ItemStack(Items.redstone), new ItemStack(ItemList.Hull_Bronze.getItem(),1,65),new ItemStack(ItemList.Hull_Bronze.getItem(),1,65)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,37), new Object[] {new ItemStack(TDDucts.energyBasic.itemStack.getItem(),1,0), new ItemStack(Items.redstone), new ItemStack(ItemList.Hull_Bronze.getItem(),1,66), new ItemStack(ItemList.Hull_Bronze.getItem(),1,66)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,38), new Object[] {new ItemStack(TDDucts.energyBasic.itemStack.getItem(),1,0), new ItemStack(Items.redstone), new ItemStack(ItemList.Hull_Bronze.getItem(),1,67),new ItemStack(ItemList.Hull_Bronze.getItem(),1,67)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,39), new Object[] {new ItemStack(TDDucts.energyBasic.itemStack.getItem(),1,0), new ItemStack(Items.redstone), new ItemStack(ItemList.Hull_Bronze.getItem(),1,68),new ItemStack(ItemList.Hull_Bronze.getItem(),1,68)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,126), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,125),new ItemStack(ItemList.Hull_Bronze.getItem(),1,125)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,127), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,126),new ItemStack(ItemList.Hull_Bronze.getItem(),1,126)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,128), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,127),new ItemStack(ItemList.Hull_Bronze.getItem(),1,127)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,129), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,128),new ItemStack(ItemList.Hull_Bronze.getItem(),1,128)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,51), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,50),new ItemStack(ItemList.Hull_Bronze.getItem(),1,50)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,52), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,51),new ItemStack(ItemList.Hull_Bronze.getItem(),1,51)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,53), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,52),new ItemStack(ItemList.Hull_Bronze.getItem(),1,52)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,54), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,53),new ItemStack(ItemList.Hull_Bronze.getItem(),1,53)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,55), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,54),new ItemStack(ItemList.Hull_Bronze.getItem(),1,54)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,56), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,55),new ItemStack(ItemList.Hull_Bronze.getItem(),1,55)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,57), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,56),new ItemStack(ItemList.Hull_Bronze.getItem(),1,56)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,58), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,57),new ItemStack(ItemList.Hull_Bronze.getItem(),1,57)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,59), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,58),new ItemStack(ItemList.Hull_Bronze.getItem(),1,58)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,71), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,71),new ItemStack(ItemList.Hull_Bronze.getItem(),1,70)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,72), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,72),new ItemStack(ItemList.Hull_Bronze.getItem(),1,71)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,73), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,73),new ItemStack(ItemList.Hull_Bronze.getItem(),1,72)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,74), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,74),new ItemStack(ItemList.Hull_Bronze.getItem(),1,73)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,75), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,75),new ItemStack(ItemList.Hull_Bronze.getItem(),1,74)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,76), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,76),new ItemStack(ItemList.Hull_Bronze.getItem(),1,75)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,77), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,77),new ItemStack(ItemList.Hull_Bronze.getItem(),1,76)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,78), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,78),new ItemStack(ItemList.Hull_Bronze.getItem(),1,77)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,79), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,79),new ItemStack(ItemList.Hull_Bronze.getItem(),1,78)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,61), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,60),new ItemStack(ItemList.Hull_Bronze.getItem(),1,60)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,62), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,61),new ItemStack(ItemList.Hull_Bronze.getItem(),1,61)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,63), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,62),new ItemStack(ItemList.Hull_Bronze.getItem(),1,62)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,64), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,63),new ItemStack(ItemList.Hull_Bronze.getItem(),1,63)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,65), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,64),new ItemStack(ItemList.Hull_Bronze.getItem(),1,64)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,66), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,65),new ItemStack(ItemList.Hull_Bronze.getItem(),1,65)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,67), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,66),new ItemStack(ItemList.Hull_Bronze.getItem(),1,66)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,68), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,67),new ItemStack(ItemList.Hull_Bronze.getItem(),1,67)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,69), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,68),new ItemStack(ItemList.Hull_Bronze.getItem(),1,68)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,81), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,80),new ItemStack(ItemList.Hull_Bronze.getItem(),1,80)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,82), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,81),new ItemStack(ItemList.Hull_Bronze.getItem(),1,81)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,83), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,82),new ItemStack(ItemList.Hull_Bronze.getItem(),1,82)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,84), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,83),new ItemStack(ItemList.Hull_Bronze.getItem(),1,83)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,85), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,84),new ItemStack(ItemList.Hull_Bronze.getItem(),1,84)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,86), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,85),new ItemStack(ItemList.Hull_Bronze.getItem(),1,85)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,87), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,86),new ItemStack(ItemList.Hull_Bronze.getItem(),1,86)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,88), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,87),new ItemStack(ItemList.Hull_Bronze.getItem(),1,87)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,89), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,88),new ItemStack(ItemList.Hull_Bronze.getItem(),1,88)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),2,1220), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1221)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1221), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1220),new ItemStack(ItemList.Hull_Bronze.getItem(),1,1220)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),2,1221), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1222)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1222), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1221),new ItemStack(ItemList.Hull_Bronze.getItem(),1,1221)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),2,1222), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1223)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1223), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1222),new ItemStack(ItemList.Hull_Bronze.getItem(),1,1222)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),2,1223), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1224)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1224), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1223),new ItemStack(ItemList.Hull_Bronze.getItem(),1,1223)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),2,1224), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1225)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1225), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1224),new ItemStack(ItemList.Hull_Bronze.getItem(),1,1224)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1226), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1220), "ingotRubber"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1227), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1221), "ingotRubber"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1228), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1222), "ingotRubber"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1229), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1223), "ingotRubber"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1230), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1224), "ingotRubber"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),2,1240), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1241)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1241), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1240),new ItemStack(ItemList.Hull_Bronze.getItem(),1,1240)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),2,1241), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1242)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1242), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1241),new ItemStack(ItemList.Hull_Bronze.getItem(),1,1241)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),2,1242), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1243)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1243), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1242),new ItemStack(ItemList.Hull_Bronze.getItem(),1,1242)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),2,1243), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1244)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1244), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1243),new ItemStack(ItemList.Hull_Bronze.getItem(),1,1243)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),2,1244), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1245)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1245), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1244),new ItemStack(ItemList.Hull_Bronze.getItem(),1,1244)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1246), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1240), "ingotRubber"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1247), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1241), "ingotRubber"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1248), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1242), "ingotRubber"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1249), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1243), "ingotRubber"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1250), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1244), "ingotRubber"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),2,1260), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1261)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1261), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1260),new ItemStack(ItemList.Hull_Bronze.getItem(),1,1260)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),2,1261), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1262)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1262), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1261),new ItemStack(ItemList.Hull_Bronze.getItem(),1,1261)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),2,1262), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1263)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1263), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1262),new ItemStack(ItemList.Hull_Bronze.getItem(),1,1262)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),2,1263), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1264)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1264), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1263),new ItemStack(ItemList.Hull_Bronze.getItem(),1,1263)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),2,1264), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1265)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1265), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1264),new ItemStack(ItemList.Hull_Bronze.getItem(),1,1264)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1266), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1260), "ingotRubber"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1267), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1261), "ingotRubber"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1268), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1262), "ingotRubber"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1269), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1263), "ingotRubber"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1270), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1264), "ingotRubber"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),2,1300), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1301)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1301), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1300),new ItemStack(ItemList.Hull_Bronze.getItem(),1,1300)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),2,1301), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1302)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1302), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1301),new ItemStack(ItemList.Hull_Bronze.getItem(),1,1301)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),2,1302), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1303)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1303), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1302),new ItemStack(ItemList.Hull_Bronze.getItem(),1,1302)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),2,1303), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1304)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1304), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1303),new ItemStack(ItemList.Hull_Bronze.getItem(),1,1303)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),2,1304), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1305)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1305), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1304),new ItemStack(ItemList.Hull_Bronze.getItem(),1,1304)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1306), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1300), "ingotRubber"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1307), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1301), "ingotRubber"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1308), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1302), "ingotRubber"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1309), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1303), "ingotRubber"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1310), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1304), "ingotRubber"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),2,1320), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1321)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1321), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1320),new ItemStack(ItemList.Hull_Bronze.getItem(),1,1320)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),2,1321), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1322)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1322), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1321),new ItemStack(ItemList.Hull_Bronze.getItem(),1,1321)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),2,1322), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1323)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1323), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1322),new ItemStack(ItemList.Hull_Bronze.getItem(),1,1322)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),2,1323), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1324)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1324), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1323),new ItemStack(ItemList.Hull_Bronze.getItem(),1,1323)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),2,1324), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1325)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1325), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1324),new ItemStack(ItemList.Hull_Bronze.getItem(),1,1324)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1326), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1320), "ingotRubber"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1327), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1321), "ingotRubber"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1328), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1322), "ingotRubber"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1329), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1323), "ingotRubber"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1330), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1324), "ingotRubber"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),2,1320), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1321)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1321), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1320),new ItemStack(ItemList.Hull_Bronze.getItem(),1,1320)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),2,1321), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1322)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1322), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1321),new ItemStack(ItemList.Hull_Bronze.getItem(),1,1321)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),2,1322), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1323)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1323), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1322),new ItemStack(ItemList.Hull_Bronze.getItem(),1,1322)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),2,1323), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1324)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1324), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1323),new ItemStack(ItemList.Hull_Bronze.getItem(),1,1323)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),2,1324), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1325)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1325), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1324),new ItemStack(ItemList.Hull_Bronze.getItem(),1,1324)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1326), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1320), "ingotRubber"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1327), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1321), "ingotRubber"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1328), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1322), "ingotRubber"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1329), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1323), "ingotRubber"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1330), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1324), "ingotRubber"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),2,1360), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1361)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1361), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1360),new ItemStack(ItemList.Hull_Bronze.getItem(),1,1360)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),2,1361), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1362)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1362), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1361),new ItemStack(ItemList.Hull_Bronze.getItem(),1,1361)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),2,1362), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1363)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1363), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1362),new ItemStack(ItemList.Hull_Bronze.getItem(),1,1362)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),2,1363), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1364)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1364), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1363),new ItemStack(ItemList.Hull_Bronze.getItem(),1,1363)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),2,1364), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1365)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1365), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1364),new ItemStack(ItemList.Hull_Bronze.getItem(),1,1364)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1366), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1360), "ingotRubber"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1367), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1361), "ingotRubber"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1368), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1362), "ingotRubber"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1369), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1363), "ingotRubber"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1370), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1364), "ingotRubber"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),2,1420), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1421)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1421), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1420),new ItemStack(ItemList.Hull_Bronze.getItem(),1,1420)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),2,1421), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1422)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1422), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1421),new ItemStack(ItemList.Hull_Bronze.getItem(),1,1421)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),2,1422), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1423)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1423), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1422),new ItemStack(ItemList.Hull_Bronze.getItem(),1,1422)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),2,1423), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1424)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1424), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1423),new ItemStack(ItemList.Hull_Bronze.getItem(),1,1423)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),2,1424), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1425)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1425), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1424),new ItemStack(ItemList.Hull_Bronze.getItem(),1,1424)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1426), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1420), "ingotRubber"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1427), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1421), "ingotRubber"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1428), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1422), "ingotRubber"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1429), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1423), "ingotRubber"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1420), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1424), "ingotRubber"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),2,1460), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1461)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1461), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1460),new ItemStack(ItemList.Hull_Bronze.getItem(),1,1460)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),2,1461), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1462)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1462), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1461),new ItemStack(ItemList.Hull_Bronze.getItem(),1,1461)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),2,1462), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1463)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1463), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1462),new ItemStack(ItemList.Hull_Bronze.getItem(),1,1462)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),2,1463), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1464)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1464), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1463),new ItemStack(ItemList.Hull_Bronze.getItem(),1,1463)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),2,1464), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1465)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1465), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1464),new ItemStack(ItemList.Hull_Bronze.getItem(),1,1464)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1466), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1460), "ingotRubber"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1467), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1461), "ingotRubber"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1468), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1462), "ingotRubber"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1469), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1463), "ingotRubber"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1470), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1464), "ingotRubber"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),2,1520), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1521)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1521), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1520),new ItemStack(ItemList.Hull_Bronze.getItem(),1,1520)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),2,1521), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1522)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1522), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1521),new ItemStack(ItemList.Hull_Bronze.getItem(),1,1521)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),2,1522), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1523)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1523), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1522),new ItemStack(ItemList.Hull_Bronze.getItem(),1,1522)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),2,1523), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1524)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1524), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1523),new ItemStack(ItemList.Hull_Bronze.getItem(),1,1523)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),2,1524), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1525)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1525), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1524),new ItemStack(ItemList.Hull_Bronze.getItem(),1,1524)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1526), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1520), "ingotRubber"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1527), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1521), "ingotRubber"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1528), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1522), "ingotRubber"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1529), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1523), "ingotRubber"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1530), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1524), "ingotRubber"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),2,1640), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1641)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1641), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1640),new ItemStack(ItemList.Hull_Bronze.getItem(),1,1640)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),2,1641), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1642)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1642), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1641),new ItemStack(ItemList.Hull_Bronze.getItem(),1,1641)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),2,1642), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1643)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1643), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1642),new ItemStack(ItemList.Hull_Bronze.getItem(),1,1642)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),2,1643), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1644)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1644), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1643),new ItemStack(ItemList.Hull_Bronze.getItem(),1,1643)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),2,1644), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1645)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1645), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1644),new ItemStack(ItemList.Hull_Bronze.getItem(),1,1644)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1646), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1640), "ingotRubber"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1647), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1641), "ingotRubber"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1648), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1642), "ingotRubber"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1649), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1643), "ingotRubber"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,1650), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,1644), "ingotRubber"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),2,2000), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,2001)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,2001), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,2000),new ItemStack(ItemList.Hull_Bronze.getItem(),1,2000)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),2,2001), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,2002)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,2002), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,2001),new ItemStack(ItemList.Hull_Bronze.getItem(),1,2001)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),2,2002), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,2003)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,2003), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,2002),new ItemStack(ItemList.Hull_Bronze.getItem(),1,2002)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),2,2003), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,2004)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,2004), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,2004),new ItemStack(ItemList.Hull_Bronze.getItem(),1,2003)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),2,2004), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,2005)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,2005), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,2004),new ItemStack(ItemList.Hull_Bronze.getItem(),1,2004)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,2006), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,2000), "ingotRubber"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,2007), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,2001), "ingotRubber"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,2008), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,2002), "ingotRubber"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,2009), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,2003), "ingotRubber"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,2010), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,2004), "ingotRubber"}));
	
	}
	
	// Register TFC Shapeless Recipes
	public static void addTFCRecipes() {
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(TFCItems.WoolYarn, 8), new Object[]{ TFCItems.Wool, new ItemStack(TFCItems.Spindle, 1, Wild) }));
		GameRegistry.addShapelessRecipe(new ItemStack(TFCItems.BismuthIngot, 1, 0), new Object[] {new ItemStack(tweaks.wurm.items.ModItems.BismuthUnshaped.setContainerItem(tweaks.wurm.items.ModItems.WurmMold), 1)});
		GameRegistry.addShapelessRecipe(new ItemStack(TFCItems.BismuthBronzeIngot, 1, 0), new Object[] {new ItemStack(tweaks.wurm.items.ModItems.BismuthBronzeUnshaped.setContainerItem(tweaks.wurm.items.ModItems.WurmMold), 1)});
		GameRegistry.addShapelessRecipe(new ItemStack(TFCItems.BlackBronzeIngot, 1, 0), new Object[] {new ItemStack(tweaks.wurm.items.ModItems.BlackBronzeUnshaped.setContainerItem(tweaks.wurm.items.ModItems.WurmMold), 1)});
		GameRegistry.addShapelessRecipe(new ItemStack(TFCItems.BlackSteelIngot, 1, 0), new Object[] {new ItemStack(tweaks.wurm.items.ModItems.BlackSteelUnshaped.setContainerItem(tweaks.wurm.items.ModItems.WurmMold), 1)});
		GameRegistry.addShapelessRecipe(new ItemStack(TFCItems.BlueSteelIngot, 1, 0), new Object[] {new ItemStack(tweaks.wurm.items.ModItems.BlueSteelUnshaped.setContainerItem(tweaks.wurm.items.ModItems.WurmMold), 1)});
		GameRegistry.addShapelessRecipe(new ItemStack(TFCItems.BrassIngot, 1, 0), new Object[] {new ItemStack(tweaks.wurm.items.ModItems.BrassUnshaped.setContainerItem(tweaks.wurm.items.ModItems.WurmMold), 1)});
		GameRegistry.addShapelessRecipe(new ItemStack(TFCItems.BronzeIngot, 1, 0), new Object[] {new ItemStack(tweaks.wurm.items.ModItems.BronzeUnshaped.setContainerItem(tweaks.wurm.items.ModItems.WurmMold), 1)});
		GameRegistry.addShapelessRecipe(new ItemStack(TFCItems.CopperIngot, 1, 0), new Object[] {new ItemStack(tweaks.wurm.items.ModItems.CopperUnshaped.setContainerItem(tweaks.wurm.items.ModItems.WurmMold), 1)});
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.Hull_Bronze.getItem(),1,129), new Object[] {new ItemStack(ItemList.Hull_Bronze.getItem(),1,128),new ItemStack(ItemList.Hull_Bronze.getItem(),1,128)}));
		GameRegistry.addShapelessRecipe(new ItemStack(TFCItems.GoldIngot, 1, 0), new Object[] {new ItemStack(tweaks.wurm.items.ModItems.GoldUnshaped.setContainerItem(tweaks.wurm.items.ModItems.WurmMold), 1)});
		GameRegistry.addShapelessRecipe(new ItemStack(TFCItems.WroughtIronIngot, 1, 0), new Object[] {new ItemStack(tweaks.wurm.items.ModItems.WroughtIronUnshaped.setContainerItem(tweaks.wurm.items.ModItems.WurmMold), 1)});
		GameRegistry.addShapelessRecipe(new ItemStack(TFCItems.LeadIngot, 1, 0), new Object[] {new ItemStack(tweaks.wurm.items.ModItems.LeadUnshaped.setContainerItem(tweaks.wurm.items.ModItems.WurmMold), 1)});
		GameRegistry.addShapelessRecipe(new ItemStack(TFCItems.NickelIngot, 1, 0), new Object[] {new ItemStack(tweaks.wurm.items.ModItems.NickelUnshaped.setContainerItem(tweaks.wurm.items.ModItems.WurmMold), 1)});
		GameRegistry.addShapelessRecipe(new ItemStack(TFCItems.PigIronIngot, 1, 0), new Object[] {new ItemStack(tweaks.wurm.items.ModItems.PigIronUnshaped.setContainerItem(tweaks.wurm.items.ModItems.WurmMold), 1)});
		GameRegistry.addShapelessRecipe(new ItemStack(TFCItems.PlatinumIngot, 1, 0), new Object[] {new ItemStack(tweaks.wurm.items.ModItems.PlatinumUnshaped.setContainerItem(tweaks.wurm.items.ModItems.WurmMold), 1)});
		GameRegistry.addShapelessRecipe(new ItemStack(TFCItems.RedSteelIngot, 1, 0), new Object[] {new ItemStack(tweaks.wurm.items.ModItems.RedSteelUnshaped.setContainerItem(tweaks.wurm.items.ModItems.WurmMold), 1)});
		GameRegistry.addShapelessRecipe(new ItemStack(TFCItems.RoseGoldIngot, 1, 0), new Object[] {new ItemStack(tweaks.wurm.items.ModItems.RoseGoldUnshaped.setContainerItem(tweaks.wurm.items.ModItems.WurmMold), 1)});
		GameRegistry.addShapelessRecipe(new ItemStack(TFCItems.SilverIngot, 1, 0), new Object[] {new ItemStack(tweaks.wurm.items.ModItems.SilverUnshaped.setContainerItem(tweaks.wurm.items.ModItems.WurmMold), 1)});
		GameRegistry.addShapelessRecipe(new ItemStack(TFCItems.SteelIngot, 1, 0), new Object[] {new ItemStack(tweaks.wurm.items.ModItems.SteelUnshaped.setContainerItem(tweaks.wurm.items.ModItems.WurmMold), 1)});
		GameRegistry.addShapelessRecipe(new ItemStack(TFCItems.SterlingSilverIngot, 1, 0), new Object[] {new ItemStack(tweaks.wurm.items.ModItems.SterlingSilverUnshaped.setContainerItem(tweaks.wurm.items.ModItems.WurmMold), 1)});
		GameRegistry.addShapelessRecipe(new ItemStack(TFCItems.TinIngot, 1, 0), new Object[] {new ItemStack(tweaks.wurm.items.ModItems.TinUnshaped.setContainerItem(tweaks.wurm.items.ModItems.WurmMold), 1)});
		GameRegistry.addShapelessRecipe(new ItemStack(TFCItems.ZincIngot, 1, 0), new Object[] {new ItemStack(tweaks.wurm.items.ModItems.ZincUnshaped.setContainerItem(tweaks.wurm.items.ModItems.WurmMold), 1)});
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(TFCItems.Coal,1,1), new Object[] {new ItemStack(Items.coal,1,1)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.coal,1,1), new Object[] {new ItemStack(TFCItems.Coal,1,1)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(TFCBlocks.LitPumpkin,1,0),new Object[] {TFCBlocks.Pumpkin, TFCBlocks.Torch}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(TFCItems.FlintSteel),new Object[] {"wurmsteel", Items.flint}));
		
	}
}