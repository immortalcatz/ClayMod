package claymod.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import claymod.blocks.CmClayBlock;
import claymod.blocks.CmMudBlock;
import claymod.items.CmClayBall;
import claymod.items.CmClayStick;
import claymod.items.CmColorRemover;
import claymod.items.CmMudBall;
import claymod.lib.ClayColors;
import claymod.lib.ClayStrings;
import claymod.tools.CmClayAxe;
import claymod.tools.CmClayHoe;
import claymod.tools.CmClayPickaxe;
import claymod.tools.CmClayShovel;
import claymod.tools.CmClaySword;

public class ClayParts {

 	public static ClayColors CC = new ClayColors();
  	public static ClayStrings CS = new ClayStrings();
  	public static ClayArrays CA = new ClayArrays();
  	
    //Tool Material
    public static ToolMaterial ClayMaterial = EnumHelper.addToolMaterial("CLAY", 2, 196, 5.0F, 1.5F, 10);
    
    //Balls
    public static Item mudBall;
    public static Item homemadeClayBall;
    public static Item colorRemover;

    //Blocks
    public static Block homemadeClayBlock;
    public static Block mudBlock;
    
    //Sticks
    public static Item blackClayStick;
    public static Item redClayStick;
    public static Item greenClayStick;
    public static Item brownClayStick;
    public static Item blueClayStick;
    public static Item purpleClayStick;
    public static Item cyanClayStick;
    public static Item lightgrayClayStick;
    public static Item grayClayStick;
    public static Item pinkClayStick;
    public static Item limeClayStick;
    public static Item yellowClayStick;
    public static Item lightblueClayStick;
    public static Item magentaClayStick;
    public static Item orangeClayStick;
    public static Item whiteClayStick;
    public static Item hardClayStick;

    //Tools
    public static Item blackPickaxe;
    public static Item redPickaxe;
    public static Item greenPickaxe;
    public static Item brownPickaxe;
    public static Item bluePickaxe;
    public static Item purplePickaxe;
    public static Item cyanPickaxe;
    public static Item lightgrayPickaxe;
    public static Item grayPickaxe;
    public static Item pinkPickaxe;
    public static Item limePickaxe;
    public static Item yellowPickaxe;
    public static Item lightbluePickaxe;
    public static Item magentaPickaxe;
    public static Item orangePickaxe;
    public static Item whitePickaxe;
    public static Item hardPickaxe;

    public static Item blackAxe;
    public static Item redAxe;
    public static Item greenAxe;
    public static Item brownAxe;
    public static Item blueAxe;
    public static Item purpleAxe;
    public static Item cyanAxe;
    public static Item lightgrayAxe;
    public static Item grayAxe;
    public static Item pinkAxe;
    public static Item limeAxe;
    public static Item yellowAxe;
    public static Item lightblueAxe;
    public static Item magentaAxe;
    public static Item orangeAxe;
    public static Item whiteAxe;
    public static Item hardAxe;

    public static Item blackHoe;
    public static Item redHoe;
    public static Item greenHoe;
    public static Item brownHoe;
    public static Item blueHoe;
    public static Item purpleHoe;
    public static Item cyanHoe;
    public static Item lightgrayHoe;
    public static Item grayHoe;
    public static Item pinkHoe;
    public static Item limeHoe;
    public static Item yellowHoe;
    public static Item lightblueHoe;
    public static Item magentaHoe;
    public static Item orangeHoe;
    public static Item whiteHoe;
    public static Item hardHoe;

    public static Item blackShovel;
    public static Item redShovel;
    public static Item greenShovel;
    public static Item brownShovel;
    public static Item blueShovel;
    public static Item purpleShovel;
    public static Item cyanShovel;
    public static Item lightgrayShovel;
    public static Item grayShovel;
    public static Item pinkShovel;
    public static Item limeShovel;
    public static Item yellowShovel;
    public static Item lightblueShovel;
    public static Item magentaShovel;
    public static Item orangeShovel;
    public static Item whiteShovel;
    public static Item hardShovel;

    public static Item blackSword;
    public static Item redSword;
    public static Item greenSword;
    public static Item brownSword;
    public static Item blueSword;
    public static Item purpleSword;
    public static Item cyanSword;
    public static Item lightgraySword;
    public static Item graySword;
    public static Item pinkSword;
    public static Item limeSword;
    public static Item yellowSword;
    public static Item lightblueSword;
    public static Item magentaSword;
    public static Item orangeSword;
    public static Item whiteSword;
    public static Item hardSword;
    
    protected static void init(){
    	addClayStuff();
    }
	private static void addClayStuff(){
        
		
        //Balls
           mudBall = new CmMudBall("mudBall");
           homemadeClayBall = new CmClayBall("homemadeClayBall");
           colorRemover = new CmColorRemover("colorRemover");
           
        //Blocks
           homemadeClayBlock = new CmClayBlock(Material.clay, "homemadeClayBlock");
           mudBlock = new CmMudBlock(Material.clay, "mudBlock");

        //Sticks
           blackClayStick = new CmClayStick(CC.BLACKCLAYSTICK_COLOR).setUnlocalizedName(CS.BLACKCLAYSTICK_NAME);
           redClayStick = new CmClayStick(CC.REDCLAYSTICK_COLOR).setUnlocalizedName(CS.REDCLAYSTICK_NAME);
           greenClayStick = new CmClayStick(CC.GREENCLAYSTICK_COLOR).setUnlocalizedName(CS.GREENCLAYSTICK_NAME);
           brownClayStick = new CmClayStick(CC.BROWNCLAYSTICK_COLOR).setUnlocalizedName(CS.BROWNCLAYSTICK_NAME);
           blueClayStick = new CmClayStick(CC.BLUECLAYSTICK_COLOR).setUnlocalizedName(CS.BLUECLAYSTICK_NAME);
           purpleClayStick = new CmClayStick(CC.PURPLECLAYSTICK_COLOR).setUnlocalizedName(CS.PURPLECLAYSTICK_NAME);
           cyanClayStick = new CmClayStick(CC.CYANCLAYSTICK_COLOR).setUnlocalizedName(CS.CYANCLAYSTICK_NAME);
           lightgrayClayStick = new CmClayStick(CC.LIGHTGRAYCLAYSTICK_COLOR).setUnlocalizedName(CS.LIGHTGRAYCLAYSTICK_NAME);
           grayClayStick = new CmClayStick(CC.GRAYCLAYSTICK_COLOR).setUnlocalizedName(CS.GRAYCLAYSTICK_NAME);
           pinkClayStick = new CmClayStick(CC.PINKCLAYSTICK_COLOR).setUnlocalizedName(CS.PINKCLAYSTICK_NAME);
           limeClayStick = new CmClayStick(CC.LIMECLAYSTICK_COLOR).setUnlocalizedName(CS.LIMECLAYSTICK_NAME);
           yellowClayStick = new CmClayStick(CC.YELLOWCLAYSTICK_COLOR).setUnlocalizedName(CS.YELLOWCLAYSTICK_NAME);
           lightblueClayStick = new CmClayStick(CC.LIGHTBLUECLAYSTICK_COLOR).setUnlocalizedName(CS.LIGHTBLUECLAYSTICK_NAME);
           magentaClayStick = new CmClayStick(CC.MAGENTACLAYSTICK_COLOR).setUnlocalizedName(CS.MAGENTACLAYSTICK_NAME);
           orangeClayStick = new CmClayStick(CC.ORANGECLAYSTICK_COLOR).setUnlocalizedName(CS.ORANGECLAYSTICK_NAME);
           whiteClayStick = new CmClayStick(CC.WHITECLAYSTICK_COLOR).setUnlocalizedName(CS.WHITECLAYSTICK_NAME);
           hardClayStick = new CmClayStick(CC.HARDCLAYSTICK_COLOR).setUnlocalizedName(CS.HARDCLAYSTICK_NAME);

         //Tools
           blackPickaxe = new CmClayPickaxe(ClayMaterial, CC.BLACKPICKAXE_COLOR).setUnlocalizedName(CS.BLACKPICKAXE_NAME);
           redPickaxe = new CmClayPickaxe(ClayMaterial, CC.REDPICKAXE_COLOR).setUnlocalizedName(CS.REDPICKAXE_NAME);
           greenPickaxe = new CmClayPickaxe(ClayMaterial, CC.GREENPICKAXE_COLOR).setUnlocalizedName(CS.GREENPICKAXE_NAME);
           brownPickaxe = new CmClayPickaxe(ClayMaterial, CC.BROWNPICKAXE_COLOR).setUnlocalizedName(CS.BROWNPICKAXE_NAME);
           bluePickaxe = new CmClayPickaxe(ClayMaterial, CC.BLUEPICKAXE_COLOR).setUnlocalizedName(CS.BLUEPICKAXE_NAME);
           purplePickaxe = new CmClayPickaxe(ClayMaterial, CC.PURPLEPICKAXE_COLOR).setUnlocalizedName(CS.PURPLEPICKAXE_NAME);
           cyanPickaxe = new CmClayPickaxe(ClayMaterial, CC.CYANPICKAXE_COLOR).setUnlocalizedName(CS.CYANPICKAXE_NAME);
           lightgrayPickaxe = new CmClayPickaxe(ClayMaterial, CC.LIGHTGRAYPICKAXE_COLOR).setUnlocalizedName(CS.LIGHTGRAYPICKAXE_NAME);
           grayPickaxe = new CmClayPickaxe(ClayMaterial, CC.GRAYPICKAXE_COLOR).setUnlocalizedName(CS.GRAYPICKAXE_NAME);
           pinkPickaxe = new CmClayPickaxe(ClayMaterial, CC.PINKPICKAXE_COLOR).setUnlocalizedName(CS.PINKPICKAXE_NAME);
           limePickaxe = new CmClayPickaxe(ClayMaterial, CC.LIMEPICKAXE_COLOR).setUnlocalizedName(CS.LIMEPICKAXE_NAME);
           yellowPickaxe = new CmClayPickaxe(ClayMaterial, CC.YELLOWPICKAXE_COLOR).setUnlocalizedName(CS.YELLOWPICKAXE_NAME);
           lightbluePickaxe = new CmClayPickaxe(ClayMaterial, CC.LIGHTBLUEPICKAXE_COLOR).setUnlocalizedName(CS.LIGHTBLUEPICKAXE_NAME);
           magentaPickaxe = new CmClayPickaxe(ClayMaterial, CC.MAGENTAPICKAXE_COLOR).setUnlocalizedName(CS.MAGENTAPICKAXE_NAME);
           orangePickaxe = new CmClayPickaxe(ClayMaterial, CC.ORANGEPICKAXE_COLOR).setUnlocalizedName(CS.ORANGEPICKAXE_NAME);
           whitePickaxe = new CmClayPickaxe(ClayMaterial, CC.WHITEPICKAXE_COLOR).setUnlocalizedName(CS.WHITEPICKAXE_NAME);
           hardPickaxe = new CmClayPickaxe(ClayMaterial, CC.HARDPICKAXE_COLOR).setUnlocalizedName(CS.HARDPICKAXE_NAME);

           blackAxe = new CmClayAxe(ClayMaterial, CC.BLACKAXE_COLOR).setUnlocalizedName(CS.BLACKAXE_NAME);
           redAxe = new CmClayAxe(ClayMaterial, CC.REDAXE_COLOR).setUnlocalizedName(CS.REDAXE_NAME);
           greenAxe = new CmClayAxe(ClayMaterial, CC.GREENAXE_COLOR).setUnlocalizedName(CS.GREENAXE_NAME);
           brownAxe = new CmClayAxe(ClayMaterial, CC.BROWNAXE_COLOR).setUnlocalizedName(CS.BROWNAXE_NAME);
           blueAxe = new CmClayAxe(ClayMaterial, CC.BLUEAXE_COLOR).setUnlocalizedName(CS.BLUEAXE_NAME);
           purpleAxe = new CmClayAxe(ClayMaterial, CC.PURPLEAXE_COLOR).setUnlocalizedName(CS.PURPLEAXE_NAME);
           cyanAxe = new CmClayAxe(ClayMaterial, CC.CYANAXE_COLOR).setUnlocalizedName(CS.CYANAXE_NAME);
           lightgrayAxe = new CmClayAxe(ClayMaterial, CC.LIGHTGRAYAXE_COLOR).setUnlocalizedName(CS.LIGHTGRAYAXE_NAME);
           grayAxe = new CmClayAxe(ClayMaterial, CC.GRAYAXE_COLOR).setUnlocalizedName(CS.GRAYAXE_NAME);
           pinkAxe = new CmClayAxe(ClayMaterial, CC.PINKAXE_COLOR).setUnlocalizedName(CS.PINKAXE_NAME);
           limeAxe = new CmClayAxe(ClayMaterial, CC.LIMEAXE_COLOR).setUnlocalizedName(CS.LIMEAXE_NAME);
           yellowAxe = new CmClayAxe(ClayMaterial, CC.YELLOWAXE_COLOR).setUnlocalizedName(CS.YELLOWAXE_NAME);
           lightblueAxe = new CmClayAxe(ClayMaterial, CC.LIGHTBLUEAXE_COLOR).setUnlocalizedName(CS.LIGHTBLUEAXE_NAME);
           magentaAxe = new CmClayAxe(ClayMaterial, CC.MAGENTAAXE_COLOR).setUnlocalizedName(CS.MAGENTAAXE_NAME);
           orangeAxe = new CmClayAxe(ClayMaterial, CC.ORANGEAXE_COLOR).setUnlocalizedName(CS.ORANGEAXE_NAME);
           whiteAxe = new CmClayAxe(ClayMaterial, CC.WHITEAXE_COLOR).setUnlocalizedName(CS.WHITEAXE_NAME);
           hardAxe = new CmClayAxe(ClayMaterial, CC.HARDAXE_COLOR).setUnlocalizedName(CS.HARDAXE_NAME);

           blackHoe = new CmClayHoe(ClayMaterial, CC.BLACKHOE_COLOR).setUnlocalizedName(CS.BLACKHOE_NAME);
           redHoe = new CmClayHoe(ClayMaterial, CC.REDHOE_COLOR).setUnlocalizedName(CS.REDHOE_NAME);
           greenHoe = new CmClayHoe(ClayMaterial, CC.GREENHOE_COLOR).setUnlocalizedName(CS.GREENHOE_NAME);
           brownHoe = new CmClayHoe(ClayMaterial, CC.BROWNHOE_COLOR).setUnlocalizedName(CS.BROWNHOE_NAME);
           blueHoe = new CmClayHoe(ClayMaterial, CC.BLUEHOE_COLOR).setUnlocalizedName(CS.BLUEHOE_NAME);
           purpleHoe = new CmClayHoe(ClayMaterial, CC.PURPLEHOE_COLOR).setUnlocalizedName(CS.PURPLEHOE_NAME);
           cyanHoe = new CmClayHoe(ClayMaterial, CC.CYANHOE_COLOR).setUnlocalizedName(CS.CYANHOE_NAME);
           lightgrayHoe = new CmClayHoe(ClayMaterial, CC.LIGHTGRAYHOE_COLOR).setUnlocalizedName(CS.LIGHTGRAYHOE_NAME);
           grayHoe = new CmClayHoe(ClayMaterial, CC.GRAYHOE_COLOR).setUnlocalizedName(CS.GRAYHOE_NAME);
           pinkHoe = new CmClayHoe(ClayMaterial, CC.PINKHOE_COLOR).setUnlocalizedName(CS.PINKHOE_NAME);
           limeHoe = new CmClayHoe(ClayMaterial, CC.LIMEHOE_COLOR).setUnlocalizedName(CS.LIMEHOE_NAME);
           yellowHoe = new CmClayHoe(ClayMaterial, CC.YELLOWHOE_COLOR).setUnlocalizedName(CS.YELLOWHOE_NAME);
           lightblueHoe = new CmClayHoe(ClayMaterial, CC.LIGHTBLUEHOE_COLOR).setUnlocalizedName(CS.LIGHTBLUEHOE_NAME);
           magentaHoe = new CmClayHoe(ClayMaterial, CC.MAGENTAHOE_COLOR).setUnlocalizedName(CS.MAGENTAHOE_NAME);
           orangeHoe = new CmClayHoe(ClayMaterial, CC.ORANGEHOE_COLOR).setUnlocalizedName(CS.ORANGEHOE_NAME);
           whiteHoe = new CmClayHoe(ClayMaterial, CC.WHITEHOE_COLOR).setUnlocalizedName(CS.WHITEHOE_NAME);
           hardHoe = new CmClayHoe(ClayMaterial, CC.HARDHOE_COLOR).setUnlocalizedName(CS.HARDHOE_NAME);

           blackShovel = new CmClayShovel(ClayMaterial, CC.BLACKSHOVEL_COLOR).setUnlocalizedName(CS.BLACKSHOVEL_NAME);
           redShovel = new CmClayShovel(ClayMaterial, CC.REDSHOVEL_COLOR).setUnlocalizedName(CS.REDSHOVEL_NAME);
           greenShovel = new CmClayShovel(ClayMaterial, CC.GREENSHOVEL_COLOR).setUnlocalizedName(CS.GREENSHOVEL_NAME);
           brownShovel = new CmClayShovel(ClayMaterial, CC.BROWNSHOVEL_COLOR).setUnlocalizedName(CS.BROWNSHOVEL_NAME);
           blueShovel = new CmClayShovel(ClayMaterial, CC.BLUESHOVEL_COLOR).setUnlocalizedName(CS.BLUESHOVEL_NAME);
           purpleShovel = new CmClayShovel(ClayMaterial, CC.PURPLESHOVEL_COLOR).setUnlocalizedName(CS.PURPLESHOVEL_NAME);
           cyanShovel = new CmClayShovel(ClayMaterial, CC.CYANSHOVEL_COLOR).setUnlocalizedName(CS.CYANSHOVEL_NAME);
           lightgrayShovel = new CmClayShovel(ClayMaterial, CC.LIGHTGRAYSHOVEL_COLOR).setUnlocalizedName(CS.LIGHTGRAYSHOVEL_NAME);
           grayShovel = new CmClayShovel(ClayMaterial, CC.GRAYSHOVEL_COLOR).setUnlocalizedName(CS.GRAYSHOVEL_NAME);
           pinkShovel = new CmClayShovel(ClayMaterial, CC.PINKSHOVEL_COLOR).setUnlocalizedName(CS.PINKSHOVEL_NAME);
           limeShovel = new CmClayShovel(ClayMaterial, CC.LIMESHOVEL_COLOR).setUnlocalizedName(CS.LIMESHOVEL_NAME);
           yellowShovel = new CmClayShovel(ClayMaterial, CC.YELLOWSHOVEL_COLOR).setUnlocalizedName(CS.YELLOWSHOVEL_NAME);
           lightblueShovel = new CmClayShovel(ClayMaterial, CC.LIGHTBLUESHOVEL_COLOR).setUnlocalizedName(CS.LIGHTBLUESHOVEL_NAME);
           magentaShovel = new CmClayShovel(ClayMaterial, CC.MAGENTASHOVEL_COLOR).setUnlocalizedName(CS.MAGENTASHOVEL_NAME);
           orangeShovel = new CmClayShovel(ClayMaterial, CC.ORANGESHOVEL_COLOR).setUnlocalizedName(CS.ORANGESHOVEL_NAME);
           whiteShovel = new CmClayShovel(ClayMaterial, CC.WHITESHOVEL_COLOR).setUnlocalizedName(CS.WHITESHOVEL_NAME);
           hardShovel = new CmClayShovel(ClayMaterial, CC.HARDSHOVEL_COLOR).setUnlocalizedName(CS.HARDSHOVEL_NAME);

           blackSword = new CmClaySword(ClayMaterial, CC.BLACKSWORD_COLOR).setUnlocalizedName(CS.BLACKSWORD_NAME);
           redSword = new CmClaySword(ClayMaterial, CC.REDSWORD_COLOR).setUnlocalizedName(CS.REDSWORD_NAME);
           greenSword = new CmClaySword(ClayMaterial, CC.GREENSWORD_COLOR).setUnlocalizedName(CS.GREENSWORD_NAME);
           brownSword = new CmClaySword(ClayMaterial, CC.BROWNSWORD_COLOR).setUnlocalizedName(CS.BROWNSWORD_NAME);
           blueSword = new CmClaySword(ClayMaterial, CC.BLUESWORD_COLOR).setUnlocalizedName(CS.BLUESWORD_NAME);
           purpleSword = new CmClaySword(ClayMaterial, CC.PURPLESWORD_COLOR).setUnlocalizedName(CS.PURPLESWORD_NAME);
           cyanSword = new CmClaySword(ClayMaterial, CC.CYANSWORD_COLOR).setUnlocalizedName(CS.CYANSWORD_NAME);
           lightgraySword = new CmClaySword(ClayMaterial, CC.LIGHTGRAYSWORD_COLOR).setUnlocalizedName(CS.LIGHTGRAYSWORD_NAME);
           graySword = new CmClaySword(ClayMaterial, CC.GRAYSWORD_COLOR).setUnlocalizedName(CS.GRAYSWORD_NAME);
           pinkSword = new CmClaySword(ClayMaterial, CC.PINKSWORD_COLOR).setUnlocalizedName(CS.PINKSWORD_NAME);
           limeSword = new CmClaySword(ClayMaterial, CC.LIMESWORD_COLOR).setUnlocalizedName(CS.LIMESWORD_NAME);
           yellowSword = new CmClaySword(ClayMaterial, CC.YELLOWSWORD_COLOR).setUnlocalizedName(CS.YELLOWSWORD_NAME);
           lightblueSword = new CmClaySword(ClayMaterial, CC.LIGHTBLUESWORD_COLOR).setUnlocalizedName(CS.LIGHTBLUESWORD_NAME);
           magentaSword = new CmClaySword(ClayMaterial, CC.MAGENTASWORD_COLOR).setUnlocalizedName(CS.MAGENTASWORD_NAME);
           orangeSword = new CmClaySword(ClayMaterial, CC.ORANGESWORD_COLOR).setUnlocalizedName(CS.ORANGESWORD_NAME);
           whiteSword = new CmClaySword(ClayMaterial, CC.WHITESWORD_COLOR).setUnlocalizedName(CS.WHITESWORD_NAME);
           hardSword = new CmClaySword(ClayMaterial, CC.HARDSWORD_COLOR).setUnlocalizedName(CS.HARDSWORD_NAME);
	}
}
