package appliCR;

import java.sql.SQLException;

public class AppliCR {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("AppliCR::main()") ;
		
		ModeleCR modele = new ModeleCR() ;
		Controleur controleur = new Controleur(modele) ;
//		ConnexionBDD.getConnexion() ;
		new GuiCR(modele,controleur) ;
		
	}

}
