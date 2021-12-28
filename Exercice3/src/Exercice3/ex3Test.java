package Exercice3;



public class ex3Test {
    public static void main(String[] args)  {
	Ville v1=new Ville("khouribga","maroc",900000);     
	Ville v2=new Ville("USA","dinver",-9000);    
	Ville v3=new Ville("ain","maroc",0);    
	Ville v4=new Ville("USA","dinver",-9000);
	v1.testerNbr();
    
	System.out.println("*********************");
	
	v2.testerNbr();
	System.out.println("*********************);");
	v3.testerNbr();
	
	System.out.println("*********************);");
	v4.testerNbr();
    
    }
}
