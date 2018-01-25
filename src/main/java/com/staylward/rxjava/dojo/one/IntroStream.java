package com.staylward.rxjava.dojo.one;


import rx.Observable;

import java.util.List;

public class IntroStream {
    private final static String desiredOutput = "Hello World!";

    public static void helloWorld() {
        Observable<String> helloWorldObservable = null;
        // set helloWorldObservable to just contain the desired output
        helloWorldObservable.subscribe(System.out::print);
    }

    public static void printList(List<String> inputStrings) {
        Observable test = null;
        // create an instance of an observable for test that accepts the input strings
        test.subscribe(System.out::println);
    }
}
