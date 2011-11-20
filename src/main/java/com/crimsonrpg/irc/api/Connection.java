/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crimsonrpg.irc.api;

/**
 * Represents a connection to an IRC server.
 */
public interface Connection {
    /**
     * Connects to the IRC server.
     */
    public void connect();
    
    /**
     * Disconnects from the IRC server.
     */
    public void disconnect();
    
    /**
     * Checks if this connection is connected.
     * 
     * @return Connected
     */
    public boolean isConnected();
    
    /**
     * Gets the hostname of this connection.
     * 
     * @return 
     */
    public String getHostname();
    
    /**
     * Gets the nick of this connection.
     * 
     * @return 
     */
    public String getNick();
    
    /**
     * Gets a channel on this connection.
     * 
     * @param name
     * @return 
     */
    public Channel getChannel(String name);
}
