package appliCR;


import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

public class ModeleListePraticiens extends AbstractTableModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Praticien> vehicules ;
	private final String[] entetes = {"Immatriculation","Modèle","Année","Compteur",""} ;
	
	private ModeleCR modele ;
	
	public ModeleListePraticiens(ModeleCR modele){
		super() ; 
		System.out.println("ModeleListeVehicules::ModeleListeVehicules()") ;
		this.modele = modele ;
		vehicules = new ArrayList<Praticien>(modele.getPraticiens()) ;
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object getValueAt(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return null;
	}


}
