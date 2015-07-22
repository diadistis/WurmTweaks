package tweaks.wurm.crafting.thaumcraft;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.common.config.ConfigBlocks;
import thaumcraft.common.config.ConfigItems;
import thaumicenergistics.api.ThEApi;
import thaumicenergistics.registries.ResearchRegistry;
import tweaks.wurm.utils.tfc.TFCFood;
import tweaks.wurm.utils.thaumcraft.ArcaneRecipe;
import tweaks.wurm.utils.thaumcraft.Research;
import am2.items.ItemsCommonProxy;
import appeng.api.AEApi;
import codechicken.enderstorage.EnderStorage;

import com.bioxx.tfc.api.TFCBlocks;
import com.bioxx.tfc.api.TFCItems;
import com.brandon3055.draconicevolution.common.ModItems;
import com.rwtema.extrautils.ExtraUtils;

import cpw.mods.fml.common.registry.GameRegistry;

public class ArcaneThaumcraft {
	
	public static void addRecipes() {
		
		ArcaneRecipe.addShaped("DECONSTRUCTOR", new ItemStack(ConfigBlocks.blockTable,1,14), new AspectList().add(Aspect.ENTROPY,25),new Object[] {" S ", "PTA", "   ", Character.valueOf('S'), new ItemStack(ConfigItems.itemThaumometer,1,0), Character.valueOf('P'), new ItemStack(TFCItems.BlueSteelPick), Character.valueOf('T'), new ItemStack(ConfigBlocks.blockTable,1,0), Character.valueOf('A'), new ItemStack(TFCItems.RedSteelAxe)});
		ArcaneRecipe.addShaped("CAP_thaumium", new ItemStack(ConfigItems.itemWandCap,1,6), new AspectList().add(Aspect.ORDER,10).add(Aspect.FIRE,10).add(Aspect.AIR,10),new Object[] {"TTT", "T T", Character.valueOf('T'), new ItemStack(ConfigItems.itemResource,1,2)});
		ArcaneRecipe.addShaped("CAP_gold", new ItemStack(ConfigItems.itemWandCap,1,1), new AspectList().add(Aspect.ORDER,10).add(Aspect.FIRE,10).add(Aspect.AIR,10),new Object[] {"TTT", "T T", Character.valueOf('T'), new ItemStack(TFCItems.GoldIngot)});
		ArcaneRecipe.addShaped("CAP_silver", new ItemStack(ConfigItems.itemWandCap,1,5), new AspectList().add(Aspect.ORDER,10).add(Aspect.FIRE,10).add(Aspect.AIR,10),new Object[] {"TTT", "T T", Character.valueOf('T'), new ItemStack(TFCItems.SilverIngot)});
		ArcaneRecipe.addShaped("CAP_copper", new ItemStack(ConfigItems.itemWandCap,1,3), new AspectList().add(Aspect.ORDER,10).add(Aspect.FIRE,10).add(Aspect.AIR,10),new Object[] {"TTT", "T T", Character.valueOf('T'), new ItemStack(TFCItems.CopperIngot)});
		ArcaneRecipe.addShaped("FOCUSPOUCH", new ItemStack(ConfigItems.itemFocusPouch), new AspectList().add(Aspect.FIRE,10).add(Aspect.ORDER,10).add(Aspect.AIR,10).add(Aspect.EARTH,10).add(Aspect.ENTROPY,10), new Object[] {"LXL", "LCL", "LLL",Character.valueOf('L'), TFCItems.Leather, Character.valueOf('C'), tweaks.wurm.items.ModItems.MixedSheet, Character.valueOf('X'), TFCItems.PlatinumSheet2x });
		ArcaneRecipe.addShaped("FOCUSFIRE", new ItemStack(ConfigItems.itemFocusFire), new AspectList().add(Aspect.FIRE,25), new Object[] {"XAX", "ACA", "XAX", Character.valueOf('X'), Items.blaze_rod, Character.valueOf('A'), Items.quartz, Character.valueOf('C'), tweaks.wurm.items.ModItems.CraftingCore});
		ArcaneRecipe.addShaped("FOCUSEXCAVATION", new ItemStack(ConfigItems.itemFocusExcavation), new AspectList().add(Aspect.EARTH,25), new Object[] {"XAX", "ACA", "XAX", Character.valueOf('X'), TFCBlocks.Dirt, Character.valueOf('A'), Items.quartz, Character.valueOf('C'), tweaks.wurm.items.ModItems.CraftingCore});
		ArcaneRecipe.addShaped("FOCUSSHOCK", new ItemStack(ConfigItems.itemFocusShock), new AspectList().add(Aspect.ORDER,25), new Object[] {"XAX", "ACA", "XAX", Character.valueOf('X'), ModItems.draconicEnergyCore, Character.valueOf('A'), Items.quartz, Character.valueOf('C'), tweaks.wurm.items.ModItems.CraftingCore});
		ArcaneRecipe.addShaped("FOCUSTRADE", new ItemStack(ConfigItems.itemFocusTrade), new AspectList().add(Aspect.ORDER,25), new Object[] {"XAX", "ACA", "XAX", Character.valueOf('X'), TFCFood.getFood(TFCItems.beefRaw, 160f), Character.valueOf('A'), Items.quartz, Character.valueOf('C'), tweaks.wurm.items.ModItems.CraftingCore});
		ArcaneRecipe.addShaped("FOCUSFROST", new ItemStack(ConfigItems.itemFocusFrost), new AspectList().add(Aspect.ORDER,25), new Object[] {"XAX", "ACA", "XAX", Character.valueOf('X'), TFCItems.RedSteelBucketSaltWater, Character.valueOf('A'), Items.quartz, Character.valueOf('C'), tweaks.wurm.items.ModItems.CraftingCore});
		ArcaneRecipe.addShaped("NODESTABILIZER", new ItemStack(ConfigBlocks.blockStoneDevice,1,9), new AspectList().add(Aspect.ENTROPY,20), new Object[] {" G ", "SBS", "BNB", Character.valueOf('G'), tweaks.wurm.items.ModItems.MixedSheet, Character.valueOf('B'), tweaks.wurm.items.ModBlocks.BlueSteelBlock, Character.valueOf('S'), tweaks.wurm.items.ModItems.MixedSheet, Character.valueOf('N'), new ItemStack(ConfigItems.itemResource,1,1)});
		ArcaneRecipe.addShaped("VISCHARGERELAY", new ItemStack(ConfigBlocks.blockMetalDevice,1,2), new AspectList().add(Aspect.AIR,50).add(Aspect.EARTH,50), new Object[] {" R ", "S S", "I I", Character.valueOf('R'), new ItemStack(ConfigBlocks.blockMetalDevice,1,14), Character.valueOf('S'), new ItemStack(ConfigItems.itemWandRod,1,2), Character.valueOf('I'), tweaks.wurm.items.ModBlocks.BronzeBlock});
		ArcaneRecipe.addShaped("VISPOWER", new ItemStack(ConfigBlocks.blockStoneDevice,1,11), new AspectList().add(Aspect.AIR,100).add(Aspect.EARTH,100).add(Aspect.ORDER,100).add(Aspect.EARTH,100).add(Aspect.AIR,100), new Object[] {"RSR", "SXS", "RSR", Character.valueOf('R'), tweaks.wurm.items.ModBlocks.CompressedRedstoneBlock, Character.valueOf('S'), tweaks.wurm.items.ModItems.MixedSheet, Character.valueOf('X'), new ItemStack(ConfigBlocks.blockStoneDevice,1,9)});
		ArcaneRecipe.addShaped("VISPOWER", new ItemStack(ConfigBlocks.blockMetalDevice,1,14), new AspectList().add(Aspect.AIR,50), new Object[] {" S ", "SIS", " S ", Character.valueOf('S'), tweaks.wurm.items.ModItems.MixedSheet, Character.valueOf('I'), tweaks.wurm.items.ModItems.CraftingCore});
		ArcaneRecipe.addShaped("FOCALMANIPULATION", new ItemStack(ConfigBlocks.blockStoneDevice,1,13), new AspectList().add(Aspect.AIR,10), new Object[] {"SSS", "XCX", "BBB", Character.valueOf('S'), tweaks.wurm.items.ModItems.MixedSheet, Character.valueOf('X'), tweaks.wurm.items.ModItems.CraftingCore, Character.valueOf('C'), new ItemStack(ConfigItems.itemResource,1,15), Character.valueOf('B'), tweaks.wurm.items.ModBlocks.BlueSteelBlock});
		ArcaneRecipe.addShaped("DISTILESSENTIA", new ItemStack(ConfigItems.itemResource,1,8), new AspectList().add(Aspect.ORDER,10).add(Aspect.AIR,10), new Object[] {"GLG", Character.valueOf('G'), new ItemStack(TFCItems.PlatinumSheet), Character.valueOf('L'), new ItemStack(ConfigBlocks.blockWoodenDevice,1,7)});
		ArcaneRecipe.addShaped("DISTILESSENTIA", new ItemStack(ConfigBlocks.blockMetalDevice,1,1), new AspectList().add(Aspect.ORDER,20), new Object[] {"FII", "IBI", "I I", Character.valueOf('F'), new ItemStack(ConfigItems.itemResource,1,8), Character.valueOf('I'), tweaks.wurm.items.ModItems.MixedSheet, Character.valueOf('B'), Items.bucket});
		ArcaneRecipe.addShaped("DISTILESSENTIA", new ItemStack(ConfigBlocks.blockMetalDevice,1,9),new AspectList().add(Aspect.AIR,20), new Object[] {"SXS", "XCX", "SXS", Character.valueOf('S'), tweaks.wurm.items.ModItems.MixedSheet, Character.valueOf('X'), TFCItems.BlueSteelSheet2x, Character.valueOf('C'), new ItemStack(ConfigBlocks.blockMagicalLog,1,0)});
		ArcaneRecipe.addShaped("TUBEFILTER", new ItemStack(ConfigBlocks.blockTube,1,5), new AspectList().add(Aspect.AIR,20), new Object[] {"BS", Character.valueOf('B'),new ItemStack(ConfigBlocks.blockTube,1,0),Character.valueOf('S'), TFCBlocks.StoneMMSmooth});
		ArcaneRecipe.addShaped("TUBEFILTER", new ItemStack(ConfigBlocks.blockTube,1,3), new AspectList().add(Aspect.AIR,20), new Object[] {"BS", Character.valueOf('B'), new ItemStack(ConfigBlocks.blockTube,1,0),Character.valueOf('S'), new ItemStack(ConfigItems.itemResource,1,8)});
		ArcaneRecipe.addShaped("TUBEFILTER", new ItemStack(ConfigBlocks.blockTube,1,6), new AspectList().add(Aspect.AIR,20), new Object[] {"BS", Character.valueOf('B'),new ItemStack(ConfigBlocks.blockTube,1,0),Character.valueOf('S'), TFCItems.Dye});
		ArcaneRecipe.addShaped("TUBES", new ItemStack(ConfigBlocks.blockTube,3,0), new AspectList().add(Aspect.WATER,10), new Object[] {"IGI", Character.valueOf('I'), new ItemStack(TFCItems.RedSteelSheet), Character.valueOf('G'), Blocks.glass});
		ArcaneRecipe.addShaped("TUBES", new ItemStack(ConfigItems.itemResonator,1,0), new AspectList().add(Aspect.AIR,5), new Object[] {"I I", "III", " I ", Character.valueOf('I'), new ItemStack(tweaks.wurm.items.ModItems.MixedSheet)});
		ArcaneRecipe.addShaped("BELLOWS", new ItemStack(ConfigBlocks.blockWoodenDevice,1,0), new AspectList().add(Aspect.AIR,10).add(Aspect.EARTH,10), new Object[] {"SXS", "XCX", "SXS", Character.valueOf('S'), new ItemStack(tweaks.wurm.items.ModItems.MixedSheet), Character.valueOf('X'), new ItemStack(TFCItems.RedSteelSheet), Character.valueOf('C'), TFCBlocks.Bellows});
		ArcaneRecipe.addShaped("LEVITATOR", new ItemStack(ConfigBlocks.blockLifter), new AspectList().add(Aspect.AIR,20), new Object[] {"BXB", "XCX", "BXB", Character.valueOf('B'), new ItemStack(ConfigBlocks.blockMagicalLog), Character.valueOf('X'), tweaks.wurm.items.ModItems.MixedSheet, Character.valueOf('C'), Items.feather});
		ArcaneRecipe.addShaped("BASICARTIFACE", new ItemStack(ConfigItems.itemResource,1,15), new AspectList().add(Aspect.EARTH,25).add(Aspect.AIR,25).add(Aspect.WATER,25).add(Aspect.ENTROPY,25).add(Aspect.ORDER,25), new Object[] {"ABC", "XHX", "CBA", Character.valueOf('A'), new ItemStack(ItemsCommonProxy.essence,1,0), Character.valueOf('B'), new ItemStack(ItemsCommonProxy.essence,1,10), Character.valueOf('C'), new ItemStack(ItemsCommonProxy.essence,1,9), Character.valueOf('X'), new ItemStack(TFCItems.OreChunk,1,24),Character.valueOf('H'), ConfigItems.itemEssence });
		ArcaneRecipe.addShaped("BASICARTIFACE", new ItemStack(ConfigItems.itemBaubleBlanks,1,0), new AspectList().add(Aspect.AIR,5), new Object[] {" S ", "S S", " G ",Character.valueOf('S'), TFCItems.SilkCloth, Character.valueOf('G'), new ItemStack(TFCItems.RedSteelSheet2x)});
		ArcaneRecipe.addShaped("BASICARTIFACE", new ItemStack(ConfigItems.itemBaubleBlanks,1,1), new AspectList().add(Aspect.AIR,5), new Object[] {" S ", "S S", " G ",Character.valueOf('S'), TFCItems.SilkCloth, Character.valueOf('G'), new ItemStack(TFCItems.SilkCloth)});
		ArcaneRecipe.addShaped("BASICARTIFACE", new ItemStack(ConfigItems.itemBaubleBlanks,1,2), new AspectList().add(Aspect.AIR,5), new Object[] {" S ", "S S", " G ",Character.valueOf('S'), TFCItems.RedSteelSheet, Character.valueOf('G'), new ItemStack(TFCItems.BlueSteelSheet2x)});
		ArcaneRecipe.addShaped("BASICARTIFACE", new ItemStack(ConfigItems.itemResource,1,10), new AspectList().add(Aspect.EARTH,10), new Object[] {"GS", Character.valueOf('G'), Blocks.glass, Character.valueOf('S'), TFCItems.SilverSheet});
		ArcaneRecipe.addShaped("INFUSION", new ItemStack(ConfigBlocks.blockStoneDevice,1,2), new AspectList().add(Aspect.ORDER,50), new Object[] {"AXA", "XCX", "AXA", Character.valueOf('A'), tweaks.wurm.items.ModItems.MixedSheet, Character.valueOf('X'), tweaks.wurm.items.ModItems.CraftingCore, Character.valueOf('C'), tweaks.wurm.items.ModBlocks.BlueSteelBlock});
		ArcaneRecipe.addShaped("GOGGLES", new ItemStack(ConfigItems.itemGoggles,1,0), new AspectList().add(Aspect.AIR,5).add(Aspect.EARTH,5).add(Aspect.ENTROPY,5), new Object[] {"LGL", "L L", "XAX", Character.valueOf('L'), new ItemStack(tweaks.wurm.items.ModItems.MixedSheet), Character.valueOf('G'), new ItemStack(tweaks.wurm.items.ModItems.CraftingCore), Character.valueOf('X'), new ItemStack(ConfigItems.itemThaumometer), Character.valueOf('A'), TFCItems.PlatinumSheet2x});
		ArcaneRecipe.addShaped("ARCANEEAR", new ItemStack(ConfigBlocks.blockWoodenDevice,1,1), new AspectList().add(Aspect.EARTH,20).add(Aspect.ENTROPY,20), new Object[] {"ISI", "ISI", "BBB",Character.valueOf('I'), tweaks.wurm.items.ModItems.MixedSheet, Character.valueOf('S'), new ItemStack(tweaks.wurm.items.ModItems.Zircon), Character.valueOf('B'), tweaks.wurm.items.ModBlocks.BlueSteelBlock});
		ArcaneRecipe.addShaped("ARCANESTONE", new ItemStack(ConfigBlocks.blockCosmeticSolid,4,6),new AspectList().add(Aspect.EARTH,2).add(Aspect.AIR,2), new Object[] {"SSS", "SXS", "SSS", Character.valueOf('S'), TFCBlocks.StoneIgInSmooth, Character.valueOf('X'), tweaks.wurm.items.ModItems.MixedSheet});
		ArcaneRecipe.addShaped("FOCUSPRIMAL", new ItemStack(ConfigItems.itemFocusPrimal),new AspectList().add(Aspect.EARTH,50).add(Aspect.AIR,50).add(Aspect.FIRE,50).add(Aspect.WATER,50).add(Aspect.ENTROPY,50), new Object[] {"XAX", "ACA", "XAX",Character.valueOf('X'), new ItemStack(tweaks.wurm.items.ModItems.MixedSheet), Character.valueOf('A'), new ItemStack(tweaks.wurm.items.ModBlocks.RedSteelBlock), Character.valueOf('C'), ConfigItems.itemEssence});
		ArcaneRecipe.addShaped(ResearchRegistry.ResearchTypes.IO.getKey(), new ItemStack(ThEApi.instance().parts().Essentia_ImportBus.getItem()), new AspectList().add(Aspect.ORDER,25), new Object[] {"JXJ", "IPI", Character.valueOf('J'), new ItemStack(ConfigBlocks.blockJar), Character.valueOf('X'), tweaks.wurm.items.ModItems.CraftingCore, Character.valueOf('I'), tweaks.wurm.items.ModItems.MixedSheet, Character.valueOf('P'), new ItemStack(ConfigBlocks.blockTube,1,3)});
		ArcaneRecipe.addShaped(ResearchRegistry.ResearchTypes.IO.getKey(), new ItemStack(ThEApi.instance().parts().Essentia_ExportBus.getItem()), new AspectList().add(Aspect.ORDER,25), new Object[] {"JXJ", "IPI", Character.valueOf('J'), new ItemStack(ConfigBlocks.blockJar), Character.valueOf('X'), tweaks.wurm.items.ModItems.QuantumSingularity, Character.valueOf('I'), tweaks.wurm.items.ModItems.MixedSheet, Character.valueOf('P'), new ItemStack(ConfigBlocks.blockTube,1,3)});
		ArcaneRecipe.addShaped(ResearchRegistry.ResearchTypes.IO.getKey(), new ItemStack(ThEApi.instance().parts().Essentia_StorageBus.getItem()), new AspectList().add(Aspect.ORDER,50), new Object[] {"JXJ", "IPI", Character.valueOf('J'), new ItemStack(ConfigBlocks.blockJar), Character.valueOf('X'), tweaks.wurm.items.ModItems.ElectroMagneticShielding, Character.valueOf('I'), tweaks.wurm.items.ModItems.MixedSheet, Character.valueOf('P'), new ItemStack(ConfigBlocks.blockTube,1,3)});
		ArcaneRecipe.addShaped(ResearchRegistry.ResearchTypes.ESSENTIATERMINAL.getKey(), new ItemStack(ThEApi.instance().parts().Essentia_ImportBus.getItem(),1,4), new AspectList().add(Aspect.ORDER,10).add(Aspect.EARTH,10).add(Aspect.WATER,10).add(Aspect.FIRE,10).add(Aspect.ENTROPY,10).add(Aspect.AIR,10), new Object[] {"CF", Character.valueOf('I'), new ItemStack(AEApi.instance().parts().partAnnihilationPlane.item(),1,360), Character.valueOf('F'), new ItemStack(ConfigItems.itemResource,1,8)});
		ArcaneRecipe.addShaped(ResearchRegistry.ResearchTypes.ARCANETERMINAL.getKey(), new ItemStack(ThEApi.instance().parts().Essentia_ImportBus.getItem(),1,5), new AspectList().add(Aspect.ORDER,10).add(Aspect.EARTH,10).add(Aspect.WATER,10).add(Aspect.FIRE,10).add(Aspect.ENTROPY,10).add(Aspect.AIR,10), new Object[] {"CF", Character.valueOf('I'), new ItemStack(AEApi.instance().parts().partAnnihilationPlane.item(),1,360), Character.valueOf('F'), new ItemStack(ConfigBlocks.blockTable,1,15)});
		ArcaneRecipe.addShaped(ResearchRegistry.ResearchTypes.VISINTERFACE.getKey(), new ItemStack(ThEApi.instance().parts().VisRelay_Interface.getItem(),1,6), new AspectList().add(Aspect.ORDER,10).add(Aspect.EARTH,10).add(Aspect.WATER,10).add(Aspect.FIRE,10).add(Aspect.ENTROPY,10).add(Aspect.AIR,10), new Object[] {"CF", Character.valueOf('I'), new ItemStack(AEApi.instance().parts().partAnnihilationPlane.item(),1,440), Character.valueOf('F'), new ItemStack(ConfigBlocks.blockTable,1,15)});
		ArcaneRecipe.addShaped(ResearchRegistry.ResearchTypes.KNOWLEDGEINSCRIBER.getKey(), new ItemStack(ThEApi.instance().items().KnowledgeCore.getItem()),new AspectList().add(Aspect.AIR,25).add(Aspect.EARTH,50).add(Aspect.WATER,75), new Object[] {"XAX", "ACA", "XAX", Character.valueOf('X'), tweaks.wurm.items.ModItems.CraftingCore, Character.valueOf('A'), new ItemStack(tweaks.wurm.items.ModItems.MixedSheet), Character.valueOf('C'), new ItemStack(TFCItems.RedSteelSheet)});
		ArcaneRecipe.addShaped(ResearchRegistry.ResearchTypes.KNOWLEDGEINSCRIBER.getKey(), new ItemStack(ThEApi.instance().blocks().KnowledgeInscriber.getBlock()), new AspectList().add(Aspect.AIR,100).add(Aspect.EARTH,100).add(Aspect.WATER,100).add(Aspect.FIRE,100).add(Aspect.ORDER,100).add(Aspect.ENTROPY,100), new Object[] {"ICI", " X ", "ICI", Character.valueOf('I'), tweaks.wurm.items.ModItems.MixedSheet, Character.valueOf('C'), tweaks.wurm.items.ModItems.CraftingCore, Character.valueOf('X'), tweaks.wurm.items.ModBlocks.RedSteelBlock});
		ArcaneRecipe.addShaped(ResearchRegistry.ResearchTypes.STORAGE.getKey(), ThEApi.instance().items().EssentiaStorageComponent_1k.getStack(), new AspectList().add(Aspect.FIRE,10).add(Aspect.ORDER,10), new Object[] {"SXS", "XBX", "SXS", Character.valueOf('S'), tweaks.wurm.items.ModItems.MixedSheet, Character.valueOf('X'), tweaks.wurm.items.ModItems.CraftingCore,Character.valueOf('B'), new ItemStack(ExtraUtils.cobblestoneCompr,1,7)});
		ArcaneRecipe.addShaped(ResearchRegistry.ResearchTypes.STORAGE.getKey(), ThEApi.instance().items().EssentiaStorageComponent_4k.getStack(), new AspectList().add(Aspect.FIRE,10).add(Aspect.ORDER,10), new Object[] {"SAS", "ABA", "SXS", Character.valueOf('A'), ThEApi.instance().items().EssentiaStorageComponent_1k.getStack(), Character.valueOf('S'), tweaks.wurm.items.ModItems.MixedSheet, Character.valueOf('X'), tweaks.wurm.items.ModItems.CraftingCore,Character.valueOf('B'), new ItemStack(ExtraUtils.cobblestoneCompr,1,7)});
		ArcaneRecipe.addShaped(ResearchRegistry.ResearchTypes.STORAGE.getKey(), ThEApi.instance().items().EssentiaStorageComponent_16k.getStack(), new AspectList().add(Aspect.FIRE,10).add(Aspect.ORDER,10), new Object[] {"SAS", "ABA", "SXS", Character.valueOf('A'), ThEApi.instance().items().EssentiaStorageComponent_4k.getStack(), Character.valueOf('S'), tweaks.wurm.items.ModItems.MixedSheet, Character.valueOf('X'), tweaks.wurm.items.ModItems.CraftingCore,Character.valueOf('B'), new ItemStack(ExtraUtils.cobblestoneCompr,1,7)});
		ArcaneRecipe.addShaped(ResearchRegistry.ResearchTypes.STORAGE.getKey(), ThEApi.instance().items().EssentiaStorageComponent_64k.getStack(), new AspectList().add(Aspect.FIRE,10).add(Aspect.ORDER,10), new Object[] {"SAS", "ABA", "SXS", Character.valueOf('A'), ThEApi.instance().items().EssentiaStorageComponent_16k.getStack(), Character.valueOf('S'), tweaks.wurm.items.ModItems.MixedSheet, Character.valueOf('X'), tweaks.wurm.items.ModItems.CraftingCore,Character.valueOf('B'), new ItemStack(ExtraUtils.cobblestoneCompr,1,7)});
		ArcaneRecipe.addShaped(ResearchRegistry.ResearchTypes.STORAGE.getKey(), ThEApi.instance().items().EssentiaStorageComponent_4k.getStack(), new AspectList().add(Aspect.FIRE,10).add(Aspect.ORDER,10), new Object[] {"SAS", "ABA", "SXS", Character.valueOf('A'), ThEApi.instance().items().EssentiaStorageComponent_1k.getStack(), Character.valueOf('S'), tweaks.wurm.items.ModItems.MixedSheet, Character.valueOf('X'), tweaks.wurm.items.ModItems.CraftingCore,Character.valueOf('B'), new ItemStack(ExtraUtils.cobblestoneCompr,1,7)});
		ArcaneRecipe.addShaped("DISLOCATOR",GameRegistry.findItemStack("ThaumicTinkerer", "dislocator", 1), new AspectList().add(Aspect.EARTH,10).add(Aspect.AIR,10), new Object[] {"XAX", "AMA", "XAX", Character.valueOf('X'), tweaks.wurm.items.ModItems.MixedSheet, Character.valueOf('A'), TFCItems.RedSteelSheet, Character.valueOf('M'), new ItemStack(tweaks.wurm.items.ModBlocks.BismuthBlock)});
		ArcaneRecipe.addShaped("GAS_REMOVER", GameRegistry.findItemStack("ThaumicTinkerer", "gasRemover", 1), new AspectList().add(Aspect.AIR,10).add(Aspect.EARTH,10), new Object[] {"CCC", "A B", "CCC",Character.valueOf('C'), Items.quartz,Character.valueOf('A'), GameRegistry.findItemStack("ThaumicTinkerer", "gaseousShadowItem", 1), Character.valueOf('B'), GameRegistry.findItemStack("ThaumicTinkerer", "gaseousLightItem", 1)});
		ArcaneRecipe.addShaped("FOCUS_ENDER_CHEST", GameRegistry.findItemStack("ThaumicTinkerer", "focusEnderChest", 1), new AspectList().add(Aspect.ENTROPY,50), new Object[] {"XXX", "ACA", "XXX", Character.valueOf('X'), tweaks.wurm.items.ModItems.MixedSheet, Character.valueOf('A'), TFCItems.BlueSteelSheet, Character.valueOf('C'), new ItemStack(EnderStorage.blockEnderChest)});
		ArcaneRecipe.addShaped("CAP_ICHOR", new ItemStack(GameRegistry.findItemStack("ThaumicTinkerer", "kamiResource", 1).getItem(),1,4),new AspectList().add(Aspect.AIR,125).add(Aspect.ORDER,125).add(Aspect.EARTH,125).add(Aspect.FIRE,125).add(Aspect.ENTROPY,125), new Object[] {"ICI", " X ", "ICI", Character.valueOf('I'), new ItemStack(GameRegistry.findItemStack("ThaumicTinkerer", "kamiResource", 1).getItem(),1,0),Character.valueOf('C'), new ItemStack(ConfigItems.itemWandCap,1,2), Character.valueOf('X'), tweaks.wurm.items.ModItems.CraftingCore });
		ArcaneRecipe.addShaped("ICHORCLOTH_ARMOR", new ItemStack(GameRegistry.findItemStack("ThaumicTinkerer", "ichorclothHelm", 1).getItem(),1,0), new AspectList().add(Aspect.AIR,100), new Object[] {"XXX", "X X", Character.valueOf('X'), new ItemStack(GameRegistry.findItemStack("ThaumicTinkerer", "kamiResource",1).getItem(),1,1)});
		ArcaneRecipe.addShaped("ICHORCLOTH_ARMOR", new ItemStack(GameRegistry.findItemStack("ThaumicTinkerer", "ichorclothChest", 1).getItem(),1,0), new AspectList().add(Aspect.FIRE,100), new Object[] {"X X", "XXX","XXX", Character.valueOf('X'), new ItemStack(GameRegistry.findItemStack("ThaumicTinkerer", "kamiResource",1).getItem(),1,1)});
		ArcaneRecipe.addShaped("ICHORCLOTH_ARMOR", new ItemStack(GameRegistry.findItemStack("ThaumicTinkerer", "ichorclothLegs", 1).getItem(),1,0), new AspectList().add(Aspect.ORDER,100), new Object[] {"XXX", "X X","X X", Character.valueOf('X'), new ItemStack(GameRegistry.findItemStack("ThaumicTinkerer", "kamiResource",1).getItem(),1,1)});
		ArcaneRecipe.addShaped("ICHORCLOTH_ARMOR", new ItemStack(GameRegistry.findItemStack("ThaumicTinkerer", "ichorclothBoots", 1).getItem(),1,0), new AspectList().add(Aspect.ORDER,100), new Object[] {"X X", "X X", Character.valueOf('X'), new ItemStack(GameRegistry.findItemStack("ThaumicTinkerer", "kamiResource",1).getItem(),1,1)});
		ArcaneRecipe.addShaped("ICHORIUM", new ItemStack(GameRegistry.findItemStack("ThaumicTinkerer", "kamiResource", 1).getItem(),1,2), new AspectList().add(Aspect.AIR,125), new Object[] {" I ", "IGI", " I ", Character.valueOf('I'), new ItemStack(GameRegistry.findItemStack("ThaumicTinkerer", "kamiResource",1).getItem(),1,0), Character.valueOf('G'), tweaks.wurm.items.ModItems.CraftingCore});
		ArcaneRecipe.addShaped("ICHOR_CLOTH", new ItemStack(GameRegistry.findItemStack("ThaumicTinkerer", "kamiResource", 1).getItem(),1,1), new AspectList().add(Aspect.EARTH,125).add(Aspect.AIR,125).add(Aspect.FIRE,125).add(Aspect.ORDER,125).add(Aspect.WATER,125).add(Aspect.ENTROPY,125), new Object[] {"XXX", "AAA", "BBB", Character.valueOf('X'), tweaks.wurm.items.ModItems.MixedSheet, Character.valueOf('A'), tweaks.wurm.items.ModItems.AntiMatter, Character.valueOf('B'), new ItemStack(GameRegistry.findItemStack("ThaumicTinkerer", "kamiResource", 1).getItem(),1,0)});
		
		
	}
	public static void refreshBook() {
		
		Research.RefreshResearch("DECONSTRUCTOR");
		Research.RefreshResearch("CAP_thaumium");
		Research.RefreshResearch("CAP_gold");
		Research.RefreshResearch("CAP_silver");
		Research.RefreshResearch("CAP_copper");
		Research.RefreshResearch("FOCUSPOUCH");
		Research.RefreshResearch("FOCUSFIRE");
		Research.RefreshResearch("FOCUSEXCAVATION");
		Research.RefreshResearch("FOCUSSHOCK");
		Research.RefreshResearch("FOCUSTRADE");
		Research.RefreshResearch("FOCUSFROST");
		Research.RefreshResearch("NODESTABILIZER");
		Research.RefreshResearch("VISCHARGERELAY");
		Research.RefreshResearch("VISPOWER");
		Research.RefreshResearch("FOCALMANIPULATION");
		Research.RefreshResearch("DISTILESSENTIA");
		Research.RefreshResearch("TUBEFILTER");
		Research.RefreshResearch("TUBES");
		Research.RefreshResearch("BELLOWS");
		Research.RefreshResearch("LEVITATOR");
		Research.RefreshResearch("BASICARTIFACE");
		Research.RefreshResearch("INFUSION");
		Research.RefreshResearch("GOGGLES");
		Research.RefreshResearch("ARCANEEAR");
		Research.RefreshResearch("ARCANESTONE");
		Research.RefreshResearch("FOCUSPRIMAL");
		Research.RefreshResearch(ResearchRegistry.ResearchTypes.IO.getKey());
		Research.RefreshResearch(ResearchRegistry.ResearchTypes.ESSENTIATERMINAL.getKey());
		Research.RefreshResearch(ResearchRegistry.ResearchTypes.ARCANETERMINAL.getKey());
		Research.RefreshResearch(ResearchRegistry.ResearchTypes.VISINTERFACE.getKey());
		Research.RefreshResearch(ResearchRegistry.ResearchTypes.KNOWLEDGEINSCRIBER.getKey());
		Research.RefreshResearch(ResearchRegistry.ResearchTypes.STORAGE.getKey());
		Research.RefreshResearch("DISLOCATOR");
		Research.RefreshResearch("GAS_REMOVER");
		Research.RefreshResearch("FOCUS_ENDER_CHEST");
		Research.RefreshResearch("CAP_ICHOR");
		Research.RefreshResearch("ICHORCLOTH_ARMOR");
		Research.RefreshResearch("ICHORIUM");
		Research.RefreshResearch("ICHOR_CLOTH");

	}
}
