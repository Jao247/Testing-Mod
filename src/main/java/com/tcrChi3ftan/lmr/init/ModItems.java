package com.tcrChi3ftan.lmr.init;

import com.tcrChi3ftan.lmr.item.ItemLMR;
import com.tcrChi3ftan.lmr.item.ItemMapleLeaf;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    public static final ItemLMR mapleLeaf = new ItemMapleLeaf();

    public static void init()
    {
        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
    }
}
