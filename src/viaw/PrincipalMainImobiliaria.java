/***Classe Principal para Testar o Sistema**

→ Crie uma classe principal com o método main para testar o sistema da imobiliária.

→ Crie um objeto do tipo Imobiliaria, adicione diferentes construções ao catálogo, liste as construções disponíveis e informe a área total das construções no catálogo.
*/

package viaw;

import controller.Imobiliaria;
import controller.Menu;

public class PrincipalMainImobiliaria {

	public static void main(String[] args) {
		
		Menu m = new Menu();
		
		m.exibirMenu();
	
	}
}