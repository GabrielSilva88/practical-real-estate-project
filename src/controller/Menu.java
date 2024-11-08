/* Classe Menu

→ Crie uma classe Menu que interage com o sistema da imobiliária.
	Menu Imobiliária:
			1 - Adicionar Construção.
			2 - Remover Construção.
			3 - Listar Construções.
			4 - Informar Área total.
			5 - Sair.
- Implemente um menu interativo com opções para adicionar, remover, listar construções e informar a área total.
- Utilize a classe Scanner para receber entradas do usuário.
*/
package controller;

import java.util.Scanner;

import model.Casa;
import model.Imovel;
import model.Loja;
import model.Predio;

public class Menu {

	private Imobiliaria imobiliaria;
	Scanner scan = new Scanner(System.in);

	// menu interativo
	public void exibirMenu() {
		System.out.println("\n Menu Imobiliária:\n" 
				+ "	1 - Adicionar Construção.\n"
				+ "	2 - Remover Construção.\n" 
				+ "	3 - Listar Construções.\n"
				+ "	4 - Informar Área total.\n" 
				+ "	5 - Sair.");
		scan.nextLine();
		System.out.println(" \n Digite: ");
		int opcao = scan.nextInt();

		do {
			switch (opcao) {
			case 1: {
				adicionarConstrucao();
				break;
			}
			case 2: {
				removerConstrucao();
				break;
			}
			case 3: {
				listarConstrucao();
				break;
			}
			case 4: {
				informarAreaTotal();
				break;
			}
			case 5: {
				System.out.println("Saindo do sistema...");
				break;
			}
			default:
				System.out.println(opcao + "Opção invalida, tente novamente.");
			}
		} while (opcao != 5);
	}

	// método informar a área total
	private void informarAreaTotal() {
		double areaTotal = imobiliaria.informarArea();
		System.out.println("Area total " + areaTotal + " metros quadrados.");
	}

	// método listar construções
	private void listarConstrucao() {
		imobiliaria.listarConstrucaes();
		
	}

	// método remove a construções da lista
	private void removerConstrucao() {
		System.out.println("Informe o endereço a ser removido: ");
		String endereco = scan.nextLine();
		
		Construcao construcaoRemover = null;
		
		for (Construcao construcao : Imobiliaria.getCatalogo()) {
			if (((Imovel) construcao).getEndereco().equalsIgnoreCase(endereco)) {
				construcaoRemover = construcao;
				break;
			}
		}
		
		if (construcaoRemover != null) {
			imobiliaria.removerConstrucao(construcaoRemover);
		} else {
			System.out.println("não encontrada.");
		}
	}

	// método que criar construções
	private void adicionarConstrucao() {
		System.out.println("Escolha um Tipo: \n1.Casa \n2.Loja \n3.Prédio");
		int tipo = scan.nextInt();

		System.out.println("Digite o endereço: ");
		String end = scan.nextLine();
		
		scan.nextLine();
		
		System.out.println("Digite o valor: ");
		double val = scan.nextDouble();

		Construcao construcao = null;

		switch (tipo) {
		case 1:
			System.out.println("Informe a largura da casa: ");
			double larguraCasa = scan.nextDouble();
			
			System.out.println("Informe a largura da casa: ");
			double comprimentoCasa = scan.nextDouble();
			construcao = new Casa(end, val, comprimentoCasa, larguraCasa);
			break;
		case 2:
			System.out.println("Informe a largura da Predio: ");
			double areaAndar = scan.nextDouble();
			
			System.out.println("Informe a largura da Predio: ");
			int numeroAndar = scan.nextInt();
			construcao = new Predio(end, val, tipo, numeroAndar);
			break;
		case 3:
			System.out.println("Informe a largura da Loja: ");
			double larguraLoja = scan.nextDouble();
			
			System.out.println("Informe a largura da Loja: ");
			double comprimentoLoja = scan.nextDouble();
			construcao = new Loja(end, val, larguraLoja, comprimentoLoja);
			break;
		default:
			System.out.println("Opção inválida");
			break;
		}
		
		imobiliaria.adicionarConstrucao(construcao);
	}
}
