package appliCR;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

public class GuiCR extends JFrame implements ActionListener {
	
	private ModeleCR modele ;
	private Controleur controleur ;
	private JMenu fichier ;
	private JMenu visiteur;
	private JMenuItem itemQuitter ;
	private JMenuItem itemVisualiserPraticiens ;
	private JMenuItem itemEnregistrerPraticien ;
	private JMenuItem itemVisualiserVisiteurs ;
	private JMenuItem itemEnregistrerVisiteur ;
	private JMenuItem itemVisualiserCR ;
	private JMenuItem seConnecter ;
	private JMenuItem seDeconnecter ;
	private JTextField tfLogin;
	private JLabel labelLogin;
	private JPasswordField pfMdp;
	private JLabel labelMdp;

	
	
	private JPanel panneauAuthentification;

	
	private VueListeCR vueVisualiserCR ;
	private VueListeVisiteurs vueVisualiserVisiteurs ;
	private VueListePraticiens vueVisualiserPraticiens ;
	
	private CardLayout vues ;
	private Container conteneur ;
	
	public GuiCR(ModeleCR modele, Controleur controleur){
		
		super() ;
		this.modele = modele ;
		this.controleur = controleur ;
		
		this.setTitle("GSB");
		this.setSize(1120,520);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.vues = new CardLayout(2,2) ;
		this.conteneur = this.getContentPane() ;
		this.conteneur.setLayout(this.vues) ;
		
		vueVisualiserCR = new VueListeCR(modele,controleur) ;
		vueVisualiserVisiteurs = new VueListeVisiteurs(modele,controleur) ;
//		vueVisualiserPraticiens = new VueListePraticiens(modele,controleur) ;
		
		
		this.conteneur.add(vueVisualiserCR,"Liste véhicules") ;
		this.conteneur.add(vueVisualiserVisiteurs,"Liste Visiteurs") ;
//		this.conteneur.add(vueVisualiserPraticiens,"Liste CRs") ;
		
		this.vues.show(this.conteneur, "Liste Visiteurs");
		
		this.creerBarreMenu() ;
		this.setVisible(true) ;
		
		panneauAuthentification = new JPanel();
		panneauAuthentification.setLayout(new GridLayout(3,3,10,10));
		tfLogin = new JTextField(10) ;
		pfMdp = new JPasswordField(10) ;


		labelLogin= new JLabel("Login : ");
		labelMdp = new JLabel ("Mot de passe : ");
		panneauAuthentification.add(labelLogin);
		panneauAuthentification.add(tfLogin);
		panneauAuthentification.add(labelMdp);
		panneauAuthentification.add(pfMdp);

		pfMdp.setEchoChar('*') ;
		
	}
	
	private void creerBarreMenu(){
		
		JMenuBar barreDeMenu = new JMenuBar();
		fichier = new JMenu("Fichier") ;
		visiteur = new JMenu("Visiteur") ;
		
		this.seConnecter = new JMenuItem("Se Connecter") ;
		this.seDeconnecter = new JMenuItem("Se Déconnecter") ;
		this.itemQuitter = new JMenuItem ("Quitter") ;
		itemQuitter.addActionListener(this);
		seConnecter.addActionListener(this);
		seDeconnecter.addActionListener(this) ;
		seConnecter.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,InputEvent.CTRL_MASK));
		seDeconnecter.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,InputEvent.CTRL_MASK));
		itemQuitter.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q,InputEvent.CTRL_MASK));
		seConnecter.setToolTipText("Connexion à l'application GSB");
		seDeconnecter.setToolTipText("Déconnexion de l'application GSB");
		itemQuitter.setToolTipText("Quitter l'application");
		
		
		JMenuItem listeVisiteur = new JMenuItem("Liste des visiteurs") ;
		JMenuItem enregisterVisiteur = new JMenuItem ("Enregistrer un nouveau visiteur") ;
		
		fichier.add(seConnecter) ;
		fichier.add(seDeconnecter) ;
		
		fichier.addSeparator();
		
		fichier.add(itemQuitter) ;
		
		visiteur.add(listeVisiteur) ;
		visiteur.add(enregisterVisiteur) ;
		
		barreDeMenu.add(fichier) ;
		barreDeMenu.add(visiteur) ;
		
//		this.add(barreDeMenu) ;
		
		this.setJMenuBar(barreDeMenu);
		
	}

	public ModeleCR getModele() {
		return modele;
	}

	public void setModele(ModeleCR modele) {
		this.modele = modele;
	}

	public Controleur getControleur() {
		return controleur;
	}

	public void setControleur(Controleur controleur) {
		this.controleur = controleur;
	}
	
	
	public void changerDeVue(String nomVue){
		System.out.println("GuiCR::changerVue()") ;
		if(nomVue.equals("")){
			//this.vueVisualiserCR.actualiser() ;
		}
		else if(nomVue.equals("")){
			this.vueVisualiserVisiteurs.actualiser() ;
		}
		else if(nomVue.equals("")){
//			this.vueVisualiserPraticiens.actualiser() ;
		}
		this.vues.show(this.conteneur,nomVue) ;
	}
	
	public void actionPerformed(ActionEvent evenement) {
		System.out.println("----------------------------------------") ;
		System.out.println("GuiCR::actionPerformed()") ;
		Object sourceEvt = evenement.getSource() ;
		
		if(sourceEvt == this.itemQuitter){
			
			this.controleur.quitterApplication() ;
		}
		else if(sourceEvt == this.itemVisualiserVisiteurs){
			this.controleur.visualiserVisiteur() ;
		}
		else if(sourceEvt == this.itemVisualiserCR){
			this.controleur.visualiserCR() ;
		}
		else if(sourceEvt == this.itemVisualiserPraticiens){
			this.controleur.visualiserPraticien() ;
		}
		else if(sourceEvt == this.seConnecter) {
			int ok = JOptionPane.showOptionDialog(this, panneauAuthentification, "Identification", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, EXIT_ON_CLOSE);
			String login = tfLogin.getText();
			String mdp = pfMdp.getText();
			if(ok == JOptionPane.CANCEL_OPTION){
			this.seDeconnecter.setEnabled(false) ;
			this.seConnecter.setEnabled(true) ;
//			this.menuComptesRendus.setEnabled(false) ;
			this.visiteur.setEnabled(false) ;
//			this.menuPraticien.setEnabled(false) ;
			this.vues.show(this.conteneur,"Accueil") ;
			}
			else if(login.isEmpty() || mdp.isEmpty()){
				JOptionPane.showMessageDialog(null, "Veuillez renseigner tous les champs", "Saisir votre login et votre mot de passe : ", JOptionPane.ERROR_MESSAGE);
				this.seDeconnecter.setEnabled(false) ;
				this.seConnecter.setEnabled(true) ;
//				this.menuComptesRendus.setEnabled(false) ;
				this.visiteur.setEnabled(false) ;
//				this.menuPraticien.setEnabled(false) ;
				this.vues.show(this.conteneur,"Accueil") ;
			}
			else if(ok == JOptionPane.OK_OPTION){
				boolean co = this.controleur.tenterConnexion(login, mdp);
				if(co == true){
					this.seDeconnecter.setEnabled(true) ;
					this.seConnecter.setEnabled(false) ;
//					this.menuComptesRendus.setEnabled(true) ;
					this.visiteur.setEnabled(true) ;
//					this.menuPraticien.setEnabled(true) ;
					this.vues.show(this.conteneur,"Accueil") ;
				}
				else{
					JOptionPane.showMessageDialog(null, "Vous n'êtes pas un délégué !", "Erreur d'identification", JOptionPane.ERROR_MESSAGE);
				}
			}
			
		}
		
	}


}
