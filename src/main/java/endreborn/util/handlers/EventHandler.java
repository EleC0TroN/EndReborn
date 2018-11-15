package endreborn.util.handlers;

import endreborn.world.TeleporterEnd;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.management.PlayerList;
import net.minecraft.world.WorldServer;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;


@EventBusSubscriber
public class EventHandler 
{
	
	@SubscribeEvent
    public static void onPlayerPosition(LivingHurtEvent event) 
	{
        if(event.getEntityLiving() instanceof EntityPlayerMP && event.getEntityLiving().dimension == 1 
        		&& ConfigHandler.teleporterEnd && event.getEntityLiving().getPosition().getY() <= -6) 
        {
        	EntityPlayerMP player = (EntityPlayerMP) event.getEntityLiving();
        	PlayerList playerList = player.getEntityWorld().getMinecraftServer().getPlayerList();
        	
        	event.setCanceled(true);
        	playerList.transferPlayerToDimension(player, 0, 
        			new TeleporterEnd((WorldServer) player.getEntityWorld(), 
        					player.getPosition().getX(), 250, player.getPosition().getZ()));
        }
        }
	
}	
