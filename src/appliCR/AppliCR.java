package appliCR;

public class AppliCR {

	public static void main(String[] args) {
		System.out.println("AppliCR::main()") ;
		
		ModeleCR modele = new ModeleCR() ;
		Controleur controleur = new Controleur(modele) ;
		new GuiCR(modele,controleur) ;
		new VueAuthentification() ;
	}

}
