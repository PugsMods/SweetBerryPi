package com.putopug.sweetberrypi.obj.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

import static com.putopug.sweetberrypi.init.FoodInit.SWEETBERRY_JAM;
import static com.putopug.sweetberrypi.init.FoodInit.SWEETBERRY_PIE;

//
//@author PutoPug
//
public class SbJA extends Item {
    public SbJA() {
        super(new Item.Properties().food(SWEETBERRY_JAM).group(ItemGroup.FOOD));
    }

    @Override
    public int getUseDuration(ItemStack stack) {
        return 15;
    }
}
