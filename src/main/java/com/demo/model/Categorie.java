package com.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Categorie implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
@Column(unique = true,nullable = false)
private String titre;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTitre() {
	return titre;
}
public void setTitre(String titre) {
	this.titre = titre;
}




}
