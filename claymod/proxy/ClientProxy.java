package claymod.proxy;

import net.minecraft.client.model.ModelSnowMan;
import net.minecraft.client.renderer.entity.RenderSnowball;
import claymod.entities.EntityClayBall;
import claymod.entities.EntityMudBall;
import claymod.entities.EntityMudGolem;
import claymod.init.ClayParts;
import claymod.models.ModelMudGolem;
import claymod.rendering.RenderMudGolem;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy{

	@Override
    public void registerRenderers() {
		RenderingRegistry.registerEntityRenderingHandler(EntityMudGolem.class,new RenderMudGolem(new ModelMudGolem(), 1.0F));
    	RenderingRegistry.registerEntityRenderingHandler(EntityMudBall.class, new RenderSnowball(ClayParts.mudBall));
    	RenderingRegistry.registerEntityRenderingHandler(EntityClayBall.class, new RenderSnowball(ClayParts.homemadeClayBall));

    }
	
}
