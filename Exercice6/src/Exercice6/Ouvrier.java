package Exercice6;

import java.util.Date;
public class Ouvrier extends Employe {
  //les attributs:	
	private Date dateEntreeSociete; 
	private static int SMIG=3000;
  //les constructeurs:
	public Ouvrier() {}
	
	public Ouvrier(String matricule, String nom, String prenom, Date dateNaissance,Date dateEntreeSociete) {
		super(matricule,nom,prenom,dateNaissance);
		this.dateEntreeSociete=dateEntreeSociete;
	}
  //les setter et getter:
	public Date getDateEntreeSociete() {
		return dateEntreeSociete;
	}

	public void setDateEntreeSociete(Date dateEntreeSociete) {
		this.dateEntreeSociete = dateEntreeSociete;
	}
	
  //toString():
	@Override
	public String toString() {
		return super.toString()+" ,dateEntreeSociete=" + dateEntreeSociete.getYear() +",Salaire="+getSalaire()+"]";
	}


 //les methodes:
	public double getSalaire() {
     Date dateAuj=new Date();
     int annee=(dateAuj.getYear()+1900)-dateEntreeSociete.getYear();
     
     int salaire=SMIG+annee*100;
     
     if(salaire<SMIG*2)
    	 return salaire;
     else
    	 return SMIG*2;
 
   }
	
	
}