
public class Animal {

	private String animal;
	int idade;
	private String nome;
	
	public Animal (String animal, String nome, int idade)
	{
		super();
		this.animal = animal;
		this.idade = idade;
		this.nome = nome;
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
	
	
	
	
}

