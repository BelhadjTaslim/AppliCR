package appliCR ;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ModeleCR {
	
	private List<Visiteur> visiteurs = new ArrayList<Visiteur>() ;
	private List<Praticien> praticiens = new ArrayList<Praticien>() ;
	private List<CompteRendu> compteRendus = new ArrayList<CompteRendu>() ;

	public List<Praticien> getPraticiens(){
		System.out.println("ModeleLocations::getLocations()") ;
		return this.praticiens ;
	}
	
	/** Obtenir la liste des clients
	 * 
	 * @return La liste des clients
	 */
	public List<Visiteur> getVisiteurs(){
		System.out.println("ModeleLocations::getClients()") ;
		return this.visiteurs ;
	}
	
	/** Obtenir la liste des véhicules
	 * 
	 * @return La liste des véhicules
	 */
	public List<CompteRendu> getVehicules(){
		System.out.println("ModeleLocations::getVehicules()") ;
		return this.compteRendus ;
	}

	public void ajouterVisiteur(String nom, String prenom, String mobile) {
		// TODO Auto-generated method stub
		
	}

}
