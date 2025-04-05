package com.uddeshyaSingh.MyFirstApplciation.controllers;

import com.uddeshyaSingh.MyFirstApplciation.entities.Note;
import org.springframework.web.bind.annotation.*;
import com.uddeshyaSingh.MyFirstApplciation.entities.NotesResponse;

@RestController @RequestMapping("/notes") public class NotesController {
    private java.util.Map<String, Note> notes = new java.util.TreeMap<>();

    @GetMapping("/get_all_notes") public java.util.List<Note> getAllNotes() {
        return new java.util.ArrayList<>(notes.values());
    }

    @PostMapping("/add_note") public NotesResponse addNote(@RequestBody Note _note) {
        if(this.notes.containsKey(_note.getId())) return false;
        this.notes.put(_note.getId(), _note);
        return true;
    }
}
