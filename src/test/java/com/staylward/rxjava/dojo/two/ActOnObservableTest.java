package com.staylward.rxjava.dojo.two;

import org.junit.Test;

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
}