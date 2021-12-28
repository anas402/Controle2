package Exercice7;

import java.util.Date;

import java.util.HashMap;
import java.util.Map;
public class Ex7Test {

	public static void main(String[] args) {
		//Tester:
		   Article article1=new Article(5,10,"Stylo","AliExpress");
		   article1.afficher();
		   
		   Article article2=new Article(2,3,"Cahier","AliExpress");
		   article2.afficher();
		   Article article3=new Article(4,6,"cartable","AliBaba");
		   article3.afficher();
		   
		   System.out.println("****************************");
		   
		   
		  Electromenager electro1=new Electromenager(750,1000,"camera","canon",40,"S34pe");
		  electro1.afficher();
		  Electromenager electro2=new Electromenager(5000,4500,"drone","Amaon",30,"D34322");
		  electro1.afficher();
		  System.out.println("****************************");
		 
		  Primeurs primeur1=new Primeurs(3,4,"Potato","agriculteure",new Date(2021,12,21));
		  primeur1.afficher();
		  Primeurs primeur2=new Primeurs(5,6,"tomato","agriculteure",new Date(2021,12,15));
		  primeur2.afficher();
		  
		
		
		Map<String,Integer> ajouter=new HashMap<>();
		 ajouter.put("potato",49);
		 ajouter.put("tomato",50);
		 ajouter.put("orange", 14);
		 ajouter.put("pomme",0);
		 
		
		  Magasin m1=new Magasin(ajouter);
		 System.out.println("****************************");
		 //afficher
		 System.out.println( m1.getListeArticle());
		 System.out.println("****************************");
		 
		 m1.vendreArticle("tomato",10);
		 System.out.println(m1.getListeArticle());

		 System.out.println("****************************");
		 //ajouter des quantite en stock:
		 m1.approvisionner("carrot",0);
		 m1.approvisionner("blee",0);
		 
		 m1.listerArticleRupture();
		 m1.listerArticleDisponible();
	 
	}

}

