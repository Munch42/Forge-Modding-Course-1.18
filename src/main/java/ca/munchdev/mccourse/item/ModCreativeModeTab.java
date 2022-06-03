package ca.munchdev.mccourse.item;

import ca.munchdev.mccourse.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    //                                                                  This label is for the translation file.
    public static final CreativeModeTab COURSE_TAB = new CreativeModeTab("coursemodtab") {
        @Override
        public ItemStack makeIcon() {
            // Display image for the tab
            return new ItemStack(ModBlocks.COBALT_ORE.get());
        }
    };
}
