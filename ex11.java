import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		double sal,par,cal;
		
		System.out.println("digite o valor de seu salario:  ");
		sal = leia.nextDouble();
		
		System.out.println("digite o valor da parcela do emprestimo simulado:  ");
		par = leia.nextDouble();
		
		cal= (sal/100)*30;
		
		if(par<=cal)
		{
			System.out.println("o emprestimo ser� liberado");
		}
		else
		{
			System.out.println("o emprestimo n�o ser� liberado");
		}
	
		leia.close();
		
		
	}

}
