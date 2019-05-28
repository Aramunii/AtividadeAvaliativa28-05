package usipa;

public class Cachorro extends Mamifero implements AnimalDomesticado, AnimalEstimacao  {

	

	public String raca;
	public String porte;
	
	public Cachorro(String nome,String Porte) {
		super(nome);
		this.porte = Porte;
		// TODO Auto-generated constructor stub
	}
	
	public String amamentar() {
		return "Mamando";
	}
	
	public String emitirSom() {
		return "Au,Au,Au";
	}
	
	public void alimentar() {
		System.out.println(this.nome + " está comendo sua ração");
	}
	
	public void brincar() {
	System.out.println("Você jogou a bolinha para  " + this.nome );	
	}
	
	public void levarPassear() {
		System.out.println("Você levou " + this.nome + " passear" );	
		
	}
	
	public void levarVet() {
		System.out.println("Você levou  " + this.nome + " para a Clivet" );	
	}
	
	public void chamarVet() {
		System.out.println("Você ligou para a Vet para cuidar da(o) " + this.nome);
	}
	
	
	
}
