/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crimsonrpg.irc.api.event;

import com.crimsonrpg.irc.api.Channel;

/**
 * Called when a topic is received or changed in a channel.
 */
public class ChannelTopicEvent extends ChannelEvent {
    private String topic;
    private String setBy;
    private long date;
    private boolean changed;

    public ChannelTopicEvent(Channel channel, String topic, String setBy, long date, boolean changed) {
        super(EventType.CHANNEL_TOPIC, channel);
        this.topic = topic;
        this.setBy = setBy;
        this.date = date;
        this.changed = changed;
    }

    /**
     * Gets if the topic was changed.
     * 
     * @return 
     */
    public boolean isChanged() {
        return changed;
    }
    
    /**
     * Gets the milliseconds in which the topic was sent since the epoch.
     * 
     * @return 
     */
    public long getDate() {
        return date;
    }
    
    /**
     * Gets the nick of the user who set the topic.
     * 
     * @return 
     */
    public String getSetBy() {
        return setBy;
    }
    
    /**
     * Gets the topic.
     * 
     * @return 
     */
    public String getTopic() {
        return topic;
    }
}
