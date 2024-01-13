//Tayfun Özdemir 20050111002   
//Hidayet Aktürk 20050111030 
//İsmail Alper Koyuncu 21050111056 
//Ahmad Zubair Rahimi 21050141006

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static boolean isEnglishWords(String sentence) {
		String[] myWords = sentence.startsWith(" ") 
                ? sentence.replaceFirst("^\\s+", "").split("\\s+")
                : sentence.split("\\s+");
		
		for(int current = 0; current < myWords.length; current++) {
			// Check if the word contains at least one English letter
	        if (!myWords[current].matches(".*[a-zA-Z].*")) {
	            return false;
	        }
	        // Check if the word contains only alphanumeric characters and punctuation
	        if (!myWords[current].matches("[\\w\\p{Punct}]+")) {
	            return false;
	        }
		}
		
		return true;
	}
	public static void main(String[] args) throws IOException {
		
		chainingHash dictionary = new chainingHash();
		dictionary.initializeTable();
		String line;
		BufferedReader myReader = new BufferedReader(new FileReader("words.txt"));
		while ((line = myReader.readLine()) != null) {
			dictionary.insertWord(line);
		}
		System.out.println("Enter a word or a sentence ");
		Scanner input = new Scanner(System.in);
	    String writenSentence = input.nextLine();
	    
	    while(!isEnglishWords(writenSentence)){
			System.out.println("Your input contains non english characters. Please enter a new one: ");
			writenSentence = input.nextLine();
		}
		dictionary.printCorrectedOne(writenSentence);
	    
	   
	}

}
