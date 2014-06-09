package claymod.main;

import java.io.File;

import claymod.config.ConfigurationHandler;
import claymod.entities.EntityClayBall;
import claymod.entities.EntityMudBall;
import claymod.init.LoadMod;
import claymod.keybinds.KeyHandler;
import claymod.proxy.CommonProxy;
import claymod.worldgen.ClayWorldgen;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid=ClayMod.modid, name=ClayMod.name, version=ClayMod.version)
public class ClayMod {

	//Change version on update!
	public static final String version = "1.2";
	public static final String modid = "claymod";
	public static final String name = "The Clay Mod";
	public static final String author = "KeeperofMee";

        // The instance of your mod that Forge uses.
        @Instance("claymod")
        public static ClayMod instance;
       
        @SidedProxy(clientSide="claymod.proxy.ClientProxy", serverSide="claymod.proxy.CommonProxy")
        public static CommonProxy proxy;
        
    	int clayID = 0;
    	int mudID = 1;
        @EventHandler
        public void preInit(FMLPreInitializationEvent event) {   
        	
        	FMLCommonHandler.instance().bus().register(new KeyHandler());
            ConfigurationHandler.init(new File(event.getModConfigurationDirectory().getAbsolutePath() + File.separator + this.author + "'s mods" + File.separator + this.modid + ".cfg"));
            proxy.registerKeyBindings();
            NetworkRegistry.INSTANCE.registerGuiHandler(instance, proxy);

        	EntityRegistry.registerModEntity(EntityMudBall.class, "Mud Ball", ++mudID, this, 64, 10, true);
        	EntityRegistry.registerModEntity(EntityClayBall.class, "Clay Ball", ++clayID, this, 64, 10, true);
               LoadMod.load();

       		GameRegistry.registerWorldGenerator(new ClayWorldgen(), 0);
        }
        

		@EventHandler
        public void load(FMLInitializationEvent event) {
                proxy.registerRenderers();
                

        }
        
        @EventHandler
        public void postInit(FMLPostInitializationEvent event) {
                // Stub Method
        }
        

        

}


