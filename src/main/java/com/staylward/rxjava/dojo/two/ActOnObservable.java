package com.staylward.rxjava.dojo.two;

import rx.Observable;
import rx.functions.Func1;

import java.util.ArrayList;
import java.util.List;

public class ActOnObservable {

    public static List<Integer> addOneToEach(List<Integer> inputs) {
        List<Integer> results = new ArrayList<>();
        Observable.from(inputs)
                .map(value -> value + 1)
                .subscribe(results::add);
        return results;
    }

    public static List<Integer> filterList(List<Integer> inputs, Func1<Integer, Boolean> filter) {
        List<Integer> results = new ArrayList<>();
        Observable.from(inputs)
                .filter(filter)
                .subscribe(results::add);
        return results;
    }

    public static List<String> combineObservables(Observable<String> observable1, Observable<String> observable2) {
        List<String> results = new ArrayList<>();
        // Add your function here to combine both the observables and then return them
        return results;
    }
}
