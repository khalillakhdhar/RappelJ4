package com.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
@Entity
public class User implements Serializable { // facilite et accélere la reconnaissance et l'insertion des sous objet
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String email;
private String mdp;
@NotBlank
private String nom;
@NotBlank
private String prenom;
@NotBlank
private String adresse;
@Column(nullable = false, columnDefinition = "varchar(100) default 'client'")
private String grade;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getMdp() {
	return mdp;
}
public void setMdp(String mdp) {
	this.mdp = mdp;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public String getAdresse() {
	return adresse;
}
public void setAdresse(String adresse) {
	this.adresse = adresse;
}
public String getGrade() {
	return grade;
}
public void setGrade(String grade) {
	this.grade = grade;
}




}
