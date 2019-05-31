package bingo;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class App {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		FrameBingo f = new FrameBingo();
		
		String inputNameUser = "";
		String inputNumberPlayers = "";
		Object[] possibilities = {"1", "2", "3", "4"};
		
		while(inputNameUser == null || inputNameUser.length() == 0) {
			inputNameUser = (String)JOptionPane.showInputDialog(
	                f,
	                "Inserisci il tuo nome:\n",
	                "Nome",
	                JOptionPane.PLAIN_MESSAGE);
			if(inputNameUser == null || inputNameUser.length() == 0) {
				JOptionPane.showMessageDialog(f, "E' obbligatorio inserire il proprio nome!", "Nome obbligatorio!", JOptionPane.ERROR_MESSAGE);
			}
		}
		
		
		while(inputNumberPlayers == null || inputNumberPlayers.length() == 0) {
			inputNumberPlayers = (String)JOptionPane.showInputDialog(
		            f,
		            "Quanti giocatori vuoi sfidare?\n",
		            "Numero giocatori",
		            JOptionPane.PLAIN_MESSAGE,
		            null,
		            possibilities,
		            "1");
				if(inputNumberPlayers == null || inputNumberPlayers.length() == 0) {
					JOptionPane.showMessageDialog(f, "E' obbligatorio scegliere quanti giocatori sfidare!", "Numero giocatori da sfidare obbligatorio!", JOptionPane.ERROR_MESSAGE);
				}
		}
		
		int numberPlayers = Integer.parseInt(inputNumberPlayers)+1;
			
		Dealer d = new Dealer();
		System.out.println("I numeri del Dealer sono: "+d);
		
		// Definisco un array di stringhe contenente i nomi dei giocatori, anche meno o pi� di 5, usati per istanziare gli oggetti Player
		String[] namePlayers = {"Matteo", "Luca", "Amalia", "Antonio", "Daniele", "Rebecca"};
		// Definisco un vettore di Player contenente il numero degli elementi presenti nella lista namePlayers
		Player[] players = new Player[numberPlayers];
		
		players[0] = new Player(inputNameUser.toUpperCase());
		
		for(int i=1; i < numberPlayers; i++) {
			// Istanzio gli oggetti Player
			players[i] = new Player(namePlayers[i]);
		}
		
		
		System.out.println("I giocatori sono: ");
		for(Player p : players) {
			
			System.out.println(p);
		}
		
		f.drawPlayers(players);
		
		loop:
		while(true) {
			Thread.sleep(1500);
			int number = d.exctractNumber();
			System.out.println("Il numero estratto e': "+number);
			System.out.println("I numeri rimanenti al Dealer sono: "+d);
			f.setNumberExtract(Integer.toString(number));
			for(int i = 0; i < players.length; i++) {
				players[i].checkNumber(number);
				f.updateBillboard(number);
				f.updatePlayer(i);
				if(players[i].bingo()) {
					System.out.println("Il vincitore e' "+players[i].getName()+" con i numeri "+players[i].getNumbersExtract());
					if(players[i].superBingo()) {
						f.showWinner(players[i], true);
					} else {
						f.showWinner(players[i], false);
					}
					break loop;
				}
				System.out.println(players[i]);
			}
		}
				
	}

}
