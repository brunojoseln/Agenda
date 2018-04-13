
import javax.swing.JOptionPane;

public class Agenda {
	int dia,hora;
	int [] dias = new int[31];
	int [] horas = new int[24];
	
	public void Agendar(){
		dia = Integer.parseInt(JOptionPane.showInputDialog("Insira o dia que voce quer marcar na agenda: "));
		//o Programa sá vai aceitar valores entre 0 e 30
		if (dia < 31 && dia > 0) {
			//dia é passado para o vetor dias
			dias[dia] = dia; 
			
			hora = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a hora: "));
			if (hora < 24 && hora >= 0){
				horas[hora] = hora;
			}else {
				JOptionPane.showMessageDialog(null,"Hora Inválida");
			}
			
		}else {
			JOptionPane.showMessageDialog(null,"Dia Inválido");
		}

	}
		
	public void Exibir(){
		boolean vazio = false;
		
		for (int d = 0; d <= 30; d++){
			for (int h = 0; h <= 23; h++){
				
				if (dias[d] != 0 && horas[h] != 0 ) {
					JOptionPane.showMessageDialog(null,"Dia agendado: "+dias[d]+"\n Hora: "+horas[h]+":00");
			}
			
			}
			

	}
		
		
		
		
		
}

	}
	
	

