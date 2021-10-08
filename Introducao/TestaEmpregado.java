package Poo;

public class TestaEmpregado {

	public static void main(String[] args) {
		
		Empregado[] lista = new Empregado [3];
		int x;
		
		lista[0] = new Empregado("Kevin Sousa", 12000);
		lista[1] = new Empregado("Juliana Macedo", 6000);
		lista[2] = new Empregado ("Luis Roberto", 30000);
		
		for(Empregado roda:lista)
		{
			roda.imprimir();
		}
		System.out.println("***************************");
		for(Empregado roda:lista)
		{
			roda.aumentarSalario(10);
			roda.imprimir();
		}
		
	}

}
