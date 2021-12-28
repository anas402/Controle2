package Exercice7;

import java.util.Date;


public class Primeurs extends Article implements Produits {
  //les attributs:
	private Date peremption;
  //les constructeurs:
	public Primeurs() {
		
	}
	
	public Primeurs(double prixAchat, double prixVente, String nom, String fournisseur,Date peremption) {
		super(prixAchat, prixVente,nom,fournisseur);
		this.peremption = peremption;
	}
	
  //les getter et setter:
	
	
	
	public Date getPeremption() {
		return peremption;
	}
   public void setPeremption(Date peremption) {
		this.peremption = peremption;
	}
   
   //la methode afficher();
   public void afficher() {
		super.afficher();
	    System.out.println("Date:"+peremption);
   }

	
	//les methodes:
	public Date datePeremption() {
		return peremption;
	}
	
	public int joursRestants() {
		Date date =new Date();
		
		int jourauj=((date.getYear()+1900)*365)+((date.getMonth()+1)*30)+date.getDay();
		int jourper=((peremption.getYear())*365)+((peremption.getMonth())*30)+peremption.getDay();
		return jourper-jourauj;
	}
}