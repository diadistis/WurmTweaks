package tweaks.wurm.utils.thaumcraft;

import net.minecraft.item.ItemStack;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.AspectList;
import tweaks.wurm.utils.OreDictHelper;


public class CrucibleRecipe extends OreDictHelper {
    public static void addRecipe(String name, ItemStack output, ItemStack input, AspectList aspects) {

        ThaumcraftApi.addCrucibleRecipe(name, output, input, aspects);
        
    }
}