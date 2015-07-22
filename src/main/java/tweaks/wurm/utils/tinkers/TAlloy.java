package tweaks.wurm.utils.tinkers;

import net.minecraftforge.fluids.FluidRegistry;
import tconstruct.library.crafting.Smeltery;

public class TAlloy {
	
	// Created by Troykoffeman
	public static void addRecipes() {
		
		Smeltery.getAlloyList().clear();
		Smeltery.addAlloyMixing(FluidRegistry.getFluidStack("molten.wurmsteel", 10), FluidRegistry.getFluidStack("molten.wurmpigiron", 9), FluidRegistry.getFluidStack("molten.wurmnickel", 1));
		Smeltery.addAlloyMixing(FluidRegistry.getFluidStack("molten.wurmbismuthbronze", 10), FluidRegistry.getFluidStack("molten.wurmzinc", 3), FluidRegistry.getFluidStack("molten.wurmcopper", 5), FluidRegistry.getFluidStack("molten.wurmbismuth", 2));
		Smeltery.addAlloyMixing(FluidRegistry.getFluidStack("molten.wurmblackbronze", 20), FluidRegistry.getFluidStack("molten.wurmbismuthbronze", 14), FluidRegistry.getFluidStack("molten.wurmsilver", 3), FluidRegistry.getFluidStack("molten.wurmgold", 3));
		Smeltery.addAlloyMixing(FluidRegistry.getFluidStack("molten.wurmbronze", 10), FluidRegistry.getFluidStack("molten.wurmcopper", 9), FluidRegistry.getFluidStack("molten.wurmtin", 1));
		Smeltery.addAlloyMixing(FluidRegistry.getFluidStack("molten.wurmbrass", 10), FluidRegistry.getFluidStack("molten.wurmcopper", 8), FluidRegistry.getFluidStack("molten.wurmzinc", 1), FluidRegistry.getFluidStack("molten.wurmgold",1));
		Smeltery.addAlloyMixing(FluidRegistry.getFluidStack("molten.wurmrosegold", 10), FluidRegistry.getFluidStack("molten.wurmcopper", 2), FluidRegistry.getFluidStack("molten.wurmgold", 8));
		Smeltery.addAlloyMixing(FluidRegistry.getFluidStack("molten.wurmsterlingsilver", 10), FluidRegistry.getFluidStack("molten.wurmcopper", 3), FluidRegistry.getFluidStack("molten.wurmsilver", 7));
	    Smeltery.addAlloyMixing(FluidRegistry.getFluidStack("molten.wurmblacksteel", 20), FluidRegistry.getFluidStack("molten.wurmnickel", 2),FluidRegistry.getFluidStack("molten.wurmblackbronze",3),FluidRegistry.getFluidStack("molten.wurmsteel",15));
	    Smeltery.addAlloyMixing(FluidRegistry.getFluidStack("molten.wurmredsteel", 10), FluidRegistry.getFluidStack("molten.wurmblacksteel", 15), FluidRegistry.getFluidStack("molten.wurmrosegold", 1),FluidRegistry.getFluidStack("molten.wurmbrass",2),FluidRegistry.getFluidStack("molten.wurmsteel",2));
	    Smeltery.addAlloyMixing(FluidRegistry.getFluidStack("molten.wurmbluesteel", 10), FluidRegistry.getFluidStack("molten.wurmblacksteel", 15), FluidRegistry.getFluidStack("molten.wurmbismuthbronze", 2),FluidRegistry.getFluidStack("molten.wurmsterlingsilver",1),FluidRegistry.getFluidStack("molten.wurmsteel",2));
	    
	}
}
