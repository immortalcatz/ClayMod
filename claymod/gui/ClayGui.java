package claymod.gui;

import org.lwjgl.opengl.GL11;

import claymod.main.ClayMod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;

public class ClayGui extends GuiScreen {
        public ClayGui() {
		super();
	}
		public static final int GUI_ID = 25;
    	public static ResourceLocation texture = new ResourceLocation( ClayMod.modid + ":textures/gui/clayGui.png");
        
        public final int xSizeOfTexture = 176;
        public final int ySizeOfTexture = 88;
         	
        @Override
        public void drawScreen(int x, int y, float f)
        {
        drawDefaultBackground();

        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		Minecraft.getMinecraft().getTextureManager().bindTexture(texture);

        int posX = (this.width - xSizeOfTexture) / 2;
        int posY = (this.height - ySizeOfTexture) / 2;
        drawTexturedModalRect(posX, posY, 0, 0, xSizeOfTexture, ySizeOfTexture);
        super.drawScreen(x, y, f);
        GL11.glDisable(GL11.GL_LIGHTING);
		this.drawGuiContainerForegroundLayer(xSizeOfTexture, posY);
        GL11.glEnable(GL11.GL_LIGHTING);
        }
        
    	public void drawGuiContainerForegroundLayer(int xSize, int ySize){
    		String name = I18n.format("Clay GUI", new Object[0]);
    	
    		this.fontRendererObj.drawString(name, xSize - this.fontRendererObj.getStringWidth(name), ySizeOfTexture/2 +40, 4210752);
    	}
    	
        public void initGui()
        {
        this.buttonList.clear();

        int posX = (this.width - xSizeOfTexture) / 2;
        int posY = (this.height - ySizeOfTexture) / 2;

        this.buttonList.add(new GuiButton(0, posX+40, posY+50, 60, 20, "Something."));
        this.buttonList.add(new GuiButton(1, posX+ 120, posY + 10, 50, 20, "Close"));

        }
        private boolean entHeight = false;
        public void actionPerformed(GuiButton button){
        	switch(button.id){
        	case 0:
        		break;
        	case 1: this.mc.thePlayer.closeScreen();
        		break;

        	}
        }
        
        @Override
        public boolean doesGuiPauseGame()
        {
        return false;
        }

}