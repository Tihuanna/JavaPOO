package Colecoes;

import java.util.ArrayList;
import java.util.Scanner;

public class Colecoes2 {
	public static void main(String[]args) {
		
	

	int op;
	Scanner ler = new Scanner(System.in);
	
	ArrayList<String> estoque = new ArrayList();
	
	do 
	{
		System.out.println(" ---------------------");
		System.out.println("\n(1)Deseja adicionar produtos ai estoque?");
		System.out.println("\n(2)Deseja remover produtos do estoque?");
		System.out.println("\n(3)Deseja atualizar produtos do estoque?");
		System.out.println("\n(4)Mostrar todos os produtos do estoque");
		System.out.println("\n(0)Deseja sair do programa? ");
		op = ler.nextInt();
		
		switch(op)
		{
		case 1:
			ler.nextLine();
			System.out.println("\nDigite o produto para adicionar ao estoque");
			String produto = ler.nextLine();
			estoque.add(produto);
			break;
			
		case 2:
			ler.nextLine();
		System.out.println("\nQual produto deseja remover do estoque?");
		String produtor = ler.nextLine();
		if(estoque.contains(produtor))
		{
			estoque.remove(produtor);
		}
		else 
		{
			System.out.println("\nProduto não existe no estoque!!");
		}
		break;
		
		case 3:
			ler.nextLine();
			System.out.println("\nDigite o produto que quer atualizar");
			String verifica = ler.nextLine();
			System.out.println("\nDigite o nome do produto que entrara no lugar do "+verifica+" : ");
			String novo = ler.nextLine();
			if(estoque.contains(verifica))
			{
				estoque.remove(verifica);
				estoque.add(novo);
			}
			else
			{
				System.out.println("\nO produto indicado não existe");
			}
			break;
			
			case 4:
				
				System.out.println("\nProdutos do estoque: ");
				System.out.println(estoque);
				break;
				default:
					System.out.println("Finalizou o programa.");
		}
	}
	while (op!=0);
}
}
