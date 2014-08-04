package com.tcrChi3ftan.lmr.handler;

import com.tcrChi3ftan.lmr.reference.Reference;
import com.tcrChi3ftan.lmr.utility.LogHandler;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigHandler
{
    public static Configuration configuration;
    public static boolean testValue = false;

    public static void init(File configFile)
    {
        //Create the config object from the given config file
        if (configuration == null)
        {
            configuration = new Configuration(configFile);
            loadConfig();
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent e)
    {
        if (e.modID.equalsIgnoreCase(Reference.MOD_ID))
        {
            //Resync Configs
        }
    }

    private static void loadConfig()
    {
        testValue = configuration.getBoolean("configValue", Configuration.CATEGORY_GENERAL, false, "An example Config value");
        LogHandler.info("Config Loaded");
        if (configuration.hasChanged())
            configuration.save();
    }
}
