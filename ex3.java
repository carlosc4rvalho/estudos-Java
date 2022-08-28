import java.util.Scanner;

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
