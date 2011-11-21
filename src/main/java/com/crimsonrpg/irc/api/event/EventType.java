/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crimsonrpg.irc.api.event;

/**
 * Represents a type of event.
 */
public enum EventType {
    CHANNEL_MESSAGE,
    
    CHANNEL_TOPIC,
    
    CONNECTION_CONNECT,
    
    CONNECTION_DISCONNECT,
    
    PRIVATE_MESSAGE;
}
