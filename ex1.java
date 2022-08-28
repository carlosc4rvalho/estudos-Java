import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int num;
		
		System.out.println("digite um numero inteiro:  ");
		num = leia.nextInt();
		
		if(num>=20)
		{
			System.out.println(+num);
		}
		else
		{
			System.out.println("numero menor que 20");
		}
		
		leia.close();
		
	}

}
