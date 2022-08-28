import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int n1,n2;
		
		System.out.println("digite um numero:  ");
		n1 = leia.nextInt();
		
		System.out.println("digite um numero:  ");
		n2 = leia.nextInt();
		
		if(n1%n2==0)
		{
			System.out.println("o numero é divisivel por "+n2);
		}
		else
		{
			System.out.println("o numero não é divisivel por "+n2);
		}
		
		leia.close();
		
	}

}
