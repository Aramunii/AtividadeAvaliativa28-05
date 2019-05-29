package br.com.caelum.contas.modelo;

public class ContaCorrente extends Conta implements Tributavel{

	@Override
	public double getValorImposto() {
		// TODO Auto-generated method stub
		return this.getSaldo() *0.01;
	}

}
