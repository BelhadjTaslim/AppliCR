package appliCR;

import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class VueListeVisiteurs extends JPanel {
	private ModeleCR modele;
	private Controleur controleur;
	private JTable tableauVisiteurs ;
	

	public VueListeVisiteurs(ModeleCR modele, Controleur controleur) {
		super();
		System.out.println("VueListeVisiteurs::VueListeVisiteurs()") ;
		
		this.modele = modele ;
		this.controleur = controleur ;
		
		Box boxPrincipal = Box.createVerticalBox() ;
		Box boxEtiquette = Box.createHorizontalBox() ;
		Box boxTableau = Box.createHorizontalBox() ;

		boxEtiquette.add(new JLabel("Clients :")) ;
		boxEtiquette.add(Box.createHorizontalGlue()) ;
		
		ModeleListeVisiteurs modeleTableauVisiteurs = new ModeleListeVisiteurs(modele, controleur) ;
		tableauVisiteurs = new JTable(modeleTableauVisiteurs) ;
		tableauVisiteurs.setRowHeight(30) ;
		
		JScrollPane spVisiteurs = new JScrollPane(tableauVisiteurs) ;
		spVisiteurs.setPreferredSize(new Dimension(1090,420)) ;
		
		boxTableau.add(spVisiteurs) ;
		
		boxPrincipal.add(boxEtiquette) ;
		boxPrincipal.add(boxTableau) ;
		
		this.add(boxPrincipal) ;
		
	}
	
	public void actualiser(){
		System.out.println("VueListeClients::actualiser()") ;
		ModeleListeVisiteurs modeleTableauVisiteurs = new ModeleListeVisiteurs(modele, controleur) ;
		tableauVisiteurs.setModel(modeleTableauVisiteurs) ;
		this.appliquerRendu() ;
	}

	private void appliquerRendu() {
		System.out.println("VueListeVisiteurs::appliquerRendu()") ;
		//this.tableauVisiteurs.getColumn("Bouton de séléction").setCellRenderer(new RenduBoutonVisiteur());
		//this.tableauVisiteurs.getColumn("Bouton de séléction").setCellRenderer(new EditeurBoutonVisiteur(new JCheckBox()));
		
		
	}
	}

}
