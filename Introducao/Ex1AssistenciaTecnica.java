package Poo;

import java.text.NumberFormat;

/*1) Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console. */

public class Ex1AssistenciaTecnica {
	//declaracao atributos
	private String nomeProprietario;
	private String modeloNotebook;
	private String pecaDefeituosa;
	private int valorReparo;
//metodo especial construtor	
	public Ex1AssistenciaTecnica(String nomeProprietario, String modeloNotebook, String pecaDefeituosa, int valorReparo)
	{
		this.nomeProprietario = nomeProprietario;
		this.modeloNotebook = modeloNotebook;
		this.pecaDefeituosa = pecaDefeituosa;
		this.valorReparo = valorReparo;
	}

	//declaração dos metodos
	
	public void imprimirInfo()
	{
		System.out.println("\nO cliente: "+nomeProprietario+" possui em nossa empresa o "+modeloNotebook+ " com a seguinte peça defeituosa: "+pecaDefeituosa+", o reparo fica no valor de "+valorReparo);
	}
	

	public String getNomeProprietario() {
		return nomeProprietario;
	}

	public void setNomeProprietario(String nomeProprietario) {
		this.nomeProprietario = nomeProprietario;
	}

	public String getModeloNotebook() {
		return modeloNotebook;
	}

	public void setModeloNotebook(String modeloNotebook) {
		this.modeloNotebook = modeloNotebook;
	}

	public String getPecaDefeituosa() {
		return pecaDefeituosa;
	}

	public void setPecaDefeituosa(String pecaDefeituosa) {
		this.pecaDefeituosa = pecaDefeituosa;
	}

	public int getValorReparo() {
		return valorReparo;
	}

	public void setValorReparo(int valorReparo) {
		this.valorReparo = valorReparo;
	}
	public String formatarMoeda()
	{ 	
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMaximumFractionDigits(2);
		String formatoMoeda = nf.format(valorReparo);
		return formatoMoeda;
	}


}

