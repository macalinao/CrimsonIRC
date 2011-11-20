/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crimsonrpg.irc.api.event;

import com.crimsonrpg.irc.api.Channel;

/**
 * Represents an event relating to an IRC channel.
 */
public abstract class ChannelEvent extends IRCEvent {
    private final Channel channel;

    public ChannelEvent(EventType type, Channel channel) {
        super(type, channel.getConnection());
        this.channel = channel;
    }
}
