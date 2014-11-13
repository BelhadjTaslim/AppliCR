package appliCR;

import java.util.List;

import javax.swing.table.AbstractTableModel;

public class ModeleListeVisiteurs extends AbstractTableModel {
	
	private List<Visiteur> clients ;
	private final String[] entetes = {"Numéro","Nom","Prénom","Mobile"} ;
	
	private ModeleCR modele ;
	private Controleur controleur;
	
	public ModeleListeVisiteurs(ModeleCR modele, Controleur controleur){
		super() ; 
		System.out.println("ModeleListeClients::ModeleListeClients()") ;
		this.modele = modele ;
		this.controleur = controleur ;
		clients = modele.getVisiteurs() ;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
