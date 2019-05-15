package com.infotel.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import com.infotel.ejb.IBanqueRemote;
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

	public IRemote getService() {
		return service;
	}

	public void setService(IRemote service) {
		this.service = service;
	}

	public Personne getPersonne() {
		return personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}
	
	public void ajouterPersonne(Personne p);
	public List<Personne> listerPersonnes();
	public Personne getPersonne(long idPersonne);
	public Personne getPersonneSuppr(long idPersonne);
	public void supprimerPersonne(Personne p);
	public void modifierPersonne(Personne p);
	public void seMarier(Personne p1, Personne p2);

}
