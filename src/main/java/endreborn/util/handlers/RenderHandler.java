package endreborn.util.handlers;

import endreborn.enity.EntityEGuard;
import endreborn.enity.EntityWatcher;
import endreborn.enity.render.RenderEGuard;
import endreborn.enity.render.RenderWatcher;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler 
{
	public static void registerEntityRenders()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityEGuard.class, new IRenderFactory<EntityEGuard>()
		{
			@Override
			public Render<? super EntityEGuard> createRenderFor(RenderManager manager) 
			{
				return new RenderEGuard(manager);
			}
	});
		RenderingRegistry.registerEntityRenderingHandler(EntityWatcher.class, new IRenderFactory<EntityWatcher>()
		{
		@Override
		public Render<? super EntityWatcher> createRenderFor(RenderManager manager) 
		{
			return new RenderWatcher(manager);
		}
	});
	}
}
