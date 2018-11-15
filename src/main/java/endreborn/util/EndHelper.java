package endreborn.util;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.ReflectionHelper;

public class EndHelper 
{
	public static final String[] GUIMAINMENU_TITLEPANORAMAPATHS = new String[] { "TITLE_PANORAMA_PATHS", "field_73978_o", "o" };
	public static void setTitlePanoramaPaths(ResourceLocation[] titlePanoramaPaths) {
		Field field = ReflectionHelper.findField(GuiMainMenu.class, EndHelper.GUIMAINMENU_TITLEPANORAMAPATHS);
		
		Field modifiersField;
		try {
			modifiersField = Field.class.getDeclaredField("modifiers");
			modifiersField.setAccessible(true);
	        modifiersField.setInt(field, field.getModifiers() & ~Modifier.FINAL);

	        field.setAccessible(true);
	        field.set(null, titlePanoramaPaths);
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}


}
