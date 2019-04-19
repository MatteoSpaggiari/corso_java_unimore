package bingo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dealer d = new Dealer();
		System.out.println("I numeri del Dealer sono: "+d);
		
		// Definisco un array di stringhe contenente i nomi dei giocatori, anche meno o più di 5, usati per istanziare gli oggetti Player
		String[] namePlayers = {"Matteo", "Luca", "Amalia", "Antonio", "Daniele", "Rebecca"};
		// Definisco un vettore di Player contenente il numero degli elementi presenti nella lista namePlayers
		Player[] players = new Player[namePlayers.length];
		
		for(int i=0;i < namePlayers.length;i++) {
			// Istanzio gli oggetti Player
			players[i] = new Player(namePlayers[i]);
		}
		
		
		System.out.println("I giocatori sono: ");
		for(Player p : players) {
			
			System.out.println(p);
		}
		
		loop:
		while(true) {
			int number = d.exctractNumber();
			System.out.println("Il numero estratto è: "+number);
			System.out.println("I numeri rimanenti al Dealer sono: "+d);
			for(Player p : players) {
				p.checkNumber(number);
				if(p.bingo()) {
					System.out.println("Il vincitore è "+p.getName()+" con i numeri "+p.getNumbersExtract());
					break loop;
				}
				System.out.println(p);
			}
		}
		
		
		
	}

}
