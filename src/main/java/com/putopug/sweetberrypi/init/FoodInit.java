package com.putopug.sweetberrypi.init;

import com.putopug.sweetberrypi.SweetBerryPi;
import com.putopug.sweetberrypi.obj.item.SbJA;
import com.putopug.sweetberrypi.obj.item.SbPi;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

//
//@author PutoPug
//
public class FoodInit {
    public static final DeferredRegister<Item> FOOD = DeferredRegister.create(ForgeRegistries.ITEMS, SweetBerryPi.MOD_ID);

    public static void init(){
        FOOD.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
    public static final Food SWEETBERRY_PIE = new Food.Builder().saturation(0.98F).hunger(7).build();
    public static final Food SWEETBERRY_JAM = new Food.Builder().saturation(0.3F).hunger(4).build();
    public static final RegistryObject<Item> SWEETBERRYPIE = FOOD.register("sweetberry_pie", SbPi::new);
    public static final RegistryObject<Item> SWEETBERRYJAM = FOOD.register("sweetberry_jam", SbJA::new);
}
