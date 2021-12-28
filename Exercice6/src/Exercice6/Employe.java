package Exercice6;

import java.util.Date;
public abstract class Employe {
 //les attributs:	
   private String matricule,nom,prenom;
   private Date dateNaissance;
 //les constructeurs:
   public Employe() {}
  
   public Employe(String matricule, String nom, String prenom, Date dateNaissance) {
	this.matricule = matricule;
	this.nom = nom;
	this.prenom = prenom;
	this.dateNaissance = dateNaissance;
   
   }
   
  //setter et getter:
   
   public String getMatricule() {
 	return matricule;
   }

    public void setMatricule(String matricule) {
 	this.matricule = matricule;
   }

   public String getNom() {
 	return nom;
   }

   public void setNom(String nom) {
 	this.nom = nom;
   }

   public String getPrenom() {
 	return prenom;
   }

   public void setPrenom(String prenom) {
   	this.prenom = prenom;
   }

   public Date getDateNaissance() {
 	return dateNaissance;
   }

   public void setDateNaissance(Date dateNaissance) {
 	this.dateNaissance = dateNaissance;
   }

 //toString():
  @Override
  public String toString() {
	return "[matricule=" + matricule + ", nom=" + nom + ", prenom=" + prenom + ", dateNaissance="
			+ dateNaissance.getYear() + "";
  }
 
// La méthode abstraite getSalaire ( ).
 
public abstract double getSalaire();


}
