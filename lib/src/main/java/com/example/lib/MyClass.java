package com.example.lib;

public class MyClass {
    public static void main(String[] args) {
        String str = "Taiwan, Touch, Your, Heart";
        String strChange = "";

        int strlength = str.length();
        for (int i = 0; i < strlength; i++) {
            if (str.charAt(i)!=(char)44) {
                strChange += str.charAt(i);
            }
        }
        System.out.println(strChange);
    }
}