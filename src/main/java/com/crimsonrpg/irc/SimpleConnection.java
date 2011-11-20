/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crimsonrpg.irc;

import com.crimsonrpg.irc.api.Channel;
import com.crimsonrpg.irc.api.Connection;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jibble.pircbot.IrcException;
import org.jibble.pircbot.NickAlreadyInUseException;
import org.jibble.pircbot.PircBot;

/**
 * Represents a connection to an IRC server.
 */
public class SimpleConnection implements Connection {
    private String hostname;
    private String nick;
    private CrimsonBot bot;
    
    public SimpleConnection(String hostname, String nick) {
        this.hostname = hostname;
        this.nick = nick;
    }
    
    public void connect() {
        bot = new CrimsonBot() {{
            setLogin(nick);
            setName(nick);
            setAutoNickChange(true);
        }};
        
        try {
            bot.connect(hostname);
        } catch (IOException ex) {
            CrimsonIRC.LOGGER.severe("[CrimsonIRC] Could not connect to the host " + hostname + ".");
        } catch (NickAlreadyInUseException ex) {
            CrimsonIRC.LOGGER.severe("[CrimsonIRC] Could not connect to the host " + hostname + " as the nickname was already in use.");
        } catch (IrcException ex) {
            CrimsonIRC.LOGGER.severe("[CrimsonIRC] Could not connect to the host " + hostname + " for an unknown reason.");
        }
    }

    public void disconnect() {
        bot.disconnect();
        bot = null;
    }

    public boolean isConnected() {
        return bot.isConnected();
    }

    public String getHostname() {
        return hostname;
    }

    public String getNick() {
        return bot.getNick();
    }

    public Channel getChannel(String name) {
        return null;
    }
    
    protected CrimsonBot getBot() {
        return bot;
    }
    
    protected class CrimsonBot extends PircBot {
        
    }
    
}
