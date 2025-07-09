package com.aaliyaan.crashloopfixer;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CrashLoopFixer implements ModInitializer {
    public static final String MOD_ID = "crashloopfixer";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("CrashLoopFixer initialized! 💥");
        LOGGER.warn("If Minecraft crashes again, we’re auto-restarting. 💀🍗");

        if (isModMenuPresent()) {
            LOGGER.info("ModMenu detected. Toggle auto-restart in settings! 🔥");
        }
    }

    private boolean isModMenuPresent() {
        try {
            Class.forName("io.github.prospector.modmenu.ModMenu");
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        }
    }
}
