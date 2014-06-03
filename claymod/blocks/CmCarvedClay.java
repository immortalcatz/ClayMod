package claymod.blocks;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import claymod.init.ClayParts;
import claymod.init.ClayTabs;
import claymod.main.ClayMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class CmCarvedClay extends Block
{
    @SideOnly(Side.CLIENT)
    private IIcon[] texture;
    
    private final static String[] SUBNAMES = {"White", "Orange", "Magenta", "Lightblue", "Yellow", "Lime", "Pink", "Gray", "Silver", "Cyan", "Purple", "Blue", "Brown", "Green", "Red", "Black"};

    public CmCarvedClay()
    {
        super(Material.rock);
        this.setCreativeTab(ClayTabs.claymodTab);
        this.setHardness(1.25F);
        this.setResistance(7.0F);
        this.setStepSound(soundTypePiston);
    }

    public MapColor getMapColor(int p_149728_1_)
    {
        return MapColor.adobeColor;
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister){
    texture = new IIcon[SUBNAMES.length];
    for(int i = 0; i < SUBNAMES.length; i++)
    texture[i] = iconRegister.registerIcon(ClayMod.modid + ":" + "/carved/" + "carvedClay" + SUBNAMES[i]);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item block, CreativeTabs creativeTabs, List list){
      for(int i = 0; i < SUBNAMES.length; ++i) {
       list.add(new ItemStack(block, 1, i));
      }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta){
    return texture[meta];
    }

    @Override
    public int damageDropped(int meta){
    return meta;
    }
}