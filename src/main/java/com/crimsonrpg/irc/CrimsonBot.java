/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crimsonrpg.irc;

import com.crimsonrpg.irc.api.event.ChannelMessageEvent;
import com.crimsonrpg.irc.api.event.ConnectionConnectEvent;
import com.crimsonrpg.irc.api.event.ConnectionDisconnectEvent;
import com.crimsonrpg.irc.api.event.PrivateMessageEvent;
import org.bukkit.Bukkit;
import org.jibble.pircbot.PircBot;

/**
 *
 * @author simplyianm
 */ 
public class CrimsonBot extends PircBot {
    private SimpleConnection connection;

    public CrimsonBot(SimpleConnection connection) {
        this.connection = connection;
    }

    @Override
    protected void onConnect() {
        ConnectionConnectEvent event = new ConnectionConnectEvent(connection);
        Bukkit.getServer().getPluginManager().callEvent(event);
    }

    @Override
    protected void onDisconnect() {
        ConnectionDisconnectEvent event = new ConnectionDisconnectEvent(connection);
        Bukkit.getServer().getPluginManager().callEvent(event);
    }
    
    @Override
    protected void onMessage(String channel, String sender, String login, String hostname, String message) {
        ChannelMessageEvent event = new ChannelMessageEvent(connection.getChannel(channel), sender, login, hostname, message);
        Bukkit.getServer().getPluginManager().callEvent(event);
    }
    
    @Override
    protected void onPrivateMessage(String sender, String login, String hostname, String message) {
        PrivateMessageEvent event = new PrivateMessageEvent(connection, sender, login, hostname, message);
        Bukkit.getServer().getPluginManager().callEvent(event);
    }
}