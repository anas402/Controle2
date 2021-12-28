package Exercice4;


public class exercice4Test {

	public static void main(String[] args) {
	  //tester:	
		 AdresseIP adr1=new AdresseIP(2,332,21,223);
		 System.out.println(adr1.toString());
		 System.out.println("***********************");
		   
		 AdresseIP adr2=new AdresseIP(20,0,21,251);
		 System.out.println(adr2.toString());
		 System.out.println("***********************");
		 
		 AdresseIP adr3=new AdresseIP(2,23,0,-21);
		 System.out.println(adr3.toString());
		 System.out.println("***********************");
		 
		 AdresseIP adr4=new AdresseIP(34,23,0,251);
		 System.out.println(adr4.toString());
		 System.out.println("***********************");	
		 
	}

}
