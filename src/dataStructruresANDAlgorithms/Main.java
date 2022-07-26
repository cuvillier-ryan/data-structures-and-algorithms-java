package dataStructruresANDAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

//		SingleDimensionArray sda = new SingleDimensionArray(3);
//		sda.insert(0, 10);
//		sda.insert(1, 20);
//		sda.insert(2, 30);
//
//		var firstElement = sda.arr[0];
//		System.out.println(firstElement);
//		sda.traverseArray();
//		sda.searchInArray(20);
//		sda.deleteInArray(2);
//		System.out.println(sda.arr[2]);
		
		TwoDimensionalArray sda = new TwoDimensionalArray(3, 3);
		sda.insertValueInTheArray(0, 0, 10);
		sda.insertValueInTheArray(0, 1, 20);
		sda.insertValueInTheArray(1, 0, 30);
		sda.insertValueInTheArray(2, 0, 40);
		
		
		System.out.println(Arrays.deepToString(sda.arr));
		sda.deleteValueFromArray(0, 0);
		System.out.println(Arrays.deepToString(sda.arr));
		
		int[] newArray = {1,2,3,4,5,7,8,9,10};
		ArraysPract ap = new ArraysPract();
		ap.missingNumber(newArray);
		SinglyLinkedList sLL = new SinglyLinkedList();
		sLL.createSinglyLinkedList(4);
		System.out.println(sLL.head.value);
		
		// Adjacency Matrix
		ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
		nodeList.add(new GraphNode("A", 0));
		nodeList.add(new GraphNode("B", 1));
		nodeList.add(new GraphNode("C", 2));
		nodeList.add(new GraphNode("D", 3));
		nodeList.add(new GraphNode("E", 4));
		
		Graph g = new Graph(nodeList);
		g.addUndirectedEdge(0, 1);
		g.addUndirectedEdge(0, 2);
		g.addUndirectedEdge(0, 3);
		g.addUndirectedEdge(1, 4);
		g.addUndirectedEdge(2, 3);
		g.addUndirectedEdge(3, 4);
		System.out.println(g.toString());
		
		
	}	

}
