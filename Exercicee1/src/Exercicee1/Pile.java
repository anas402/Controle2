package Exercicee1;



public class Pile {
	  //les attributs :	
		private final static int taille = 10; 
		private Object [] pile; 
		private int pos;
	  //constructeur:
		public Pile() {
			pile=new Object[taille];
			pos=0;
	    }
		
		public void empile(Object o) throws PilePleine{
	     try {
		    pile[pos]=o; 
		    
	       }catch(ArrayIndexOutOfBoundsException e){
		       throw new PilePleine("Pile pleine!");
		     }                                                                                                                        
		}
		
		
		public Object depile() throws PileVide{
		   try {
		       Object O = pile[pos-1];
		       pos--;
		       return O;                       
		   }catch(ArrayIndexOutOfBoundsException e){
		    throw new PileVide("Pile vide!");
		   }
		}

	}
