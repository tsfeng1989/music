package com.music.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author Forever
 * @version 1.0
 */
@Entity
@Table(name="tb_album")
public class Album {
	private int al_id;
	private String al_name;
	private int al_munber; 
	private int al_a_id;
	
	
	public Album() {
		super();
	}
	public Album(int al_id, String al_name, int al_munber, int al_a_id) {
		super();
		this.al_id = al_id;
		this.al_name = al_name;
		this.al_munber = al_munber;
		this.al_a_id = al_a_id;
	}
	
	@Id
	@GeneratedValue
	public int getAl_id() {
		return al_id;
	}
	public void setAl_id(int al_id) {
		this.al_id = al_id;
	}
	public String getAl_name() {
		return al_name;
	}
	public void setAl_name(String al_name) {
		this.al_name = al_name;
	}
	public int getAl_munber() {
		return al_munber;
	}
	public void setAl_munber(int al_munber) {
		this.al_munber = al_munber;
	}
	public int getAl_a_id() {
		return al_a_id;
	}
	public void setAl_a_id(int al_a_id) {
		this.al_a_id = al_a_id;
	}
}
