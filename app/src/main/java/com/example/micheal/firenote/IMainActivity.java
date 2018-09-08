package com.example.micheal.firenote;


import com.example.micheal.firenote.Model.Note;


public interface IMainActivity {

    void createNewNote(String title, String content);

    void updateNote(Note note);

    void onNoteSelected(Note note);

    void deleteNote(Note note);
}
