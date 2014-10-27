package com.buggzboy.test.Init;


import com.buggzboy.test.Blocks.BlockT;
import com.buggzboy.test.Blocks.Blocktestblock;
import cpw.mods.fml.common.registry.GameRegistry;

public class modBlocks {

    public static final BlockT testblock = new Blocktestblock();



    public static void init(){

        GameRegistry.registerBlock(testblock, "testblock");



    }




}
