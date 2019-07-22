package co.grandcircus;

import java.util.Scanner;

public class PigLatin {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		StringBuffer sx = new StringBuffer();
		System.out.println("Welcome to the Pig Latin Translator!");
		
		String cont = ("yes");
		while (cont.equalsIgnoreCase("yes")) {
			
			System.out.println("Enter a string to play!");
			String word = scan.nextLine();
			String word2 = word.toLowerCase();

			char ch = word2.charAt(0);

			if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O'
					|| ch == 'u' || ch == 'U') {
				System.out.println(sb.append(word2).append("way").toString());

			} else if (ch != 'a' || ch != 'A' || ch != 'e' || ch != 'E' || ch != 'i' || ch != 'I' || ch != 'o'
					|| ch != 'O' || ch != 'u' || ch != 'U') {

				int x = (countVowels2(word2)) - (vowelFirst2(word2, ch));

				String h2 = sb.append(word).reverse().substring(x, word.length());

				String stw = word2.substring(vowelFirst(word2, (countVowels(word2))));

				System.out.println(sx.append(stw).append(h2).append("ay"));

			}
			
			
			System.out.println("Do you wish to go agian? (yes/no)");
			cont = scan.nextLine();

		}


		System.out.println("Thanks for playing!");
		scan.close();
	}

	public static int countVowels(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != 'a' || str.charAt(i) != 'e' || str.charAt(i) != 'i' || str.charAt(i) != 'o'
					|| str.charAt(i) != 'u') {
				str.indexOf(i);
				str.substring(0, 1);
				count++;
			}

		}
		return count;
	}

	public static int vowelFirst(String word, int j) {
		int i;
		for (i = 0; i < word.length(); i++) {
			switch (word.charAt(i)) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				return i;
			}
		}
		return -1;
	}

	public static int countVowels2(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != 'a' || str.charAt(i) != 'e' || str.charAt(i) != 'i' || str.charAt(i) != 'o'
					|| str.charAt(i) != 'u') {
				str.indexOf(i);
				str.substring(0, 1);
				count++;
			}

		}
		return count;

	}

	public static int vowelFirst2(String word, int j) {
		int i;
		for (i = 0; i < word.length(); i++) {
			switch (word.charAt(i)) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				return i;
			}
		}
		return -1;
	}

}
