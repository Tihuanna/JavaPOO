package Colecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excesao2 {
//demonstra o lançamento de uma exceção quando
	public static int quociente (int numerador, int denominador) throws ArithmeticException
	{
		
		return  numerador / denominador; //possibilita a divisão por zero
		
	}
	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		boolean continuaLoop = true;
		
		do
		{
			try // le dois numeros e calcula o quociente
			{
			System.out.println("\nEntre com o numerador: ");
			int numerador = leia.nextInt();
			System.out.println("\nEntre com o denominador ");
			int denominador = leia.nextInt();
			
			int result = quociente(numerador,denominador);
			System.out.printf("\nResultado: %d/%d=%d\n",numerador,denominador,result);
			continuaLoop = false;
			}
			catch(InputMismatchException inputMismatchExcepction)
			{
				leia.nextLine();
				System.err.printf("\nException %s \n",inputMismatchExcepction);
				System.out.println("\nVocê deve entrar com um valor do tipo inteiro..\nTente novamente");
			}
			catch(ArithmeticException arithmeticException)
			{
				leia.nextLine();
				System.err.printf("\nException %s \n",arithmeticException);
				System.out.println("\nZero é um denominador invalido.. \nInsira outro valor");
			}
		}
		while (continuaLoop);

	}

}
