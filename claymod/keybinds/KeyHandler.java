package claymod.keybinds;

import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.player.EntityPlayer;

import org.lwjgl.input.Keyboard;

import claymod.gui.ClayGui;
import claymod.main.ClayMod;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent.KeyInputEvent;

public class KeyHandler {
	//public static KeyBinding claygui = new KeyBinding("ClayGUI", Keyboard.KEY_O, "ClayMod");

	public KeyHandler() {
	//	ClientRegistry.registerKeyBinding(claygui);
	}

	@SubscribeEvent
	public void KeyInputEvent(KeyInputEvent event) {
	/*	if(claygui.isPressed()) {
			System.out.println("ClayGUI opened.");
			if(Minecraft.getMinecraft().currentScreen == null) {
				EntityPlayer player = Minecraft.getMinecraft().thePlayer;
	    		player.openGui(ClayMod.instance, ClayGui.GUI_ID, player.worldObj, (int) player.posX, (int) player.posY, (int) player.posZ);
			}
		}*/
	}
}