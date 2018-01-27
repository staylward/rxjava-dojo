package com.staylward.rxjava.dojo.two;

import rx.Observable;

import java.util.ArrayList;
import java.util.List;

public class ActOnObservable {

    public static List<Integer> addOneToEach(List<Integer> inputs) {
        List<Integer> results = new ArrayList<>();
        Observable.from(inputs)
                // Add your function here
                .subscribe(results::add);
        return results;
    }
}