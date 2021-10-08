
public class Cachorro  extends Animal
{
	private String nome;
	private String animal;
	private String som;
	private String corrida;
	
	public Cachorro (String animal, String nome, int idade, String som, String corrida)
	{
		super(animal,nome,idade);
		this.animal=animal;
		this.nome= nome;
		this.idade=idade;
		this.corrida = corrida;
		this.som = som;
	}
	public void ImprimirInfo()
	{
		System.out.println("\n\nO primeiro animal é o "+animal+" o nome dele é "+nome+" e ele tem "+idade+" anos de idade"+ ",cuidado pois ele pode latir pra você "+"....."+som);
		System.out.println("\nUm cachorro corre em média: "+corrida);
		
	
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAnimal() {
		return animal;
	}
	public void setAnimal(String animal) {
		this.animal = animal;
	}
	public String getSom() {
		return som;
	}
	public void setSom(String som) {
		this.som = som;
	}
	public String getCorrida() {
		return corrida;
	}
	public void setCorrida(String corrida) {
		this.corrida = corrida;
	}
}
