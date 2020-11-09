package com.blackMamba.dp.flyweight;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by Black Mamba on 2020/11/9 22:47
 *
 * @version 1.0
 * @description
 */
public class StrPool {

    public static List<Str> strPool = new ArrayList<Str>();

    static {
        for(int i = 0; i< 10; i++){
            strPool.add(new Str(UUID.randomUUID().toString(),true));
        }
    }

    public static void main(String[] args) {
        getStr();
    }

    private static Str getStr() {
        for(int i=0;i<strPool.size();i++){
            if(!strPool.get(i).isLive()){
                strPool.get(i).setLive(true);
                return strPool.get(i);
            }
        }
        return new Str(UUID.randomUUID().toString(),true);
    }
}
