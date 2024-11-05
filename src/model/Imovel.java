/*
Classe Abstrata Imovel:

→ Crie uma classe abstrata Imovel que implementa a interface Construcao. Esta classe contém:

- Atributos endereco e preco.
double calcularArea(): Método abstrato para calcular a área da construção.
String getDescricao(): Método abstrato para obter uma descrição genérica da construção.
*/
package model;

import controller.Construcao;

public abstract class Imovel implements Construcao{
	
		// ATRIBUTO
		public String endereco;
		public double preco;
		
		//CONSTRUCAO
		public Imovel(String endereco, double preco) {
			super();
			this.endereco = endereco;
			this.preco = preco;
		}

		// MÉTODO 
		public double calcularArea() {
			return preco;
		}

		// GET(); E SET();
		public String getEndereco() {
			return endereco;
		}

		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}

		public double getPreco() {
			return preco;
		}

		public void setPreco(double preco) {
			this.preco = preco;
		}

		public String getDescricao(String descricao) {
			return descricao;
		}

}
