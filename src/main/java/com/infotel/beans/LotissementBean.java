package com.infotel.beans;



import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

<<<<<<< HEAD
import com.infotel.ejb.ICoeurRemote;
=======
>>>>>>> ef548708032b17446697b67d6566451be3136cb5
import com.infotel.metier.Lotissement;
import com.infotel.metier.Personne;


@Named
@SessionScoped
public class LotissementBean implements Serializable{

	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;
	
	@EJB
	private ICoeurRemote service;
	
	private Lotissement lotissement = new Lotissement();
	
	private Personne personne = new Personne();

<<<<<<< HEAD
	

=======
>>>>>>> ef548708032b17446697b67d6566451be3136cb5
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
	}
	public List<Lotissement> listerLotissements(){
		return service.listerLotissements();
	}
	public Lotissement getLotissement(long idLot) {
		return service.getLotissement
	}
	public Lotissement getLotissementSuppr(long idLot) {
		
	}
	public void supprimerLotissement(Lotissement l) {
		
	}
	public void modifierLotissement(Lotissement l) {
		
	}
	
	public void acheterLotissement(Personne p, Lotissement l) {
		
	}
	
}
