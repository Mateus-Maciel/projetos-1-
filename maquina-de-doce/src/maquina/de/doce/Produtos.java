
package maquina.de.doce;

public class Produtos {
	
	private String nomeProduto;
	private int precoProduto;
	
	
	
	public Produtos(String nome, int preco) {
		this.nomeProduto = nome;
		this.precoProduto = preco;
	}



	public String getNomeProduto() {
		return nomeProduto;
	}



	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}



	public int getPrecoProduto() {
		return precoProduto;
	}



	public void setPrecoProduto(int preco) {
		if (preco >= 6 && preco <= 8) {
			this.precoProduto = preco;
		} else {
			this.precoProduto = 8;
		}
		
	}
	

}
