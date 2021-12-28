package Exercice6;

import java.util.Date;

public class Associe extends Employe {
   // les attributs:
	 private double BN;//chiffre d'affaire ou benefice
	 private double pourcentage;
   //les constructeurs:
	public Associe(String mat, String nom, String prenom, Date dateNaissance,double BN,double pourcentage) {
		super(mat,nom,prenom,dateNaissance);
		this.BN =BN;
		this.pourcentage=pourcentage;
	}
  //toString():
	@Override
	public String toString() {
		return super.toString()+" ,BN=" + BN + ", pourcentage=" + pourcentage +",Salaire="+getSalaire()+"]";
	}
	
  //la methode abstract:
	public double getSalaire() {
	   double x=(double)pourcentage/100;
		double salaire=(BN*x)/12;
		return salaire;
	}


}