package claymod.entities;

import claymod.rendering.RenderParticleEffects;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityClayBall extends EntityThrowable {

    private static final String __OBFID = "CL_000047465";
	
	public EntityClayBall(World par1World) {
		super(par1World);
	}

	public EntityClayBall(World par1World, EntityLivingBase par2EntityLiving) {
		super(par1World, par2EntityLiving);
	}

	public EntityClayBall(World par1World, double par2, double par4,
			double par6) {
		super(par1World, par2, par4, par6);
	}

	protected void onImpact(MovingObjectPosition par1MovingObjectPosition) {

		if (par1MovingObjectPosition.entityHit != null)
        {
            byte b0 = 0;

            par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), b0);
        }

		for (int i = 0; i < 8; ++i)
        {
            RenderParticleEffects.spawnParticle("clayballpoof", this.posX, this.posY, this.posZ, 0.0D, 0.0D, 0.0D);
        }

		if (!this.worldObj.isRemote) 
		{
            this.setDead();
        }
	}

}