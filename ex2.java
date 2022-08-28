import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int n1,n2,s;
		
		System.out.println("digite um numero:  ");
		n1 = leia.nextInt();
		System.out.println("digite um numero:  ");
		n2 = leia.nextInt();
		
		s= n1+n2;
				
		if(s>10)
		{
			System.out.println(+s);
		}
		else
		{
			System.out.println("soma menor do que 10");
		}
		
		leia.close();
		
	
	}

}
