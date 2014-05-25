package claymod.tools;

import claymod.main.ClayMod;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class CmClaySword extends ItemSword{

	private int color;

	public CmClaySword(ToolMaterial toolmat, int colorcode) {
		super(toolmat);
		this.color = colorcode;
        this.setCreativeTab(ClayMod.claymodTab);
        this.setTextureName(ClayMod.modid + ":" + "swordClay");
	}

	
    @SideOnly(Side.CLIENT)
    public int getColorFromItemStack(ItemStack par1ItemStack, int par2)
    {
    	return color;
    }
    
}
