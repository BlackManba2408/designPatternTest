package com.blackMamba.dp.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Black Mamba on 2020/11/9 21:49
 *
 * @version 1.0
 * @description
 */
public class BranchNode extends Node {

    public String name;
    public List<Node> nodeLists = new ArrayList<Node>();

    public BranchNode(String name){
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println(name);
    }

    public void add(Node node){
        nodeLists.add(node);
    }
}
