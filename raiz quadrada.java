import java.util.Scanner;
import java.util.Math;
public class ex5 {

	
	// Escreva um programa em Java que leia um número e imprima a raiz quadrada
        // do número caso ele seja positivo ou igual a zero e o quadrado do número caso
        // ele seja negativo.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		double num,r;
		
		System.out.println("digite um numero:  ");
		num = leia.nextDouble();
		
		if(num>=0)
		{
		r = Math.sqrt(num);
		System.out.println("a raiz quadrada de " +num+ " é = " +r);
		}
		else
		{
			System.out.println(+num+" elevado ao quadrado é = " +num*num);
		}
		
		leia.close();

	}

}
