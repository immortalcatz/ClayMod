package claymod.init;

import claymod.main.ClayMod;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;


public class ClayArrays {

    public static ItemStack[] DyeArray = new ItemStack[16];
    public static ItemStack[] ClayMaterialArray = new ItemStack[17];
    public static Item[] ClayPickaxeArray = new Item[17];
    public static Item[] ClayAxeArray = new Item[17];
    public static Item[] ClayHoeArray = new Item[17];
    public static Item[] ClayShovelArray = new Item[17];
    public static Item[] ClaySwordArray = new Item[17];
    public static Item[] ClayStickArray = new Item[17];
    
    protected static void init(){
    	defineArrays();
    }
    private static void defineArrays(){
    	ClayParts CP = new ClayParts();
    	
    	ClayMaterialArray[0] =  new ItemStack(Blocks.stained_hardened_clay, 1, 15);
    	ClayMaterialArray[1] =  new ItemStack(Blocks.stained_hardened_clay, 1, 14);
    	ClayMaterialArray[2] =  new ItemStack(Blocks.stained_hardened_clay, 1, 13);
    	ClayMaterialArray[3] =  new ItemStack(Blocks.stained_hardened_clay, 1, 12);
    	ClayMaterialArray[4] =  new ItemStack(Blocks.stained_hardened_clay, 1, 11);
    	ClayMaterialArray[5] =  new ItemStack(Blocks.stained_hardened_clay, 1, 10);
    	ClayMaterialArray[6] =  new ItemStack(Blocks.stained_hardened_clay, 1, 9);
    	ClayMaterialArray[7] =  new ItemStack(Blocks.stained_hardened_clay, 1, 8);
    	ClayMaterialArray[8] =  new ItemStack(Blocks.stained_hardened_clay, 1, 7);
    	ClayMaterialArray[9] =  new ItemStack(Blocks.stained_hardened_clay, 1, 6);
    	ClayMaterialArray[10] =  new ItemStack(Blocks.stained_hardened_clay, 1, 5);
    	ClayMaterialArray[11] =  new ItemStack(Blocks.stained_hardened_clay, 1, 4);
    	ClayMaterialArray[12] =  new ItemStack(Blocks.stained_hardened_clay, 1, 3);
    	ClayMaterialArray[13] =  new ItemStack(Blocks.stained_hardened_clay, 1, 2);
    	ClayMaterialArray[14] =  new ItemStack(Blocks.stained_hardened_clay, 1, 1);
    	ClayMaterialArray[15] =  new ItemStack(Blocks.stained_hardened_clay, 1, 0);
    	ClayMaterialArray[16] =  new ItemStack(Blocks.hardened_clay);

    	DyeArray[0] =  new ItemStack(Items.dye, 1, 0);
    	DyeArray[1] =  new ItemStack(Items.dye, 1, 1);
    	DyeArray[2] =  new ItemStack(Items.dye, 1, 2);
    	DyeArray[3] =  new ItemStack(Items.dye, 1, 3);
    	DyeArray[4] =  new ItemStack(Items.dye, 1, 4);
    	DyeArray[5] =  new ItemStack(Items.dye, 1, 5);
    	DyeArray[6] =  new ItemStack(Items.dye, 1, 6);
    	DyeArray[7] =  new ItemStack(Items.dye, 1, 7);
    	DyeArray[8] =  new ItemStack(Items.dye, 1, 8);
    	DyeArray[9] =  new ItemStack(Items.dye, 1, 9);
    	DyeArray[10] =  new ItemStack(Items.dye, 1, 10);
    	DyeArray[11] =  new ItemStack(Items.dye, 1, 11);
    	DyeArray[12] =  new ItemStack(Items.dye, 1, 12);
    	DyeArray[13] =  new ItemStack(Items.dye, 1, 13);
    	DyeArray[14] =  new ItemStack(Items.dye, 1, 14);
    	DyeArray[15] =  new ItemStack(Items.dye, 1, 15);
    	
    	ClayStickArray[0] =  CP.blackClayStick;
    	ClayStickArray[1] =  CP.redClayStick;
    	ClayStickArray[2] =  CP.greenClayStick;
    	ClayStickArray[3] =  CP.brownClayStick;
    	ClayStickArray[4] =  CP.blueClayStick;
    	ClayStickArray[5] =  CP.purpleClayStick;
    	ClayStickArray[6] =  CP.cyanClayStick;
    	ClayStickArray[7] =  CP.lightgrayClayStick;
    	ClayStickArray[8] =  CP.grayClayStick;
    	ClayStickArray[9] =  CP.pinkClayStick;
    	ClayStickArray[10] =  CP.limeClayStick;
    	ClayStickArray[11] =  CP.yellowClayStick;
    	ClayStickArray[12] =  CP.lightblueClayStick;
    	ClayStickArray[13] =  CP.magentaClayStick;
    	ClayStickArray[14] =  CP.orangeClayStick;
    	ClayStickArray[15] =  CP.whiteClayStick;
    	ClayStickArray[16] =  CP.hardClayStick;
    	
    	ClayPickaxeArray[0] =  CP.blackPickaxe;
    	ClayPickaxeArray[1] =  CP.redPickaxe;
    	ClayPickaxeArray[2] =  CP.greenPickaxe;
    	ClayPickaxeArray[3] =  CP.brownPickaxe;
    	ClayPickaxeArray[4] =  CP.bluePickaxe;
    	ClayPickaxeArray[5] =  CP.purplePickaxe;
    	ClayPickaxeArray[6] =  CP.cyanPickaxe;
    	ClayPickaxeArray[7] =  CP.lightgrayPickaxe;
    	ClayPickaxeArray[8] =  CP.grayPickaxe;
    	ClayPickaxeArray[9] =  CP.pinkPickaxe;
    	ClayPickaxeArray[10] =  CP.limePickaxe;
    	ClayPickaxeArray[11] =  CP.yellowPickaxe;
    	ClayPickaxeArray[12] =  CP.lightbluePickaxe;
    	ClayPickaxeArray[13] =  CP.magentaPickaxe;
    	ClayPickaxeArray[14] =  CP.orangePickaxe;
    	ClayPickaxeArray[15] =  CP.whitePickaxe;
    	ClayPickaxeArray[16] =  CP.hardPickaxe;
    	
    	ClayAxeArray[0] =  CP.blackAxe;
    	ClayAxeArray[1] =  CP.redAxe;
    	ClayAxeArray[2] =  CP.greenAxe;
    	ClayAxeArray[3] =  CP.brownAxe;
    	ClayAxeArray[4] =  CP.blueAxe;
    	ClayAxeArray[5] =  CP.purpleAxe;
    	ClayAxeArray[6] =  CP.cyanAxe;
    	ClayAxeArray[7] =  CP.lightgrayAxe;
    	ClayAxeArray[8] =  CP.grayAxe;
    	ClayAxeArray[9] =  CP.pinkAxe;
    	ClayAxeArray[10] =  CP.limeAxe;
    	ClayAxeArray[11] =  CP.yellowAxe;
    	ClayAxeArray[12] =  CP.lightblueAxe;
    	ClayAxeArray[13] =  CP.magentaAxe;
    	ClayAxeArray[14] =  CP.orangeAxe;
    	ClayAxeArray[15] =  CP.whiteAxe;
    	ClayAxeArray[16] =  CP.hardAxe;
    	
    	ClayHoeArray[0] =  CP.blackHoe;
    	ClayHoeArray[1] =  CP.redHoe;
    	ClayHoeArray[2] =  CP.greenHoe;
    	ClayHoeArray[3] =  CP.brownHoe;
    	ClayHoeArray[4] =  CP.blueHoe;
    	ClayHoeArray[5] =  CP.purpleHoe;
    	ClayHoeArray[6] =  CP.cyanHoe;
    	ClayHoeArray[7] =  CP.lightgrayHoe;
    	ClayHoeArray[8] =  CP.grayHoe;
    	ClayHoeArray[9] =  CP.pinkHoe;
    	ClayHoeArray[10] =  CP.limeHoe;
    	ClayHoeArray[11] =  CP.yellowHoe;
    	ClayHoeArray[12] =  CP.lightblueHoe;
    	ClayHoeArray[13] =  CP.magentaHoe;
    	ClayHoeArray[14] =  CP.orangeHoe;
    	ClayHoeArray[15] =  CP.whiteHoe;
    	ClayHoeArray[16] =  CP.hardHoe;
    	
    	ClayShovelArray[0] =  CP.blackShovel;
    	ClayShovelArray[1] =  CP.redShovel;
    	ClayShovelArray[2] =  CP.greenShovel;
    	ClayShovelArray[3] =  CP.brownShovel;
    	ClayShovelArray[4] =  CP.blueShovel;
    	ClayShovelArray[5] =  CP.purpleShovel;
    	ClayShovelArray[6] =  CP.cyanShovel;
    	ClayShovelArray[7] =  CP.lightgrayShovel;
    	ClayShovelArray[8] =  CP.grayShovel;
    	ClayShovelArray[9] =  CP.pinkShovel;
    	ClayShovelArray[10] =  CP.limeShovel;
    	ClayShovelArray[11] =  CP.yellowShovel;
    	ClayShovelArray[12] =  CP.lightblueShovel;
    	ClayShovelArray[13] =  CP.magentaShovel;
    	ClayShovelArray[14] =  CP.orangeShovel;
    	ClayShovelArray[15] =  CP.whiteShovel;
    	ClayShovelArray[16] =  CP.hardShovel;
    	
    	ClaySwordArray[0] =  CP.blackSword;
    	ClaySwordArray[1] =  CP.redSword;
    	ClaySwordArray[2] =  CP.greenSword;
    	ClaySwordArray[3] =  CP.brownSword;
    	ClaySwordArray[4] =  CP.blueSword;
    	ClaySwordArray[5] =  CP.purpleSword;
    	ClaySwordArray[6] =  CP.cyanSword;
    	ClaySwordArray[7] =  CP.lightgraySword;
    	ClaySwordArray[8] =  CP.graySword;
    	ClaySwordArray[9] =  CP.pinkSword;
    	ClaySwordArray[10] =  CP.limeSword;
    	ClaySwordArray[11] =  CP.yellowSword;
    	ClaySwordArray[12] =  CP.lightblueSword;
    	ClaySwordArray[13] =  CP.magentaSword;
    	ClaySwordArray[14] =  CP.orangeSword;
    	ClaySwordArray[15] =  CP.whiteSword;
    	ClaySwordArray[16] =  CP.hardSword;
    	
    }
}
