package com.infotel.beans;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import com.infotel.ejb.ICoeurRemote;
import com.infotel.metier.Lotissement;
import com.infotel.metier.Personne;

@Named
@SessionScoped
public class LotissementBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EJB
	private ICoeurRemote service;

	private Lotissement lotissement = new Lotissement();

	private Personne personne = new Personne();

	public ICoeurRemote getService() {
		return service;
	}

	public void setService(ICoeurRemote service) {
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

	public void ajouterLotissement() {
		service.ajouterLotissement(lotissement);
		lotissement = new Lotissement();
	}

	public List<Lotissement> listerLotissements() {
		return service.listerLotissements();
	}

	public Lotissement getLotissement(long idLot) {
		return service.getLotissement(idLot);
	}

	public Lotissement getLotissementSuppr(long idLot) {
		return service.getLotissementSuppr(idLot);

	}

	public void supprimerLotissement() {
		service.supprimerLotissement(lotissement);
	}

	public void modifierLotissement() {
		service.modifierLotissement(lotissement);
	}

	public void acheterLotissement(Personne p, Lotissement l) {
		service.acheterLotissement(p, l);
	}

}
