package claymod.proxy;

import claymod.gui.ClayGui;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class CommonProxy implements IGuiHandler {

    public void registerKeyBindings () {}

    @Override
    public Object getServerGuiElement ( int ID, EntityPlayer player, World world, int x, int y, int z ) {
            return null;
    }

    @Override
    public Object getClientGuiElement ( int ID, EntityPlayer player, World world, int x, int y, int z ) {
            if ( ID == ClayGui.GUI_ID )
                    return new ClayGui();
            
            return null;
    }

	public void registerRenderers() {
		//Nothing here yet...
	}
}