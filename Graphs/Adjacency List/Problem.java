import java.util.*;

public class Problem{
    public static void main(String[] args){
        Graph _graph = new Graph();

        _graph.addNode(new Node("P"));
        _graph.addNode(new Node("Q"));
        _graph.addNode(new Node("R"));
        _graph.addNode(new Node("S"));
        _graph.addNode(new Node("T"));

        _graph.addEdge(0,1);
        _graph.addEdge(1,2);
        _graph.addEdge(2,3);

        _graph.print();
    }
}


class Node{
    String data;

    Node(String data){
        this.data = data;
    }
}

class Graph{
    ArrayList<LinkedList<Node>> alist = new ArrayList();

    void addNode(Node node){
        LinkedList<Node> currentList = new LinkedList();
        currentList.add(node);
        alist.add(currentList);
    }

    boolean checkEdge(int src, int dst){
        LinkedList<Node> currentList = alist.get(src);
        Node dstNode = alist.get(dst).get(0);

        for(Node node : currentList){
            if(node == dstNode) return true;
        }
        return false;
    }

    void addEdge(int src, int dst){
        LinkedList<Node> currentList = alist.get(src);
        Node dstNode = alist.get(dst).get(0);
        currentList.add(dstNode);
    }

    void print(){
        for(LinkedList<Node> currentList : alist){
            for(Node node : currentList){
                System.out.print(node.data + " -> ");
            }
            System.out.println();
        }
    }

}

/*
Adjacency List:
    1. An array/arraylist of linkedlist.
    2. Each linkdlist has a unique node at the head;
    3. All adjacent neighbours to that node are added to that node's linked list.

    Runtime complexity: O(v)
    Space complexity: O(v+e) [vertext + edge]
*/