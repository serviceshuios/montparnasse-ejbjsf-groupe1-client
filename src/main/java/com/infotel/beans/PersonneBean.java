package com.infotel.beans;


import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import com.infotel.ejb.ICoeurRemote;
import com.infotel.metier.Personne;

@Named
@SessionScoped
public class PersonneBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@EJB
	private ICoeurRemote service;
	
	private Personne personne = new Personne();
	
	

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
	
	public void ajouterPersonne() {
		service.ajouterPersonne(personne);
		personne = new Personne();
	}

	public List<Personne> listerPersonnes(){
		return service.listerPersonnes();
	}
	public Personne getPersonne(long idPersonne) {
		return service.getPersonne(idPersonne);
	}
	public Personne getPersonneSuppr(long idPersonne) {
		return service.getPersonneSuppr(idPersonne);
	}
	public void supprimerPersonne(Personne p) {
		service.supprimerPersonne(p);
	}
	public void modifierPersonne(Personne p) {
		service.modifierPersonne(p);
	}
	public void seMarier(Personne p1, Personne p2) {
		service.seMarier(p1, p2);
	}

}
