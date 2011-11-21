/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crimsonrpg.irc;

import com.crimsonrpg.irc.api.Connection;
import com.crimsonrpg.irc.api.ConnectionManager;
import java.util.HashMap;
import java.util.Map;

/**
 * Represents a simple IRC manager.
 */
public class SimpleConnectionManager implements ConnectionManager {
    private Map<String, Map<String, Connection>> connections = new HashMap<String, Map<String, Connection>>();
    
    public Connection getConnection(String host, String name) {
        Map<String, Connection> hostMap = connections.get(host);
        if (hostMap == null) {
            hostMap = new HashMap<String, Connection>();
            connections.put(host, hostMap);
        }
        
        Connection connection = hostMap.get(name);
        if (connection != null) return connection;
        
        connection = new SimpleConnection(host, name);
        hostMap.put(name, connection);
        return connection;
    }
    
}
