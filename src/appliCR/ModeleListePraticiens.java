package appliCR;


import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

public class ModeleListePraticiens extends AbstractTableModel {
	private List<Praticien> vehicules ;
	private final String[] entetes = {"Immatriculation","Modèle","Année","Compteur",""} ;
	
	private ModeleCR modele ;
	
	public ModeleListePraticiens(ModeleCR modele){
		super() ; 
		System.out.println("ModeleListeVehicules::ModeleListeVehicules()") ;
		this.modele = modele ;
		vehicules = new ArrayList<Praticien>(modele.getPraticiens()) ;
	}


}
