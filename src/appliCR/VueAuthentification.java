package appliCR;

import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class VueAuthentification extends JFrame {
	
	public static void main(String[] args){
		JFrame formulaire = new JFrame("Authentification DR") ;
		JTextField tfLogin = new JTextField() ;
		JPasswordField pfMdp = new JPasswordField() ;
		JButton bEnregistrer = new JButton() ;
		JButton bAnnuler = new JButton() ;
		
		Box boxPrincipal = Box.createVerticalBox();
		Box boxLogin = Box.createHorizontalBox();
		Box boxMdp = Box.createHorizontalBox();
		Box boxBouton = Box.createHorizontalBox() ;


		

		boxLogin.add(new JLabel("Login : ")) ;
		boxLogin.add(tfLogin);
		boxMdp.add(new JLabel("Mot de passe : ")) ;
		boxMdp.add(pfMdp);
		pfMdp.setEchoChar('*') ;
		boxBouton.add(bEnregistrer) ;
		boxBouton.add(bAnnuler) ;
		boxPrincipal.add(boxLogin) ;
		boxPrincipal.add(boxMdp) ;
		boxPrincipal.add(bEnregistrer) ;
		boxPrincipal.add(boxBouton);
		formulaire.add(boxPrincipal) ;
		
		formulaire.setLocationRelativeTo(null);
		formulaire.setVisible(true);
		formulaire.setSize(850,520);
		formulaire.setDefaultCloseOperation(EXIT_ON_CLOSE);

		
		
		
	}
	
	
	

}



