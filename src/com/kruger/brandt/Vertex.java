package com.kruger.brandt;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

    private String name;
    private boolean visted;
    private List<Vertex> neighbourList;

    public Vertex(String  name){
        this.name = name;
        this.neighbourList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVisted() {
        return visted;
    }

    public void setVisted(boolean visted) {
        this.visted = visted;
    }

    public List<Vertex> getNeighbourList() {
        return neighbourList;
    }

    public void setNeighbourList(List<Vertex> neighbourList) {
        this.neighbourList = neighbourList;
    }

    public void addNeighbour(Vertex vertex){
        this.neighbourList.add(vertex);
    }

    @Override
    public String toString() {
        return this.name;
    }
}
