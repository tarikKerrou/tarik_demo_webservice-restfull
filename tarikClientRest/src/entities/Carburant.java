package ma.tarikKerrou.entities;

import java.io.Serializable;
import java.lang.String;


/**
 * Entity implementation class for Entity: Carburant
 *
 */

public class Carburant implements Serializable {
	
	private Long id_carburant;
	
	private String nom;
	private String description;
	private static final long serialVersionUID = 1L;

	public Carburant() {
		super();
	}   
	
	public Carburant(Long id_carburant, String nom, String description) {
		super();
		this.id_carburant = id_carburant;
		this.nom = nom;
		this.description = description;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public Long getId_carburant() {
		return id_carburant;
	}
	public void setId_carburant(Long id_carburant) {
		this.id_carburant = id_carburant;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}   
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
   
}
