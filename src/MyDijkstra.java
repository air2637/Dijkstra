import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class MyDijkstra {

	private List<Node> nodes;
	private List<Edge> edges;

	private Node startNode;
	private Node endNode;
	private int breakCnt;

	private Graph graph;
	private Dijkstra dijkstra;
	
	private Stack<Edge> path;
	private Edge[] myPath;

	public MyDijkstra() {
		nodes = new ArrayList<Node>();
		edges = new ArrayList<Edge>();

		RoadGraphReader roadGraphReader = new RoadGraphReader();

		HashMap<String, Edge> loadedEdges = roadGraphReader.getLoadedEdges();
		Iterator<String> iter = loadedEdges.keySet().iterator();
		while (iter.hasNext()) {
			String edgeId = (String) iter.next();
			Edge edge = loadedEdges.get(edgeId);
			addLane(edgeId, edge);
		}

		graph = new Graph(nodes, edges);
		dijkstra = new Dijkstra(graph);
	}

	private void addLane(String laneId, Edge edge) {

		Edge lane = new Edge(laneId, edge.source, edge.destination, edge.weight);
		Edge lane2 = new Edge(laneId, edge.destination, edge.source, edge.weight);
		if (!this.nodes.contains(edge.source))
			this.nodes.add(edge.source);
		if (!this.nodes.contains(edge.destination))
			this.nodes.add(edge.destination);
		this.edges.add(lane);
		this.edges.add(lane2);
	}

	public double findDijkstraWeight(Node original, Node destination) {
		breakCnt = 0;
		for (int i = 0; i < nodes.size(); i++) {
			if (breakCnt == 2) {
				break;
			}
			if (nodes.get(i).equals(original)) {
				startNode = nodes.get(i);
				breakCnt++;
			}
			if (nodes.get(i).equals(destination)) {
				endNode = nodes.get(i);
				breakCnt++;
			}
		}
		dijkstra.execute(startNode);
		path = dijkstra.shortestPath(endNode);
		
		myPath = new Edge[path.size()];
		
		
		double weight = 0;
		if(path==null){
			//weight = Double.MAX_VALUE;
		}else{
			int i = 0;
			while(path.size()>0){
				myPath[i] = path.pop();
				//weight = weight + myPath[i].weight;
				i++;
			}
		}
		weight = dijkstra.getShortestDistance(endNode);
		return weight;
	}
	
	public Edge[] getDijkstraPath(){
		
		return myPath;
	}
}
