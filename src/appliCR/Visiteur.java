package appliCR;

public class Visiteur {
	private int numero ;
	private String nom ;
	private String prenom ;
	private String mobile ;
	
	/** Créer un visiteur
	 * 
	 * @param numero Le numéro du visiteur
	 * @param nom Le nom
	 * @param prenom Le prénom
	 * @param mobile Le numéro de mobile
	 */
	public Visiteur(int numero, String nom, String prenom, String mobile) {
		super();
		
		this.nom = nom;
		this.prenom = prenom;
		this.mobile = mobile;
	}
	
	/** Obtenir le numéro visiteur
	 * 
	 * @return Le numéro visiteur
	 */
	public int getNumero() {
		return numero;
	}

	/** Modifier le numéro visiteur
	 * 
	 * @param numero Le numéro visiteur
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/** Obtenir le nom
	 * 
	 * @return Le nom
	 */
	public String getNom() {
		return nom;
	}

	/** Modifier le nom
	 * 
	 * @param nom Le nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/** Obtenir le prénom
	 * 
	 * @return Le prénom
	 */
	public String getPrenom() {
		return prenom;
	}

	/** Modifier le prénom
	 * 
	 * @param prenom Le prénom
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/** Obtenir le numéro de mobile
	 * 
	 * @return Le numéro de mobile
	 */
	public String getMobile() {
		return mobile;
	}

	/** Modifier le numéro de mobile
	 * 
	 * @param mobile Le numéro de mobile
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "visiteur [numero=" + numero + ", nom=" + nom + ", prenom="
				+ prenom + ", mobile=" + mobile + "]";
	}

}
