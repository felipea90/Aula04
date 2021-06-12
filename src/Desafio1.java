import java.util.Scanner;

public class Desafio1 {
	
	//01 - Crie um programa que seja capaz de exibir todos os números inteiros entre 0 e 1000. (Se você conseguir, modifique o programa para que mostre apenas os números pares)

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int contador=0, total=100, par=0;
		
		System.out.println("Programa que exibe os números inteiros de 0 a 100");
		
		while (contador <= total)
		{
			System.out.println(contador);
			
			contador = contador + 1;
		}
		
		System.out.println("Programa que exibe os números pares de 0 a 100");
		
		while (par <= total)
		{
			System.out.println(par);
			
			par = par + 2;
		}
		
		leitor.close();

	}

}
