/**
 * 
 */
package com.common;

import java.util.ArrayList;
import java.util.List;

/**
 * @author amodak
 */
public class MessageResult {

    private List<MessageTO> messages;

    private boolean valid = true;

    /**
     * @return the messages
     */
    public List<MessageTO> getMessages() {
        return messages;
    }

    /**
     * @param messages the messages to set
     */
    public void setMessages(List<MessageTO> messages) {
        this.messages = messages;
    }

    /**
     * @return the valid
     */
    public boolean isValid() {
        return valid;
    }

    /**
     * @param valid the valid to set
     */
    public void setValid(boolean valid) {
        this.valid = valid;
    }

    /**
     * Adds a list of messages to the business result.
     * 
     * @param ml the list of messages to be added.
     */
    public void addMessages(List<MessageTO> ml) {
        if (messages == null) {
            messages = new ArrayList<MessageTO>(ml);
        } else {
            messages.addAll(ml);
        }
    }

    /**
     * Adds message to the business result.
     * 
     * @param ml message to be added.
     */
    public void addMessage(MessageTO ml) {
        if (messages == null) {
            messages = new ArrayList<MessageTO>();
        }
        messages.add(ml);
    }

}
