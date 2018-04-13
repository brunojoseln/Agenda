/*Nome: Bruno José de Lima Neves
Turma: 2°Info
Data: 13/04/2018*/

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		int op = 0;
		Agenda agenda = new Agenda();
		//Instanciei logo no começo para não ter que ficar repetindo a instanciação 
		
		JOptionPane.showMessageDialog(null, "Seja bem vindo :)");

		//Enquanto a opção não for igual a zero o menu vai continar sendo exibido
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
				JOptionPane.showMessageDialog(null, "Opção inválida"); 
				break;
			}
		} while (op != 0);

	}

}
