package Poo;

import java.text.NumberFormat;

public class Empregado {
	
	//declaração dos atributos
	
	private String nome;
	private double salario;
	
	
	//declaração do método especial construtor
	
	public Empregado(String n, double s)
	{
		this.setNome(n);
		this.setSalario(s);	
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
		public void aumentarSalario(double percentual)
		{
			salario *= 1+ percentual /100;
		}
		
		public String formatarMoeda()
		{
			NumberFormat nf = NumberFormat.getCurrencyInstance();
			nf.setMaximumFractionDigits(2);
			String formatoMoeda = nf.format(salario);
			return formatoMoeda;
		}
		public void imprimir()
		{
			System.out.println("\n"+nome+"\t\t"+"salario:"+this.formatarMoeda());
		}
}
