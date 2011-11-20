/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crimsonrpg.irc.api.event;

import org.bukkit.event.CustomEventListener;
import org.bukkit.event.Event;

/**
 * Represents a listener for IRC events.
 * 
 * TODO: write documentation
 */
public class IRCListener extends CustomEventListener {
    public void onChannelMessage(ChannelMessageEvent event) {}
    
    public void onConnectionConnect(ConnectionConnectEvent event) {}
    
    public void onConnectionDisconnect(ConnectionDisconnectEvent event) {}
    
    public void onPrivateMessage(PrivateMessageEvent event) {}
    
    @Override
    public void onCustomEvent(Event event) {
        if (!(event instanceof IRCEvent)) return;
        IRCEvent ircEvent = (IRCEvent) event;
        
        switch (ircEvent.getEventType()) {
            
            case CHANNEL_MESSAGE:
                this.onChannelMessage((ChannelMessageEvent) event);
                break;
                
            case CONNECTION_CONNECT:
                this.onConnectionConnect((ConnectionConnectEvent) event);
                break;
                
            case CONNECTION_DISCONNECT:
                this.onConnectionDisconnect((ConnectionDisconnectEvent) event);
                break;
                
            case PRIVATE_MESSAGE:
                this.onPrivateMessage((PrivateMessageEvent) event);
                break;
        }
    }
}
