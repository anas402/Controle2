package Exercicee1;



public class Ex1Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	      //creer un objet:
			Pile p = new Pile();
			
			try {
			     for(int i=0;i<args.length;i++)  
			     p.empile(args[i]);
			}
			catch(PilePleine e) {};   

			
			try {
				
			for(;;) System.out.print(p.depile()+" ");
			}
			catch(PileVide e) { System.out.println(); };


		}
	}


