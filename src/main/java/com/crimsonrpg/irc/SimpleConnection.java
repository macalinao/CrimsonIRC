/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crimsonrpg.irc;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.jibble.pircbot.IrcException;
import org.jibble.pircbot.NickAlreadyInUseException;
import org.jibble.pircbot.PircBot;

import com.crimsonrpg.irc.api.Channel;
import com.crimsonrpg.irc.api.Connection;

/**
 * Represents a connection to an IRC server.
 */
public class SimpleConnection implements Connection {
    private String hostname;
    private String nick;
    private CrimsonBot bot;
    private Map<String, Channel> channels = new HashMap<String, Channel>();
    
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
        Channel channel = channels.get(name);
        if (channel != null) return channel;
        
        channel = new SimpleChannel(name, this);
        channels.put(name, channel);
        return channel;
    }
    
    protected CrimsonBot getBot() {
        return bot;
    }
    
    protected class CrimsonBot extends PircBot {
        
    }
    
}
