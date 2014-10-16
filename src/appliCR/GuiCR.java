package appliCR;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

public class GuiCR extends JFrame implements ActionListener {
	
	private ModeleCR modele ;
	private Controleur controleur ;
	private JMenuItem itemQuitter ;
	private JMenuItem itemVisualiserPraticiens ;
	private JMenuItem itemEnregistrerPraticien ;
	private JMenuItem itemVisualiserVisiteurs ;
	private JMenuItem itemEnregistrerVisiteur ;
	private JMenuItem itemVisualiserCR ;
	
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
		this.setSize(850,520);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.vues = new CardLayout(2,2) ;
		this.conteneur = this.getContentPane() ;
		this.conteneur.setLayout(this.vues) ;
		
		vueVisualiserCR = new VueListeCR(modele,controleur) ;
		vueVisualiserVisiteurs = new VueListeVisiteurs(modele,controleur) ;
		vueVisualiserPraticiens = new VueListePraticiens(modele,controleur) ;
		
		
		this.conteneur.add(vueVisualiserCR,"Liste véhicules") ;
		this.conteneur.add(vueVisualiserVisiteurs,"Liste Visiteurs") ;
		this.conteneur.add(vueVisualiserPraticiens,"Liste CRs") ;
		
		
		this.vues.show(this.conteneur, "Liste CR");
		
		this.creerBarreMenu() ;
		this.setVisible(true) ;
		
		
	}
	
	private void creerBarreMenu(){
		
		JMenuBar barreDeMenu = new JMenuBar();
		JMenu fichier = new JMenu("Fichier") ;
		
		JMenuItem seConnecter = new JMenuItem("Se Connecter") ;
		JMenuItem seDeconnecter = new JMenuItem("Se Déconnecter") ;
		JMenuItem quitter = new JMenuItem ("Quitter") ;
		seConnecter.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,InputEvent.CTRL_MASK));
		seDeconnecter.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,InputEvent.CTRL_MASK));
		quitter.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q,InputEvent.CTRL_MASK));
		seConnecter.setToolTipText("Connexion à l'application GSB");
		seDeconnecter.setToolTipText("Déconnexion de l'application GSB");
		quitter.setToolTipText("Quitter l'application");
		
		fichier.add(seConnecter) ;
		fichier.add(seDeconnecter) ;
		
		fichier.addSeparator();
		
		fichier.add(quitter) ;
		
		barreDeMenu.add(fichier) ;
		
		this.add(barreDeMenu) ;
		
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
			this.vueVisualiserCR.actualiser() ;
		}
		else if(nomVue.equals("")){
			this.vueVisualiserVisiteurs.actualiser() ;
		}
		else if(nomVue.equals("")){
			this.vueVisualiserPraticiens.actualiser() ;
		}
		this.vues.show(this.conteneur,nomVue) ;
	}
	
	public void actionPerformed(ActionEvent evenement) {
		System.out.println("----------------------------------------") ;
		System.out.println("GuiRentaco::actionPerformed()") ;
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
		
	}


}
