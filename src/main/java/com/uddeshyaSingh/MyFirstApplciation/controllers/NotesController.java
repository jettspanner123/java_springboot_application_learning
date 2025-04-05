package com.uddeshyaSingh.MyFirstApplciation.controllers;

import com.uddeshyaSingh.MyFirstApplciation.entities.Note;
import org.springframework.web.bind.annotation.*;
import com.uddeshyaSingh.MyFirstApplciation.entities.NotesGetResponse;

@RestController @RequestMapping("/notes") public class NotesController {
    private java.util.Map<String, Note> notes = new java.util.TreeMap<>();

    @GetMapping("/get_all_notes") public java.util.List<Note> getAllNotes() {
        return new java.util.ArrayList<>(notes.values());
    }

//    @GetMapping("/get_notes/{_it}") public 0

    @PostMapping("/add_note") public NotesGetResponse addNote(@RequestBody Note _note) {
        if(this.notes.containsKey(_note.getId())) return new NotesGetResponse(false, "Note id " + _note.getId() + " already exists");
        this.notes.put(_note.getId(), _note);
        return new NotesGetResponse(true, "Note id " + _note.getId() + " added");
    }

}
