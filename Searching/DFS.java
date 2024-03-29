import java.util.*;

public class DFS{
    public static void main(String[] args){
        Graph _graph = new Graph(5);

        _graph.addNode(new Node("A"));
        _graph.addNode(new Node("B"));
        _graph.addNode(new Node("C"));
        _graph.addNode(new Node("D"));
        _graph.addNode(new Node("E"));

        _graph.addEdge(0,1);
        _graph.addEdge(1,2);

        //_graph.print();
        _graph.depthFirstSearch(4);
    }
}


class Node{
    String data;

    Node(String data){
        this.data = data;
    }
}

class Graph{

    int[][] graphList;
    ArrayList<Node> nodes;

    Graph(int size){
        graphList = new int[size][size];
        nodes = new ArrayList(size);
    }

    void addNode(Node node){
        nodes.add(node);
    }

    void addEdge(int src, int dst){
        graphList[src][dst] = 1;
    }

    boolean checkEdge(int src, int dst){
        return graphList[src][dst] == 1;
    }

    void print(){
        System.out.print("  ");

        for(Node nodes : nodes){
            System.out.print(nodes.data + " ");
        }
        System.out.println();

        for(int i=0;i<graphList.length;i++){
            System.out.print(nodes.get(i).data + " ");
            for(int j=0;j<graphList[i].length;j++){
                System.out.print(graphList[i][j] + " ");
            }
            System.out.println();
        }
    }

    void depthFirstSearch(int src){
        boolean[] visited = new boolean[graphList.length];
        helperDFS(src, visited);
    }


    void helperDFS(int src, boolean[] visited){
        if(visited[src]) return;
        
        else{
            visited[src] = true;
            System.out.println("Just visited -> " + nodes.get(src).data);
        }

        for(int i=0;i<graphList[src].length;i++){
            if(graphList[src][i] == 1){
                helperDFS(i,visited);
            }
        }
        return;
    }

}

/*
 Depth First Search
    1. Pick a route, keep going.
    2. If you reach a dead end, or an already visited node, backtrack to previous node with unvisited previous adjacent neighbors.
    3. More popular for games and puzzles

*/