package com.blackMamba.dp.composite;

/**
 * Created by Black Mamba on 2020/11/9 21:59
 *
 * @version 1.0
 * @description
 */
public class Main {
    public static void main(String[] args) {
        BranchNode root = new BranchNode("root");
        BranchNode a1 = new BranchNode("a1");
        LeafNode a11 = new LeafNode("a11");
        LeafNode a12 = new LeafNode("a12");
        BranchNode b1 = new BranchNode("b1");
        BranchNode b11 = new BranchNode("b11");
        LeafNode b111 = new LeafNode("b111");
        LeafNode b112 = new LeafNode("b112");
        LeafNode b12 = new LeafNode("b12");

        a1.add(a11);
        a1.add(a12);
        root.add(a1);
        b11.add(b111);
        b11.add(b112);
        b1.add(b11);
        b1.add(b12);
        root.add(b1);

        tree(root , 0);

    }

    /**
     * root
     * --a1
     * ----a11
     * ----a12
     * --b1
     * ----b11
     * ------b111
     * ------b112
     * ----b12
     *
     */

    public static void tree(Node node , int depth){
        for(int i=0; i<depth;i++) System.out.print("--");
        node.print();

        if(node instanceof BranchNode){
            for(Node n : ((BranchNode) node).nodeLists){
                //System.out.println("================="+depth);
                tree(n , depth+1);
            }
        }
    }
}
