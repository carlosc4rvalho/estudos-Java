import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int num;
		
		System.out.println("digite um numero inteiro:  ");
        num = leia.nextInt();
        
        if(num%5==0)
        {
        	System.out.println("o numero dividivel por 5");
        }
        else
        {
        	System.out.println("o numero não é divisivel por 5");
        }
        
        leia.close();
	}

}
