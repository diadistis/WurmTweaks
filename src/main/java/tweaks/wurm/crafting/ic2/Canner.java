package tweaks.wurm.crafting.ic2;


public class Canner {
	
	public static void RemoveAll() {
		ic2.api.recipe.Recipes.cannerBottle.getRecipes().clear();
		ic2.api.recipe.Recipes.cannerEnrich.getRecipes().clear();
	}
	
	public static void addCannerBottle() {
			
	}
	
	public static void addCannerEnrich() {
		
	}
}
