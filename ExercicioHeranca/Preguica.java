
public class Preguica extends Animal{
	
	private String animal;
	int idade;
	private String nome;
	private String som;

	
	public Preguica (String animal, String nome, int idade, String som)
	{
		super(animal,nome,idade);
		this.animal = animal;
		this.idade= idade;
		this.nome = nome;
		this.som = som;
	}
	public void ImprimirInfo()
	{
		System.out.println("\n\nPor ultimo temos a "+animal+" o nome dele é "+nome+" e ele tem "+idade+" anos de idade"+ ",xiuuu, cuidado pra não acordar ele "+"....."+som);
		System.out.println("\n"+som);
		
		
		
	}
	public String getAnimal() {
		return animal;
	}
	public void setAnimal(String animal) {
		this.animal = animal;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSom() {
		return som;
	}
	public void setSom(String som) {
		this.som = som;
	}
}


