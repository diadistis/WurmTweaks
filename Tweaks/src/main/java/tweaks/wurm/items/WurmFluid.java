package tweaks.wurm.items;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class WurmFluid extends BlockFluidClassic  {
    boolean alpha;
    public IIcon stillIcon;
    public IIcon flowIcon;
    boolean overwriteFluidIcons = true;
    private Fluid fluid = null;

    public WurmFluid(Fluid fluid, Material material)
    {
        super(fluid, material);

    }


    @Override
    public int getRenderBlockPass ()
    {
        return alpha ? 1 : 0;
    }

    @Override
    public void registerBlockIcons (IIconRegister register)
    {
    	stillIcon = register.registerIcon("wurmtweaks:" + this.getFluid().getBlock().getUnlocalizedName().substring(5, this.getFluid().getBlock().getUnlocalizedName().length()) + "_still");
    	flowIcon = register.registerIcon("wurmtweaks:" + this.getFluid().getBlock().getUnlocalizedName().substring(5, this.getFluid().getBlock().getUnlocalizedName().length()) + "_flow");

        if (overwriteFluidIcons)
            this.getFluid().setIcons(stillIcon, flowIcon);

        if(this.getFluid().getBlock() != this && fluid != null)
            fluid.setIcons(stillIcon, flowIcon);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon (int side, int meta)
    {
        if (side == 0 || side == 1)
            return stillIcon;
        return flowIcon;
    }

    public void suppressOverwritingFluidIcons ()
    {
        overwriteFluidIcons = false;
    }

    public void setFluid(Fluid fluid) {
        this.fluid = fluid;
    }
}