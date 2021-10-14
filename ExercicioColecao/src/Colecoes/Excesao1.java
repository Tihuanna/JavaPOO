package Colecoes;

public class Excesao1 {

	public static void main(String[] args) {
		
		String frase = null;
		String novaFrase = null;
		
		try
		{
			novaFrase = frase.toUpperCase();
		}
		catch(NullPointerException e )//captura de uma possivel exceção
		{
			//tratamento da exceção
		
		System.out.println("\nA frase inicial esta nula, para solucionar tal problema ");
		frase = "frase vazia";
		novaFrase = frase.toUpperCase();
		}
	 System.out.println("\nFrase antiga: "+frase);
	 System.out.println("\nFrase nova: "+novaFrase);
	}
	
	
	
}
