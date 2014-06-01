package claymod.rendering;

import claymod.entities.EntityMudGolem;
import claymod.main.ClayMod;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;



@SideOnly(Side.CLIENT)
public class RenderMudGolem extends RenderLiving 
{

	private static final ResourceLocation claygolemTextures = new ResourceLocation(ClayMod.modid + ":" + "textures/entities/mudGolem.png");

    public RenderMudGolem(ModelBase modelBase, float fl)
    {
        super(modelBase, fl);
    }

    protected ResourceLocation getEntityTexture(EntityMudGolem entityClayGolem)
    {
        return claygolemTextures;
    }

    protected ResourceLocation getEntityTexture(Entity par1Entity)
    {
        return this.getEntityTexture((EntityMudGolem)par1Entity);
    }

}