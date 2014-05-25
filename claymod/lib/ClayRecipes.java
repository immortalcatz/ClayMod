package claymod.lib;

import claymod.main.ClayMod;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class ClayRecipes {

	public static void addClayRecipes(){
		ClayArrays CA = new ClayArrays();	
				
		GameRegistry.addShapedRecipe(new ItemStack(CA.ClayStickArray[0], 4), new Object[] { "M", "M", 'M', CA.ClayMaterialArray[0]});
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClayStickArray[1], 4), new Object[] { "M", "M", 'M', CA.ClayMaterialArray[1]});
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClayStickArray[2], 4), new Object[] { "M", "M", 'M', CA.ClayMaterialArray[2]});
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClayStickArray[3], 4), new Object[] { "M", "M", 'M', CA.ClayMaterialArray[3]});
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClayStickArray[4], 4), new Object[] { "M", "M", 'M', CA.ClayMaterialArray[4]});
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClayStickArray[5], 4), new Object[] { "M", "M", 'M', CA.ClayMaterialArray[5]});
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClayStickArray[6], 4), new Object[] { "M", "M", 'M', CA.ClayMaterialArray[6]});
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClayStickArray[7], 4), new Object[] { "M", "M", 'M', CA.ClayMaterialArray[7]});
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClayStickArray[8], 4), new Object[] { "M", "M", 'M', CA.ClayMaterialArray[8]});
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClayStickArray[9], 4), new Object[] { "M", "M", 'M', CA.ClayMaterialArray[9]});
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClayStickArray[10], 4), new Object[] { "M", "M", 'M', CA.ClayMaterialArray[10]});
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClayStickArray[11], 4), new Object[] { "M", "M", 'M', CA.ClayMaterialArray[11]});
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClayStickArray[12], 4), new Object[] { "M", "M", 'M', CA.ClayMaterialArray[12]});
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClayStickArray[13], 4), new Object[] { "M", "M", 'M', CA.ClayMaterialArray[13]});
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClayStickArray[14], 4), new Object[] { "M", "M", 'M', CA.ClayMaterialArray[14]});
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClayStickArray[15], 4), new Object[] { "M", "M", 'M', CA.ClayMaterialArray[15]});
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClayStickArray[16], 4), new Object[] { "M", "M", 'M', CA.ClayMaterialArray[16]});

		GameRegistry.addShapedRecipe(new ItemStack(CA.ClayPickaxeArray[0], 1), new Object[] { "MMM", " S ", " S ", 'M', CA.ClayMaterialArray[0], 'S', CA.ClayStickArray[0] });
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClayPickaxeArray[1], 1), new Object[] { "MMM", " S ", " S ", 'M', CA.ClayMaterialArray[1], 'S', CA.ClayStickArray[1] });
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClayPickaxeArray[2], 1), new Object[] { "MMM", " S ", " S ", 'M', CA.ClayMaterialArray[2], 'S', CA.ClayStickArray[2] });
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClayPickaxeArray[3], 1), new Object[] { "MMM", " S ", " S ", 'M', CA.ClayMaterialArray[3], 'S', CA.ClayStickArray[3] });
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClayPickaxeArray[4], 1), new Object[] { "MMM", " S ", " S ", 'M', CA.ClayMaterialArray[4], 'S', CA.ClayStickArray[4] });
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClayPickaxeArray[5], 1), new Object[] { "MMM", " S ", " S ", 'M', CA.ClayMaterialArray[5], 'S', CA.ClayStickArray[5] });
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClayPickaxeArray[6], 1), new Object[] { "MMM", " S ", " S ", 'M', CA.ClayMaterialArray[6], 'S', CA.ClayStickArray[6] });
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClayPickaxeArray[7], 1), new Object[] { "MMM", " S ", " S ", 'M', CA.ClayMaterialArray[7], 'S', CA.ClayStickArray[7] });
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClayPickaxeArray[8], 1), new Object[] { "MMM", " S ", " S ", 'M', CA.ClayMaterialArray[8], 'S', CA.ClayStickArray[8] });
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClayPickaxeArray[9], 1), new Object[] { "MMM", " S ", " S ", 'M', CA.ClayMaterialArray[9], 'S', CA.ClayStickArray[9] });
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClayPickaxeArray[10], 1), new Object[] { "MMM", " S ", " S ", 'M', CA.ClayMaterialArray[10], 'S', CA.ClayStickArray[10] });
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClayPickaxeArray[11], 1), new Object[] { "MMM", " S ", " S ", 'M', CA.ClayMaterialArray[11], 'S', CA.ClayStickArray[11] });
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClayPickaxeArray[12], 1), new Object[] { "MMM", " S ", " S ", 'M', CA.ClayMaterialArray[12], 'S', CA.ClayStickArray[12] });
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClayPickaxeArray[13], 1), new Object[] { "MMM", " S ", " S ", 'M', CA.ClayMaterialArray[13], 'S', CA.ClayStickArray[13] });
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClayPickaxeArray[14], 1), new Object[] { "MMM", " S ", " S ", 'M', CA.ClayMaterialArray[14], 'S', CA.ClayStickArray[14] });
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClayPickaxeArray[15], 1), new Object[] { "MMM", " S ", " S ", 'M', CA.ClayMaterialArray[15], 'S', CA.ClayStickArray[15] });
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClayPickaxeArray[16], 1), new Object[] { "MMM", " S ", " S ", 'M', CA.ClayMaterialArray[16], 'S', CA.ClayStickArray[16] });

       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClayAxeArray[0], 1), new Object[] { "MM", "MS", " S", 'M', CA.ClayMaterialArray[0], 'S', CA.ClayStickArray[0] });
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClayAxeArray[1], 1), new Object[] { "MM", "MS", " S", 'M', CA.ClayMaterialArray[1], 'S', CA.ClayStickArray[1] });
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClayAxeArray[2], 1), new Object[] { "MM", "MS", " S", 'M', CA.ClayMaterialArray[2], 'S', CA.ClayStickArray[2] });
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClayAxeArray[3], 1), new Object[] { "MM", "MS", " S", 'M', CA.ClayMaterialArray[3], 'S', CA.ClayStickArray[3] });
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClayAxeArray[4], 1), new Object[] { "MM", "MS", " S", 'M', CA.ClayMaterialArray[4], 'S', CA.ClayStickArray[4] });
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClayAxeArray[5], 1), new Object[] { "MM", "MS", " S", 'M', CA.ClayMaterialArray[5], 'S', CA.ClayStickArray[5] });
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClayAxeArray[6], 1), new Object[] { "MM", "MS", " S", 'M', CA.ClayMaterialArray[6], 'S', CA.ClayStickArray[6] });
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClayAxeArray[7], 1), new Object[] { "MM", "MS", " S", 'M', CA.ClayMaterialArray[7], 'S', CA.ClayStickArray[7] });
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClayAxeArray[8], 1), new Object[] { "MM", "MS", " S", 'M', CA.ClayMaterialArray[8], 'S', CA.ClayStickArray[8] });
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClayAxeArray[9], 1), new Object[] { "MM", "MS", " S", 'M', CA.ClayMaterialArray[9], 'S', CA.ClayStickArray[9] });
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClayAxeArray[10], 1), new Object[] { "MM", "MS", " S", 'M', CA.ClayMaterialArray[10], 'S', CA.ClayStickArray[10] });
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClayAxeArray[11], 1), new Object[] { "MM", "MS", " S", 'M', CA.ClayMaterialArray[11], 'S', CA.ClayStickArray[11] });
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClayAxeArray[12], 1), new Object[] { "MM", "MS", " S", 'M', CA.ClayMaterialArray[12], 'S', CA.ClayStickArray[12] });
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClayAxeArray[13], 1), new Object[] { "MM", "MS", " S", 'M', CA.ClayMaterialArray[13], 'S', CA.ClayStickArray[13] });
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClayAxeArray[14], 1), new Object[] { "MM", "MS", " S", 'M', CA.ClayMaterialArray[14], 'S', CA.ClayStickArray[14] });
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClayAxeArray[15], 1), new Object[] { "MM", "MS", " S", 'M', CA.ClayMaterialArray[15], 'S', CA.ClayStickArray[15] });
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClayAxeArray[16], 1), new Object[] { "MM", "MS", " S", 'M', CA.ClayMaterialArray[16], 'S', CA.ClayStickArray[16] });

       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClayHoeArray[0], 1), new Object[] { "MM", " S", " S", 'M', CA.ClayMaterialArray[0], 'S', CA.ClayStickArray[0] });
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClayHoeArray[1], 1), new Object[] { "MM", " S", " S", 'M', CA.ClayMaterialArray[1], 'S', CA.ClayStickArray[1] });
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClayHoeArray[2], 1), new Object[] { "MM", " S", " S", 'M', CA.ClayMaterialArray[2], 'S', CA.ClayStickArray[2] });
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClayHoeArray[3], 1), new Object[] { "MM", " S", " S", 'M', CA.ClayMaterialArray[3], 'S', CA.ClayStickArray[3] });
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClayHoeArray[4], 1), new Object[] { "MM", " S", " S", 'M', CA.ClayMaterialArray[4], 'S', CA.ClayStickArray[4] });
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClayHoeArray[5], 1), new Object[] { "MM", " S", " S", 'M', CA.ClayMaterialArray[5], 'S', CA.ClayStickArray[5] });
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClayHoeArray[6], 1), new Object[] { "MM", " S", " S", 'M', CA.ClayMaterialArray[6], 'S', CA.ClayStickArray[6] });
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClayHoeArray[7], 1), new Object[] { "MM", " S", " S", 'M', CA.ClayMaterialArray[7], 'S', CA.ClayStickArray[7] });
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClayHoeArray[8], 1), new Object[] { "MM", " S", " S", 'M', CA.ClayMaterialArray[8], 'S', CA.ClayStickArray[8] });
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClayHoeArray[9], 1), new Object[] { "MM", " S", " S", 'M', CA.ClayMaterialArray[9], 'S', CA.ClayStickArray[9] });
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClayHoeArray[10], 1), new Object[] { "MM", " S", " S", 'M', CA.ClayMaterialArray[10], 'S', CA.ClayStickArray[10] });
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClayHoeArray[11], 1), new Object[] { "MM", " S", " S", 'M', CA.ClayMaterialArray[11], 'S', CA.ClayStickArray[11] });
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClayHoeArray[12], 1), new Object[] { "MM", " S", " S", 'M', CA.ClayMaterialArray[12], 'S', CA.ClayStickArray[12] });
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClayHoeArray[13], 1), new Object[] { "MM", " S", " S", 'M', CA.ClayMaterialArray[13], 'S', CA.ClayStickArray[13] });
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClayHoeArray[14], 1), new Object[] { "MM", " S", " S", 'M', CA.ClayMaterialArray[14], 'S', CA.ClayStickArray[14] });
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClayHoeArray[15], 1), new Object[] { "MM", " S", " S", 'M', CA.ClayMaterialArray[15], 'S', CA.ClayStickArray[15] });
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClayHoeArray[16], 1), new Object[] { "MM", " S", " S", 'M', CA.ClayMaterialArray[16], 'S', CA.ClayStickArray[16] });

       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClayShovelArray[0], 1), new Object[] { "M", "S", "S", 'M', CA.ClayMaterialArray[0], 'S', CA.ClayStickArray[0] });
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClayShovelArray[1], 1), new Object[] { "M", "S", "S", 'M', CA.ClayMaterialArray[1], 'S', CA.ClayStickArray[1] });
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClayShovelArray[2], 1), new Object[] { "M", "S", "S", 'M', CA.ClayMaterialArray[2], 'S', CA.ClayStickArray[2] });
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClayShovelArray[3], 1), new Object[] { "M", "S", "S", 'M', CA.ClayMaterialArray[3], 'S', CA.ClayStickArray[3] });
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClayShovelArray[4], 1), new Object[] { "M", "S", "S", 'M', CA.ClayMaterialArray[4], 'S', CA.ClayStickArray[4] });
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClayShovelArray[5], 1), new Object[] { "M", "S", "S", 'M', CA.ClayMaterialArray[5], 'S', CA.ClayStickArray[5] });
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClayShovelArray[6], 1), new Object[] { "M", "S", "S", 'M', CA.ClayMaterialArray[6], 'S', CA.ClayStickArray[6] });
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClayShovelArray[7], 1), new Object[] { "M", "S", "S", 'M', CA.ClayMaterialArray[7], 'S', CA.ClayStickArray[7] });
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClayShovelArray[8], 1), new Object[] { "M", "S", "S", 'M', CA.ClayMaterialArray[8], 'S', CA.ClayStickArray[8] });
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClayShovelArray[9], 1), new Object[] { "M", "S", "S", 'M', CA.ClayMaterialArray[9], 'S', CA.ClayStickArray[9] });
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClayShovelArray[10], 1), new Object[] { "M", "S", "S", 'M', CA.ClayMaterialArray[10], 'S', CA.ClayStickArray[10] });
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClayShovelArray[11], 1), new Object[] { "M", "S", "S", 'M', CA.ClayMaterialArray[11], 'S', CA.ClayStickArray[11] });
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClayShovelArray[12], 1), new Object[] { "M", "S", "S", 'M', CA.ClayMaterialArray[12], 'S', CA.ClayStickArray[12] });
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClayShovelArray[13], 1), new Object[] { "M", "S", "S", 'M', CA.ClayMaterialArray[13], 'S', CA.ClayStickArray[13] });
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClayShovelArray[14], 1), new Object[] { "M", "S", "S", 'M', CA.ClayMaterialArray[14], 'S', CA.ClayStickArray[14] });
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClayShovelArray[15], 1), new Object[] { "M", "S", "S", 'M', CA.ClayMaterialArray[15], 'S', CA.ClayStickArray[15] });
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClayShovelArray[16], 1), new Object[] { "M", "S", "S", 'M', CA.ClayMaterialArray[16], 'S', CA.ClayStickArray[16] });

       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClaySwordArray[0], 1), new Object[] { "M", "M", "S", 'M', CA.ClayMaterialArray[0], 'S', CA.ClayStickArray[0] });
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClaySwordArray[1], 1), new Object[] { "M", "M", "S", 'M', CA.ClayMaterialArray[1], 'S', CA.ClayStickArray[1] });
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClaySwordArray[2], 1), new Object[] { "M", "M", "S", 'M', CA.ClayMaterialArray[2], 'S', CA.ClayStickArray[2] });
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClaySwordArray[3], 1), new Object[] { "M", "M", "S", 'M', CA.ClayMaterialArray[3], 'S', CA.ClayStickArray[3] });
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClaySwordArray[4], 1), new Object[] { "M", "M", "S", 'M', CA.ClayMaterialArray[4], 'S', CA.ClayStickArray[4] });
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClaySwordArray[5], 1), new Object[] { "M", "M", "S", 'M', CA.ClayMaterialArray[5], 'S', CA.ClayStickArray[5] });
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClaySwordArray[6], 1), new Object[] { "M", "M", "S", 'M', CA.ClayMaterialArray[6], 'S', CA.ClayStickArray[6] });
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClaySwordArray[7], 1), new Object[] { "M", "M", "S", 'M', CA.ClayMaterialArray[7], 'S', CA.ClayStickArray[7] });
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClaySwordArray[8], 1), new Object[] { "M", "M", "S", 'M', CA.ClayMaterialArray[8], 'S', CA.ClayStickArray[8] });
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClaySwordArray[9], 1), new Object[] { "M", "M", "S", 'M', CA.ClayMaterialArray[9], 'S', CA.ClayStickArray[9] });
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClaySwordArray[10], 1), new Object[] { "M", "M", "S", 'M', CA.ClayMaterialArray[10], 'S', CA.ClayStickArray[10] });
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClaySwordArray[11], 1), new Object[] { "M", "M", "S", 'M', CA.ClayMaterialArray[11], 'S', CA.ClayStickArray[11] });
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClaySwordArray[12], 1), new Object[] { "M", "M", "S", 'M', CA.ClayMaterialArray[12], 'S', CA.ClayStickArray[12] });
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClaySwordArray[13], 1), new Object[] { "M", "M", "S", 'M', CA.ClayMaterialArray[13], 'S', CA.ClayStickArray[13] });
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClaySwordArray[14], 1), new Object[] { "M", "M", "S", 'M', CA.ClayMaterialArray[14], 'S', CA.ClayStickArray[14] });
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClaySwordArray[15], 1), new Object[] { "M", "M", "S", 'M', CA.ClayMaterialArray[15], 'S', CA.ClayStickArray[15] });
       	GameRegistry.addShapedRecipe(new ItemStack(CA.ClaySwordArray[16], 1), new Object[] { "M", "M", "S", 'M', CA.ClayMaterialArray[16], 'S', CA.ClayStickArray[16] });
	
       	GameRegistry.addShapedRecipe(new ItemStack(ClayMod.homemadeClayBlock, 1), new Object[] {"CC", "CC", 'C', ClayMod.homemadeClayBall});
       	GameRegistry.addShapedRecipe(new ItemStack(ClayMod.mudBlock, 8), new Object[] {"DDD", "DWD", "DDD", 'D', Blocks.dirt, 'W',Items.water_bucket});
       	GameRegistry.addShapelessRecipe(new ItemStack(ClayMod.homemadeClayBall, 4), new Object[] {ClayMod.homemadeClayBlock});
       	GameRegistry.addSmelting(ClayMod.mudBall, new ItemStack(ClayMod.homemadeClayBall, 1), 0.7F);
       	GameRegistry.addSmelting(ClayMod.homemadeClayBall, new ItemStack(Items.brick, 1), 0.7F);
       	GameRegistry.addSmelting(ClayMod.homemadeClayBlock, new ItemStack(Blocks.hardened_clay, 1), 0.7F);
	}
	
	public static void addAlternateClayRecipes(){
		ClayArrays CA = new ClayArrays();	
		
		GameRegistry.addShapelessRecipe(new ItemStack(CA.ClayStickArray[0], 1), new Object[] {CA.DyeArray[0], CA.ClayStickArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClayStickArray[1], 1), new Object[] {CA.DyeArray[1], CA.ClayStickArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClayStickArray[2], 1), new Object[] {CA.DyeArray[2], CA.ClayStickArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClayStickArray[3], 1), new Object[] {CA.DyeArray[3], CA.ClayStickArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClayStickArray[4], 1), new Object[] {CA.DyeArray[4], CA.ClayStickArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClayStickArray[5], 1), new Object[] {CA.DyeArray[5], CA.ClayStickArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClayStickArray[6], 1), new Object[] {CA.DyeArray[6], CA.ClayStickArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClayStickArray[7], 1), new Object[] {CA.DyeArray[7], CA.ClayStickArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClayStickArray[8], 1), new Object[] {CA.DyeArray[8], CA.ClayStickArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClayStickArray[9], 1), new Object[] {CA.DyeArray[9], CA.ClayStickArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClayStickArray[10], 1), new Object[] {CA.DyeArray[10], CA.ClayStickArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClayStickArray[11], 1), new Object[] {CA.DyeArray[11], CA.ClayStickArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClayStickArray[12], 1), new Object[] {CA.DyeArray[12], CA.ClayStickArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClayStickArray[13], 1), new Object[] {CA.DyeArray[13], CA.ClayStickArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClayStickArray[14], 1), new Object[] {CA.DyeArray[14], CA.ClayStickArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClayStickArray[15], 1), new Object[] {CA.DyeArray[15], CA.ClayStickArray[16]});
		
		GameRegistry.addShapelessRecipe(new ItemStack(CA.ClayPickaxeArray[0], 1), new Object[] {CA.DyeArray[0], CA.ClayPickaxeArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClayPickaxeArray[1], 1), new Object[] {CA.DyeArray[1], CA.ClayPickaxeArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClayPickaxeArray[2], 1), new Object[] {CA.DyeArray[2], CA.ClayPickaxeArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClayPickaxeArray[3], 1), new Object[] {CA.DyeArray[3], CA.ClayPickaxeArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClayPickaxeArray[4], 1), new Object[] {CA.DyeArray[4], CA.ClayPickaxeArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClayPickaxeArray[5], 1), new Object[] {CA.DyeArray[5], CA.ClayPickaxeArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClayPickaxeArray[6], 1), new Object[] {CA.DyeArray[6], CA.ClayPickaxeArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClayPickaxeArray[7], 1), new Object[] {CA.DyeArray[7], CA.ClayPickaxeArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClayPickaxeArray[8], 1), new Object[] {CA.DyeArray[8], CA.ClayPickaxeArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClayPickaxeArray[9], 1), new Object[] {CA.DyeArray[9], CA.ClayPickaxeArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClayPickaxeArray[10], 1), new Object[] {CA.DyeArray[10], CA.ClayPickaxeArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClayPickaxeArray[11], 1), new Object[] {CA.DyeArray[11], CA.ClayPickaxeArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClayPickaxeArray[12], 1), new Object[] {CA.DyeArray[12], CA.ClayPickaxeArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClayPickaxeArray[13], 1), new Object[] {CA.DyeArray[13], CA.ClayPickaxeArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClayPickaxeArray[14], 1), new Object[] {CA.DyeArray[14], CA.ClayPickaxeArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClayPickaxeArray[15], 1), new Object[] {CA.DyeArray[15], CA.ClayPickaxeArray[16]});
       	
		GameRegistry.addShapelessRecipe(new ItemStack(CA.ClayAxeArray[0], 1), new Object[] {CA.DyeArray[0], CA.ClayAxeArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClayAxeArray[1], 1), new Object[] {CA.DyeArray[1], CA.ClayAxeArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClayAxeArray[2], 1), new Object[] {CA.DyeArray[2], CA.ClayAxeArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClayAxeArray[3], 1), new Object[] {CA.DyeArray[3], CA.ClayAxeArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClayAxeArray[4], 1), new Object[] {CA.DyeArray[4], CA.ClayAxeArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClayAxeArray[5], 1), new Object[] {CA.DyeArray[5], CA.ClayAxeArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClayAxeArray[6], 1), new Object[] {CA.DyeArray[6], CA.ClayAxeArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClayAxeArray[7], 1), new Object[] {CA.DyeArray[7], CA.ClayAxeArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClayAxeArray[8], 1), new Object[] {CA.DyeArray[8], CA.ClayAxeArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClayAxeArray[9], 1), new Object[] {CA.DyeArray[9], CA.ClayAxeArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClayAxeArray[10], 1), new Object[] {CA.DyeArray[10], CA.ClayAxeArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClayAxeArray[11], 1), new Object[] {CA.DyeArray[11], CA.ClayAxeArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClayAxeArray[12], 1), new Object[] {CA.DyeArray[12], CA.ClayAxeArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClayAxeArray[13], 1), new Object[] {CA.DyeArray[13], CA.ClayAxeArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClayAxeArray[14], 1), new Object[] {CA.DyeArray[14], CA.ClayAxeArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClayAxeArray[15], 1), new Object[] {CA.DyeArray[15], CA.ClayAxeArray[16]});
       	
		GameRegistry.addShapelessRecipe(new ItemStack(CA.ClayHoeArray[0], 1), new Object[] {CA.DyeArray[0], CA.ClayHoeArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClayHoeArray[1], 1), new Object[] {CA.DyeArray[1], CA.ClayHoeArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClayHoeArray[2], 1), new Object[] {CA.DyeArray[2], CA.ClayHoeArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClayHoeArray[3], 1), new Object[] {CA.DyeArray[3], CA.ClayHoeArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClayHoeArray[4], 1), new Object[] {CA.DyeArray[4], CA.ClayHoeArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClayHoeArray[5], 1), new Object[] {CA.DyeArray[5], CA.ClayHoeArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClayHoeArray[6], 1), new Object[] {CA.DyeArray[6], CA.ClayHoeArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClayHoeArray[7], 1), new Object[] {CA.DyeArray[7], CA.ClayHoeArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClayHoeArray[8], 1), new Object[] {CA.DyeArray[8], CA.ClayHoeArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClayHoeArray[9], 1), new Object[] {CA.DyeArray[9], CA.ClayHoeArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClayHoeArray[10], 1), new Object[] {CA.DyeArray[10], CA.ClayHoeArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClayHoeArray[11], 1), new Object[] {CA.DyeArray[11], CA.ClayHoeArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClayHoeArray[12], 1), new Object[] {CA.DyeArray[12], CA.ClayHoeArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClayHoeArray[13], 1), new Object[] {CA.DyeArray[13], CA.ClayHoeArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClayHoeArray[14], 1), new Object[] {CA.DyeArray[14], CA.ClayHoeArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClayHoeArray[15], 1), new Object[] {CA.DyeArray[15], CA.ClayHoeArray[16]});
       	
		GameRegistry.addShapelessRecipe(new ItemStack(CA.ClayShovelArray[0], 1), new Object[] {CA.DyeArray[0], CA.ClayShovelArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClayShovelArray[1], 1), new Object[] {CA.DyeArray[1], CA.ClayShovelArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClayShovelArray[2], 1), new Object[] {CA.DyeArray[2], CA.ClayShovelArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClayShovelArray[3], 1), new Object[] {CA.DyeArray[3], CA.ClayShovelArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClayShovelArray[4], 1), new Object[] {CA.DyeArray[4], CA.ClayShovelArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClayShovelArray[5], 1), new Object[] {CA.DyeArray[5], CA.ClayShovelArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClayShovelArray[6], 1), new Object[] {CA.DyeArray[6], CA.ClayShovelArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClayShovelArray[7], 1), new Object[] {CA.DyeArray[7], CA.ClayShovelArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClayShovelArray[8], 1), new Object[] {CA.DyeArray[8], CA.ClayShovelArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClayShovelArray[9], 1), new Object[] {CA.DyeArray[9], CA.ClayShovelArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClayShovelArray[10], 1), new Object[] {CA.DyeArray[10], CA.ClayShovelArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClayShovelArray[11], 1), new Object[] {CA.DyeArray[11], CA.ClayShovelArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClayShovelArray[12], 1), new Object[] {CA.DyeArray[12], CA.ClayShovelArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClayShovelArray[13], 1), new Object[] {CA.DyeArray[13], CA.ClayShovelArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClayShovelArray[14], 1), new Object[] {CA.DyeArray[14], CA.ClayShovelArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClayShovelArray[15], 1), new Object[] {CA.DyeArray[15], CA.ClayShovelArray[16]});

		GameRegistry.addShapelessRecipe(new ItemStack(CA.ClaySwordArray[0], 1), new Object[] {CA.DyeArray[0], CA.ClaySwordArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClaySwordArray[1], 1), new Object[] {CA.DyeArray[1], CA.ClaySwordArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClaySwordArray[2], 1), new Object[] {CA.DyeArray[2], CA.ClaySwordArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClaySwordArray[3], 1), new Object[] {CA.DyeArray[3], CA.ClaySwordArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClaySwordArray[4], 1), new Object[] {CA.DyeArray[4], CA.ClaySwordArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClaySwordArray[5], 1), new Object[] {CA.DyeArray[5], CA.ClaySwordArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClaySwordArray[6], 1), new Object[] {CA.DyeArray[6], CA.ClaySwordArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClaySwordArray[7], 1), new Object[] {CA.DyeArray[7], CA.ClaySwordArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClaySwordArray[8], 1), new Object[] {CA.DyeArray[8], CA.ClaySwordArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClaySwordArray[9], 1), new Object[] {CA.DyeArray[9], CA.ClaySwordArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClaySwordArray[10], 1), new Object[] {CA.DyeArray[10], CA.ClaySwordArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClaySwordArray[11], 1), new Object[] {CA.DyeArray[11], CA.ClaySwordArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClaySwordArray[12], 1), new Object[] {CA.DyeArray[12], CA.ClaySwordArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClaySwordArray[13], 1), new Object[] {CA.DyeArray[13], CA.ClaySwordArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClaySwordArray[14], 1), new Object[] {CA.DyeArray[14], CA.ClaySwordArray[16]});
       	GameRegistry.addShapelessRecipe(new ItemStack(CA.ClaySwordArray[15], 1), new Object[] {CA.DyeArray[15], CA.ClaySwordArray[16]});
   	
	}
	
}
