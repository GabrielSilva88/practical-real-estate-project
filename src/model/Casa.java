/* 
 Três Tipos de Construção (Subclasses de Imovel):

→ Crie três classes concretas que herdam da classe Imovel: Casa, Predio e Loja.

- Implemente os métodos abstratos calcularArea e getDescricao de acordo com as especificidades de cada tipo de construção.
*/
package model;

public class Casa extends Imovel {
	
	private double comprimento;
	private double largura;

	// CONSTRUTOR
	public Casa(String endereco, double preco, double comprimento, double largura) {
		super(endereco, preco);
		this.comprimento = comprimento;
		this.largura = largura;
	}

	@Override
	public String getDescricao() {
		// TODO Auto-generated method stub
		return "Casa localizada em " + endereco + " com área de " + calcularArea() + " metros quadrados.";
	}

	@Override
	public double calcularArea() {
		return largura * comprimento;
	}
}
