package tweaks.wurm.utils.ImmersiveEngineering;

import tweaks.wurm.utils.tfc.TFCFood;
import net.minecraftforge.fluids.FluidStack;
import blusunrize.immersiveengineering.api.DieselHandler;
import blusunrize.immersiveengineering.common.IEContent;

import com.bioxx.tfc.api.TFCItems;

public class Fermenter {
	
	public static void fixRecipes() {
		DieselHandler.fermenterList.clear();
		DieselHandler.addFermenterRecipe(TFCItems.Reeds, 1200,new FluidStack(IEContent.fluidEthanol,160), null);
		DieselHandler.addFermenterRecipe(TFCFood.getFood(TFCItems.Sugar, 160f),400,new FluidStack(IEContent.fluidEthanol,320), null);
		DieselHandler.addFermenterRecipe(TFCFood.getFood(TFCItems.Sugar, 160f), 400,new FluidStack(IEContent.fluidEthanol,320), null);
		DieselHandler.addFermenterRecipe(TFCFood.getFood(TFCItems.WheatGrain, 160f), 1200,new FluidStack(IEContent.fluidEthanol,360), null);
		DieselHandler.addFermenterRecipe(TFCFood.getFood(TFCItems.BarleyGrain, 160f), 1200,new FluidStack(IEContent.fluidEthanol,360), null);
		DieselHandler.addFermenterRecipe(TFCFood.getFood(TFCItems.RyeGrain,160f), 1200,new FluidStack(IEContent.fluidEthanol,360), null);
		DieselHandler.addFermenterRecipe(TFCFood.getFood(TFCItems.RiceGrain, 160f), 1200,new FluidStack(IEContent.fluidEthanol,360), null);
		DieselHandler.addFermenterRecipe(TFCFood.getFood(TFCItems.Snowberry, 160f), 1200,new FluidStack(IEContent.fluidEthanol,360), null);
		DieselHandler.addFermenterRecipe(TFCFood.getFood(TFCItems.Peach, 160f), 1200,new FluidStack(IEContent.fluidEthanol,360), null);
		DieselHandler.addFermenterRecipe(TFCFood.getFood(TFCItems.WintergreenBerry, 160f), 1200,new FluidStack(IEContent.fluidEthanol,360), null);
		DieselHandler.addFermenterRecipe(TFCFood.getFood(TFCItems.Gooseberry, 160f), 1200,new FluidStack(IEContent.fluidEthanol,360), null);
		DieselHandler.addFermenterRecipe(TFCFood.getFood(TFCItems.Plum,160f), 1200,new FluidStack(IEContent.fluidEthanol,360), null);
		DieselHandler.addFermenterRecipe(TFCFood.getFood(TFCItems.Olive, 160f), 1200,new FluidStack(IEContent.fluidEthanol,360), null);
		DieselHandler.addFermenterRecipe(TFCFood.getFood(TFCItems.Cranberry, 160f), 1200,new FluidStack(IEContent.fluidEthanol,360), null);
		DieselHandler.addFermenterRecipe(TFCFood.getFood(TFCItems.Lemon, 160f), 1200,new FluidStack(IEContent.fluidEthanol,360), null);
		DieselHandler.addFermenterRecipe(TFCFood.getFood(TFCItems.Orange, 160f), 1200,new FluidStack(IEContent.fluidEthanol,360), null);
		DieselHandler.addFermenterRecipe(TFCFood.getFood(TFCItems.Cloudberry,160f), 1200,new FluidStack(IEContent.fluidEthanol,360), null);
		DieselHandler.addFermenterRecipe(TFCFood.getFood(TFCItems.Strawberry, 160f), 1200,new FluidStack(IEContent.fluidEthanol,360), null);
		DieselHandler.addFermenterRecipe(TFCFood.getFood(TFCItems.Cherry, 160f), 1200,new FluidStack(IEContent.fluidEthanol,360), null);
		DieselHandler.addFermenterRecipe(TFCFood.getFood(TFCItems.Carrot, 160f), 1200,new FluidStack(IEContent.fluidEthanol,360), null);
		DieselHandler.addFermenterRecipe(TFCFood.getFood(TFCItems.Bunchberry, 160f), 1200,new FluidStack(IEContent.fluidEthanol,360), null);
		DieselHandler.addFermenterRecipe(TFCFood.getFood(TFCItems.Raspberry, 160f), 1200,new FluidStack(IEContent.fluidEthanol,360), null);
		DieselHandler.addFermenterRecipe(TFCFood.getFood(TFCItems.Banana, 160f), 1200,new FluidStack(IEContent.fluidEthanol,360), null);
		DieselHandler.addFermenterRecipe(TFCFood.getFood(TFCItems.Elderberry, 160f), 1200,new FluidStack(IEContent.fluidEthanol,360), null);
		DieselHandler.addFermenterRecipe(TFCFood.getFood(TFCItems.Blueberry, 160f), 1200,new FluidStack(IEContent.fluidEthanol,360), null);
	    DieselHandler.addFermenterRecipe(TFCFood.getFood(TFCItems.Blackberry, 160f), 1200,new FluidStack(IEContent.fluidEthanol,360), null);
		DieselHandler.addFermenterRecipe(TFCFood.getFood(TFCItems.WheatGrain, 160f), 1200,new FluidStack(IEContent.fluidEthanol,320), null);
		
	}
}
