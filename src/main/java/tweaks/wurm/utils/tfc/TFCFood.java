package tweaks.wurm.utils.tfc;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class TFCFood {
	
	public static ItemStack getFood(Item item, float size) {
		ItemStack food = new ItemStack(item,1,0);
		food.stackTagCompound = new NBTTagCompound();
		food.stackTagCompound.setFloat("foodDecay", 0f);
		food.stackTagCompound.setFloat("foodWeight", size);
		return food;
	}
	
}
