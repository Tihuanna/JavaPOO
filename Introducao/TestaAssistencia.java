package Poo;

public class TestaAssistencia {

	public static void main(String[] args) {
		//instanciando o objeto
		Ex1AssistenciaTecnica tec1 = new Ex1AssistenciaTecnica ("Kevin William","dell 5310","HD",150);
		tec1.imprimirInfo();
		System.out.println("\nValor pago, novas informações no sistema ");
		tec1.setValorReparo(0);
		System.out.println("\nEquipamento retirado ");
		
		Ex1AssistenciaTecnica tec2 = new Ex1AssistenciaTecnica ("Blabla Silva","dell 5142","MotherBoard",1630);
		tec2.imprimirInfo();
		System.out.println("\nValor pago, novas informações no sistema ");
		tec2.setValorReparo(0);
		System.out.println("\nEquipamento retirado ");
		
		
		
		
	}

}
