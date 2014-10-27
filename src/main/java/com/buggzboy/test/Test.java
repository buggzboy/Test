package com.buggzboy.test;

import com.buggzboy.test.Init.modBlocks;
import com.buggzboy.test.Ref.Ref;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;




@Mod(modid = Ref.MOD_ID, name = Ref.MOD_NAME, version = Ref.VERSION)
public class Test {

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){

        modBlocks.init();

    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event){



    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){



    }


}
