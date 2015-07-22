package tweaks.wurm.utils.minefactory;

import net.minecraft.item.ItemStack;
import powercrystals.minefactoryreloaded.MFRRegistry;
import powercrystals.minefactoryreloaded.farmables.harvestables.HarvestableWood;
import powercrystals.minefactoryreloaded.farmables.plantables.PlantableSapling;
import powercrystals.minefactoryreloaded.farmables.plantables.PlantableSoil;

import com.bioxx.tfc.api.TFCBlocks;
import com.bioxx.tfc.api.TFCItems;

public class MFR {
	
	public static void register() {
		
		MFRRegistry.registerHarvestable(new HarvestableWood(TFCBlocks.LogNatural));
		MFRRegistry.registerHarvestable(new HarvestableWood(TFCBlocks.LogNatural2));
		
		MFRRegistry.registerHarvestable(new HarvestLeaves(TFCBlocks.Leaves));
		MFRRegistry.registerHarvestable(new HarvestLeaves(TFCBlocks.Leaves2));
		
		MFRRegistry.registerPlantable(new PlantableSapling(TFCBlocks.Sapling));
		MFRRegistry.registerPlantable(new PlantableSapling(TFCBlocks.Sapling2));
		
		MFRRegistry.registerPlantable(new PlantableSoil(TFCBlocks.Dirt));
		MFRRegistry.registerPlantable(new PlantableSoil(TFCBlocks.Dirt2));
		MFRRegistry.registerPlantable(new PlantableSoil(TFCBlocks.Grass));
		MFRRegistry.registerPlantable(new PlantableSoil(TFCBlocks.Grass2));
		MFRRegistry.registerPlantable(new PlantableSoil(TFCBlocks.ClayGrass));
		MFRRegistry.registerPlantable(new PlantableSoil(TFCBlocks.ClayGrass2));
		MFRRegistry.registerPlantable(new PlantableSoil(TFCBlocks.tilledSoil));
		MFRRegistry.registerPlantable(new PlantableSoil(TFCBlocks.tilledSoil2));
		MFRRegistry.registerPlantable(new PlantableSoil(TFCBlocks.PeatGrass));
		
		MFRRegistry.getLaserOres().clear();
		
		MFRRegistry.registerLaserOre(12,new ItemStack(TFCItems.OreChunk,1,0));
		MFRRegistry.registerLaserOre(15,new ItemStack(TFCItems.OreChunk,1,1));
		MFRRegistry.registerLaserOre(5,new ItemStack(TFCItems.OreChunk,1,2));
		MFRRegistry.registerLaserOre(10,new ItemStack(TFCItems.OreChunk,1,3));
		MFRRegistry.registerLaserOre(8,new ItemStack(TFCItems.OreChunk,1,4));
		MFRRegistry.registerLaserOre(12,new ItemStack(TFCItems.OreChunk,1,5));
		MFRRegistry.registerLaserOre(14,new ItemStack(TFCItems.OreChunk,1,6));
		MFRRegistry.registerLaserOre(8,new ItemStack(TFCItems.OreChunk,1,7));
		MFRRegistry.registerLaserOre(2,new ItemStack(TFCItems.OreChunk,1,8));
		MFRRegistry.registerLaserOre(12,new ItemStack(TFCItems.OreChunk,1,9));
		MFRRegistry.registerLaserOre(8,new ItemStack(TFCItems.OreChunk,1,10));
		MFRRegistry.registerLaserOre(10,new ItemStack(TFCItems.OreChunk,1,11));
		MFRRegistry.registerLaserOre(10,new ItemStack(TFCItems.OreChunk,1,12));
		MFRRegistry.registerLaserOre(10,new ItemStack(TFCItems.OreChunk,1,13));
		MFRRegistry.registerLaserOre(12,new ItemStack(TFCItems.OreChunk,1,16));
		MFRRegistry.registerLaserOre(12,new ItemStack(TFCItems.OreChunk,1,20));
		MFRRegistry.registerLaserOre(8,new ItemStack(TFCItems.OreChunk,1,27));
		MFRRegistry.registerLaserOre(8,new ItemStack(TFCItems.OreChunk,1,28));
		MFRRegistry.registerLaserOre(22,new ItemStack(TFCItems.OreChunk,1,49));
		MFRRegistry.registerLaserOre(25,new ItemStack(TFCItems.OreChunk,1,50));
		MFRRegistry.registerLaserOre(15,new ItemStack(TFCItems.OreChunk,1,51));
		MFRRegistry.registerLaserOre(20,new ItemStack(TFCItems.OreChunk,1,52));
		MFRRegistry.registerLaserOre(18,new ItemStack(TFCItems.OreChunk,1,53));
		MFRRegistry.registerLaserOre(22,new ItemStack(TFCItems.OreChunk,1,54));
		MFRRegistry.registerLaserOre(24,new ItemStack(TFCItems.OreChunk,1,55));
		MFRRegistry.registerLaserOre(18,new ItemStack(TFCItems.OreChunk,1,56));
		MFRRegistry.registerLaserOre(12,new ItemStack(TFCItems.OreChunk,1,57));
		MFRRegistry.registerLaserOre(22,new ItemStack(TFCItems.OreChunk,1,58));
		MFRRegistry.registerLaserOre(18,new ItemStack(TFCItems.OreChunk,1,59));
		MFRRegistry.registerLaserOre(20,new ItemStack(TFCItems.OreChunk,1,60));
		MFRRegistry.registerLaserOre(20,new ItemStack(TFCItems.OreChunk,1,61));
		MFRRegistry.registerLaserOre(20,new ItemStack(TFCItems.OreChunk,1,62));
		MFRRegistry.registerLaserOre(32,new ItemStack(TFCItems.SmallOreChunk,1,0));
		MFRRegistry.registerLaserOre(35,new ItemStack(TFCItems.SmallOreChunk,1,1));
		MFRRegistry.registerLaserOre(25,new ItemStack(TFCItems.SmallOreChunk,1,2));
		MFRRegistry.registerLaserOre(30,new ItemStack(TFCItems.SmallOreChunk,1,3));
		MFRRegistry.registerLaserOre(28,new ItemStack(TFCItems.SmallOreChunk,1,4));
		MFRRegistry.registerLaserOre(32,new ItemStack(TFCItems.SmallOreChunk,1,5));
		MFRRegistry.registerLaserOre(34,new ItemStack(TFCItems.SmallOreChunk,1,6));
		MFRRegistry.registerLaserOre(28,new ItemStack(TFCItems.SmallOreChunk,1,7));
		MFRRegistry.registerLaserOre(22,new ItemStack(TFCItems.SmallOreChunk,1,8));
		MFRRegistry.registerLaserOre(32,new ItemStack(TFCItems.SmallOreChunk,1,9));
		MFRRegistry.registerLaserOre(28,new ItemStack(TFCItems.SmallOreChunk,1,10));
		MFRRegistry.registerLaserOre(30,new ItemStack(TFCItems.SmallOreChunk,1,11));
		MFRRegistry.registerLaserOre(30,new ItemStack(TFCItems.SmallOreChunk,1,12));
		MFRRegistry.registerLaserOre(30,new ItemStack(TFCItems.SmallOreChunk,1,13));
		
	}
}