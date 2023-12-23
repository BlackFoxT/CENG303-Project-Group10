import java.util.ArrayList;

public class Graph {
    boolean isEnded = false;
    ArrayList<Integer> path;
	ArrayList<Node> nodes;
	int[][] matrix;
	int steps = 0;
	int counts = 0;
	
	Graph(int size){
		nodes = new ArrayList<>();
		matrix = new int[size][size];
	}
	
}
