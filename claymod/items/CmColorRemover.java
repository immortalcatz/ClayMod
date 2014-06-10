package claymod.items;

import java.util.List;

import claymod.init.ClayTabs;
import claymod.main.ClayMod;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;

public class CmColorRemover extends Item {
	
	private static String name;

	public CmColorRemover(String string){
		name = string;
        this.setCreativeTab(ClayTabs.claymodTab);
        this.setTextureName(ClayMod.modid + ":" + string);
        this.setUnlocalizedName(string);
        this.setMaxDamage(32);
        this.maxStackSize = 1;
	}
	
	public void addInformation(ItemStack stack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
	{
	    par3List.add(this.mainDesc());
	    par3List.add(this.usesDesc() + " " + (stack.getMaxDamage()-stack.getItemDamage()));
	}

	public String mainDesc()
	{
	    return StatCollector.translateToLocal("item." + name + ".maindesc");
	}
	
	public String usesDesc()
	{
	    return StatCollector.translateToLocal("item." + name + ".usesdesc");
	}
	@Override
    public boolean hasContainerItem(ItemStack stack)
    {
        return true;
    }
    
    @Override
    public boolean doesContainerItemLeaveCraftingGrid(ItemStack itemStack)
    {
        return false;
    }

    
    @Override
    public boolean getShareTag()
    {
        return true;
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemStack)
    {
        ItemStack copiedStack = itemStack.copy();

        copiedStack.setItemDamage(copiedStack.getItemDamage() + 1);
        copiedStack.stackSize = 1;

        return copiedStack;
    }
}
