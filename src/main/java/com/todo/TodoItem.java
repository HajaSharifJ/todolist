package com.todo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "TodoItems")
public class TodoItem {

    @Id
    private String id;
    private String name;
    private boolean complete;

    public TodoItem() {}

    public TodoItem(String name) {
        this.name = name;
        this.complete = false;
    }

    public TodoItem(String name, boolean complete) {
    	this.name = name;
    	this.complete = complete;
    }
    
    @Override
    public String toString() {
        return String.format(
                "TodoItem[id=%d, name='%s', complete='%b']",
                id, name, complete);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        return;
    }

     public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
        return;
    }

    public boolean isComplete() {
        return complete;
    }
    
    public void setComplete(boolean complete) {
        this.complete = complete;
        return;
    }
}