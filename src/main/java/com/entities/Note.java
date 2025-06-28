package com.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="notes")
public class Note 
{
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String title;
	private String content;

	
	public Note() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Note(int id, String title, String content) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		
	}
	
	

	public Note(String title, String content) {
		super();
		this.title = title;
		this.content = content;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Note [id=" + id + ", title=" + title + ", content=" + content + "]";
	}

	
	
	
	
	

}
