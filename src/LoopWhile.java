import java.util.Scanner;

public class LoopWhile 
{

	public static void main(String[] args) 
	{
		
		/*Imagine que uma ONG precise saber a m�dia de idades dos alunos de uma escola.
		 * Sabendo de antem�o quantos alunos existem e sem a necessidade de armazenar permanentemente a idade de cada um desses alunos, qual � a melhor forma de calcular essa m�dia?*/
		
		Scanner leitor = new Scanner(System.in);
		
		int idade, quantidade, contador = 0, totalIdade = 0;
		double mediaIdade;
		
		System.out.println("Quantos alunos existem na escola?");
		quantidade = leitor.nextInt();
		
		while (contador < quantidade)
		{
			System.out.println("Por favor, digite a idade do aluno:");
			idade = leitor.nextInt();
			contador = contador + 1;
			totalIdade = totalIdade + idade;
		}
		
		mediaIdade = totalIdade / quantidade;
		
		System.out.println("A m�dia de idade dos alunos � " + mediaIdade + " anos");
				
		leitor.close();

	}

}
