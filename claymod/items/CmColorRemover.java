package claymod.items;

import java.util.List;

import claymod.init.ClayTabs;
import claymod.main.ClayMod;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;

public class CmColorRemover extends Item {
	public CmColorRemover(String string){
        this.setCreativeTab(ClayTabs.claymodTab);
        this.setTextureName(ClayMod.modid + ":" + string);
        this.setUnlocalizedName(string);
	}
	
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
	{
	    par3List.add(this.func_150927_i());
	}

	public String func_150927_i()
	{
	    return StatCollector.translateToLocal("item.colorRemover.desc");
	}
}
