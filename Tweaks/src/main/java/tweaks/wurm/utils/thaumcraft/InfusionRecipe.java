package tweaks.wurm.utils.thaumcraft;

import net.minecraft.item.ItemStack;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.AspectList;
import tweaks.wurm.utils.OreDictHelper;

public class InfusionRecipe extends OreDictHelper {

    public InfusionRecipe(String research, ItemStack result, int instability, AspectList aspects, ItemStack input, ItemStack... recipe) {

        ThaumcraftApi.addInfusionCraftingRecipe(research, result, instability, aspects, input, recipe);
        
    }
}