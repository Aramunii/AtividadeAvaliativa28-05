package usipa;

public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		gatinho("Cibele", "Angorá");
		System.out.println("-----------------------------------------");
		doguinho("Tilin", "Pequeno");
		System.out.println("-----------------------------------------");
		cavalinho("Cleiton");
		System.out.println("-----------------------------------------");
		papagaio("Mustafa");

	}

	public static void gatinho(String nome, String raca) {
		Gato gato = new Gato(nome, raca);
		System.out.println("Nome: " + gato.nome);
		System.out.println("Raça:" + gato.raca);
		System.out.println(gato.emitirSom());
		System.out.println(gato.amamentar());
		gato.brincar();
		gato.chamarVet();
		gato.levarPassear();
		gato.levarVet();

	}

	public static void doguinho(String nome, String porte) {
		Cachorro dog = new Cachorro(nome, porte);
		System.out.println("Nome:" + dog.nome);
		System.out.println("Porte:" + dog.porte);
		System.out.println(dog.emitirSom());
		System.out.println(dog.amamentar());
		dog.brincar();
		dog.chamarVet();
		dog.levarPassear();
		dog.levarVet();
	}

	public static void papagaio(String nome) {
		Papagaio papagai = new Papagaio(nome);
		System.out.println("Nome: "+ papagai.nome);
		System.out.println(papagai.voar());
		System.out.println(papagai.emitirSom());
	}

	public static void cavalinho(String nome) {
		Cavalo pocoto = new Cavalo(nome);
		System.out.println("Nome:" + pocoto.nome);
		System.out.println(pocoto.emitirSom());
		System.out.println(pocoto.amamentar());
		pocoto.chamarVet();
		pocoto.levarVet();
		pocoto.alimentar();
		pocoto.chamarVet();
	}
	
	
}
