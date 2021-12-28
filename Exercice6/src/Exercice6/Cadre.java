package Exercice6;

import java.util.Date;

public class Cadre extends Employe{
  //les attributs:	
    private int indice;
  //les constructeurs:
    public Cadre() {}                          
	public Cadre(String mat, String nom, String prenom, Date dateNaissance,int indice) {
		
		super(mat,nom,prenom,dateNaissance);
		this.indice = indice;
	}
    
  //mehode toString():
	@Override
	public String toString() {
		return super.toString()+",indice=" + indice + ",Salaire="+getSalaire()+"]";
	}
	
  //la methode abstract:
	public double getSalaire() {
		int salaire=0;
		switch(indice) {
		 case 1:salaire=12000;break;
		 case 2:salaire=14000;break;
		 case 3:salaire=16000;break;
		 case 4:salaire=18000;break;
		 default:System.out.println("l'indice qui entrer est incorrect!");
		}
		return salaire;
	}
	

}
