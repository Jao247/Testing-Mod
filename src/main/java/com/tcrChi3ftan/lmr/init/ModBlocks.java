package com.tcrChi3ftan.lmr.init;

import com.tcrChi3ftan.lmr.block.BlockLMR;
import com.tcrChi3ftan.lmr.block.BlockMapleLog;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks
{
    public static final BlockLMR mapleLog = new BlockMapleLog();

    public static void init(){
        GameRegistry.registerBlock(mapleLog, "mapleLog");
    }
}
