package Exercice7;

public class Electromenager extends Article implements Susceptible{
	//les attributs:
	   private int voltage;
	   private String marque;
	   
	
	//les constructeurs:
	   public Electromenager() {
		   
	   }
	   
	
	public Electromenager(double prixAchat, double prixVente, String nom, String fournisseur,int voltage, String marque) {
		
		super(prixAchat,prixVente,nom,fournisseur);
		this.voltage = voltage;
		this.marque = marque;
	}
	
  //les getter et setter:
	public int getVoltage() {
		return voltage;
	}


	public void setVoltage(int voltage) {
		this.voltage = voltage;
	}


	public String getMarque() {
		return marque;
	}


	public void setMarque(String marque) {
		this.marque = marque;
	}

	
	
   //les methodes:

	
	@Override
	public void afficher() {
		super.afficher();
	System.out.println("voltage:"+voltage+"\tmarque:"+marque);
		
	}
	
	
	
	public void lancerSolde(double pourcentage) { 
		
	   double result=super.getPrixVente()-(double)super.getPrixVente()*pourcentage/100;
		setPrixVente(result);
	}
	
	public void terminerSolde(double pourcentage) {
		double result=super.getPrixVente()+(double)(super.getPrixVente()*pourcentage/100)   ;
		setPrixVente(result);
	}


}
