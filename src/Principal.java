/*Nome: Bruno Jos� de Lima Neves
Turma: 2�Info
Data: 13/04/2018*/

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		int op = 0;
		Agenda agenda = new Agenda();
		//Instanciei logo no come�o para n�o ter que ficar repetindo a instancia��o 
		
		JOptionPane.showMessageDialog(null, "Seja bem vindo :)");

		//Enquanto a op��o n�o for igual a zero o menu vai continar sendo exibido
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog("1 - Agendar \n 2 - Consultar \n 0 - Sair"));
			switch (op) {
			case 1:
				agenda.Agendar();
				break;
				
			case 2:
				agenda.Exibir();
				break;
			
			case 0:
				break;

			default:
				JOptionPane.showMessageDialog(null, "Op��o inv�lida"); 
				break;
			}
		} while (op != 0);

	}

}
