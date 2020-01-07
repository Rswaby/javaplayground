package javaplay.CTCI;

import java.util.ArrayList;

public class Graph{
    String val;
    ArrayList<Graph> neighbours;

    public Graph(String val){
        this.val = val;
        this.neighbours = new ArrayList<>();
    }
}