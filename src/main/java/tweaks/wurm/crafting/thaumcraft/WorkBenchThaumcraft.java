package tweaks.wurm.crafting.thaumcraft;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import thaumcraft.common.config.ConfigItems;
import tweaks.wurm.utils.thaumcraft.Research;
import tweaks.wurm.utils.thaumcraft.WorkBenchRecipe;

import com.bioxx.tfc.api.TFCItems;

import cpw.mods.fml.common.registry.GameRegistry;

public class WorkBenchThaumcraft {
	
	public static void addRecipes() {
		int wild = OreDictionary.WILDCARD_VALUE;
		
		new WorkBenchRecipe("RESEARCH", new ItemStack(ConfigItems.itemThaumometer,1,0), new Object[] {" I ", "SGS", " I ", Character.valueOf('I'), new ItemStack(TFCItems.BlueSteelSheet), Character.valueOf('S'), new ItemStack(TFCItems.RedSteelSheet), Character.valueOf('G'), new ItemStack(Blocks.glass)});
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ConfigItems.itemThaumometer,1,0), new Object[] {" I ", "SGS", " I ", Character.valueOf('I'), new ItemStack(TFCItems.BlueSteelSheet), Character.valueOf('S'), new ItemStack(TFCItems.RedSteelSheet), Character.valueOf('G'), new ItemStack(Blocks.glass)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ConfigItems.itemInkwell), new Object[] {new ItemStack(Items.glass_bottle), new ItemStack(Items.feather), "dyeBlack"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ConfigItems.itemInkwell), new Object[] {new ItemStack(ConfigItems.itemInkwell,1,wild), "dyeBlack"}));
		new WorkBenchRecipe("KNOWFRAG", new ItemStack(ConfigItems.itemResearchNotes,1,42), new Object[] {"RRR", "RRR", "RRR", Character.valueOf('R'), new ItemStack(ConfigItems.itemResource,1,9)});
		GameRegistry.addRecipe(new ShapedOreRecipe( new ItemStack(ConfigItems.itemResearchNotes,1,42), new Object[] {"RRR", "RRR", "RRR", Character.valueOf('R'), new ItemStack(ConfigItems.itemResource,1,9)}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ConfigItems.itemEssence,1,0), new Object[] {" C ", "G G", " G ", Character.valueOf('C'), TFCItems.ClayBall, Character.valueOf('G'), "wurmglass"}));
		new WorkBenchRecipe("JARLABEL", new ItemStack(ConfigItems.itemResource,1,13), new Object[] {"DSP", "PPP", Character.valueOf('D'), new ItemStack(TFCItems.Dye,1,0), Character.valueOf('S'), Items.slime_ball, Character.valueOf('P'), Items.paper});
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ConfigItems.itemResource,1,13), new Object[]{"dyeBlack", "wurmslime", Items.paper, Items.paper, Items.paper}));
		new WorkBenchRecipe("BASICTHAUMATURGY",new ItemStack(ConfigItems.itemWandCap,1,0), new Object[] {"III", "I I", Character.valueOf('I'), TFCItems.WroughtIronIngot});
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ConfigItems.itemWandCap,1,0), new Object[] {"III", "I I", Character.valueOf('I'), TFCItems.WroughtIronIngot}));
		new WorkBenchRecipe("THAUMOMETER", new ItemStack(ConfigItems.itemThaumometer,1,0), new Object[] {" I ", "SGS", " I ", Character.valueOf('I'), new ItemStack(TFCItems.BlueSteelSheet), Character.valueOf('S'), new ItemStack(TFCItems.RedSteelSheet), Character.valueOf('G'), new ItemStack(Blocks.glass)});
		
	}
	
	public static void refreshBook() {
		
		Research.RefreshResearch("RESEARCH");
		Research.RefreshResearch("KNOWFRAG");
		Research.RefreshResearch("JARLABEL");
		Research.RefreshResearch("BASICTHAUMATURGY");
		Research.RefreshResearch("THAUMOMETER");
		
	}
}
