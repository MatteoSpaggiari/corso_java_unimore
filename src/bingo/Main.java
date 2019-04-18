package bingo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dealer d = new Dealer();
		System.out.println(d);
		
		String[] namePlayers = {"Matteo", "Luca", "Amalia", "Antonio", "Daniele", "Rebecca"};
		Player[] players = new Player[namePlayers.length];
		
		for(int i=0;i < namePlayers.length;i++) {
			players[i] = new Player(namePlayers[i]);
		}
		
		for(Player p : players) {
			System.out.println(p);
		}
		
		loop:
		while(true) {
			int number = d.exctractNumber();
			System.out.println(number);
			System.out.println(d);
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
