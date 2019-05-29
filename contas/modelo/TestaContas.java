package br.com.caelum.contas.modelo;
import br.com.caelum.contas.ManipuladorDeSeguroDeVida;
public class TestaContas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ManipuladorDeSeguroDeVida seguro = new ManipuladorDeSeguroDeVida();
		
		seguro.criaSeguro(455544, "Warley Maer", 50000);
		seguro.ImprimeSeguro();
		
		
		
	}

}
