package com.dao;

import java.util.List;

import com.entities.Note;


public interface NotetakerDAO 
{
	Note insertNotes(Note note);
	void deleteNote(int id);
	void  updateNote(Note note);
	Note getNote(int id);
	List<Note> getAllNote();

}
