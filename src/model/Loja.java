/* 
 Três Tipos de Construção (Subclasses de Imovel):

→ Crie três classes concretas que herdam da classe Imovel: Casa, Predio e Loja.

- Implemente os métodos abstratos calcularArea e getDescricao de acordo com as especificidades de cada tipo de construção.
*/
package model;

public class Loja extends Imovel{

	private double largura;
	private double comprimento;
	
	public Loja(String endereco, double preco, double largura, double comprimento) {
		super(endereco, comprimento);
		this.largura = largura;
		this.comprimento = comprimento;
	}

	@Override
	public String getDescricao() {
		// TODO Auto-generated method stub
		return "Loja localizada em " + endereco + " com área de " + calcularArea() + " metros quadrados.";
	}
	
	@Override
	public double calcularArea() {
		return largura * comprimento;
	}

}
