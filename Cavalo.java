package usipa;

public class Cavalo extends Mamifero implements AnimalDomesticado{

	
	public Cavalo(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	public String amamentar() {
		
		return "Amamentando";
	}

	public String emitirSom() {
		
		return "ihhhhhh";
	}
	
	public void alimentar() {
		System.out.println("Cavalinho est� comendo no pasto");
	}
	
	public void levarVet() {
		System.out.println("Voc� levou o cavalinho no Veterinario");
	}
	
	public void chamarVet() {
		System.out.println("Voc� ligou para o  Veterinario ver o seu cavalo");
	}
	
	
	

}
