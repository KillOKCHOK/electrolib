package ua.killok.dao.model.entities;

import java.sql.Date;

import ua.killok.dao.model.interfaces.LibEntity;

public class Article implements LibEntity{
	
	private int id;
	private String tile ;
	private String text ;
	private byte[] picture;
	private Date date;
	private User author; 		//id of user who created this  	//one author to many articles
	
	public Article() {}
	
	
	
	public Article(String tile, String text, byte[] picture, Date date, User author) {
		this.tile = tile;
		this.text = text;
		this.picture = picture;
		this.date = date;
		this.author = author;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTile() {
		return tile;
	}
	public void setTile(String tile) {
		this.tile = tile;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public byte[] getPicture() {
		return picture;
	}
	public void setPicture(byte[] picture) {
		this.picture = picture;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public User getAuthor() {
		return author;
	}
	public void setAuthor(User author) {
		this.author = author;
	}
	
	
}
