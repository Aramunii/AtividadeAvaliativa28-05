package br.com.caelum.contas;


import br.com.caelum.contas.modelo.SeguroDeVida;

public class ManipuladorDeSeguroDeVida {

	
	private SeguroDeVida seguroDeVida;

	 public void criaSeguro(int numApol,String nome,double valor){
		 		
	   this.seguroDeVida = new SeguroDeVida();
	   this.seguroDeVida.setNumeroApolice(numApol);
	   this.seguroDeVida.setTitular(nome);
	   this.seguroDeVida.setValor(valor);
	 }
	 
	 public void ImprimeSeguro() {
		 System.out.println("Apolice: " + this.seguroDeVida.getNumeroApolice());
		 System.out.println("Nome: " + this.seguroDeVida.getTitular());
		 System.out.println("Valor: " + this.seguroDeVida.getValor());
	 }
	
}
