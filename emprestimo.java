import java.util.Scanner;

// A prefeitura de Contagem abriu uma linha de crédito para os funcionários
// estatutários. O valor máximo da prestação não poderá ultrapassar 30% do
// salário bruto. Fazer um algoritmo que permita entrar com o salário bruto e o
// valor da prestação, e informar se o empréstimo pode ou não ser concedido.
	
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
