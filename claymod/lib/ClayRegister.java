package claymod.lib;

import claymod.main.ClayMod;
import cpw.mods.fml.common.registry.GameRegistry;

public class ClayRegister {

	public static void addClayStuff(){
		ClayMod m = new ClayMod();
		ClayStrings CS= new ClayStrings();

        GameRegistry.registerItem(m.mudBall, "mudBall");
        GameRegistry.registerItem(m.homemadeClayBall, "homemadeClayBall");
        GameRegistry.registerBlock(m.homemadeClayBlock, "homemadeClayBlock");
        GameRegistry.registerBlock(m.mudBlock, "mudBlock");

        GameRegistry.registerItem(m.blackClayStick, CS.BLACKCLAYSTICK_NAME);
        GameRegistry.registerItem(m.redClayStick, CS.REDCLAYSTICK_NAME);
        GameRegistry.registerItem(m.greenClayStick, CS.GREENCLAYSTICK_NAME);
        GameRegistry.registerItem(m.brownClayStick, CS.BROWNCLAYSTICK_NAME);
        GameRegistry.registerItem(m.blueClayStick, CS.BLUECLAYSTICK_NAME);
        GameRegistry.registerItem(m.purpleClayStick, CS.PURPLECLAYSTICK_NAME);
        GameRegistry.registerItem(m.cyanClayStick, CS.CYANCLAYSTICK_NAME);
        GameRegistry.registerItem(m.lightgrayClayStick, CS.LIGHTGRAYCLAYSTICK_NAME);
        GameRegistry.registerItem(m.grayClayStick, CS.GRAYCLAYSTICK_NAME);
        GameRegistry.registerItem(m.pinkClayStick, CS.PINKCLAYSTICK_NAME);
        GameRegistry.registerItem(m.limeClayStick, CS.LIMECLAYSTICK_NAME);
        GameRegistry.registerItem(m.yellowClayStick, CS.YELLOWCLAYSTICK_NAME);
        GameRegistry.registerItem(m.lightblueClayStick, CS.LIGHTBLUECLAYSTICK_NAME);
        GameRegistry.registerItem(m.magentaClayStick, CS.MAGENTACLAYSTICK_NAME);
        GameRegistry.registerItem(m.orangeClayStick, CS.ORANGECLAYSTICK_NAME);
        GameRegistry.registerItem(m.whiteClayStick, CS.WHITECLAYSTICK_NAME);
        GameRegistry.registerItem(m.hardClayStick, CS.HARDCLAYSTICK_NAME);

	}
	
	public static void addTools(){
		ClayMod m = new ClayMod();
		ClayStrings CS= new ClayStrings();

        GameRegistry.registerItem(m.blackPickaxe, CS.BLACKPICKAXE_NAME);
        GameRegistry.registerItem(m.redPickaxe, CS.REDPICKAXE_NAME);
        GameRegistry.registerItem(m.greenPickaxe, CS.GREENPICKAXE_NAME);
        GameRegistry.registerItem(m.brownPickaxe, CS.BROWNPICKAXE_NAME);
        GameRegistry.registerItem(m.bluePickaxe, CS.BLUEPICKAXE_NAME);
        GameRegistry.registerItem(m.purplePickaxe, CS.PURPLEPICKAXE_NAME);
        GameRegistry.registerItem(m.cyanPickaxe, CS.CYANPICKAXE_NAME);
        GameRegistry.registerItem(m.lightgrayPickaxe, CS.LIGHTGRAYPICKAXE_NAME);
        GameRegistry.registerItem(m.grayPickaxe, CS.GRAYPICKAXE_NAME);
        GameRegistry.registerItem(m.pinkPickaxe, CS.PINKPICKAXE_NAME);
        GameRegistry.registerItem(m.limePickaxe, CS.LIMEPICKAXE_NAME);
        GameRegistry.registerItem(m.yellowPickaxe, CS.YELLOWPICKAXE_NAME);
        GameRegistry.registerItem(m.lightbluePickaxe, CS.LIGHTBLUEPICKAXE_NAME);
        GameRegistry.registerItem(m.magentaPickaxe, CS.MAGENTAPICKAXE_NAME);
        GameRegistry.registerItem(m.orangePickaxe, CS.ORANGEPICKAXE_NAME);
        GameRegistry.registerItem(m.whitePickaxe, CS.WHITEPICKAXE_NAME);
        GameRegistry.registerItem(m.hardPickaxe, CS.HARDPICKAXE_NAME);

        GameRegistry.registerItem(m.blackAxe, CS.BLACKAXE_NAME);
        GameRegistry.registerItem(m.redAxe, CS.REDAXE_NAME);
        GameRegistry.registerItem(m.greenAxe, CS.GREENAXE_NAME);
        GameRegistry.registerItem(m.brownAxe, CS.BROWNAXE_NAME);
        GameRegistry.registerItem(m.blueAxe, CS.BLUEAXE_NAME);
        GameRegistry.registerItem(m.purpleAxe, CS.PURPLEAXE_NAME);
        GameRegistry.registerItem(m.cyanAxe, CS.CYANAXE_NAME);
        GameRegistry.registerItem(m.lightgrayAxe, CS.LIGHTGRAYAXE_NAME);
        GameRegistry.registerItem(m.grayAxe, CS.GRAYAXE_NAME);
        GameRegistry.registerItem(m.pinkAxe, CS.PINKAXE_NAME);
        GameRegistry.registerItem(m.limeAxe, CS.LIMEAXE_NAME);
        GameRegistry.registerItem(m.yellowAxe, CS.YELLOWAXE_NAME);
        GameRegistry.registerItem(m.lightblueAxe, CS.LIGHTBLUEAXE_NAME);
        GameRegistry.registerItem(m.magentaAxe, CS.MAGENTAAXE_NAME);
        GameRegistry.registerItem(m.orangeAxe, CS.ORANGEAXE_NAME);
        GameRegistry.registerItem(m.whiteAxe, CS.WHITEAXE_NAME);
        GameRegistry.registerItem(m.hardAxe, CS.HARDAXE_NAME);
        
        GameRegistry.registerItem(m.blackHoe, CS.BLACKHOE_NAME);
        GameRegistry.registerItem(m.redHoe, CS.REDHOE_NAME);
        GameRegistry.registerItem(m.greenHoe, CS.GREENHOE_NAME);
        GameRegistry.registerItem(m.brownHoe, CS.BROWNHOE_NAME);
        GameRegistry.registerItem(m.blueHoe, CS.BLUEHOE_NAME);
        GameRegistry.registerItem(m.purpleHoe, CS.PURPLEHOE_NAME);
        GameRegistry.registerItem(m.cyanHoe, CS.CYANHOE_NAME);
        GameRegistry.registerItem(m.lightgrayHoe, CS.LIGHTGRAYHOE_NAME);
        GameRegistry.registerItem(m.grayHoe, CS.GRAYHOE_NAME);
        GameRegistry.registerItem(m.pinkHoe, CS.PINKHOE_NAME);
        GameRegistry.registerItem(m.limeHoe, CS.LIMEHOE_NAME);
        GameRegistry.registerItem(m.yellowHoe, CS.YELLOWHOE_NAME);
        GameRegistry.registerItem(m.lightblueHoe, CS.LIGHTBLUEHOE_NAME);
        GameRegistry.registerItem(m.magentaHoe, CS.MAGENTAHOE_NAME);
        GameRegistry.registerItem(m.orangeHoe, CS.ORANGEHOE_NAME);
        GameRegistry.registerItem(m.whiteHoe, CS.WHITEHOE_NAME);
        GameRegistry.registerItem(m.hardHoe, CS.HARDHOE_NAME);
        
        GameRegistry.registerItem(m.blackShovel, CS.BLACKSHOVEL_NAME);
        GameRegistry.registerItem(m.redShovel, CS.REDSHOVEL_NAME);
        GameRegistry.registerItem(m.greenShovel, CS.GREENSHOVEL_NAME);
        GameRegistry.registerItem(m.brownShovel, CS.BROWNSHOVEL_NAME);
        GameRegistry.registerItem(m.blueShovel, CS.BLUESHOVEL_NAME);
        GameRegistry.registerItem(m.purpleShovel, CS.PURPLESHOVEL_NAME);
        GameRegistry.registerItem(m.cyanShovel, CS.CYANSHOVEL_NAME);
        GameRegistry.registerItem(m.lightgrayShovel, CS.LIGHTGRAYSHOVEL_NAME);
        GameRegistry.registerItem(m.grayShovel, CS.GRAYSHOVEL_NAME);
        GameRegistry.registerItem(m.pinkShovel, CS.PINKSHOVEL_NAME);
        GameRegistry.registerItem(m.limeShovel, CS.LIMESHOVEL_NAME);
        GameRegistry.registerItem(m.yellowShovel, CS.YELLOWSHOVEL_NAME);
        GameRegistry.registerItem(m.lightblueShovel, CS.LIGHTBLUESHOVEL_NAME);
        GameRegistry.registerItem(m.magentaShovel, CS.MAGENTASHOVEL_NAME);
        GameRegistry.registerItem(m.orangeShovel, CS.ORANGESHOVEL_NAME);
        GameRegistry.registerItem(m.whiteShovel, CS.WHITESHOVEL_NAME);
        GameRegistry.registerItem(m.hardShovel, CS.HARDSHOVEL_NAME);
        
        GameRegistry.registerItem(m.blackSword, CS.BLACKSWORD_NAME);
        GameRegistry.registerItem(m.redSword, CS.REDSWORD_NAME);
        GameRegistry.registerItem(m.greenSword, CS.GREENSWORD_NAME);
        GameRegistry.registerItem(m.brownSword, CS.BROWNSWORD_NAME);
        GameRegistry.registerItem(m.blueSword, CS.BLUESWORD_NAME);
        GameRegistry.registerItem(m.purpleSword, CS.PURPLESWORD_NAME);
        GameRegistry.registerItem(m.cyanSword, CS.CYANSWORD_NAME);
        GameRegistry.registerItem(m.lightgraySword, CS.LIGHTGRAYSWORD_NAME);
        GameRegistry.registerItem(m.graySword, CS.GRAYSWORD_NAME);
        GameRegistry.registerItem(m.pinkSword, CS.PINKSWORD_NAME);
        GameRegistry.registerItem(m.limeSword, CS.LIMESWORD_NAME);
        GameRegistry.registerItem(m.yellowSword, CS.YELLOWSWORD_NAME);
        GameRegistry.registerItem(m.lightblueSword, CS.LIGHTBLUESWORD_NAME);
        GameRegistry.registerItem(m.magentaSword, CS.MAGENTASWORD_NAME);
        GameRegistry.registerItem(m.orangeSword, CS.ORANGESWORD_NAME);
        GameRegistry.registerItem(m.whiteSword, CS.WHITESWORD_NAME);
        GameRegistry.registerItem(m.hardSword, CS.HARDSWORD_NAME);

	}
}
