package tweaks.wurm.utils.thaumcraft;

import modtweaker2.utils.BaseListAddition;
import net.minecraft.item.ItemStack;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.crafting.IArcaneRecipe;
import thaumcraft.api.crafting.ShapedArcaneRecipe;
import thaumcraft.api.crafting.ShapelessArcaneRecipe;

public class ArcaneRecipe {
	
	public static void addShaped(String key, ItemStack output, AspectList aspects, Object[] ingredients) {
		new Add(new ShapedArcaneRecipe(key, output, aspects,ingredients));
		ThaumcraftApi.addArcaneCraftingRecipe(key, output, aspects, ingredients);
	}

	public static void addShapeless(String key, ItemStack output, AspectList aspects, Object[] ingredients) {
		new Add(new ShapelessArcaneRecipe(key,output, aspects,ingredients));
		ThaumcraftApi.addArcaneCraftingRecipe(key, output, aspects, ingredients);
	}

	private static class Add extends BaseListAddition {
		public Add(IArcaneRecipe recipe) {
			super("Thaumcraft Arcane Worktable", ThaumcraftApi.getCraftingRecipes(), recipe);
		}
	}
}