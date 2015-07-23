package tweaks.wurm.utils;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;

public class RecipeHelper {
	
	public static int Wild = OreDictionary.WILDCARD_VALUE;
	public static String Dye[] = {"dyeWhite", "dyeOrange", "dyeMagenta", "dyeLightBlue", "dyeYellow", "dyeLime", "dyePink", "dyeGray", "dyeLightGray", "dyeCyan", "dyePurple", "dyeBlue", "dyeBrown", "dyeGreen", "dyeRed", "dyeBlack"};

	public static void addSlabRecipe(ItemStack output, ItemStack input) {
		GameRegistry.addShapedRecipe(output, new Object[] {"BBB","BBB", Character.valueOf('B'), input});
	}
	
	public static void addStairsRecipe(ItemStack output, ItemStack input) {
		GameRegistry.addShapedRecipe(output, new Object[] {"B  ", "BB ", "BBB", Character.valueOf('B'), input});
		GameRegistry.addShapedRecipe(output, new Object[] {"  B", " BB", "BBB", Character.valueOf('B'), input});
	}
	
	public static void addCrossRecipe(ItemStack output, ItemStack input1, ItemStack input2) {
		GameRegistry.addShapedRecipe(output, new Object[] {"XAX", "AXA", "XAX", Character.valueOf('X'), input1, Character.valueOf('A'), input2});
		GameRegistry.addShapedRecipe(output, new Object[] {"AXA", "XAX", "AXA", Character.valueOf('X'), input1, Character.valueOf('A'), input2});
	}
	
	public static void addPresssurePlateRecipe(ItemStack output, ItemStack input) {
		GameRegistry.addShapedRecipe(output, new Object[] {"PP", Character.valueOf('P'), input});
	}
	
	public static void addPresssurePlateRecipe(ItemStack output, String input) {
		GameRegistry.addRecipe(new ShapedOreRecipe(output, new Object[] {"PP", Character.valueOf('P'), input}));
	}
	
	public static void addCircwithCenterRecipe(ItemStack output, ItemStack input1, ItemStack input2) {
		GameRegistry.addRecipe(output, new Object[] {"XXX", "XAX", "XXX", Character.valueOf('X'), input1, Character.valueOf('A'), input2});
	}
	
	public static void addCircwithCenterRecipe(ItemStack output, ItemStack input1, String input2) {
		GameRegistry.addRecipe(new ShapedOreRecipe(output, new Object[] {"XXX", "XAX", "XXX", Character.valueOf('X'), input1, Character.valueOf('A'), input2}));
	}
	
	public static void addCircwithCenterRecipe(ItemStack output, String input1, String input2) {
		GameRegistry.addRecipe(new ShapedOreRecipe(output, new Object[] {"XXX", "XAX", "XXX", Character.valueOf('X'), input1, Character.valueOf('A'), input2}));
	}
	
	public static void add2xRecipe(ItemStack output, ItemStack input) {
		GameRegistry.addRecipe(output, new Object[] {"XX", "XX", Character.valueOf('X'), input});
	}
	
	public static void add3xRecipe(ItemStack output, ItemStack input) {
		GameRegistry.addRecipe(output, new Object[] {"XXX","XXX", "XXX", Character.valueOf('X'), input});
	}
	
	public static void addCircRecipe(ItemStack output, ItemStack input) {
		GameRegistry.addRecipe(output, new Object[] {"XXX", "X X", "XXX", Character.valueOf('X'), input});
	}

}
