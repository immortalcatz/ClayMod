package claymod.init;

import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import claymod.entities.EntityClayBall;
import claymod.entities.EntityMudBall;
import claymod.entities.EntityMudGolem;
import claymod.lib.ClayStrings;
import claymod.main.ClayMod;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

class ClayRegister {

	protected static void init(){
		addClayStuff();
		addTools();
		addMobs();
		addGolemSpawn();
	}
	
	private static void addMobs(){
		addMob(EntityMudGolem.class, "MudGolem", EnumCreatureType.creature, 0x835C3B, 0xC85A17);
	}
	
	private static void addGolemSpawn(){
		EntityRegistry.addSpawn(EntityMudGolem.class, 60, 3, 6, EnumCreatureType.creature, BiomeGenBase.mesaPlateau);
		EntityRegistry.addSpawn(EntityMudGolem.class, 60, 3, 6, EnumCreatureType.creature, BiomeGenBase.plains);
		EntityRegistry.addSpawn(EntityMudGolem.class, 60, 3, 6, EnumCreatureType.creature, BiomeGenBase.taiga);
		EntityRegistry.addSpawn(EntityMudGolem.class, 60, 3, 6, EnumCreatureType.creature, BiomeGenBase.mesa);
		EntityRegistry.addSpawn(EntityMudGolem.class, 60, 3, 6, EnumCreatureType.creature, BiomeGenBase.mesaPlateau_F);
		EntityRegistry.addSpawn(EntityMudGolem.class, 60, 3, 6, EnumCreatureType.creature, BiomeGenBase.desert);
		EntityRegistry.addSpawn(EntityMudGolem.class, 60, 3, 6, EnumCreatureType.creature, BiomeGenBase.desertHills);
		EntityRegistry.addSpawn(EntityMudGolem.class, 60, 3, 6, EnumCreatureType.creature, BiomeGenBase.extremeHills);
		EntityRegistry.addSpawn(EntityMudGolem.class, 60, 3, 6, EnumCreatureType.creature, BiomeGenBase.extremeHillsEdge);
		EntityRegistry.addSpawn(EntityMudGolem.class, 60, 3, 6, EnumCreatureType.creature, BiomeGenBase.extremeHillsPlus);
		EntityRegistry.addSpawn(EntityMudGolem.class, 60, 3, 6, EnumCreatureType.creature, BiomeGenBase.birchForest);
		EntityRegistry.addSpawn(EntityMudGolem.class, 60, 3, 6, EnumCreatureType.creature, BiomeGenBase.birchForestHills);
		EntityRegistry.addSpawn(EntityMudGolem.class, 60, 3, 6, EnumCreatureType.creature, BiomeGenBase.beach);
		EntityRegistry.addSpawn(EntityMudGolem.class, 60, 3, 6, EnumCreatureType.creature, BiomeGenBase.forest);
		EntityRegistry.addSpawn(EntityMudGolem.class, 60, 3, 6, EnumCreatureType.creature, BiomeGenBase.forestHills);
		EntityRegistry.addSpawn(EntityMudGolem.class, 60, 3, 6, EnumCreatureType.creature, BiomeGenBase.jungle);
		EntityRegistry.addSpawn(EntityMudGolem.class, 60, 3, 6, EnumCreatureType.creature, BiomeGenBase.jungleEdge);
		EntityRegistry.addSpawn(EntityMudGolem.class, 60, 3, 6, EnumCreatureType.creature, BiomeGenBase.jungleHills);
		EntityRegistry.addSpawn(EntityMudGolem.class, 60, 3, 6, EnumCreatureType.creature, BiomeGenBase.roofedForest);
		EntityRegistry.addSpawn(EntityMudGolem.class, 60, 3, 6, EnumCreatureType.creature, BiomeGenBase.savanna);
		EntityRegistry.addSpawn(EntityMudGolem.class, 60, 3, 6, EnumCreatureType.creature, BiomeGenBase.savannaPlateau);
	}
	private static void addMob(Class entityClass, String name, EnumCreatureType typeMob, int primColor, int secColor){
		int entityID = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(entityClass, name, entityID);
		EntityRegistry.registerModEntity(entityClass, name, entityID, ClayMod.instance, 64, 1, true);
        EntityList.entityEggs.put(Integer.valueOf(entityID), new EntityList.EntityEggInfo(entityID, primColor, secColor));
	}
	
	private static void addClayStuff(){
    	ClayParts CP = new ClayParts();
		ClayStrings CS= new ClayStrings();

        GameRegistry.registerItem(CP.mudBall, "mudBall");
        GameRegistry.registerItem(CP.homemadeClayBall, "homemadeClayBall");
        GameRegistry.registerItem(CP.colorRemover, "colorRemover");
        GameRegistry.registerBlock(CP.homemadeClayBlock, "homemadeClayBlock");
        GameRegistry.registerBlock(CP.mudBlock, "mudBlock");
        GameRegistry.registerBlock(CP.mudThin, "mudThin");

        GameRegistry.registerItem(CP.blackClayStick, CS.BLACKCLAYSTICK_NAME);
        GameRegistry.registerItem(CP.redClayStick, CS.REDCLAYSTICK_NAME);
        GameRegistry.registerItem(CP.greenClayStick, CS.GREENCLAYSTICK_NAME);
        GameRegistry.registerItem(CP.brownClayStick, CS.BROWNCLAYSTICK_NAME);
        GameRegistry.registerItem(CP.blueClayStick, CS.BLUECLAYSTICK_NAME);
        GameRegistry.registerItem(CP.purpleClayStick, CS.PURPLECLAYSTICK_NAME);
        GameRegistry.registerItem(CP.cyanClayStick, CS.CYANCLAYSTICK_NAME);
        GameRegistry.registerItem(CP.lightgrayClayStick, CS.LIGHTGRAYCLAYSTICK_NAME);
        GameRegistry.registerItem(CP.grayClayStick, CS.GRAYCLAYSTICK_NAME);
        GameRegistry.registerItem(CP.pinkClayStick, CS.PINKCLAYSTICK_NAME);
        GameRegistry.registerItem(CP.limeClayStick, CS.LIMECLAYSTICK_NAME);
        GameRegistry.registerItem(CP.yellowClayStick, CS.YELLOWCLAYSTICK_NAME);
        GameRegistry.registerItem(CP.lightblueClayStick, CS.LIGHTBLUECLAYSTICK_NAME);
        GameRegistry.registerItem(CP.magentaClayStick, CS.MAGENTACLAYSTICK_NAME);
        GameRegistry.registerItem(CP.orangeClayStick, CS.ORANGECLAYSTICK_NAME);
        GameRegistry.registerItem(CP.whiteClayStick, CS.WHITECLAYSTICK_NAME);
        GameRegistry.registerItem(CP.hardClayStick, CS.HARDCLAYSTICK_NAME);

	}
	
	private static void addTools(){
    	ClayParts CP = new ClayParts();
		ClayStrings CS= new ClayStrings();

        GameRegistry.registerItem(CP.blackPickaxe, CS.BLACKPICKAXE_NAME);
        GameRegistry.registerItem(CP.redPickaxe, CS.REDPICKAXE_NAME);
        GameRegistry.registerItem(CP.greenPickaxe, CS.GREENPICKAXE_NAME);
        GameRegistry.registerItem(CP.brownPickaxe, CS.BROWNPICKAXE_NAME);
        GameRegistry.registerItem(CP.bluePickaxe, CS.BLUEPICKAXE_NAME);
        GameRegistry.registerItem(CP.purplePickaxe, CS.PURPLEPICKAXE_NAME);
        GameRegistry.registerItem(CP.cyanPickaxe, CS.CYANPICKAXE_NAME);
        GameRegistry.registerItem(CP.lightgrayPickaxe, CS.LIGHTGRAYPICKAXE_NAME);
        GameRegistry.registerItem(CP.grayPickaxe, CS.GRAYPICKAXE_NAME);
        GameRegistry.registerItem(CP.pinkPickaxe, CS.PINKPICKAXE_NAME);
        GameRegistry.registerItem(CP.limePickaxe, CS.LIMEPICKAXE_NAME);
        GameRegistry.registerItem(CP.yellowPickaxe, CS.YELLOWPICKAXE_NAME);
        GameRegistry.registerItem(CP.lightbluePickaxe, CS.LIGHTBLUEPICKAXE_NAME);
        GameRegistry.registerItem(CP.magentaPickaxe, CS.MAGENTAPICKAXE_NAME);
        GameRegistry.registerItem(CP.orangePickaxe, CS.ORANGEPICKAXE_NAME);
        GameRegistry.registerItem(CP.whitePickaxe, CS.WHITEPICKAXE_NAME);
        GameRegistry.registerItem(CP.hardPickaxe, CS.HARDPICKAXE_NAME);

        GameRegistry.registerItem(CP.blackAxe, CS.BLACKAXE_NAME);
        GameRegistry.registerItem(CP.redAxe, CS.REDAXE_NAME);
        GameRegistry.registerItem(CP.greenAxe, CS.GREENAXE_NAME);
        GameRegistry.registerItem(CP.brownAxe, CS.BROWNAXE_NAME);
        GameRegistry.registerItem(CP.blueAxe, CS.BLUEAXE_NAME);
        GameRegistry.registerItem(CP.purpleAxe, CS.PURPLEAXE_NAME);
        GameRegistry.registerItem(CP.cyanAxe, CS.CYANAXE_NAME);
        GameRegistry.registerItem(CP.lightgrayAxe, CS.LIGHTGRAYAXE_NAME);
        GameRegistry.registerItem(CP.grayAxe, CS.GRAYAXE_NAME);
        GameRegistry.registerItem(CP.pinkAxe, CS.PINKAXE_NAME);
        GameRegistry.registerItem(CP.limeAxe, CS.LIMEAXE_NAME);
        GameRegistry.registerItem(CP.yellowAxe, CS.YELLOWAXE_NAME);
        GameRegistry.registerItem(CP.lightblueAxe, CS.LIGHTBLUEAXE_NAME);
        GameRegistry.registerItem(CP.magentaAxe, CS.MAGENTAAXE_NAME);
        GameRegistry.registerItem(CP.orangeAxe, CS.ORANGEAXE_NAME);
        GameRegistry.registerItem(CP.whiteAxe, CS.WHITEAXE_NAME);
        GameRegistry.registerItem(CP.hardAxe, CS.HARDAXE_NAME);
        
        GameRegistry.registerItem(CP.blackHoe, CS.BLACKHOE_NAME);
        GameRegistry.registerItem(CP.redHoe, CS.REDHOE_NAME);
        GameRegistry.registerItem(CP.greenHoe, CS.GREENHOE_NAME);
        GameRegistry.registerItem(CP.brownHoe, CS.BROWNHOE_NAME);
        GameRegistry.registerItem(CP.blueHoe, CS.BLUEHOE_NAME);
        GameRegistry.registerItem(CP.purpleHoe, CS.PURPLEHOE_NAME);
        GameRegistry.registerItem(CP.cyanHoe, CS.CYANHOE_NAME);
        GameRegistry.registerItem(CP.lightgrayHoe, CS.LIGHTGRAYHOE_NAME);
        GameRegistry.registerItem(CP.grayHoe, CS.GRAYHOE_NAME);
        GameRegistry.registerItem(CP.pinkHoe, CS.PINKHOE_NAME);
        GameRegistry.registerItem(CP.limeHoe, CS.LIMEHOE_NAME);
        GameRegistry.registerItem(CP.yellowHoe, CS.YELLOWHOE_NAME);
        GameRegistry.registerItem(CP.lightblueHoe, CS.LIGHTBLUEHOE_NAME);
        GameRegistry.registerItem(CP.magentaHoe, CS.MAGENTAHOE_NAME);
        GameRegistry.registerItem(CP.orangeHoe, CS.ORANGEHOE_NAME);
        GameRegistry.registerItem(CP.whiteHoe, CS.WHITEHOE_NAME);
        GameRegistry.registerItem(CP.hardHoe, CS.HARDHOE_NAME);
        
        GameRegistry.registerItem(CP.blackShovel, CS.BLACKSHOVEL_NAME);
        GameRegistry.registerItem(CP.redShovel, CS.REDSHOVEL_NAME);
        GameRegistry.registerItem(CP.greenShovel, CS.GREENSHOVEL_NAME);
        GameRegistry.registerItem(CP.brownShovel, CS.BROWNSHOVEL_NAME);
        GameRegistry.registerItem(CP.blueShovel, CS.BLUESHOVEL_NAME);
        GameRegistry.registerItem(CP.purpleShovel, CS.PURPLESHOVEL_NAME);
        GameRegistry.registerItem(CP.cyanShovel, CS.CYANSHOVEL_NAME);
        GameRegistry.registerItem(CP.lightgrayShovel, CS.LIGHTGRAYSHOVEL_NAME);
        GameRegistry.registerItem(CP.grayShovel, CS.GRAYSHOVEL_NAME);
        GameRegistry.registerItem(CP.pinkShovel, CS.PINKSHOVEL_NAME);
        GameRegistry.registerItem(CP.limeShovel, CS.LIMESHOVEL_NAME);
        GameRegistry.registerItem(CP.yellowShovel, CS.YELLOWSHOVEL_NAME);
        GameRegistry.registerItem(CP.lightblueShovel, CS.LIGHTBLUESHOVEL_NAME);
        GameRegistry.registerItem(CP.magentaShovel, CS.MAGENTASHOVEL_NAME);
        GameRegistry.registerItem(CP.orangeShovel, CS.ORANGESHOVEL_NAME);
        GameRegistry.registerItem(CP.whiteShovel, CS.WHITESHOVEL_NAME);
        GameRegistry.registerItem(CP.hardShovel, CS.HARDSHOVEL_NAME);
        
        GameRegistry.registerItem(CP.blackSword, CS.BLACKSWORD_NAME);
        GameRegistry.registerItem(CP.redSword, CS.REDSWORD_NAME);
        GameRegistry.registerItem(CP.greenSword, CS.GREENSWORD_NAME);
        GameRegistry.registerItem(CP.brownSword, CS.BROWNSWORD_NAME);
        GameRegistry.registerItem(CP.blueSword, CS.BLUESWORD_NAME);
        GameRegistry.registerItem(CP.purpleSword, CS.PURPLESWORD_NAME);
        GameRegistry.registerItem(CP.cyanSword, CS.CYANSWORD_NAME);
        GameRegistry.registerItem(CP.lightgraySword, CS.LIGHTGRAYSWORD_NAME);
        GameRegistry.registerItem(CP.graySword, CS.GRAYSWORD_NAME);
        GameRegistry.registerItem(CP.pinkSword, CS.PINKSWORD_NAME);
        GameRegistry.registerItem(CP.limeSword, CS.LIMESWORD_NAME);
        GameRegistry.registerItem(CP.yellowSword, CS.YELLOWSWORD_NAME);
        GameRegistry.registerItem(CP.lightblueSword, CS.LIGHTBLUESWORD_NAME);
        GameRegistry.registerItem(CP.magentaSword, CS.MAGENTASWORD_NAME);
        GameRegistry.registerItem(CP.orangeSword, CS.ORANGESWORD_NAME);
        GameRegistry.registerItem(CP.whiteSword, CS.WHITESWORD_NAME);
        GameRegistry.registerItem(CP.hardSword, CS.HARDSWORD_NAME);

	}
}
