package com.service;

import java.util.List;

import com.dao.NotetakerDAO;
import com.dao.NotetakerDAOImp;
import com.entities.Note;

public class NotetakerServiceImp implements NotetakerService
{

	@Override
	public Note addNotes(Note note) 
	{
		NotetakerDAO dao=new NotetakerDAOImp();
		Note note1=dao.insertNotes(note);
		return note1;
	}

	@Override
	public void removeNote(int id) {
		NotetakerDAO dao=new NotetakerDAOImp();
		dao.deleteNote(id);
		
		
	}

	@Override
	public void modifyNote(Note note) {
		
		NotetakerDAO dao=new NotetakerDAOImp();
		dao.updateNote(note);;
	}

	@Override
	public Note readNote(int id) {
		NotetakerDAO dao=new NotetakerDAOImp();
		Note note2=dao.getNote(id);
		return note2;
	}

	@Override
	public List<Note> readAllNote() 
	{
		NotetakerDAO dao=new NotetakerDAOImp();
		List<Note> list=dao.getAllNote();
		//System.out.println(list.size());
		return list;
	}

}
