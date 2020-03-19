package com.kruger.brandt;

import java.util.List;
import java.util.Stack;

public class DFS {

    private Stack<Vertex> stack;

    public DFS() {
        this.stack = new Stack<>();
    }

    public void dfs(List<Vertex> vertexList){

        // for loop is if there is more than one cluster
        for (Vertex v: vertexList){

            if (!v.isVisted()){
                v.setVisted(true);
                dfsRecursive(v);
            }
        }
    }

    private void dfsRecursive(Vertex vertex){
        System.out.println(vertex + " ");

        for (Vertex v: vertex.getNeighbourList()){

            if (!v.isVisted()){
                v.setVisted(true);
                dfsRecursive(v);
            }
        }
    }

    private void dfsWithStack(Vertex rootVertex) {

        this.stack.add(rootVertex);

        while (!stack.empty()){

            Vertex actualVertex = this.stack.pop();
            System.out.println(actualVertex + " ");

            for (Vertex v: actualVertex.getNeighbourList()){
                if (!v.isVisted()) {
                    v.setVisted(true);
                    this.stack.push(v);
                }
            }

        }
    }
}
