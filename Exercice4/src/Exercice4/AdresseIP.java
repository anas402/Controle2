package Exercice4;

;

public class AdresseIP {
  //les attributs:                                                                                                                                        
	  private int[] octets;
	  private String classe;
	  private boolean trouve=false;//alors la tableau est vide
	
  //constructeur:
	public AdresseIP (int o1,int o2, int o3, int o4) {
		    tester(o1,o2,o3,o4); 
		    
		   if(trouve==true)
		     octets = new int[] {o1,o2,o3,o4}; 		            
	}
	

 //toString():
	public String toString() {
		if(trouve==true)
	      return octets[0] + "." + octets[1] + "." + octets[2] + "."+ octets[3] ;	
		else
	     return "l'adressIP introuvable !";
	}
	

	public void tester(int o1,int o2,int o3,int o4) {
		  try {
			  if((o1<0||o1>255)||(o2<0||o2>255)||
				 (o3<0||o3>255)||(o4<0||o4>255)) {
				  
				  throw new AdresseIPException("l'addressIP pas encore ajouter.");
			  }else {
				  trouve=true;
				  System.out.println("l'adressIP est ajouter.");
			  }
		  }catch(AdresseIPException e) {
			System.out.println(e);
		   }
	}
	

}