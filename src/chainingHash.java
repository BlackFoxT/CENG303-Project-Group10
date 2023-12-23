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
	 	
	public boolean searchWord(String writenWord) {
		
		if(writenWord.length() == 1) {
			return true;
		}
		
		for(int n = 0; n < table[writenWord.length()].WordMap.size(); n++) {
			
			if(table[writenWord.length()].WordMap.get(n).word.equals(writenWord)){
					return true;
				}
			// to make first letter non case sensetive
			if(table[writenWord.length()].WordMap.get(n).word.charAt(0) == lowerChar(writenWord.charAt(0))){
				if(table[writenWord.length()].WordMap.get(n).word.substring(1).equals(writenWord.substring(1))){
					return true;
					}
				}
		}
		return false;
    }

	public int letterToInt(char src) {
		switch(src) {
		case 'q': return 0;
		case 'w': return 1;
		case 'e': return 2;
		case 'r': return 3;
		case 't': return 4;
		case 'y': return 5;
		case 'u': return 6;
		case 'i': return 7;
		case 'o': return 8;
		case 'p': return 9;
		case 'a': return 10;
		case 's': return 11;
		case 'd': return 12;
		case 'f': return 13;
		case 'g': return 14;
		case 'h': return 15;
		case 'j': return 16;
		case 'k': return 17;
		case 'l': return 18;
		case 'z': return 19;
		case 'x': return 20;
		case 'c': return 21;
		case 'v': return 22;
		case 'b': return 23;
		case 'n': return 24;
		case 'm': return 25;
		default: return -1;
		}
	}
}
