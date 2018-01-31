package endreborn.entity.render;

import endreborn.entity.EntityInfZombie;
import endreborn.util.Reference;
import net.minecraft.client.model.ModelZombie;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderInfZombie extends RenderLiving<EntityInfZombie>
{
    private static final ResourceLocation INF_TEXTURES = new ResourceLocation(Reference.MODID, "textures/entity/entitinfzombie.png");

    public RenderInfZombie(RenderManager p_i47210_1_)
    {
        super(p_i47210_1_, new ModelZombie(), 0.5F);
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    
	@Override
	protected ResourceLocation getEntityTexture(EntityInfZombie entity) {
		return INF_TEXTURES;
	}
}
