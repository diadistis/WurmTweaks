package tweaks.wurm.items;

import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class WurmCItem extends Item {
	
	private static Boolean effect;
	private static EnumRarity rare;
	
	public WurmCItem(Boolean Effect,EnumRarity Rare) {
		effect = Effect;
		rare = Rare;
	}
	
	@Override
	public boolean hasEffect(ItemStack par1ItemStack){
		return effect;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public EnumRarity getRarity(ItemStack par1ItemStack){
		return rare;
	}

}
