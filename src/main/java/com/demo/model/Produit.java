package com.demo.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.Min;

@Entity
public class Produit implements Serializable {
/**
	 * 
	 */
private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
	@Column(nullable = false)
private String titre;
@Column(nullable = true)
private String photo;
@Column(nullable = false)
private String description;
@Min(value = 1)
@Column(nullable = false)
private double prix;

@OneToOne(cascade = CascadeType.MERGE) // récupération fusionné
@JoinColumn(name = "categorie", referencedColumnName = "titre")
private Categorie categorie;

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

public String getPhoto() {
	return photo;
}

public void setPhoto(String photo) {
	this.photo = photo;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public double getPrix() {
	return prix;
}

public void setPrix(double prix) {
	this.prix = prix;
}

public Categorie getCategorie() {
	return categorie;
}

public void setCategorie(Categorie categorie) {
	this.categorie = categorie;
} 






}
