package appliCR;

import javax.swing.JPanel;

public class VueListeCR extends JPanel {
	
	private ModeleCR modele;
	private Controleur controleur;

	public VueListeCR(ModeleCR modele, Controleur controleur) {
		super();
		System.out.println("VueListeCR::VueListeCR()") ;
		this.modele = modele;
		this.controleur = controleur ;
	}

}
