package com.buggzboy.test;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;


@Mod(modid = "test", name = "Test", version = "1.0")
public class Test {

    @SubscribeEvent
    public void preInit(FMLPreInitializationEvent event){



    }

    @SubscribeEvent
    public void Init(FMLInitializationEvent event){



    }

    @SubscribeEvent
    public void postInit(FMLPostInitializationEvent event){



    }


}
