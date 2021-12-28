package Exercice3;


public class Ville {
	  private String nom,pays;
	  private int population;
	  
	  //les constructeurs:
	    public Ville() {}
	    public Ville(String nom,String pays,int population) {
	    	this.nom=nom;
	    	this.pays=pays;
	    	this.population=population;
	    	
	    }
	  //setter et getter:
	    public int getPopulation() {
			return population;
		}
		public void setPopulation(int population) {
			this.population=population;
		}
	    
	    public void testerNbr() {
	    	try {
	    		if(population<0)
	        		throw new PopulationException(+population+" n'est pas nombre valide!");
	        	else {
	        		System.out.println("le nombre est valide.");
	        	}
	       
	    	}catch(PopulationException e) {
	    		System.out.println(e);
	    	}
	    	  System.out.println("FIN");
	        }
	    }
		