package Exercice2;



public class Enfant {
	   private  int age;
	   //les constructeurs:

		public Enfant(int age) {
			this.age = age;
		}
		
	  //la fonction pour tester
	    public void  testerAge()  {
	          try {
	    		if((age<1)||(age>10)) {
	    			throw new AgeException("["+age+"] ans n'est pas un �ge valide !");
	    	    }else
	    	    	System.out.println("["+age+"]"+" ans est un �ge valide.");
	          }catch(AgeException e) {
	        	  System.out.println(e);
	          }
	            System.out.println("FIN.");
	    }
	    

	}
