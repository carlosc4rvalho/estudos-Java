import java.util.Scanner;

public class ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int n1,n2;
		
		System.out.println("digite um numero inteiro:  ");
		n1 = leia.nextInt();
		System.out.println("digite um numero inteiro:  ");
		n2 = leia.nextInt();
		
		if(n1>n2)
		{
			System.out.println("o maior numero é "+n1+" e o menor é "+n2);
		}
		else
		{
			System.out.println("o maior numero é "+n2+" e o menor é "+n1);
		}
		
		leia.close();
		
	}

}
