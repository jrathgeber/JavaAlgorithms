package Structures;

/*
    https://www.baeldung.com/java-graphs

    Voila

 */


import java.util.*;
import java.util.stream.Collectors;

class Vertex {

    String label;
    Vertex(String label) {
        this.label = label;
    }

    // equals and hashCode
}


public class MyGraph {

    private Map<Vertex, List<Vertex>> adjVertices;
    // standard constructor, getters, setters


    void addVertex(String label) {
        adjVertices.putIfAbsent(new Vertex(label), new ArrayList<>());
    }

    void removeVertex(String label) {
        Vertex v = new Vertex(label);
        adjVertices.values()
                .stream()
                .map(e -> e.remove(v))
                .collect(Collectors.toList());
        adjVertices.remove(new Vertex(label));
    }


    void addEdge(String label1, String label2) {
        Vertex v1 = new Vertex(label1);
        Vertex v2 = new Vertex(label2);
        adjVertices.get(v1).add(v2);
        adjVertices.get(v2).add(v1);
    }



    void removeEdge(String label1, String label2) {
        Vertex v1 = new Vertex(label1);
        Vertex v2 = new Vertex(label2);
        List<Vertex> eV1 = adjVertices.get(v1);
        List<Vertex> eV2 = adjVertices.get(v2);
        if (eV1 != null)
            eV1.remove(v2);
        if (eV2 != null)
            eV2.remove(v1);
    }

    List<Vertex> getAdjVertices(String label) {
        return adjVertices.get(new Vertex(label));
    }

    // Nice
    Set<String> breadthFirstTraversal(MyGraph graph, String root) {
        Set<String> visited = new LinkedHashSet<String>();
        Queue<String> queue = new LinkedList<String>();
        queue.add(root);
        visited.add(root);
        while (!queue.isEmpty()) {
            String vertex = queue.poll();
            for (Vertex v : graph.getAdjVertices(vertex)) {
                if (!visited.contains(v.label)) {
                    visited.add(v.label);
                    queue.add(v.label);
                }
            }
        }
        return visited;
    }


    public static void main(String ... args) {

        MyGraph gg = new MyGraph();

        gg.addVertex("hello graph");

    }


}