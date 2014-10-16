package appliCR;

public class Controleur {

	private ModeleCR modele ;
	private GuiCR vuePrincipale ;
	
	public Controleur(ModeleCR modele){
		super();
		System.out.println("Controleur::Controleur()") ;
		this.modele = modele;
	}
	public GuiCR getVuePrincipale() {
		System.out.println("Controleur::getVuePrincipale()") ;
		return vuePrincipale;
	}

	public void setVuePrincipale(GuiCR vuePrincipale) {
		System.out.println("Controleur::setVuePrincipale()") ;
		this.vuePrincipale = vuePrincipale;
	}
	
	public void visualiserVisiteur(){
		System.out.println("Controleur::visualiserVisiteur()") ;
		this.vuePrincipale.changerDeVue("Liste visiteurs");
	}
	
	public void visualiserCR(){
		System.out.println("Controleur::visualiserCR()") ;
		this.vuePrincipale.changerDeVue("Liste compte rendus") ;
	}
	
	public void visualiserPraticien(){
		System.out.println("Controleur::visualiserPraticien()") ;
		this.vuePrincipale.changerDeVue("Liste praticiens");
	}
	
	public void enregistrerVisiteur(String nom, String prenom, String mobile){
		System.out.println("Controleur::enregistrerVisiteur()") ;
		this.modele.ajouterVisiteur(nom,prenom,mobile) ;
		this.vuePrincipale.changerDeVue("Liste visiteurs") ;
	}
	
	public void annulerEnregistrerClient(){
		System.out.println("Controleur::annulerEnregistrerClient()") ;
		this.vuePrincipale.changerDeVue("Liste clients") ;
	}
	
	
	public void enregistrerPraticien(String nomPra,int numPra){
		System.out.println("Controleur::enregistrerPraticien()") ;
		this.modele.ajouterPraticien(nomPra,numPra) ;
		this.vuePrincipale.changerDeVue("Liste praticiens") ;
	}
	
	
	public void annulerEnregistrerPraticien(){
		System.out.println("Controleur::annulerEnregistrerPraticien()") ;
		this.vuePrincipale.changerDeVue("Liste praticiens") ;
	}
	
	
		
	public void annulerLocation(int numeroLocation){
		System.out.println("Controleur::annulerLocation()") ;
		this.modele.supprimerLocation(numeroLocation) ;
		this.vuePrincipale.changerDeVue("Liste locations") ;
	}
	
	
	public void quitterApplication(){
		System.out.println("Controleur::quitterApplication()") ;
		System.exit(0) ;
	}
	
	
	public void visualiserModeleCR(){
		System.out.println("Controleur::visualiserModeleCR()") ;
		System.out.println("") ;
		System.out.println("------------------ Praticiens ----------------------------") ;
		for(Praticien Praticien : this.modele.getPraticiens()){
			System.out.println(praticien) ;
		}
		System.out.println("------------------- Visiteur -----------------------------") ;
		for(Visiteur visiteur : this.modele.getVisiteurs()){
			System.out.println(visiteur) ;
		}
		System.out.println("------------------ Véhicules ----------------------------") ;
		for(CompteRendu compteRendu : this.modele.getCompteRendu()){
			System.out.println(compteRendu) ;
		}
		System.out.println("") ;
	}

	
	
}
