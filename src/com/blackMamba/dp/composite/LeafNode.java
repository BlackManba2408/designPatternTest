package com.blackMamba.dp.composite;

/**
 * Created by Black Mamba on 2020/11/9 21:32
 *
 * @version 1.0
 * @description
 */
public class LeafNode extends Node {

    public String content;

    public LeafNode(String content){
        this.content = content;
    }

    @Override
    public void print() {
        System.out.println(content);
    }
}
