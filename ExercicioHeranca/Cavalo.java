
public class Cavalo extends Animal {

	private String animal;
	int idade;
	private String nome;
	private String som;
	private String corrida;
	
	public Cavalo (String animal, String nome, int idade, String som, String corrida)
	{
		super(animal,nome,idade);
		this.animal=animal;
		this.nome= nome;
		this.idade=idade;
		this.corrida = corrida;
		this.som = som;
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
	public String getCorrida() {
		return corrida;
	}
	public void setCorrida(String corrida) {
		this.corrida = corrida;
	}
	public void ImprimirInfo()
	{
		System.out.println("\n\nO segundo animal é o "+animal+" o nome dele é "+nome+" e ele tem "+idade+" anos de idade"+"....."+som);
		System.out.println("\nUm cavalo consegue atingir velocidades de: "+corrida);
		
	}
}
	
	

