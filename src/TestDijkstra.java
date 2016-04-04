import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import helper.Writer;;

public class TestDijkstra {
	static List<Node> nodes = new ArrayList<Node>();
	static List<Edge> edges = new ArrayList<Edge>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * for(int i=0; i<11; i++){ //Node location = new Node("Node_"+i); Node
		 * location = new Node(""+i); nodes.add(location); }
		 * 
		 * addLane("Edge_0", 0, 1, 85); addLane("Edge_1", 0, 2, 217);
		 * addLane("Edge_2", 0, 4, 173); addLane("Edge_3", 2, 6, 186);
		 * addLane("Edge_4", 2, 7, 103); addLane("Edge_5", 3, 7, 183);
		 * addLane("Edge_6", 5, 8, 250); addLane("Edge_7", 8, 9, 84);
		 * addLane("Edge_8", 7, 9, 167); addLane("Edge_9", 4, 9, 502);
		 * addLane("Edge_10", 9, 10, 40); addLane("Edge_11", 1, 10, 600);
		 */

		/*
		 * RoadGraphReader roadGraphReader = new RoadGraphReader();
		 * 
		 * HashMap<String, Edge> loadedEdges = roadGraphReader.getLoadedEdges();
		 * Iterator<String> iter = loadedEdges.keySet().iterator();
		 * while(iter.hasNext()){ String edgeId = (String) iter.next(); Edge
		 * edge = loadedEdges.get(edgeId); addLane(edgeId, edge); }
		 * 
		 * 
		 * Graph graph = new Graph(nodes, edges); Dijkstra dijkstra = new
		 * Dijkstra(graph);
		 * 
		 * Node startNode = null; Node endNode = null; int breakCnt = 0; for(int
		 * i=0; i<nodes.size(); i++){ if(breakCnt == 2){ break; }
		 * if(nodes.get(i).equals(new Node("5453"))){ startNode = nodes.get(i);
		 * breakCnt++; } if(nodes.get(i).equals(new Node("3915"))){ endNode =
		 * nodes.get(i); breakCnt++; } } dijkstra.execute(startNode);
		 * 
		 * Stack<Edge> path = dijkstra.shortestPath(endNode);
		 * 
		 * if(path==null){ System.out.println("No available path"); }else{
		 * while(!path.isEmpty()){ System.out.println(path.pop()); } }
		 */

		Writer w = new Writer("C:\\Users\\superLin\\Dropbox\\Enterprise Analytics\\project\\out.csv");
		try {

			double total = 0;

			
			MyDijkstra md = new MyDijkstra();
			//Node original = new Node("3395");
			//Node destination = new Node("5453");
			Node original = new Node("0");
			Node destination = new Node("9");
			double weight = md.findDijkstraWeight(original, destination);
			
			Edge[] myPath = md.getDijkstraPath();
			for (int i=0; i<myPath.length; i++) {
				if (i==0) {
					w.println("Taxi," + myPath[i].id );
				}else{
					w.println("Trans," + myPath[i].id );
				}
			}// till now, taxi reaches customer origin
			total = total + weight;
			System.out.println(weight);
			
			original = new Node("5453");
			destination = new Node("3915");
			weight = md.findDijkstraWeight(original, destination);
			myPath = md.getDijkstraPath();
			for (int i=0; i<myPath.length; i++) {
				if (i==0) {
					w.println("Start," + myPath[i].id );
				}else if(i == myPath.length-1){
					w.println("End," + myPath[i].id );
				}else{
					w.println("Trans," + myPath[i].id );
				}
			}// till now, customer reaches his destination
			total = total + weight;
			System.out.println(weight);
			
			
			// one assignment is done!
			
			
			original = new Node("867");
			destination = new Node("1465");
			weight = md.findDijkstraWeight(original, destination);
			
			myPath = md.getDijkstraPath();
			for (int i=0; i<myPath.length; i++) {
				if (i==0) {
					w.println("Taxi," + myPath[i].id );
				}else{
					w.println("Trans," + myPath[i].id );
				}
			}// till now, taxi reaches customer origin
			total = total + weight;
			System.out.println(weight);
			
			
			original = new Node("1465");
			destination = new Node("3411");
			weight = md.findDijkstraWeight(original, destination);
			myPath = md.getDijkstraPath();
			for (int i=0; i<myPath.length; i++) {
				if (i==0) {
					w.println("Start," + myPath[i].id );
				}else if(i == myPath.length-1){
					w.println("End," + myPath[i].id );
				}else{
					w.println("Trans," + myPath[i].id );
				}
			}// till now, customer reaches his destination
			total = total + weight;
			System.out.println(weight);
			
			// one assignment is done!

			original = new Node("477");
			destination = new Node("822");
			weight = md.findDijkstraWeight(original, destination);
			myPath = md.getDijkstraPath();
			for (int i=0; i<myPath.length; i++) {
				if (i==0) {
					w.println("Taxi," + myPath[i].id );
				}else{
					w.println("Trans," + myPath[i].id );
				}
			}// till now, taxi reaches customer origin
			total = total + weight;
			System.out.println(weight);
			
			original = new Node("822");
			destination = new Node("4308");
			weight = md.findDijkstraWeight(original, destination);
			myPath = md.getDijkstraPath();
			for (int i=0; i<myPath.length; i++) {
				if (i==0) {
					w.println("Start," + myPath[i].id );
				}else if(i == myPath.length-1){
					w.println("End," + myPath[i].id );
				}else{
					w.println("Trans," + myPath[i].id );
				}
			}// till now, customer reaches his destination
			total = total + weight;
			System.out.println(weight);
			
			// one assignment is done!
			
			
			original = new Node("8543");
			destination = new Node("6827");
			weight = md.findDijkstraWeight(original, destination);
			myPath = md.getDijkstraPath();
			for (int i=0; i<myPath.length; i++) {
				if (i==0) {
					w.println("Taxi," + myPath[i].id );
				}else{
					w.println("Trans," + myPath[i].id );
				}
			}// till now, taxi reaches customer origin
			total = total + weight;
			System.out.println(weight);
			
			original = new Node("6827");
			destination = new Node("9514");
			weight = md.findDijkstraWeight(original, destination);
			myPath = md.getDijkstraPath();
			for (int i=0; i<myPath.length; i++) {
				if (i==0) {
					w.println("Start," + myPath[i].id );
				}else if(i == myPath.length-1){
					w.println("End," + myPath[i].id );
				}else{
					w.println("Trans," + myPath[i].id );
				}
			}// till now, customer reaches his destination
			total = total + weight;
			System.out.println(weight);
			
			// one assignment is done!

			original = new Node("8029");
			destination = new Node("2988");
			weight = md.findDijkstraWeight(original, destination);
			myPath = md.getDijkstraPath();
			for (int i=0; i<myPath.length; i++) {
				if (i==0) {
					w.println("Taxi," + myPath[i].id );
				}else{
					w.println("Trans," + myPath[i].id );
				}
			}// till now, taxi reaches customer origin
			total = total + weight;
			System.out.println(weight);
			
			original = new Node("2988");
			destination = new Node("1555");
			weight = md.findDijkstraWeight(original, destination);
			myPath = md.getDijkstraPath();
			for (int i=0; i<myPath.length; i++) {
				if (i==0) {
					w.println("Start," + myPath[i].id );
				}else if(i == myPath.length-1){
					w.println("End," + myPath[i].id );
				}else{
					w.println("Trans," + myPath[i].id );
				}
			}// till now, customer reaches his destination
			total = total + weight;
			System.out.println(weight);
			
			// one assignment is done!
			System.out.println("done! total is " + total);

		} finally {
			// always close before end
			w.close();
		}

		
	}

	private static void addLane(String laneId, int sourceLocNo, int destLocNo, int duration) {
		// TODO Auto-generated method stub
		Edge lane = new Edge(laneId, nodes.get(sourceLocNo), nodes.get(destLocNo), duration);
		edges.add(lane);
	}

	private static void addLane(String laneId, Edge edge) {
		// TODO Auto-generated method stub
		Edge lane = new Edge(laneId, edge.source, edge.destination, edge.weight);
		Edge lane2 = new Edge(laneId, edge.destination, edge.source, edge.weight);
		if (!nodes.contains(edge.source))
			nodes.add(edge.source);
		if (!nodes.contains(edge.destination))
			nodes.add(edge.destination);
		edges.add(lane);
		edges.add(lane2);
	}

}
