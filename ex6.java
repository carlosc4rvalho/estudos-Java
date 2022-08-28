import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int num;
		
		System.out.println("digite um numero:  ");
		num = leia.nextInt();
		
		if(num%3==0)
		{
			System.out.println("numero multiplo por 3");
		}
		else
		{
			System.out.println("numero n�o � multiplo por 3");
		}
		
		leia.close();
	}

}
