/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crimsonrpg.irc.api.event;

import com.crimsonrpg.irc.api.Connection;

/**
 * Called when a connection successfully connects.
 */
public class ConnectionConnectEvent extends IRCEvent {

    public ConnectionConnectEvent(Connection connection) {
        super(EventType.CONNECTION_CONNECT, connection);
    }
    
}
