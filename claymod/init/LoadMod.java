package claymod.init;


public class LoadMod {

	public static void load(){
		ClayParts.init();
        ClayRegister.init();
        ClayArrays.init();
        ClayRecipes.init();
	}
}
