package com.tcrChi3ftan.lmr.utility;

import com.tcrChi3ftan.lmr.reference.Reference;
import cpw.mods.fml.common.FMLLog;
import org.apache.logging.log4j.Level;

public class LogHandler
{
    public static void Log(Level logLevel, Object object)
    {
        FMLLog.log(Reference.MOD_ID, logLevel, String.valueOf(object));
    }

    public static void all(Object object){Log(Level.ALL, object);}

    public static void debug(Object object){Log(Level.DEBUG, object);}

    public static void info(Object object){Log(Level.INFO, object);}

    public static void warn(Object object){Log(Level.WARN, object);}

    public static void error(Object object){Log(Level.ERROR, object);}

    public static void fatal(Object object){Log(Level.FATAL, object);}

    public static void off(Object object){Log(Level.OFF, object);}

    public static void trace(Object object) {Log(Level.TRACE, object);}
}
