package Exercice6;

import java.util.Date;
public class EX6Test {

	public static void main(String[] args) {
		//tester:
		
		  Ouvrier ouvrier1=new Ouvrier("756/12","khaba","Ahmed",new Date(1995,2,3),new Date(2016,12,3));
		  Ouvrier ouvrier2=new Ouvrier("7561/11","faidi","said",new Date(1900,2,32),new Date(2020,11,3));
		  System.out.println(ouvrier1.toString());
		  System.out.println(ouvrier2.toString());
		  
		  
		  System.out.println("*****************************************");
		  Associe associe1=new Associe("756/12","khaba","Ahmed",new Date(1995,2,3),100000,40);
		  Associe associe2=new Associe("756/12","dahaoui","karim",new Date(1995,2,3),40000,70);
		  System.out.println(associe1.toString());
		  System.out.println(associe2.toString());
		  
		  System.out.println("*****************************************");
		  Cadre cadre1=new Cadre("6543/44","sobhi","brahim",new Date(2000,2,10),1);
		  System.out.println(cadre1.toString());
		  Cadre cadre2=new Cadre("756/17","khaba","Ahmed",new Date(1974,2,3),2);
		  System.out.println(cadre2.toString());
		  Cadre cadre3=new Cadre("356/3","draoui","hajar",new Date(2001,2,3),0);
		  System.out.println(cadre3.toString());
		  
	
	}

}