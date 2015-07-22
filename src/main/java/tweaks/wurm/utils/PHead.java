package tweaks.wurm.utils;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class PHead {
	public static ItemStack getHead(String name) {
		
		ItemStack Head = new ItemStack(Items.skull,1,3);
		Head.stackTagCompound  = new NBTTagCompound();
		Head.stackTagCompound.setString("SkullOwner", name);
		return Head;
		
	}
}
