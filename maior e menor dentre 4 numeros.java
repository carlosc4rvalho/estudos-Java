import java.util.Scanner;

// Construa um programa em Java que dado quatro valores, A, B, C e D, o
// algoritmo imprima o maior e o menor valor.
	
public class ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int n1,n2,n3,n4,maior,menor;
		
		 System.out.println("digite um numero:  ");
		 n1 = leia.nextInt();
		 n2 = leia.nextInt();
		 n3 = leia.nextInt();
		 n4 = leia.nextInt();
		
		 //Achando o maior número
		 
		    maior = n1;

		    if (n2 > maior)
		    {
		        maior = n2;
		    }
		    if (n3 > maior)
		    {
		        maior = n3;
		    }
		    if (n4 > maior)
		    {
		        maior = n4;
		    }

		    System.out.println("Maior: " +maior);

		    //Achando o menor número
		    
		    menor = n1;

		    if (n2 < menor)
		    {
			menor = n2;
		    }
		    if (n3 < menor)
		    {
		        menor = n3;
		    }
		    if (n4 < menor)
		    {
		    	menor = n4;
		    }

		    System.out.println("Menor: " +menor);
		    
		    leia.close();

	}

}
