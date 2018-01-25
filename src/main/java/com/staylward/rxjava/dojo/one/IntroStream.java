package com.staylward.rxjava.dojo.one;


import rx.Observable;

import java.util.List;

public class IntroStream {
    private final static String desiredOutput = "Hello World!";

    public static void helloWorld() {
        Observable<String> helloWorldObservable = null;
        helloWorldObservable = Observable.just(desiredOutput);
        helloWorldObservable.subscribe(System.out::print);
    }

    public static void printList(List<String> inputStrings) {
        Observable test = null;
        test = Observable.from(inputStrings);
        test.subscribe(System.out::println);
    }
}
