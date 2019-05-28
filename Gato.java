package usipa;

public class Gato extends Mamifero implements AnimalDomesticado, AnimalEstimacao  {

	public String raca;

	public Gato(String nome,String raca) {
		super(nome);
		this.raca = raca;
	}
	
	public String amamentar() {
		return "Mamando";
	}
	
	public String emitirSom() {
		return "Meow";
	}
	
	public void alimentar() {
		System.out.println(this.nome + " est� comendo sua ra��o");
	}
	
	public void brincar() {
	System.out.println("Voc� jogou a bolinha para  " + this.nome );	
	}
	
	public void levarPassear() {
		System.out.println("Voc� levou " + this.nome + " passear" );	
		
	}
	
	public void levarVet() {
		System.out.println("Voc� levou  " + this.nome + " para a Clivet" );	
	}
	
	public void chamarVet() {
		System.out.println("Voc� ligou para a Vet para cuidar da(o) " + this.nome);
	}


	
	
	
}
