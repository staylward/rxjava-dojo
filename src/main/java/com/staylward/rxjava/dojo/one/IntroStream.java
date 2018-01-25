package com.staylward.rxjava.dojo.one;


import rx.Observable;

public class IntroStream {
    private final static String desiredOutput = "Hello World!";

    public static void helloWorld() {
        Observable<String> helloWorldObservable = null;
        // set helloWorldObservable to just contain the desired output
        helloWorldObservable.subscribe(System.out::print);
    }
}
