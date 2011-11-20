/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crimsonrpg.irc.api;

/**
 * Manages IRC connections.
 */
public interface ConnectionManager {
    /**
     * Gets a connection to an IRC server.
     * 
     * @param host
     * @param name
     * @return 
     */
    public Connection getConnection(String host, String name);
}
