package Exercice7;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Magasin {
	//les attributs:
	/*
	 * private Map<Article,Integer> listeArticle=new HashMap<>(); private
	 * Map<Electromenager,Integer> listeElectromenager=new HashMap<>(); private Map
	 * <Primeurs,Integer> listePrimeurs=new HashMap<>();
	 */
		private  Map<String,Integer> listeArticle=new HashMap<>();
		private ArrayList<String>  ProduitVendus=new ArrayList<>();
		private ArrayList<String>  ProduitEnStock=new ArrayList<>();
		
		
	//les constructeurs:
		public Magasin() {}
		
		public Magasin(Map<String, Integer> listeArticle) {
			this.listeArticle = listeArticle;
		}
		
		
    //les getter et setter:
		public Map<String,Integer> getListeArticle() {
			return listeArticle;
		}
		

		public  void setListeArticle(Map<String,Integer> listeArticle) {
			this.listeArticle=listeArticle;
		}

		
		
	//methode vendreArticles():
		public void vendreArticle(String article,int quantite) {
			
			if(listeArticle.containsKey(article)==true) {//true:si article est existe
			    
				if(listeArticle.get(article)<quantite) {
				      System.out.println(quantite+" n'extiste pas dans stock pour l'article"+article);
			    }else {
				      int nouveauQuatite=listeArticle.get(article)-quantite;
				      listeArticle.replace(article,nouveauQuatite);
				      
//				     if(listeArticle.get(article)==0) {//pour ajouter les produits vendue
//				    	 ProduitVendus.add(article);
//				     }else if(listeArticle.get(article)>0) {//pour ajouter les produits en stock
//				    	 ProduitEnStock.add(article);
//				     }
				    	      
				    	 
			    }
		   }else
				System.out.println("l'article n'existe pas.");
			
	    }
		
	//methode s'approvisionner():
		
		public void approvisionner(String article,int quantite) {
			
			if(listeArticle.containsKey(article)==true) {
				if(quantite>=0) {
				   int nouveauQuatite=listeArticle.get(article)+quantite;
				   listeArticle.replace(article,nouveauQuatite);
				}else 
					System.out.println(quantite+"quantite qui peut ajouter est incorrect!");
					
			}else {
				if(quantite>=0) {
				  listeArticle.put(article,quantite);
				 // ProduitEnStock.add(article);
				  System.out.println(article+" est ajouter dans Stock.");
				}else
					System.out.println(quantite+"quantite qui peut ajouter est incorrect.");

			}
		}
		
	//methode Lister les articles en rupture en stock:
		
		
		public void listerArticleRupture() {
			for(Entry<String, Integer> e:listeArticle.entrySet()) {
			String nomArticle=e.getKey();
				int quantite=e.getValue();
				
				if((ProduitVendus.contains(nomArticle)==false)&&(quantite==0)) {
					ProduitVendus.add(nomArticle);
				}               
			}
		  System.out.println("Lister les articles en rupture en stock:");
		  System.out.println(ProduitVendus);
			
		}
		
		
	  // Lister les articles disponibles en stock:
		
		public void listerArticleDisponible() {
         
			for(Entry<String,Integer> e:listeArticle.entrySet()) {				
				String nomArticle=e.getKey();				
				int quantite=e.getValue();				
				if((ProduitEnStock.contains(nomArticle)==false) &&(quantite>0)) {
					 ProduitEnStock.add(nomArticle);
				}               
			}
       
			 System.out.println("Lister les articles disponible en stock:");
			System.out.println(ProduitEnStock);
		}
		
		
  //Quantité en stock par article (fournir le nom comme paramètre):
		public void QuantiteEnStockParArticle(String nom) {
			
			if(listeArticle.containsKey(nom)==true) {
				System.out.println("La quantite en stock par article"+nom+"est:"+listeArticle.get(nom));
			}else 
				System.out.println("l'article"+nom+"n'existe pas en stock!");
		}
		
		
  //description de l'etat du magasin:
		public void description() {
			System.out.println("magasin contient:");
			System.out.println(listeArticle);
		}


}