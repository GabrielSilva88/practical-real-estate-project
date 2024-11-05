/* Classe Imobiliaria

→ Crie uma classe chamada Imobiliaria que fará a gestão do catálogo de construções.

- Utilize uma ArrayList para armazenar as construções adicionadas.
- Implemente os seguintes métodos:
    - void adicionarConstrucao(Construcao construcao): Adiciona uma construção ao catálogo.
    - void removerConstrucao(Construcao construcao): Remove uma construção do catálogo.
    - void listarConstrucoes(): Lista as construções no catálogo.
    - double informarArea(): Informa a área total das construções no catálogo
*/
package controller;

import java.util.ArrayList;


public class Imobiliaria {
	
	private ArrayList<Construcao> catalogo;
	
	public Imobiliaria() {
		catalogo = new ArrayList<>();
	}
	
	// void adicionarConstrucao(Construcao construcao): Adiciona uma construção ao catálogo.
	public void adicionarConstrucao(Construcao construcao) {
		catalogo.add(construcao);
		System.out.println("Adicionado ao catalogo: " + construcao.getDescricao());
	}
	
	// void removerConstrucao(Construcao construcao): Remove uma construção do catálogo.
	public void removerConstrucao(Construcao construcao) {
			if(catalogo.remove(construcao)) {
				System.out.println("Construção removida com sucesso: " + construcao.getDescricao());
			}else {
				System.out.println("Construção não encontrada.");
			}
	}
	
	// void listarConstrucoes(): Lista as construções no catálogo.
	public void listarConstrucaes() {
		if(catalogo.isEmpty()) {
			System.out.println("Catalogo de contruções sem em branco");
		}else {
			System.out.println("Lista do Catalogo: ");
			for (Construcao construcao : catalogo) {
				System.err.println(construcao.getDescricao());
			}
		}
	}
	
	// double informarArea(): Informa a área total das construções no catálogo
	public double informarArea() {
		double totalArea = 0.0;
		for (Construcao construcao : catalogo) {
			
			totalArea += ((Construcao) construcao).calcularArea();
		}
		return totalArea;
	}

	public static Construcao[] getCatalogo() {
		// TODO Auto-generated method stub
		return null;
	}

}

