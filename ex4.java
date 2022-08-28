import java.util.Scanner;

// Construir um programa em Java que leia dois números e efetue a adição. Caso
// o valor somado seja maior que 20, este deverá ser apresentado somando-se a
// ele mais 8; caso o valor somado seja menor ou igual a 20, este deverá ser
// apresentado subtraindo-se 5.

public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int n1,n2,ma,mn,s;
		
		System.out.println("digite um numero:  ");
		n1 = leia.nextInt();
		System.out.println("digite um numero:  ");
		n2 = leia.nextInt();
		
		s = n1+n2;
		
		if(s>20)
		{
			ma = s+8;
			System.out.println(ma);
		}
		else
		{
			mn = s-5;
			System.out.println(+mn);
		}
		
		leia.close();
		
	}

}
