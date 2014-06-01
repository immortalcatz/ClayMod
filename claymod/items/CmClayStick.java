package claymod.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import claymod.init.ClayTabs;
import claymod.main.ClayMod;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CmClayStick extends Item
{
	
	private int color;
	
    @SideOnly(Side.CLIENT)
    private static final String __OBFID = "CL_00000070";

    public CmClayStick(int colorcode)
    {
    	this.color = colorcode;
        this.setCreativeTab(ClayTabs.claymodTab);
        this.setTextureName(ClayMod.modid + ":" + "stickClay");
    }

    @SideOnly(Side.CLIENT)
    public int getColorFromItemStack(ItemStack par1ItemStack, int par2)
    {
    	return color;
    }

}
