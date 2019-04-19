package bingo;

import java.util.*;

public class Player {
	
	private String name;
	// Lista dinamica contenente i 5 numeri casuali del giocatore
	private List<Integer> numbers = new ArrayList<Integer>();
	// Lista dinamica che conterrà i numeri estratti
	private List<Integer> numbersExtract = new ArrayList<Integer>();	
	
	public Player(String name) {
		super();
		this.name = name;
		
		// Creo una lista di 5 numeri compresi tra 1 a 90
		for(int i=0;i<5;i++) {
			int num = (int)((Math.random()*89)+1);
			if(this.numbers.contains(num)) {
				// Serve a non inserire un numero che esiste già
				i--;
			} else {
				this.numbers.add(num);
			}
		}
	}
		
	public String getName() {
		return name;
	}

	public List<Integer> getNumbersExtract() {
		return numbersExtract;
	}

	void checkNumber(int n) {
		if(this.numbers.contains(n)) {
			this.numbersExtract.add(n);
		}
	}

	boolean bingo() {
		if(this.numbersExtract.size() == 5) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", numbers=" + numbers + ", numbersExtract=" + numbersExtract + "]";
	}

	
	
}
