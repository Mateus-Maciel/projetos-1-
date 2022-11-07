package maquina.de.doce;



public class Maquina {
	private int saldo;
	private Produtos tipoA;
	private Produtos tipoB;
	private Produtos tipoC;
	public int opcao;

	public int inserirNota(int valor) {
		if (valor == 1 || valor == 2 || valor == 5)
			this.saldo += valor;
		return this.saldo;
	}

		
	public int troco() {
		int valor = getSaldo();
		int dA, dB, dC;
		
		dA = 6;
		dB = 7;
		dC = 8;
		
		switch(opcao) {
		case 1: {
			dA = valor - dA;
			return dA;		
			
		}
		case 2:{
			dB = valor - dB;
			return dB;			


		}
		default: 
			dC = valor - dC;
			return dC;}
		
		
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public Produtos getTipoA() {
		return tipoA;
	}

	public void setTipoA(Produtos tipo) {
		this.tipoA = tipo;
	}

	public Produtos getTipoB() {
		return tipoB;
	}

	public void setTipoB(Produtos tipoB) {
		this.tipoB = tipoB;
	}

	public Produtos getTipoC() {
		return tipoC;
	}

	public void setTipoC(Produtos tipoC) {
		this.tipoC = tipoC;
	}
}

