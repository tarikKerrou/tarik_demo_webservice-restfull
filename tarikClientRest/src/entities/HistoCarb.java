package ma.tarikKerrou.entities;

import java.io.Serializable;
import java.lang.Double;
import java.util.Date;


/**
 * Entity implementation class for Entity: HistoCarb
 *
 */

public class HistoCarb implements Serializable {
	
	private Long id_Histocarb;
	
	private Date date;
	private Double prix;
	private static final long serialVersionUID = 1L;

	public HistoCarb() {
		super();
	}   
	
	

	public HistoCarb(Long id_Histocarb, Date date, Double prix) {
		super();
		this.id_Histocarb = id_Histocarb;
		this.date = date;
		this.prix = prix;
	}


	public Long getId_Histocarb() {
		return id_Histocarb;
	}

	public void setId_Histocarb(Long id_Histocarb) {
		this.id_Histocarb = id_Histocarb;
	}
	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}   
	public Double getPrix() {
		return this.prix;
	}

	public void setPrix(Double prix) {
		this.prix = prix;
	}
   
}
