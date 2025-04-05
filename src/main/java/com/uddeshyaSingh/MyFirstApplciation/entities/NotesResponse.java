package com.uddeshyaSingh.MyFirstApplciation.entities;

public class NotesResponse {
    private boolean isCompleted;
    private String message;

    public boolean getCompletionState() {
        return this.isCompleted;
    }

    public String getMessage() {
       return this.message;
    }
}
