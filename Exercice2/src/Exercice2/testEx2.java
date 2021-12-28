package Exercice2;

import java.util.Scanner;


public class testEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc=new Scanner(System.in);
		    System.out.println("entrer l'age:");
		    int age=sc.nextInt();
		  //creer un objet:
			Enfant enfant1 =new Enfant(age);
			
	         enfant1.testerAge();
	    	
			
		
	}

}
