package com.uddeshyaSingh.MyFirstApplciation.entities;

import com.uddeshyaSingh.MyFirstApplciation.entities.Note;

public class NotesPostResponse {
    private Boolean isCompleted;
    private String message;
    private Note note;

    public NotesPostResponse(Boolean isCompleted, String message, Note note) {
        this.isCompleted = isCompleted;
        this.message = message;
        this.note = note;
    }

    public Boolean isCompleted() {
        return this.isCompleted;
    }

    public void setCompleted(Boolean _isCompleted) {
        this.isCompleted = _isCompleted;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String _message) {
        this.message = _message;
    }

    public Note getNote() {
        return this.note;
    }

    public void setNote(Note _note) {
        this.note = _note;
    }
}
