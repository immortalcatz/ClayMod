package claymod.lib;

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
    
    public static void defineArrays(){
    	ClayMod m = new ClayMod();
    	
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
    	
    	ClayStickArray[0] =  m.blackClayStick;
    	ClayStickArray[1] =  m.redClayStick;
    	ClayStickArray[2] =  m.greenClayStick;
    	ClayStickArray[3] =  m.brownClayStick;
    	ClayStickArray[4] =  m.blueClayStick;
    	ClayStickArray[5] =  m.purpleClayStick;
    	ClayStickArray[6] =  m.cyanClayStick;
    	ClayStickArray[7] =  m.lightgrayClayStick;
    	ClayStickArray[8] =  m.grayClayStick;
    	ClayStickArray[9] =  m.pinkClayStick;
    	ClayStickArray[10] =  m.limeClayStick;
    	ClayStickArray[11] =  m.yellowClayStick;
    	ClayStickArray[12] =  m.lightblueClayStick;
    	ClayStickArray[13] =  m.magentaClayStick;
    	ClayStickArray[14] =  m.orangeClayStick;
    	ClayStickArray[15] =  m.whiteClayStick;
    	ClayStickArray[16] =  m.hardClayStick;
    	
    	ClayPickaxeArray[0] =  m.blackPickaxe;
    	ClayPickaxeArray[1] =  m.redPickaxe;
    	ClayPickaxeArray[2] =  m.greenPickaxe;
    	ClayPickaxeArray[3] =  m.brownPickaxe;
    	ClayPickaxeArray[4] =  m.bluePickaxe;
    	ClayPickaxeArray[5] =  m.purplePickaxe;
    	ClayPickaxeArray[6] =  m.cyanPickaxe;
    	ClayPickaxeArray[7] =  m.lightgrayPickaxe;
    	ClayPickaxeArray[8] =  m.grayPickaxe;
    	ClayPickaxeArray[9] =  m.pinkPickaxe;
    	ClayPickaxeArray[10] =  m.limePickaxe;
    	ClayPickaxeArray[11] =  m.yellowPickaxe;
    	ClayPickaxeArray[12] =  m.lightbluePickaxe;
    	ClayPickaxeArray[13] =  m.magentaPickaxe;
    	ClayPickaxeArray[14] =  m.orangePickaxe;
    	ClayPickaxeArray[15] =  m.whitePickaxe;
    	ClayPickaxeArray[16] =  m.hardPickaxe;
    	
    	ClayAxeArray[0] =  m.blackAxe;
    	ClayAxeArray[1] =  m.redAxe;
    	ClayAxeArray[2] =  m.greenAxe;
    	ClayAxeArray[3] =  m.brownAxe;
    	ClayAxeArray[4] =  m.blueAxe;
    	ClayAxeArray[5] =  m.purpleAxe;
    	ClayAxeArray[6] =  m.cyanAxe;
    	ClayAxeArray[7] =  m.lightgrayAxe;
    	ClayAxeArray[8] =  m.grayAxe;
    	ClayAxeArray[9] =  m.pinkAxe;
    	ClayAxeArray[10] =  m.limeAxe;
    	ClayAxeArray[11] =  m.yellowAxe;
    	ClayAxeArray[12] =  m.lightblueAxe;
    	ClayAxeArray[13] =  m.magentaAxe;
    	ClayAxeArray[14] =  m.orangeAxe;
    	ClayAxeArray[15] =  m.whiteAxe;
    	ClayAxeArray[16] =  m.hardAxe;
    	
    	ClayHoeArray[0] =  m.blackHoe;
    	ClayHoeArray[1] =  m.redHoe;
    	ClayHoeArray[2] =  m.greenHoe;
    	ClayHoeArray[3] =  m.brownHoe;
    	ClayHoeArray[4] =  m.blueHoe;
    	ClayHoeArray[5] =  m.purpleHoe;
    	ClayHoeArray[6] =  m.cyanHoe;
    	ClayHoeArray[7] =  m.lightgrayHoe;
    	ClayHoeArray[8] =  m.grayHoe;
    	ClayHoeArray[9] =  m.pinkHoe;
    	ClayHoeArray[10] =  m.limeHoe;
    	ClayHoeArray[11] =  m.yellowHoe;
    	ClayHoeArray[12] =  m.lightblueHoe;
    	ClayHoeArray[13] =  m.magentaHoe;
    	ClayHoeArray[14] =  m.orangeHoe;
    	ClayHoeArray[15] =  m.whiteHoe;
    	ClayHoeArray[16] =  m.hardHoe;
    	
    	ClayShovelArray[0] =  m.blackShovel;
    	ClayShovelArray[1] =  m.redShovel;
    	ClayShovelArray[2] =  m.greenShovel;
    	ClayShovelArray[3] =  m.brownShovel;
    	ClayShovelArray[4] =  m.blueShovel;
    	ClayShovelArray[5] =  m.purpleShovel;
    	ClayShovelArray[6] =  m.cyanShovel;
    	ClayShovelArray[7] =  m.lightgrayShovel;
    	ClayShovelArray[8] =  m.grayShovel;
    	ClayShovelArray[9] =  m.pinkShovel;
    	ClayShovelArray[10] =  m.limeShovel;
    	ClayShovelArray[11] =  m.yellowShovel;
    	ClayShovelArray[12] =  m.lightblueShovel;
    	ClayShovelArray[13] =  m.magentaShovel;
    	ClayShovelArray[14] =  m.orangeShovel;
    	ClayShovelArray[15] =  m.whiteShovel;
    	ClayShovelArray[16] =  m.hardShovel;
    	
    	ClaySwordArray[0] =  m.blackSword;
    	ClaySwordArray[1] =  m.redSword;
    	ClaySwordArray[2] =  m.greenSword;
    	ClaySwordArray[3] =  m.brownSword;
    	ClaySwordArray[4] =  m.blueSword;
    	ClaySwordArray[5] =  m.purpleSword;
    	ClaySwordArray[6] =  m.cyanSword;
    	ClaySwordArray[7] =  m.lightgraySword;
    	ClaySwordArray[8] =  m.graySword;
    	ClaySwordArray[9] =  m.pinkSword;
    	ClaySwordArray[10] =  m.limeSword;
    	ClaySwordArray[11] =  m.yellowSword;
    	ClaySwordArray[12] =  m.lightblueSword;
    	ClaySwordArray[13] =  m.magentaSword;
    	ClaySwordArray[14] =  m.orangeSword;
    	ClaySwordArray[15] =  m.whiteSword;
    	ClaySwordArray[16] =  m.hardSword;
    	
    }
}
