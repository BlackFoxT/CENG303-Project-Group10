import java.util.ArrayList;

class WordElement{
	String word;
	int length;

	public WordElement(String word) {
		this.word = word;
		this.length = word.length();
	}
}

class ChainingMapOfWords{
	int size = 0;
	ArrayList<WordElement> WordMap = new ArrayList<>();
}

public class chainingHash{
	ChainingMapOfWords[] table = new ChainingMapOfWords[100];
	Graph graph;

	public void initializeTable() {
		for(int i=0; i<100; i++) {
			table[i] = new ChainingMapOfWords();
		}
	}

	public char lowerChar(char letter) {
		return Character.toLowerCase(letter);
	}

	public int findIndexOfLetter(char letter) {
		return letter - 'a';
	}

	public void insertWord(String word) {
		WordElement wordElement = new WordElement(word);
		table[wordElement.length].WordMap.add(wordElement);
	}
}
