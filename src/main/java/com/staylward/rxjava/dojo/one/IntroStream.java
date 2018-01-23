package com.staylward.rxjava.dojo.one;


import rx.Observable;

public class IntroStream {
    private final static String desiredOutput = "Hello World!";

    public static void helloWorld() {
        Observable.create(subscriber -> {
            // Print the desired output once here
        }).subscribe(System.out::print);
    }
}
