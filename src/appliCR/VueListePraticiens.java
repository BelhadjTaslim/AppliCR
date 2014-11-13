package appliCR;

import javax.swing.JPanel;

public class VueListePraticiens extends JPanel {
	private ModeleCR modele;
	private Controleur controleur;
	private
	public VueListePraticiens(ModeleCR modele, Controleur controleur) {
		super();
		System.out.println("VueListePraticiens::VueListePraticien()") ;
		this.modele = modele;
		this.controleur = controleur ;
	}
	
	public void actualiser(){
		System.out.println("VueListeVehicules::actualiser()") ;
		ModeleListePraticiens modeleTableauPraticiens = new ModeleListePraticiens(modele) ;
		tableauPraticiens.setModel(modeleTableauPraticiens) ;
		this.appliquerRendu() ; 
	}
	private void appliquerRendu(){
		System.out.println("VueListePraticiens::appliquerRendu()") ;
		tableauPraticiens.setDefaultRenderer(Object.class,new RenduCellulePraticien()) ;
	}


}
