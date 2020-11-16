package com.blackMamba.dp.flyweight;

import java.util.jar.JarOutputStream;

/**
 * Created by Black Mamba on 2020/11/9 22:38
 *
 * @version 1.0
 * @description
 */
public class StringTest {

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";
        String str3 = new String("abc");
        String str4 = new String("abc");

        System.out.println(str1 == str2); // true
        System.out.println(str1 == str3); // false
        System.out.println(str4.intern() == str1); //true
        System.out.println(str4.intern() == str3); //false

        System.out.println(str1.equals(str2)); //true
        System.out.println(str1.equals(str3)); //true
        System.out.println(str3.equals(str4)); //true
        System.out.println(str3.intern().equals(str1)); //true
        System.out.println(str3.intern().equals(str4)); //true

    }
}
