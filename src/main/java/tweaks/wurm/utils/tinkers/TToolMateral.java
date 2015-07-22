package tweaks.wurm.utils.tinkers;


import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import tconstruct.library.TConstructRegistry;
import tconstruct.library.crafting.PatternBuilder;
import tconstruct.library.tools.ToolMaterial;
import tconstruct.tools.TinkerTools;

import com.bioxx.tfc.api.TFCItems;

public class TToolMateral {

	public static void addMaterials() {
		
		// Copper
		ToolMaterial TCopper = new ToolMaterial("TCopper", "TFCCopper", 5, 600, 800, 170, 0, 0, 0, EnumChatFormatting.AQUA.toString(),0x33100B);
		TConstructRegistry.addtoolMaterial(201, TCopper);
		TConstructRegistry.addArrowMaterial(201, 0.01f, 0.6f);
		TConstructRegistry.addBowMaterial(201,2100, 4f);
		TConstructRegistry.toolMaterials.put(201, TCopper);
		addRepairMaterial(201,new ItemStack(TFCItems.CopperIngot));
		TConstructRegistry.addDefaultToolPartMaterial(201);
		
		// Bronze
		ToolMaterial TBronze = new ToolMaterial("TBronze", "TFCBronze", 5, 1300,1100, 225, 0, 0, 0, EnumChatFormatting.GOLD.toString(), 0x4B4021);
		TConstructRegistry.addtoolMaterial(202, TBronze);
		TConstructRegistry.addArrowMaterial(202, 0.04f, 0.4f);
		TConstructRegistry.addBowMaterial(202,280, 4f);
		TConstructRegistry.toolMaterials.put(202, TBronze);
		addRepairMaterial(202,new ItemStack(TFCItems.BronzeIngot));
		TConstructRegistry.addDefaultToolPartMaterial(202);
		
		// Bismuth Bronze
		ToolMaterial TBismuthBronze = new ToolMaterial("TBismuthBronze", "Bismuth Bronze", 5, 1200, 1000, 215, 0, 0, 0, EnumChatFormatting.GOLD.toString(), 0x142B17);
		TConstructRegistry.addtoolMaterial(203, TBismuthBronze);
		TConstructRegistry.addArrowMaterial(203, 0.2f, 0.6f);
		TConstructRegistry.addBowMaterial(203,290, 6f);
		TConstructRegistry.toolMaterials.put(203, TBismuthBronze);
		addRepairMaterial(203,new ItemStack(TFCItems.BismuthBronzeIngot));
		TConstructRegistry.addDefaultToolPartMaterial(203);
		
		// Black Bronze
		ToolMaterial TBlackBronze = new ToolMaterial("TBlackBronze", "Black Bronze", 5, 1460, 900, 235, 0, 0, 0, EnumChatFormatting.GOLD.toString(), 0x271433);
		TConstructRegistry.addtoolMaterial(204, TBlackBronze);
		TConstructRegistry.addArrowMaterial(204, 0.1f, 0.6f);
		TConstructRegistry.addBowMaterial(204,285, 8f);
		TConstructRegistry.toolMaterials.put(204, TBlackBronze);
		addRepairMaterial(204,new ItemStack(TFCItems.BlackBronzeIngot));
		TConstructRegistry.addDefaultToolPartMaterial(204);

		// Wrought Iron
		ToolMaterial TWroughtIron = new ToolMaterial("TWroughtIron", "Wrought Iron", 6, 2200, 1200, 245, 0, 0, 0, EnumChatFormatting.GOLD.toString(), 0x565656);
		TConstructRegistry.addtoolMaterial(205, TWroughtIron);
		TConstructRegistry.addArrowMaterial(205, 0.0f, 0.6f);
		TConstructRegistry.addBowMaterial(205,285, 8f);
		TConstructRegistry.toolMaterials.put(205, TWroughtIron);
		addRepairMaterial(5,new ItemStack(TFCItems.WroughtIronIngot));
		TConstructRegistry.addDefaultToolPartMaterial(205);
		
		// Steel
		ToolMaterial TSeel = new ToolMaterial("TSeel", "TFC_Steel", 7, 3300, 1400, 270, 1f, 0, 0, EnumChatFormatting.GOLD.toString(), 0x2A2A2A);
		TConstructRegistry.addtoolMaterial(206, TSeel);
		TConstructRegistry.addArrowMaterial(206, 0.0f, 0.6f);
		TConstructRegistry.addBowMaterial(206,285, 8f);
		TConstructRegistry.toolMaterials.put(206, TSeel);
		addRepairMaterial(206,new ItemStack(TFCItems.SteelIngot));
		TConstructRegistry.addDefaultToolPartMaterial(206);
		
		// Black Steel
		ToolMaterial TBlackSteel = new ToolMaterial("TBlackSteel", "Black Steel", 10, 4200, 1600, 275, 1f, 0, 0, EnumChatFormatting.GOLD.toString(), 0x111414);
		TConstructRegistry.addtoolMaterial(207, TBlackSteel);
		TConstructRegistry.addArrowMaterial(207, 0.0f, 0.6f);
		TConstructRegistry.addBowMaterial(207,385, 10f);
		TConstructRegistry.toolMaterials.put(207, TBlackSteel);
		addRepairMaterial(207,new ItemStack(TFCItems.BlackSteelIngot));
		TConstructRegistry.addDefaultToolPartMaterial(207);
		
		// Blue Steel
		ToolMaterial TBlueSteel = new ToolMaterial("TBlueSteel", "Blue Steel", 12, 6500, 1800, 320, 10f, 0, 0, EnumChatFormatting.GOLD.toString(), 0x3F475E);
		TConstructRegistry.addtoolMaterial(208, TBlueSteel);
		TConstructRegistry.addArrowMaterial(208, 0.0f, 0.6f);
		TConstructRegistry.addBowMaterial(208,485, 15f);
		TConstructRegistry.toolMaterials.put(208, TBlueSteel);
		addRepairMaterial(208,new ItemStack(TFCItems.BlueSteelIngot));
		TConstructRegistry.addDefaultToolPartMaterial(208);
		
		// Red Steel
		ToolMaterial TRedSteel = new ToolMaterial("TRedSteel", "Red Steel", 12, 6500, 1800, 310, 10f, 0, 0, EnumChatFormatting.GOLD.toString(), 0x5A2B2B);
		TConstructRegistry.addtoolMaterial(209, TRedSteel);
		TConstructRegistry.addArrowMaterial(209, 0.0f, 0.6f);
		TConstructRegistry.addBowMaterial(209,485, 15f);
		TConstructRegistry.toolMaterials.put(209, TRedSteel);
		addRepairMaterial(209,new ItemStack(TFCItems.RedSteelIngot));
		TConstructRegistry.addDefaultToolPartMaterial(209);
		
		// Platinum
		ToolMaterial TPlatinum = new ToolMaterial("TPlatinum", "TFCPlatinum", 5, 1200, 4000, 250, 2.0f, 0, 0, EnumChatFormatting.GOLD.toString(), 0x6D7777);
		TConstructRegistry.addtoolMaterial(210, TPlatinum);
		TConstructRegistry.addArrowMaterial(210, 0.1f, 0.6f);
		TConstructRegistry.addBowMaterial(210,885, 20.0f);
		TConstructRegistry.toolMaterials.put(210, TPlatinum);
		addRepairMaterial(210, new ItemStack(TFCItems.PlatinumIngot));
		TConstructRegistry.addDefaultToolPartMaterial(210);	
	}
	
	public static void addRepairMaterial(int Material, ItemStack itemstack) {
		
		ItemStack rod = new ItemStack(TinkerTools.toolRod, 1, Material);
		PatternBuilder.instance.registerFullMaterial(itemstack, Material, TConstructRegistry.getMaterial(Material).materialName,itemstack, rod, Material);

	}
}
