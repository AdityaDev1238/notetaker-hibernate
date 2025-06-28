package com.service;

import java.util.List;

import com.entities.Note;

public interface NotetakerService 
{
	Note addNotes(Note note);
	void removeNote(int id);
	void  modifyNote(Note note);
	Note readNote(int id);
	List<Note> readAllNote();

}
