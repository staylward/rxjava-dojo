package com.staylward.rxjava.dojo.two;

import org.junit.Test;
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
}