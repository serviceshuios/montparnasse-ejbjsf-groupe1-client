package com.infotel.beans;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import com.infotel.ejb.IBanqueRemote;
import com.infotel.metier.Lotissement;
import com.infotel.metier.Personne;

@Named
@SessionScoped
public class LotissementBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@EJB
	private ICoeurRemote service;
	
	private Lotissement lotissement = new Lotissement();
	
	private Personne personne = new Personne();

	public IRemote getService() {
		return service;
	}

	public void setService(IRemote service) {
		this.service = service;
	}

	public Lotissement getLotissement() {
		return lotissement;
	}

	public void setLotissement(Lotissement lotissement) {
		this.lotissement = lotissement;
	}

	public Personne getPersonne() {
		return personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}
	
	public void ajouterLotissement(Lotissement l);
	public List<Lotissement> listerLotissements();
	public Lotissement getLotissement(long idLot);
	public Lotissement getLotissementSuppr(long idLot);
	public void supprimerLotissement(Lotissement l);
	public void modifierLotissement(Lotissement l);
	
	public void acheterLotissement(Personne p, Lotissement l);
	
}
