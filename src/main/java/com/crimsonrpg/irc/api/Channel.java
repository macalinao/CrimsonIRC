/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crimsonrpg.irc.api;

/**
 * Represents a channel.
 */
public interface Channel {
    /**
     * Gets the name of this channel.
     * 
     * @return 
     */
    public String getName();
    
    /**
     * Gets the connection of this channel.
     * 
     * @return 
     */
    public Connection getConnection();
    
    /**
     * Sends a message to the channel.
     * 
     * @param message 
     */
    public void sendMessage(String message);
}
