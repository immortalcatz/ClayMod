package claymod.items.tools;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.StatCollector;
import claymod.init.ClayParts;
import claymod.init.ClayTabs;
import claymod.main.ClayMod;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CmClaySword extends ItemSword{

	private int color;

	public CmClaySword(ToolMaterial toolmat, int colorcode) {
		super(toolmat);
		this.color = colorcode;
        this.setCreativeTab(ClayTabs.claymodTab);
        this.setTextureName(ClayMod.modid + ":" + "swordClay");
	}

	public void addInformation(ItemStack stack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
	{
	    par3List.add(this.mainDesc());
	    par3List.add(this.usesDesc() + " " + (stack.getMaxDamage()-stack.getItemDamage()));

	}

	public String mainDesc()
	{
	    return StatCollector.translateToLocal("item." + "claySword" + ".maindesc");
	}
	
	public String usesDesc()
	{
	    return StatCollector.translateToLocal("item." + "claySword" + ".usesdesc");
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
