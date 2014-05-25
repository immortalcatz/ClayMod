package claymod.tools;

import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import claymod.main.ClayMod;

import com.google.common.collect.Sets;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;



public class CmClayPickaxe extends ItemPickaxe{

	private int color;

	public CmClayPickaxe(ToolMaterial toolmat, int colorcode) {
		super(toolmat);
		this.color = colorcode;
        this.setCreativeTab(ClayMod.claymodTab);
        this.setTextureName(ClayMod.modid + ":" + "pickaxeClay");
	}
	
    @SideOnly(Side.CLIENT)
    public int getColorFromItemStack(ItemStack par1ItemStack, int par2)
    {
    	return color;
    }

}