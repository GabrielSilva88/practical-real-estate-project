/* 
 Três Tipos de Construção (Subclasses de Imovel):

→ Crie três classes concretas que herdam da classe Imovel: Casa, Predio e Loja.

- Implemente os métodos abstratos calcularArea e getDescricao de acordo com as especificidades de cada tipo de construção.
*/
package model;

public class Predio extends Imovel{

	private int areaAndar;
	private double numeroAndar;
	
	public Predio(String endereco, double preco, int areaAndar, double numeroAndar) {
		super(endereco, numeroAndar);
		this.areaAndar = areaAndar;
		this.numeroAndar = numeroAndar;
	}

	@Override
	public String getDescricao() {
		// TODO Auto-generated method stub
		return "Prédio localizado em " + endereco + " com " + numeroAndar + " andares e área total de " + calcularArea() + " metros quadrados.";
	}

	@Override
	public double calcularArea() {
		return areaAndar * numeroAndar;
	}
	
}
