package tweaks.wurm.utils.TE;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fluids.FluidStack;
import cofh.api.modhelpers.ThermalExpansionHelper;
import cofh.thermalexpansion.util.crafting.CrucibleManager;
import cofh.thermalexpansion.util.crafting.PulverizerManager;
import cofh.thermalexpansion.util.crafting.TransposerManager;
import cpw.mods.fml.common.event.FMLInterModComms;

public class TERecipes {


	 public static void addFurnaceRecipe(int energy, ItemStack input, ItemStack output) {

	        if (input == null || output == null) {
	            return;
	        }
	        ThermalExpansionHelper.addFurnaceRecipe(energy, input, output);
	 }

	    public static void removeFurnaceRecipe(ItemStack input) {

	        if (input == null) {
	            return;
	        }
	        NBTTagCompound toSend = new NBTTagCompound();

	        toSend.setTag("input", new NBTTagCompound());

	        input.writeToNBT(toSend.getCompoundTag("input"));
	        FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
	    }

	    public static void addPulverizerRecipe(int power, ItemStack in, ItemStack out, ItemStack secondary, int chance)
	    {
	        PulverizerManager.addRecipe(power, in, out, secondary, chance);        
	    }
	    
	    public static void addPulverizerRecipe(int power, ItemStack in, ItemStack out)
	    {
	        PulverizerManager.addRecipe(power, in, out);        
	    }

	    public static void removePulverizerRecipe(ItemStack input) {
	    	
	        PulverizerManager.removeRecipe(input);
	        
	    }

	    /* Sawmill */
	    public static void addSawmillRecipe(int energy, ItemStack input, ItemStack primaryOutput) {

	        addSawmillRecipe(energy, input, primaryOutput, null, 0);
	    }

	    public static void addSawmillRecipe(int energy, ItemStack input, ItemStack primaryOutput, ItemStack secondaryOutput) {

	        addSawmillRecipe(energy, input, primaryOutput, secondaryOutput, 100);
	    }

	    public static void addSawmillRecipe(int energy, ItemStack input, ItemStack primaryOutput, ItemStack secondaryOutput, int secondaryChance) {

	        if (input == null || primaryOutput == null) {
	            return;
	        }
	        ThermalExpansionHelper.addSawmillRecipe(energy, input, primaryOutput, secondaryOutput, secondaryChance);
	    }

	    public static void removeSawmillRecipe(ItemStack input) {

	        if (input == null) {
	            return;
	        }
	        NBTTagCompound toSend = new NBTTagCompound();

	        toSend.setTag("input", new NBTTagCompound());

	        input.writeToNBT(toSend.getCompoundTag("input"));
	        FMLInterModComms.sendMessage("ThermalExpansion", "RemoveSawmillRecipe", toSend);
	    }

	    /* Smelter */
	    public static void addSmelterRecipe(int energy, ItemStack primaryInput, ItemStack secondaryInput, ItemStack primaryOutput) {

	        addSmelterRecipe(energy, primaryInput, secondaryInput, primaryOutput, null, 0);
	    }

	    public static void addSmelterRecipe(int energy, ItemStack primaryInput, ItemStack secondaryInput, ItemStack primaryOutput, ItemStack secondaryOutput) {

	        addSmelterRecipe(energy, primaryInput, secondaryInput, primaryOutput, secondaryOutput, 100);
	    }

	    public static void addSmelterRecipe(int energy, ItemStack primaryInput, ItemStack secondaryInput, ItemStack primaryOutput, ItemStack secondaryOutput,
	                                        int secondaryChance) {

	        if (primaryInput == null || secondaryInput == null || primaryOutput == null) {
	            return;
	        }
	        ThermalExpansionHelper.addSmelterRecipe(energy, primaryInput, secondaryInput, primaryOutput, secondaryOutput, secondaryChance);
	    }

	    public static void removeSmelterRecipe(ItemStack primaryInput, ItemStack secondaryInput) {

	        if (primaryInput == null || secondaryInput == null) {
	            return;
	        }
	        NBTTagCompound toSend = new NBTTagCompound();

	        toSend.setTag("primaryInput", new NBTTagCompound());
	        toSend.setTag("secondaryInput", new NBTTagCompound());

	        primaryInput.writeToNBT(toSend.getCompoundTag("primaryInput"));
	        secondaryInput.writeToNBT(toSend.getCompoundTag("secondaryInput"));
	        FMLInterModComms.sendMessage("ThermalExpansion", "RemoveSmelterRecipe", toSend);
	    }

	    /**
	     * Use this to register an Ore TYPE as a "Blast" recipe - it will require Pyrotheum Dust to smelt. Do not add the prefix. This is an opt-in for ores which
	     * do NOT have vanilla furnace recipes.
	     * <p/>
	     * Ex: "Steel" or "ElectrumFlux", not "dustSteel" or "dustElectrumFlux"
	     *
	     * @param oreType
	     */
	    public static void addSmelterBlastOre(String oreType) {

	    	ThermalExpansionHelper.addSmelterBlastOre(oreType);
	    }

	    /* Crucible */
	    public static void addCrucibleRecipe(int energy, ItemStack input, FluidStack output) {

	        if (input == null || output == null) {
	            return;
	        }
	        CrucibleManager.addRecipe(energy, input, output);
	    }

	    public static void removeCrucibleRecipe(ItemStack input) {

	        if (input == null) {
	            return;
	        }
	        NBTTagCompound toSend = new NBTTagCompound();

	        toSend.setTag("input", new NBTTagCompound());

	        input.writeToNBT(toSend.getCompoundTag("input"));
	        FMLInterModComms.sendMessage("ThermalExpansion", "RemoveCrucibleRecipe", toSend);
	    }

	    /* Transposer */
	    public static void addTransposerFill(int energy, ItemStack input, ItemStack output, FluidStack fluid, boolean reversible) {
	    	
	    	TransposerManager.addFillRecipe(energy, input, output, fluid, reversible);
	    	
	    }

	    public static void addTransposerExtract(int energy, ItemStack input, ItemStack output, FluidStack fluid, int chance, boolean reversible) {

	        if (input == null || output == null || fluid == null) {
	            return;
	        }
	        ThermalExpansionHelper.addTransposerExtract(energy, input, output, fluid, chance, reversible);
	    }

	    public static void removeTransposerFill(ItemStack input, FluidStack fluid) {

	        if (input == null || fluid == null) {
	            return;
	        }
	        NBTTagCompound toSend = new NBTTagCompound();

	        toSend.setTag("input", new NBTTagCompound());
	        toSend.setTag("fluid", new NBTTagCompound());

	        input.writeToNBT(toSend.getCompoundTag("input"));
	        fluid.writeToNBT(toSend.getCompoundTag("fluid"));
	        FMLInterModComms.sendMessage("ThermalExpansion", "RemoveTransposerFillRecipe", toSend);
	    }

	    public static void removeTransposerExtract(ItemStack input) {

	        if (input == null) {
	            return;
	        }
	        NBTTagCompound toSend = new NBTTagCompound();

	        toSend.setTag("input", new NBTTagCompound());

	        input.writeToNBT(toSend.getCompoundTag("input"));
	        FMLInterModComms.sendMessage("ThermalExpansion", "RemoveTransposerExtractRecipe", toSend);
	    }

	    /* Charger */
	    public static void addChargerRecipe(int energy, ItemStack input, ItemStack output) {

	        if (input == null || output == null) {
	            return;
	        }
	        NBTTagCompound toSend = new NBTTagCompound();

	        toSend.setInteger("energy", energy);
	        toSend.setTag("input", new NBTTagCompound());
	        toSend.setTag("output", new NBTTagCompound());

	        input.writeToNBT(toSend.getCompoundTag("input"));
	        output.writeToNBT(toSend.getCompoundTag("output"));
	        FMLInterModComms.sendMessage("ThermalExpansion", "ChargerRecipe", toSend);
	    }

	    public static void removeChargerRecipe(ItemStack input) {

	        if (input == null) {
	            return;
	        }
	        NBTTagCompound toSend = new NBTTagCompound();

	        toSend.setTag("input", new NBTTagCompound());

	        input.writeToNBT(toSend.getCompoundTag("input"));
	        FMLInterModComms.sendMessage("ThermalExpansion", "RemoveChargerRecipe", toSend);
	    }

	    /* Insolator */
	    public static void addInsolatorRecipe(int energy, ItemStack primaryInput, ItemStack secondaryInput, ItemStack primaryOutput) {

	        addInsolatorRecipe(energy, primaryInput, secondaryInput, primaryOutput, null, 0);
	    }

	    public static void addInsolatorRecipe(int energy, ItemStack primaryInput, ItemStack secondaryInput, ItemStack primaryOutput, ItemStack secondaryOutput) {

	        addInsolatorRecipe(energy, primaryInput, secondaryInput, primaryOutput, secondaryOutput, 100);
	    }

	    public static void addInsolatorRecipe(int energy, ItemStack primaryInput, ItemStack secondaryInput, ItemStack primaryOutput, ItemStack secondaryOutput,
	                                          int secondaryChance) {

	        if (primaryInput == null || secondaryInput == null || primaryOutput == null) {
	            return;
	        }
	        NBTTagCompound toSend = new NBTTagCompound();

	        toSend.setInteger("energy", energy);
	        toSend.setTag("primaryInput", new NBTTagCompound());
	        toSend.setTag("secondaryInput", new NBTTagCompound());
	        toSend.setTag("primaryOutput", new NBTTagCompound());

	        if (secondaryOutput != null) {
	            toSend.setTag("secondaryOutput", new NBTTagCompound());
	        }

	        primaryInput.writeToNBT(toSend.getCompoundTag("primaryInput"));
	        secondaryInput.writeToNBT(toSend.getCompoundTag("secondaryInput"));
	        primaryOutput.writeToNBT(toSend.getCompoundTag("primaryOutput"));

	        if (secondaryOutput != null) {
	            secondaryOutput.writeToNBT(toSend.getCompoundTag("secondaryOutput"));
	            toSend.setInteger("secondaryChance", secondaryChance);
	        }
	        FMLInterModComms.sendMessage("ThermalExpansion", "InsolatorRecipe", toSend);
	    }

	    public static void removeInsolatorRecipe(ItemStack primaryInput, ItemStack secondaryInput) {

	        if (primaryInput == null || secondaryInput == null) {
	            return;
	        }
	        NBTTagCompound toSend = new NBTTagCompound();

	        toSend.setTag("primaryInput", new NBTTagCompound());
	        toSend.setTag("secondaryInput", new NBTTagCompound());

	        primaryInput.writeToNBT(toSend.getCompoundTag("primaryInput"));
	        secondaryInput.writeToNBT(toSend.getCompoundTag("secondaryInput"));
	        FMLInterModComms.sendMessage("ThermalExpansion", "RemoveInsolatorRecipe", toSend);
	    }

	    /**
	     * DYNAMOS
	     */

		/* Magmatic */
	    public static void addMagmaticFuel(String fluidName, int energy) {

	        NBTTagCompound toSend = new NBTTagCompound();

	        toSend.setString("fluidName", fluidName);
	        toSend.setInteger("energy", energy);

	        FMLInterModComms.sendMessage("ThermalExpansion", "MagmaticFuel", toSend);
	    }

	    /* Compression */
	    public static void addCompressionFuel(String fluidName, int energy) {

	        NBTTagCompound toSend = new NBTTagCompound();

	        toSend.setString("fluidName", fluidName);
	        toSend.setInteger("energy", energy);

	        FMLInterModComms.sendMessage("ThermalExpansion", "CompressionFuel", toSend);
	    }

	    /* Reactant */
	    public static void addReactantFuel(String fluidName, int energy) {

	        NBTTagCompound toSend = new NBTTagCompound();

	        toSend.setString("fluidName", fluidName);
	        toSend.setInteger("energy", energy);

	        FMLInterModComms.sendMessage("ThermalExpansion", "ReactantFuel", toSend);
	    }

	    /* Coolants */
	    public static void addCoolant(String fluidName, int energy) {

	        NBTTagCompound toSend = new NBTTagCompound();

	        toSend.setString("fluidName", fluidName);
	        toSend.setInteger("energy", energy);

	        FMLInterModComms.sendMessage("ThermalExpansion", "Coolant", toSend);
	    }
}
