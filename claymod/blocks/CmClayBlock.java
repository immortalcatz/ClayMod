package claymod.blocks;

import java.util.List;
import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import claymod.main.ClayMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;

public class CmClayBlock extends Block{

	public CmClayBlock(Material mat, String string) {
		super(mat);
		this.setBlockName(string);
		this.setBlockTextureName(ClayMod.modid + ":" + string);
		this.setHarvestLevel("spade", 0);
		this.setHardness(0.6F);
		this.setCreativeTab(ClayMod.claymodTab);
		this.setStepSound(soundTypeGravel);
		
	}
	
    public int quantityDropped(Random p_149745_1_)
    {
        return 4;
    }
	
    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return ClayMod.homemadeClayBall;
    }

}
