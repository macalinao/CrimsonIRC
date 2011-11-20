/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crimsonrpg.irc.api.event;

import com.crimsonrpg.irc.api.Connection;

/**
 * Called when a connection disconnects.
 */
public class ConnectionDisconnectEvent extends IRCEvent {

    public ConnectionDisconnectEvent(Connection connection) {
        super(EventType.CONNECTION_DISCONNECT, connection);
    }
    
}