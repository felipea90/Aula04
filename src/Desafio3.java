import java.util.Scanner;

public class Desafio3 {
	
	//03 - Crie um programa capaz de calcular a tabuada de um n�mero digitado pelo usu�rio.

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int tab, cont=1, n;
		
		System.out.println("Programa da Tabuada");
		
		System.out.println("Escolha o n�mero da tabuada:");
		n = leitor.nextInt();
		
		while (cont <= 10)
		{
			tab = n * cont;
			System.out.println(n + "x" + cont + "=" + tab);
			cont = cont +1;
			
			
		}
		
		leitor.close();

	}

}
