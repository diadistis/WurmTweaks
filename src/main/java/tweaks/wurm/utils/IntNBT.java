package tweaks.wurm.utils;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class IntNBT {
	
	public static ItemStack energy(ItemStack item,String energy, int val) {
		NBTTagCompound tag = new NBTTagCompound();
		tag.setInteger(energy, val);
		item.setTagCompound(tag);

		return item;
		
	}
}
