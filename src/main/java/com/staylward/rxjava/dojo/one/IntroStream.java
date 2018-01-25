package com.staylward.rxjava.dojo.one;


import rx.Observable;

public class IntroStream {
    private final static String desiredOutput = "Hello World!";

    public static void helloWorld() {
        Observable<String> helloWorldObservable = null;
        helloWorldObservable = Observable.just(desiredOutput);
        helloWorldObservable.subscribe(System.out::print);
    }
}
