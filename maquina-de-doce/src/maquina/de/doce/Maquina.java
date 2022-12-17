/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maquina.de.doce;



public class Maquina {
	private int saldo;
	private Produtos tipoA;
	private Produtos tipoB;
	private Produtos tipoC;
	public int opcao;
                  public String msg;

	   public int inserirNota(int valor) {
                         if (getSaldo() < 11) {
                                 if (valor == 1 || valor == 2 || valor == 5) {
                                    this.saldo += valor;
                                 }
                           }
                         if(getSaldo() > 10){
                             this.saldo -= valor;
                         }
                                             return this.saldo;
        }
    

		
	public int troco() {
		int valor = getSaldo();
		int dA, dB, dC, n1;
                                   
		
		dA = 6;
		dB = 7;
		dC = 8;
		
		switch(opcao) {
		case 1: {
			dA = valor - dA;                                                    
                                                    msg = "Obrigado por comprar o Doce A";
			return dA;		
			
		}
		case 2:{
			dB = valor - dB;
                                                     msg = "Obrigado por comprar o Doce B";
			return dB;			


		}
		default: 
			dC = valor - dC;
                                                    msg = "Obrigado por comprar o Doce C";
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

