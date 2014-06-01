package claymod.items;

import java.util.List;

import claymod.entities.EntityMudBall;
import claymod.init.ClayTabs;
import claymod.main.ClayMod;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

public class CmMudBall extends Item
{

    public CmMudBall(String string)
    {
        this.setCreativeTab(ClayTabs.claymodTab);
        this.setTextureName(ClayMod.modid + ":" + string);
        this.setUnlocalizedName(string);
    }
    
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
    if (!par3EntityPlayer.capabilities.isCreativeMode)
    {
        --par1ItemStack.stackSize;
    }

    par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

    if (!par2World.isRemote)
    {
        par2World.spawnEntityInWorld(new EntityMudBall(par2World, par3EntityPlayer));
    }

    return par1ItemStack;
    }

}
