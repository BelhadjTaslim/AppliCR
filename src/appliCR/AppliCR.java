package appliCR;

public class AppliCR {

	public static void main(String[] args) {
		
		ModeleCR modele = new ModeleCR() ;
		Controleur controleur = new Controleur(modele) ;
		new GuiCR(modele,controleur) ;
	}

}
