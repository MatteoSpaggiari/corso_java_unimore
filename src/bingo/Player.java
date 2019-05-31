package bingo;

import java.util.*;

public class Player {
	
	private String name;
	// Lista dinamica contenente i 5 numeri casuali del giocatore
	private List<Integer> numbers;
	// Lista dinamica contenente i 5 numeri casuali del giocatore in stringa per il Frame
	private List<String> numbersString;
	// Lista dinamica che conterrà i numeri estratti
	private List<Integer> numbersExtract;
	// Lista dinamica che conterrà i numeri estratti in stringa per il Frame
	public List<String> numbersExtractString;
	
	public Player(String name) {
		super();
		this.name = name;
		numbers = new ArrayList<Integer>();
		numbersString = new ArrayList<String>();
		numbersExtract = new ArrayList<Integer>();
		numbersExtractString = new ArrayList<String>(Arrays.asList("-", "-", "-", "-", "-"));
		// Creo una lista di 5 numeri compresi tra 1 a 90
		for(int i=0;i<5;i++) {
			int num = (int)((Math.random()*89)+1);
			if(this.numbers.contains(num)) {
				// Serve a non inserire un numero che esiste già
				i--;
			} else {
				this.numbers.add(num);
				this.numbersString.add(Integer.toString(num));
			}
		}
	}
		
	public String getName() {
		return name;
	}
	
	public List<Integer> getNumbers() {
		return numbers;
	}
	
	public String getNumberString(int index) {
		return numbersString.get(index);
	}

	public List<Integer> getNumbersExtract() {
		return numbersExtract;
	}
	
	public String getNumberExtractString(int index) {
		// Riempio temp di elementi
		for(int i = 0; i < numbersExtract.size(); i++) {
			numbersExtractString.set(i, Integer.toString(numbersExtract.get(i)));
		}
		// Finisco di riempire temp con elementi stringa "-"
		for(int i = numbersExtract.size(); i < 5; i++) {
			numbersExtractString.set(i, "-");
		}
		System.out.println(numbersExtractString);
		return numbersExtractString.get(index);
	}
	

	public void checkNumber(int n) {
		if(this.numbers.contains(n)) {
			this.numbersExtract.add(n);
		}
	}

	public boolean bingo() {
		if(this.numbersExtract.size() == 5) {
			return true;
		}
		return false;
	}
	
	public boolean superBingo() {
		if(this.numbers.equals(this.numbersExtract)) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", numbers=" + numbers + ", numbersExtract=" + numbersExtract + "]";
	}

	
	
}
