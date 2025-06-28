package com.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.entities.Note;
import com.utility.HibernateUtility;

public class NotetakerDAOImp implements NotetakerDAO
{

	@Override
	public Note insertNotes(Note note) 
	{
		SessionFactory factory=HibernateUtility.getSessionFactory();
		try(Session session=factory.openSession())
		{
			Transaction tx=session.beginTransaction();
			 session.save(note);
			 tx.commit();
			 return note;
			
			
			
		}
		catch(Exception e)
		{
			System.out.println("com.dao.insertNotes(): "+e);
		}
		return null;
	}

	@Override
	public void deleteNote(int id) 
	{
		
		SessionFactory factory=HibernateUtility.getSessionFactory();
		try(Session session=factory.openSession())
		{
			Transaction tx=session.beginTransaction();
			
			Note note = session.get(Note.class, id); 
            if (note != null) 
            {
                session.delete(note); 
                System.out.println("Deleted Successfully");
            } else 
            {
                System.out.println("Note not found");
            }
            tx.commit();
        }
		catch(Exception e)
		{
			System.out.println("com.dao.deleteNote(): "+e);
		}
				
			
		}
		
		
		
	

	@Override
	public void  updateNote(Note note) {
		
		SessionFactory factory=HibernateUtility.getSessionFactory();
		try(Session session=factory.openSession())
		{
			Transaction tx=session.beginTransaction();
			Note note1 = session.get(Note.class, note.getId()); 
			if(note1!=null)
			{
				note1.setTitle(note.getTitle());
				note1.setContent(note.getContent());
				session.update(note1); 
	            tx.commit();
	            System.out.println("Updated");
			}
			else
			{
				System.out.println("Not updated");
			}
			
					
			
		}
		catch(Exception e)
		{
			System.out.println("com.dao.updateNote(): "+e);
		}
		
		
	}

	@Override
	public Note getNote(int id) {
		SessionFactory factory=HibernateUtility.getSessionFactory();
		try(Session session=factory.openSession())
		{
			Transaction tx=session.beginTransaction();
			Note n1 = (Note) session.get(Note.class, id);
			if (n1 != null) {

				return n1;
				
				
			} else {
				System.out.println("Not Existed Data In database");
			}
	
		}
		catch(Exception e)
		{
			System.out.println("com.dao.getNote(): "+e);
		}
		return null;
		
		
	}

	@Override
	public List<Note> getAllNote() 
	{
		SessionFactory factory=HibernateUtility.getSessionFactory();
		try(Session session=factory.openSession())
		{
			Transaction tx=session.beginTransaction();
			 Criteria criteria=session.createCriteria(Note.class);
			 return criteria.list();
			 

			 
			
			
			
		}
		catch(Exception e)
		{
			System.out.println("com.dao.getAllNote(): "+e);
		}
		return null;
		
	}

}
