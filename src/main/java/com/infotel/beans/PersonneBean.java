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
public class PersonneBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EJB
	private ICoeurRemote service;

	private Personne personne = new Personne();
	private Personne personne2 = new Personne();
	private Lotissement lotissement = new Lotissement();

	public Lotissement getLotissement() {
		return lotissement;
	}

	public void setLotissement(Lotissement lotissement) {
		this.lotissement = lotissement;
	}

	public ICoeurRemote getService() {
		return service;
	}

	public void setService(ICoeurRemote service) {
		this.service = service;
	}

	public Personne getPersonne() {
		return personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}

	public Personne getPersonne2() {
		return personne2;
	}

	public void setPersonne2(Personne personne2) {
		this.personne2 = personne2;
	}

	public void ajouterPersonne() {
		service.ajouterPersonne(personne);
		personne = new Personne();
	}

	public List<Personne> listerPersonnes() {
		return service.listerPersonnes();
	}

	public Personne getPersonne(long idPersonne) {
		return service.getPersonne(idPersonne);
	}

	public long supprimerPersonne(long idPersonne) {
		return service.supprimerPersonne(idPersonne);
	}

	public void modifierPersonne() {
		service.modifierPersonne(personne);
		personne = new Personne();
	}

	public void seMarier1() {
		service.seMarier1(personne.getIdPersonne(), personne2.getIdPersonne());
	}

	public void seMarier2() {
		service.seMarier2(personne.getIdPersonne(), personne2.getIdPersonne());
	}

}
