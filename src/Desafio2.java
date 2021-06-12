import java.util.Scanner;

public class Desafio2 {
	
	//02 - Crie um programa que exija que o usuário digite a senha 42. Enquanto o usuário não acertar a senha, deve ser exibida a mensagem "Qual é a resposta para a vida, o universo e tudo mais?"

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		
		String valor = "";
		
		System.out.println("Programa da origem de tudo!");
		
		while (!valor.equals("42"))
		{
			System.out.println("Qual é a resposta para a vida, o universo e tudo mais?");
			valor = leitor.next();
			
		}
		
		System.out.println("Está correto!\nA origem de tudo é " + valor);
		
		leitor.close();

	}

}
