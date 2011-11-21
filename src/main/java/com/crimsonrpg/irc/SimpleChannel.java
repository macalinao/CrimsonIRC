/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crimsonrpg.irc;

import com.crimsonrpg.irc.api.Channel;
import com.crimsonrpg.irc.api.Connection;

/**
 * A simple channel.
 */
public class SimpleChannel implements Channel {
    private String name;
    private SimpleConnection connection;
    
    public SimpleChannel(String name, SimpleConnection connection) {
        this.name = name;
        this.connection = connection;
    }

    public void join() {
        connection.getBot().joinChannel(name);
    }

    public void join(String key) {
        connection.getBot().joinChannel(name, key);
    }

    public String getName() {
        return name;
    }

    public Connection getConnection() {
        return connection;
    }

    public void sendMessage(String message) {
        connection.getBot().sendMessage(name, message);
    }
    
}
