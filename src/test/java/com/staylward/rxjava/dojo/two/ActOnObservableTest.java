package com.staylward.rxjava.dojo.two;

import org.junit.Test;
import rx.Observable;
import rx.functions.Func1;

import java.util.List;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;


public class ActOnObservableTest {

    @Test
    public void shouldAddOneToEachValueInList() {
        // Given
        List<Integer> inputs = asList(1,2,3,4,5);

        // When
        List<Integer> results = ActOnObservable.addOneToEach(inputs);

        // Then
        assertThat(results).hasSize(5);
        assertThat(results).containsExactly(2,3,4,5,6);
    }

    @Test
    public void shouldOnlyReturnEvenValues() {
        // Given
        List<Integer> inputs = asList(1,2,3,4,5,6);
        Func1<Integer, Boolean> filter = value -> value % 2 == 0;

        // When
        List<Integer> results = ActOnObservable.filterList(inputs, filter);

        // Then
        assertThat(results).hasSize(3);
        assertThat(results).containsExactly(2,4,6);
    }

    @Test
    public void shouldOnlyReturnOddValues() {
        // Given
        List<Integer> inputs = asList(1,2,3,4,5,6);
        Func1<Integer, Boolean> filter = value -> value % 2 == 1;

        // When
        List<Integer> results = ActOnObservable.filterList(inputs, filter);

        // Then
        assertThat(results).hasSize(3);
        assertThat(results).containsExactly(1,3,5);
    }

    @Test
    public void shouldMergeBothListTogether() {
        // Given
        Observable<String> surfingFriends = Observable.from(asList("Nick", "Hugh"));
        Observable<String> workFriends = Observable.from(asList("André", "JP", "Gilberto"));

        // When
        List<String> results = ActOnObservable.combineObservables(surfingFriends, workFriends);

        // Then
        assertThat(results).hasSize(5);
        assertThat(results).containsOnlyOnce("Nick", "Hugh");
        assertThat(results).containsOnlyOnce("André", "JP", "Gilberto");
    }

    @Test
    public void shouldTakeFirstWordStartingWithC() {
        // Given
        List<String> inputs = asList("Apple", "Banana", "Cake", "Drink", "Carrot");

        // When
        String result = ActOnObservable.returnFirst(inputs, "C");

        // Then
        assertThat(result).isEqualTo("Cake");
    }

    @Test
    public void shouldTakeFirstWordStartingWithD() {
        // Given
        List<String> inputs = asList("Apple", "Banana", "Cake", "Drink", "Carrot");

        // When
        String result = ActOnObservable.returnFirst(inputs, "D");

        // Then
        assertThat(result).isEqualTo("Drink");
    }

    @Test
    public void shouldTakeLastWordStartingWithC() {
        // Given
        List<String> inputs = asList("Apple", "Banana", "Cake", "Drink", "Carrot", "Berries", "Mango");

        // When
        String result = ActOnObservable.returnLast(inputs, "C");

        // Then
        assertThat(result).isEqualTo("Carrot");
    }

    @Test
    public void shouldTakeLastWordStartingWithB() {
        // Given
        List<String> inputs = asList("Apple", "Banana", "Cake", "Drink", "Carrot", "Berries", "Mango");

        // When
        String result = ActOnObservable.returnLast(inputs, "B");

        // Then
        assertThat(result).isEqualTo("Berries");
    }
}