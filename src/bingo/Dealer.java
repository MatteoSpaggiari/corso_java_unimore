package bingo;
import java.util.*;

public class Dealer {
	
	private List<Integer> numbers = new ArrayList<Integer>();

	public Dealer() {
		super();
		
		// Creo una lista di numeri da 1 a 90
		for(int i=1;i<=90;i++) {
			this.numbers.add(i);
		}
		
	}
	
	public int exctractNumber() {
		int index = (int)(Math.random()*(this.numbers.size()-1));
		int num = this.numbers.get(index);
		this.numbers.remove(index);
		return num;
	}

	@Override
	public String toString() {
		return "Dealer [numbers=" + numbers + "]";
	}

}
