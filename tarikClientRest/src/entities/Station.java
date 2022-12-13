package ma.tarikKerrou.entities;

import java.io.Serializable;
import java.lang.String;


/**
 * Entity implementation class for Entity: Station
 *
 */


public class Station implements Serializable {

	
	private Long id_station;
	private String nom;
	private String ville;
	private String adresse;
	private static final long serialVersionUID = 1L;

	public Station() {
		super();
	}   
	public Station(Long id_station, String nom, String ville, String adresse) {
		super();
		this.id_station = id_station;
		this.nom = nom;
		this.ville = ville;
		this.adresse = adresse;
	}
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}   
	public Long getId_station() {
		return id_station;
	}
	public void setId_station(Long id_station) {
		this.id_station = id_station;
	}
	public String getVille() {
		return this.ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}   
	
	public String getAdresse() {
		return this.adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
   
}
