package Exercice7;


public class Article {
   //les attributs:
	  private double prixAchat,prixVente;
	  private String nom,fournisseur;
	//les constructeurss:
	  public Article() {
		  
	  }
	
	  public Article(double prixAchat, double prixVente, String nom, String fournisseur) {
		super();
		this.prixAchat = prixAchat;
		this.prixVente = prixVente;
		this.nom = nom;
		this.fournisseur = fournisseur;
	 }
	 
	//les getter setter:
	  public double getPrixAchat() {
			return prixAchat;
		}

		public void setPrixAchat(double prixAchat) {
			this.prixAchat = prixAchat;
		}

		public double getPrixVente() {
			return prixVente;
		}

		public void setPrixVente(double prixVente) {
			this.prixVente = prixVente;
		}

		public String getNom() {
			return nom;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}

		public String getFournisseur() {
			return fournisseur;
		}

		public void setFournisseur(String fournisseur) {
			this.fournisseur = fournisseur;
		}
	  
	  
	//les methhodes 
	  public double  calculeTauxRendement() {
		  return prixVente-prixAchat;
	  }
	  
	 

	public void afficher() {
		 
		System.out.println("prixAchat:"+prixAchat+"\tPrixVente:"+prixVente+" \tnom:"+nom+"\tfournisseur:"+fournisseur);
		
	  }			  

}