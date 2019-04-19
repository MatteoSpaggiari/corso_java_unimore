package esercizi;

import java.util.Arrays;

public class StringProcessor {

	private String[] arrayString;

	public StringProcessor(String[] arrayString) {
		super();
		this.arrayString = arrayString;
	}

	public String[] getArrayString() {
		return arrayString;
	}

	public void setArrayString(String[] arrayString) {
		this.arrayString = arrayString;
	}

	@Override
	public String toString() {
		return "StringProcessor [arrayString=" + Arrays.toString(this.arrayString) + "]";
	}

	public String shortestStringInArray() {
		int min = 0;
		int lengthString = this.arrayString[0].length();
		for (int i = 0; i < this.arrayString.length; i++) {
			if (this.arrayString[i].length() < lengthString) {
				lengthString = this.arrayString[i].length();
				min = i;
			}
		}
		return this.arrayString[min];
	}

	public void reverseArray() {
		String temp = "";
		for (int i = 0; i < (((this.arrayString.length - 1) / 2) + 1); i++) {
			temp = this.arrayString[i];
			this.arrayString[i] = this.arrayString[((this.arrayString.length - 1) - i)];
			this.arrayString[((this.arrayString.length - 1) - i)] = temp;
		}
	}

	public int getIndex(String s) {
		boolean exists = false;
		int index = 0;
		for (int i = 0; i < this.arrayString.length; i++) {
			if (this.arrayString[i] == s) {
				index = i;
				break;
			}
			if (i == (this.arrayString.length - 1) && !exists) {
				index = -1;
				System.out.println("\nL'elemento non si trova nell'array");
			}
		}
		return index;
	}

	public String duplicateValues() {
		String duplicate = "";
		for (int i = 0; i < this.arrayString.length; i++) {
			for (int j = (this.arrayString.length - 1); j > i; j--) { // Ottimizzo il ciclo
				if (i != j) {
					if (this.arrayString[i].equals(this.arrayString[j])) {
						if (duplicate.indexOf("\"" + this.arrayString[i] + "\"") == -1) {
							duplicate += "\"" + this.arrayString[i] + "\", ";
						}
					}
				}
			}
		}
		return (duplicate.substring(0, (duplicate.length() - 2)));
	}

	public static boolean equals(String[] v1, String[] v2) {
		boolean equal = false;
		int cont = 0;
		if (v1.length != v2.length) {
			return equal;
		}
		for (int i = 0; i < v1.length; i++) {
			if (v1[i].equals(v2[i])) {
				cont++;
			}
		}
		if (cont == v1.length) {
			equal = true;
		}
		return equal;
	}

}
