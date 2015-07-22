package tweaks.wurm.utils.thaumcraft;

import static modtweaker2.helpers.StackHelper.areEqual;

import java.util.ArrayList;
import java.util.HashMap;

import modtweaker2.mods.thaumcraft.ThaumcraftHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.crafting.CrucibleRecipe;
import thaumcraft.api.crafting.IArcaneRecipe;
import thaumcraft.api.crafting.InfusionRecipe;
import thaumcraft.api.research.ResearchCategories;
import thaumcraft.api.research.ResearchItem;
import thaumcraft.api.research.ResearchPage;

public class Research  {
    static String research;
    static String tab;

    public static void RefreshResearch(String input) {
  
    	
        research = input;
        tab = ThaumcraftHelper.getResearchTab(research);
        
        if (tab != null) {
            ResearchItem target = ResearchCategories.researchCategories.get(tab).research.get(research);
            ResearchPage[] pages = target.getPages();
            for (int x = 0; x < pages.length; x++) {
                if (pages[x].recipe != null) {
                    if (pages[x].recipe instanceof IRecipe) {
                        IRecipe recipe = (IRecipe) pages[x].recipe;
                        for (Object craft : CraftingManager.getInstance().getRecipeList()) {
                            if (craft instanceof IRecipe) {
                                IRecipe theCraft = (IRecipe) craft;
                                if (theCraft.getRecipeOutput() != null && areEqual(theCraft.getRecipeOutput(), recipe.getRecipeOutput())) {
                                    pages[x] = new ResearchPage(theCraft);
                                    break;
                                }
                            }
                        }
                    } else if (pages[x].recipe instanceof IArcaneRecipe) {
                        IArcaneRecipe recipe = (IArcaneRecipe) pages[x].recipe;
                        for (Object craft : ThaumcraftApi.getCraftingRecipes()) {
                            if (craft instanceof IArcaneRecipe) {
                                IArcaneRecipe theCraft = (IArcaneRecipe) craft;
                                if (theCraft.getRecipeOutput() != null && areEqual(theCraft.getRecipeOutput(), recipe.getRecipeOutput())) {
                                    pages[x] = new ResearchPage(theCraft);
                                    break;
                                }
                            }
                        }
                    } else if (pages[x].recipe instanceof CrucibleRecipe) {
                        CrucibleRecipe recipe = (CrucibleRecipe) pages[x].recipe;
                        for (Object craft : ThaumcraftApi.getCraftingRecipes()) {
                            if (craft instanceof CrucibleRecipe) {
                                CrucibleRecipe theCraft = (CrucibleRecipe) craft;
                                if (theCraft.getRecipeOutput() != null && areEqual(theCraft.getRecipeOutput(), recipe.getRecipeOutput())) {
                                    pages[x] = new ResearchPage(theCraft);
                                    break;
                                }
                            }
                        }
                    } else if (pages[x].recipe instanceof InfusionRecipe) {
                        InfusionRecipe recipe = (InfusionRecipe) pages[x].recipe;
                        if (recipe.getRecipeOutput() instanceof ItemStack) {
                            for (Object craft : ThaumcraftApi.getCraftingRecipes()) {
                                if (craft instanceof InfusionRecipe) {
                                    InfusionRecipe theCraft = (InfusionRecipe) craft;
                                    if (theCraft.getRecipeOutput() != null && theCraft.getRecipeOutput() instanceof ItemStack && areEqual(((ItemStack) theCraft.getRecipeOutput()), (ItemStack) recipe.getRecipeOutput())) {
                                        pages[x] = new ResearchPage(theCraft);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    public static void RemoveReserch(String key)  {
    	
    	tab = ThaumcraftHelper.getResearchTab(key);
    	if (tab != null) {
    		
    		ResearchCategories.researchCategories.get(tab).research.remove(key);
    		FixReserch(key);
    	}
    }
    
    public static void FixReserch(String key) {
        HashMap<String, String> children = new HashMap();
        HashMap<String, String> secretChildren = new HashMap();
        HashMap<String, String> siblings = new HashMap();
        
        for (String tab : ResearchCategories.researchCategories.keySet()) {
            for (String research : ResearchCategories.researchCategories.get(tab).research.keySet()) {
                String[] prereqs = ResearchCategories.researchCategories.get(tab).research.get(research).parents;
                if (prereqs != null) {
                    for (int x = 0; x < prereqs.length; x++) {
                        if (prereqs[x] != null && prereqs[x].equals(key)) {
                            children.put(research, tab);
                            ArrayList<String> newReqs = new ArrayList();
                            for (int y = 0; y < prereqs.length; y++) {
                                if (y != x) newReqs.add(prereqs[y]);
                            }
                            ResearchCategories.researchCategories.get(tab).research.get(research).setParents(newReqs.toArray(new String[prereqs.length - 1]));
                            break;
                        }
                    }
                }
                prereqs = ResearchCategories.researchCategories.get(tab).research.get(research).parentsHidden;
                if (prereqs != null) {
                    for (int x = 0; x < prereqs.length; x++) {
                        if (prereqs[x] != null && prereqs[x].equals(key)) {
                            secretChildren.put(research, tab);
                            ArrayList<String> newReqs = new ArrayList();
                            for (int y = 0; y < prereqs.length; y++) {
                                if (y != x) newReqs.add(prereqs[y]);
                            }
                            ResearchCategories.researchCategories.get(tab).research.get(research).setParentsHidden(newReqs.toArray(new String[prereqs.length - 1]));
                            break;
                        }
                    }
                }
                prereqs = ResearchCategories.researchCategories.get(tab).research.get(research).siblings;
                if (prereqs != null) {
                    for (int x = 0; x < prereqs.length; x++) {
                        if (prereqs[x] != null && prereqs[x].equals(key)) {
                            siblings.put(research, tab);
                            ArrayList<String> newReqs = new ArrayList();
                            for (int y = 0; y < prereqs.length; y++) {
                                if (y != x) newReqs.add(prereqs[y]);
                            }
                            ResearchCategories.researchCategories.get(tab).research.get(research).setSiblings(newReqs.toArray(new String[prereqs.length - 1]));
                            break;
                        }
                    }
                }
            }
        }
    }
    
}