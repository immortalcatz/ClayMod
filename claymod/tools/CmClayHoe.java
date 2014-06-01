package claymod.tools;

import claymod.init.ClayParts;
import claymod.init.ClayTabs;
import claymod.main.ClayMod;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class CmClayHoe extends ItemHoe{
	
	private int color;

	public CmClayHoe(ToolMaterial toolmat, int colorcode) {
		super(toolmat);
		this.color = colorcode;
        this.setCreativeTab(ClayTabs.claymodTab);
        this.setTextureName(ClayMod.modid + ":" + "hoeClay");
	}

    @SideOnly(Side.CLIENT)
    public int getColorFromItemStack(ItemStack par1ItemStack, int par2)
    {
    	return color;
    }

    public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack)
    {
        return ClayParts.colorRemover == par2ItemStack.getItem() ? true : super.getIsRepairable(par1ItemStack, par2ItemStack);
    }
}
