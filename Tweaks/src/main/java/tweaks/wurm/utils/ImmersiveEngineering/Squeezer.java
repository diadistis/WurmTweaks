package tweaks.wurm.utils.ImmersiveEngineering;

import net.minecraftforge.fluids.FluidStack;
import blusunrize.immersiveengineering.api.DieselHandler;
import blusunrize.immersiveengineering.common.IEContent;

import com.bioxx.tfc.api.TFCItems;

public class Squeezer {
	public static void fixRecipes() {
		DieselHandler.squeezerList.clear();
		DieselHandler.addSqueezerRecipe(TFCItems.SeedsBarley, 600,  new FluidStack(IEContent.fluidPlantoil, 120), null);
		DieselHandler.addSqueezerRecipe(TFCItems.SeedsCarrot, 600,  new FluidStack(IEContent.fluidPlantoil, 120), null);
		DieselHandler.addSqueezerRecipe(TFCItems.SeedsJute, 600,  new FluidStack(IEContent.fluidPlantoil, 120), null);
		DieselHandler.addSqueezerRecipe(TFCItems.SeedsMaize, 600,  new FluidStack(IEContent.fluidPlantoil, 120), null);
		DieselHandler.addSqueezerRecipe(TFCItems.SeedsOat, 600,  new FluidStack(IEContent.fluidPlantoil, 120), null);
		DieselHandler.addSqueezerRecipe(TFCItems.SeedsRice, 600,  new FluidStack(IEContent.fluidPlantoil, 120), null);
		DieselHandler.addSqueezerRecipe(TFCItems.SeedsRye, 600,  new FluidStack(IEContent.fluidPlantoil, 120), null);
		DieselHandler.addSqueezerRecipe(TFCItems.SeedsSugarcane, 600,  new FluidStack(IEContent.fluidPlantoil, 120), null);
		DieselHandler.addSqueezerRecipe(TFCItems.SeedsWheat, 600,  new FluidStack(IEContent.fluidPlantoil, 120), null);
	}
}
