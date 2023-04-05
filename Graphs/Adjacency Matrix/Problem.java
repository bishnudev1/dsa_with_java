import java.util.*;

public class Problem{
    public static void main(String[] args){

        Graph graph = new Graph(5);

        
        graph.addNode(new Node("A"));
        graph.addNode(new Node("B"));
        graph.addNode(new Node("C"));
        graph.addNode(new Node("D"));
        graph.addNode(new Node("E"));
        

        graph.addEdge(0,1);

        graph.print();

    }
}

class Node{
    String data;

    Node(String data){
        this.data = data;
    }
}

class Graph{
    ArrayList<Node> nodes;
    int[][] matrix;

    Graph(int size){
        nodes = new ArrayList();
        matrix = new int[size][size];
    }

    void addNode(Node node){
        nodes.add(node);
    }

    void print(){

        System.out.print("  ");

        for(Node nodes : nodes){
            System.out.print(nodes.data+" ");
        }
        System.out.println();

        for(int i=0;i<matrix.length;i++){
            System.out.print(nodes.get(i).data+" ");
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    void addEdge(int src, int dst){
        matrix[src][dst] = 1;
    }

    boolean checkEdge(int src, int dst){
        return matrix[src][dst] == 1;
    }
}

/*
Graph using Adjacency Matrix
    1. An array to store 1's/0's to represent edges
    2. No of rows = No of unique nodes
    3. No of columns = No of unique nodes
    4. Runtime complexity to check an Edge => O(1)
    5. Space complexity => O(v^2) [vertex x vertex]
*/