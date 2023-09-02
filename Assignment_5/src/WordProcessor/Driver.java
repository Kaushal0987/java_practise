package WordProcessor;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a String: ");
		String sen = in.nextLine();
		
		Counter C = new WordProcessor();
		System.out.println("Numbers of Words: "+C.countWords(sen));
		System.out.println("Number of Characters: "+C.countLetters(sen));
		System.out.println("Numbers of Letters: "+C.getLength(sen));
	}

}
