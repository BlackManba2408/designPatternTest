package com.blackMamba.dp.flyweight;

/**
 * Created by Black Mamba on 2020/11/9 22:50
 *
 * @version 1.0
 * @description
 */
public class Str {

    public String id;
    public boolean isLive = true;

    public Str(String id, boolean isLive){
        this.id = id;
        this.isLive = isLive;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isLive() {
        return isLive;
    }

    public void setLive(boolean live) {
        isLive = live;
    }
}
