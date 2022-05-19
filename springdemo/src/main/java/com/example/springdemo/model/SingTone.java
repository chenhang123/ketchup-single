package com.example.springdemo.model;

/**
 * 懒汉式
 */
public class SingTone {

    private static SingTone singTone;

    private SingTone() {
    }

    public static SingTone getSingTone() {
        if (singTone == null){
            singTone = new SingTone();
        }
        return singTone;
    }
}
