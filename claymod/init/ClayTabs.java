package claymod.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ClayTabs {

    public static CreativeTabs claymodTab = new CreativeTabs("claymodTab"){
		public Item getTabIconItem() {
			return ClayParts.cyanPickaxe;
		}
		
	};
}
