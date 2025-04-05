package com.uddeshyaSingh.MyFirstApplciation.entities;

public class Note {
    private final String id = java.util.UUID.randomUUID().toString().substring(20);
    private String heading;
    private String description;
    private Boolean isCompleted;

    public String getId() {
        return this.id;
    }

    public String getHeading() {
        return this.heading;
    }

    public void setHeading(String _heading) {
        this.heading = _heading;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String _description) {
        this.description = _description;
    }

    public Boolean isCompleted() {
        return this.isCompleted;
    }

    public void setIsCompleted(Boolean _isCompleted) {
        this.isCompleted = _isCompleted;
    }
}
