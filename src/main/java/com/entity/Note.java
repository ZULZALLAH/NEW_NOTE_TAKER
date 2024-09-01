package com.entity;

import java.util.Date;
import java.util.Random;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="notes")
public class Note {
	
	@Id
	private int id;
	private String title;
	private String content;
	private Date adddedDate;
	

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

	public Date getAdddedDate() {
		return adddedDate;
	}

	public void setAdddedDate(Date adddedDate) {
		this.adddedDate = adddedDate;
	}

	public Note( String title, String content, Date adddedDate) {
		super();
		this.id = new Random().nextInt(100000);
		this.title = title;
		this.content = content;
		this.adddedDate = adddedDate;
	}

	public Note() {
		
		super();
		System.out.println("khan");
		System.out.println("Ahmad");
		System.out.println("Khan");
	}
	
	
	

}
