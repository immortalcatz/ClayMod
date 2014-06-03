package claymod.itemblocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockCarvedClay extends ItemBlock{

private final static String[] SUBNAMES = {"White", "Orange", "Magenta", "Lightblue", "Yellow", "Lightgreen", "Pink", "Darkgrey", "Lightgrey", "Cyan", "Purple", "Blue", "Brown", "Green", "Red", "Black"};

public ItemBlockCarvedClay(Block block){
super(block);
setHasSubtypes(true);
}

@Override
public String getItemStackDisplayName(ItemStack is){
return "Chiseled " + SUBNAMES[is.getItemDamage()] + " Stained Clay";
}

@Override
public int getMetadata(int meta){
return meta;
}

}