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
