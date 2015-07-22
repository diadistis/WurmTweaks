package tweaks.wurm.crafting.gregtech;

import gregtech.api.enums.GT_Values;
import net.minecraftforge.fluids.FluidStack;
import tweaks.wurm.items.ModBlocks;

public class Fusion {
	
	public static void addRecipes() {
		
		GT_Values.RA.addFusionReactorRecipe(new FluidStack(ModBlocks.moltenLeadFluid,200), new FluidStack(ModBlocks.moltenLeadFluid,200), new FluidStack(ModBlocks.AntiMatter,400), 24000, 64000, 250000000);
		
	}
}
