import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	
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
	    
	    dictionary.printCorrectedOne(writenSentence); 
	}

}
