package claymod.itemblocks;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;

public class ItemBlockHomemadeClay extends ItemBlock{

	public ItemBlockHomemadeClay(Block block){
	super(block);
	}

	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
	{
	    par3List.add(this.mainDesc());
	}

	public String mainDesc()
	{
	    return StatCollector.translateToLocal("tile." + "homemadeClayBlock" + ".desc");
	}


	@Override
	public int getMetadata(int meta){
	return meta;
	}

	}

