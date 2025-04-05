package com.uddeshyaSingh.MyFirstApplciation.entities;

public class NotesGetResponse {
    private boolean isCompleted;
    private String message;

    public NotesGetResponse(boolean _isCompleted, String _message) {
        this.isCompleted = _isCompleted;
        this.message = _message;
    }

    public boolean getCompletionState() {
        return this.isCompleted;
    }

    public String getMessage() {
       return this.message;
    }
}
