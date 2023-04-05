import java.util.*;

public class BFS{
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

        _graph.breadthFirstSearch(3);
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

    void breadthFirstSearch(int src){
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[graphList.length];

        queue.offer(src);
        visited[src] = true;

        while(queue.size() != 0){
            src = queue.poll();
            System.out.println(nodes.get(src).data + " = visited");

            for(int i=0;i<graphList[src].length;i++){
                if(graphList[src][i] == 1 && !visited[i]){
                    queue.offer(i);
                    visited[i] = true;
                }
            }
        }
    }

}

/*
Breadth First Search
    1. Traverse a graph level by level
    2. Utilizes a Queue
    3. Better if destination is on average close to start
    4. Siblings are visited before children
*/