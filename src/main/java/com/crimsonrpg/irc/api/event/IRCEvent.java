/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crimsonrpg.irc.api.event;

import com.crimsonrpg.irc.api.Connection;
import org.bukkit.event.Event;

/**
 * Represents an IRC event.
 */
public abstract class IRCEvent extends Event {
    private final EventType eventType;
    private final Connection connection;

    public IRCEvent(EventType type, Connection connection) {
        super(type.name());
        this.eventType = type;
        this.connection = connection;
    }

    public EventType getEventType() {
        return eventType;
    }

    public Connection getConnection() {
        return connection;
    }
}