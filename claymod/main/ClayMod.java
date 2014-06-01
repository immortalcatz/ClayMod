package claymod.main;

import java.io.File;

import claymod.blocks.CmClayBlock;
import claymod.blocks.CmMudBlock;
import claymod.config.ConfigurationHandler;
import claymod.init.ClayArrays;
import claymod.init.ClayRecipes;
import claymod.init.LoadMod;
import claymod.items.CmClayBall;
import claymod.items.CmClayStick;
import claymod.items.CmColorRemover;
import claymod.items.CmMudBall;
import claymod.keybinds.KeyHandler;
import claymod.lib.ClayColors;
import claymod.lib.ClayStrings;
import claymod.proxy.CommonProxy;
import claymod.tools.CmClayAxe;
import claymod.tools.CmClayHoe;
import claymod.tools.CmClayPickaxe;
import claymod.tools.CmClayShovel;
import claymod.tools.CmClaySword;
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
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockAnvil;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

@Mod(modid=ClayMod.modid, name=ClayMod.name, version=ClayMod.version)
public class ClayMod {

	//Change version on update!
	public static final String version = "1.1";
	public static final String modid = "claymod";
	public static final String name = "The Clay Mod";
	public static final String author = "KeeperofMee";

        // The instance of your mod that Forge uses.
        @Instance("claymod")
        public static ClayMod instance;
       
        @SidedProxy(clientSide="claymod.proxy.ClientProxy", serverSide="claymod.proxy.CommonProxy")
        public static CommonProxy proxy;
        private EntityPlayer player;
        
        @EventHandler
        public void preInit(FMLPreInitializationEvent event) {   
        	FMLCommonHandler.instance().bus().register(new KeyHandler());
            ConfigurationHandler.init(new File(event.getModConfigurationDirectory().getAbsolutePath() + File.separator + this.author + "'s mods" + File.separator + this.modid + ".cfg"));
            proxy.registerKeyBindings();
            NetworkRegistry.INSTANCE.registerGuiHandler(instance, proxy);

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


