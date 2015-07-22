package tweaks.wurm.utils.thaumcraft;

import java.util.List;

import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import thaumcraft.common.config.ConfigResearch;
import tweaks.wurm.utils.OreDictHelper;
import cpw.mods.fml.common.registry.GameRegistry;

public class WorkBenchRecipe extends OreDictHelper {

    private String name;
    private ItemStack output;
    private Object[] stuff;

    public WorkBenchRecipe(String name, ItemStack output, Object... stuff) {

        this.name = name;
        this.output = output;
        this.stuff = stuff;
        
        GameRegistry.addRecipe(output, stuff);
        List<IRecipe> recipeList = CraftingManager.getInstance().getRecipeList();
        if (name != null && name.length() != 0)
            ConfigResearch.recipes.put(name, recipeList.get(recipeList.size() - 1));
    }
}