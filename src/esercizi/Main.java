package esercizi;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String stringa = "Ciao Mondo";
		String stringaReverse = "";
		CircleBasic c = new CircleBasic(0, 0, 5);
		System.out.println(c);
		PointBasic p = new PointBasic(1, 1);
		System.out.println(c.isInside(p));

		System.out.println(stringa.length());

		// 13. Print reverse string
		for (int i = (stringa.length() - 1); i >= 0; i--) {
			stringaReverse += stringa.charAt(i);
		}
		System.out.println(stringaReverse);

		// 14. Convert characters string in lowercase
		System.out.println(stringa.toLowerCase());

		// 15. Write a Java program to find the shortest String of an array (String).
		String[] stringArray = new String[] { "Ciao mondo", "Come va", "Prova", "Come va", "Come volevasi dimostrare",
				"a", "Mamma mia", "Come va", "a" };
		int min = 0;
		int lengthString = stringArray[0].length();
		for (int i = 0; i < stringArray.length; i++) {
			if (stringArray[i].length() < lengthString) {
				lengthString = stringArray[i].length();
				min = i;
			}
		}

		System.out.println("La stringa più corta dell'array è " + stringArray[min] + " nella posizione " + min);

		// 16. Write a Java program to reverse the order to elements of an array
		// (String).
		String temp = "";
		for (int i = 0; i < (((stringArray.length - 1) / 2) + 1); i++) {
			temp = stringArray[i];
			stringArray[i] = stringArray[((stringArray.length - 1) - i)];
			stringArray[((stringArray.length - 1) - i)] = temp;
		}

		for (int i = 0; i < stringArray.length; i++) {
			System.out.print(stringArray[i] + ", ");
		}

		// 17. Write a Java program to find the index of an element in an array
		// (String).
		String s = "Come va";
		boolean exists = false;
		for (int i = 0; i < stringArray.length; i++) {
			if (stringArray[i] == s) {
				System.out.println("\nL'elemento si trova nella posizione " + i);
				break;
			}
			if (i == (stringArray.length - 1) && !exists) {
				System.out.println("\nL'elemento non si trova nell'array");
			}
		}

		// 18. Write a Java program to find duplicate values of an array (String).
		String duplicate = "";
		for (int i = 0; i < stringArray.length; i++) {
			for (int j = (stringArray.length - 1); j > i; j--) {
				if (i != j) {
					if (stringArray[i] == stringArray[j]) {
						if (duplicate.indexOf(stringArray[i]) == -1) {
							duplicate += "\"" + stringArray[i] + "\", ";
						}
					}
				}
			}
		}
		System.out.println("Gli elementi duplicati sono: " + duplicate.substring(0, (duplicate.length() - 2)));

		// 19. Write a Java program to test the equality of two arrays (String).
		int[] v1 = { 1, 2, 3, 4, 5 };
		int[] v2 = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.equals(v1, v2));

		String[] v3 = new String[] { "Ciao mondo", "Come va", "Prova", "Come va", "Come volevasi dimostrare",
				"Mamma mia", "Come va", "Prova", "a", "a" };
		String[] v4 = new String[] { "Ciao mondo", "Come va", "Prova", "Come va", "Come volevasi dimostrare",
				"Mamma mia", "Come va", "a" };

		StringProcessor s1 = new StringProcessor(v3);
		System.out.println(s1.toString());
		System.out.println(s1.shortestStringInArray());
		// s1.reverseArray();
		// System.out.println(s1.toString());
		System.out.println(s1.getIndex("Come va"));
		System.out.println(s1.duplicateValues());
		System.out.println(StringProcessor.equals(v3, v4));
		
		double num = 300.56;
		System.out.println(num);
	}

}
