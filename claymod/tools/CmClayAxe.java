package claymod.tools;

import claymod.main.ClayMod;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

public class CmClayAxe extends ItemAxe{
	
	private int color;

	public CmClayAxe(ToolMaterial toolmat, int colorcode) {
		super(toolmat);
		this.color = colorcode;
        this.setCreativeTab(ClayMod.claymodTab);
        this.setTextureName(ClayMod.modid + ":" + "axeClay");
	}
	
    @SideOnly(Side.CLIENT)
    public int getColorFromItemStack(ItemStack par1ItemStack, int par2)
    {
    	return color;
    }
}
