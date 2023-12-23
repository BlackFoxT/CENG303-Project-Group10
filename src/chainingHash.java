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
	
}
