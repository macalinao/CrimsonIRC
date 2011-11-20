/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crimsonrpg.irc.api.event;

import com.crimsonrpg.irc.api.Channel;

/**
 * Called when a message is sent in a channel.
 */
public class ChannelMessageEvent extends ChannelEvent {
    private final String sender;
    private final String login;
    private final String hostname;
    private final String message;
    
    public ChannelMessageEvent(Channel channel, String sender, String login, String hostname, String message) {
        super(EventType.CHANNEL_MESSAGE, channel);
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
