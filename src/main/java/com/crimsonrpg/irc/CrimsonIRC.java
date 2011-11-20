/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crimsonrpg.irc;

import com.crimsonrpg.irc.api.ConnectionManager;
import java.util.logging.Logger;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * The CrimsonIRC plugin.
 */
public class CrimsonIRC extends JavaPlugin {
    public static final Logger LOGGER = Logger.getLogger("Minecraft");
    public static final ConnectionManager connectionManager = new SimpleConnectionManager();
    
    public void onDisable() {
        LOGGER.info("[CrimsonIRC] Plugin disabled.");
    }

    public void onEnable() {
        LOGGER.info("[CrimsonIRC] Plugin enabled.");
    }
    
}
