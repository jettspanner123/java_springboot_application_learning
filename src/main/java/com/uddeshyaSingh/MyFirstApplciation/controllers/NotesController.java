package com.uddeshyaSingh.MyFirstApplciation.controllers;

import com.uddeshyaSingh.MyFirstApplciation.entities.Note;
import com.uddeshyaSingh.MyFirstApplciation.entities.NotesPostResponse;
import org.springframework.web.bind.annotation.*;
import com.uddeshyaSingh.MyFirstApplciation.entities.NotesGetResponse;

@RestController @RequestMapping("/notes") public class NotesController {
    private java.util.Map<String, Note> notes = new java.util.TreeMap<>();

    @GetMapping("/get_all_notes") public java.util.List<Note> getAllNotes() {
        return new java.util.ArrayList<>(notes.values());
    }

    @GetMapping("/get_note/{_id}") public NotesPostResponse getNoteById(@PathVariable("_id") String _id) {
        if(!this.notes.containsKey(_id)) return new NotesPostResponse(false, "Note not found with id: " + _id, null);
        return new NotesPostResponse(true, "Note found with id: " + _id, this.notes.get(_id));
    }

    @PostMapping("/add_note") public NotesGetResponse addNote(@RequestBody Note _note) {
        if(this.notes.containsKey(_note.getId())) return new NotesGetResponse(false, "Note id " + _note.getId() + " already exists");
        this.notes.put(_note.getId(), _note);
        return new NotesGetResponse(true, "Note id " + _note.getId() + " added");
    }

}
