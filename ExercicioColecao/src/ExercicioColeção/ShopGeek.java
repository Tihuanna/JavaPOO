package ExercicioColeção;

import java.util.ArrayList;
import java.util.Scanner;

public class ShopGeek {

	

	public static void main(String[] args) {
		
	int op;
	Scanner ler = new Scanner(System.in);
	
	ArrayList<String> estoque = new ArrayList<String>();
	
	do 
	{
		System.out.println(" ShopGeek Menu, selecione a opção desejada: ");
		System.out.println("\n(1)Adicionar produtos ao estoque?");
		System.out.println("\n(2)Remover produtos do estoque?");
		System.out.println("\n(3)Atualizar produtos do estoque?");
		System.out.println("\n(4)Todos os produtos do estoque");
		System.out.println("\n(0)Sair do programa ");
		op = ler.nextInt();
		
	switch(op)
	{
	case 1:
		ler.nextLine();
		System.out.println("\nInsira o produto a ser adicionado: ");
		String produto = ler.nextLine();
		estoque.add(produto);
		break;
		
	case 2:
		ler.nextLine();
		System.out.println("\nInsira o produto a ser removido: ");
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
		System.out.println("Insira o produto a ser subistituido: ");
		String antigo = ler.nextLine();
		System.out.println("Insira o produto subistitudo: ");
		String novo = ler.nextLine();
		
		if(estoque.contains(antigo))
		{
			estoque.remove(antigo);
			estoque.add(novo);
		}
		else
		{
			System.out.println("\nO produto a ser subistituido não existe! ");
		}
		break;
		
		case 4:
			ler.nextLine();
			System.out.println("\nProdutos do estoque: ");
			System.out.println("estoque");
		break;
		
		default:
		System.out.println("Programa finalizado. ");	
		
		
	
	}
		
	}
while (op!=0);
}
}