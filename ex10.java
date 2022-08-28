import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int num;
		
		System.out.println("digiteum numero inteiro:  ");
		num = leia.nextInt();
		
		if(num%3==0 && num%7==0)
		{
		System.out.println("o numero � divisivel por 3 e por 7");
		}
		else
		{
			System.out.println("o numero n�o � divisivel por 3 e por 7");
		}
		
		leia.close();
		
	}

}
