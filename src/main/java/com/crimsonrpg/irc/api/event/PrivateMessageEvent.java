/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crimsonrpg.irc.api.event;

import com.crimsonrpg.irc.api.Connection;

/**
 * Called when a connection is sent a private message.
 */
public class PrivateMessageEvent extends IRCEvent {
    private final String sender;
    private final String login;
    private final String hostname;
    private final String message;
    
    public PrivateMessageEvent(Connection connection, String sender, String login, String hostname, String message) {
        super(EventType.PRIVATE_MESSAGE, connection);
        this.sender = sender;
        this.login = login;
        this.hostname = hostname;
        this.message = message;
    }

    public String getHostname() {
        return hostname;
    }

    public String getLogin() {
        return login;
    }

    public String getMessage() {
        return message;
    }

    public String getSender() {
        return sender;
    }
}
