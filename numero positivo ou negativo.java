import java.util.Scanner;

// Escreva um programa em Java para determinar se um dado número N
// (recebido através do teclado) é POSITIVO, NEGATIVO.

public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int num;
		
		System.out.println("digite um numero inteiro:  ");
		num = leia.nextInt();
		
		if(num<0)
		{
			System.out.println("numero negativo");
		}
		else
		{
			System.out.println("numero positivo");
		}
		
		leia.close();
		
		
	}

}
