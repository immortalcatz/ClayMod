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

public class CmHardCarvedClay extends Block
{

    public CmHardCarvedClay()
    {
        super(Material.rock);
        this.setCreativeTab(ClayTabs.claymodTab);
        this.setHardness(1.25F);
        this.setResistance(7.0F);
        this.setStepSound(soundTypePiston);
        this.setBlockTextureName(ClayMod.modid + ":" + "/carved/" + "carvedClayHard");
        this.setBlockName("carvedClayHard");
    }

    public MapColor getMapColor(int p_149728_1_)
    {
        return MapColor.adobeColor;
    }
}