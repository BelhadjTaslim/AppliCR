package appliCR;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class VueAuthentification extends JFrame implements ActionListener {
	
	private static JTextField tfLogin;
	private static JLabel labelLogin;
	private static JPasswordField pfMdp;
	private static JLabel labelMdp;
	private static JButton bValider;
	private static JButton bAnnuler;
	private static ActionListener ecouteur;
	
	
	private static JPanel panel;
	private static Statement stmt;
	private static Connection connexion;
	private static ResultSet resultat;
	
	
	
	public VueAuthentification(){
		//Controleurs controleur = new Controleur();
	
		panel = new JPanel();
		this.getContentPane().add(panel);
		panel.setLayout(new GridLayout(3,3,10,10));
		tfLogin = new JTextField() ;
		pfMdp = new JPasswordField() ;
		bValider = new JButton("Se connecter") ;
		bAnnuler = new JButton("Annuler") ;





		labelLogin= new JLabel("Login : ");
		labelMdp = new JLabel ("Mot de passe : ");
		panel.add(labelLogin);
		panel.add(tfLogin);
		panel.add(labelMdp);
		panel.add(pfMdp);
		panel.add(bValider);
		panel.add(bAnnuler);
		bValider.addActionListener(this);
		bAnnuler.addActionListener(this);


		pfMdp.setEchoChar('*') ;

		this.setLocationRelativeTo(null);
		this.setVisible(true);
		pack();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Connectez vous");

	}

	public static void main(String[] args){
		VueAuthentification auth = new VueAuthentification();
	}


	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == bValider){
			//Créer la classe seConnecter dans le controleur
			//controleur.seConnecter();
			/*try{
			
			ConnexionBDD connect = new ConnexionBDD();
			}*/
	
		
		}
		if (e.getSource() == bAnnuler){
			tfLogin.setText("");
			pfMdp.setText("");
		}
	
		
	
	}

}