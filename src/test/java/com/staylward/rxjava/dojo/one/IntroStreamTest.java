package com.staylward.rxjava.dojo.one;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class IntroStreamTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void tearDown() {
        System.setOut(null);
        System.setErr(null);
    }

    @Test
    public void shouldPrintHelloWorldToStdOut() {
        // When
        IntroStream.helloWorld();

        // Then
        assertThat(outContent.toString()).contains("Hello World!");
    }

    @Test
    public void shouldPrintAllInputToStdOut() {
        // Given
        List<String> inputStrings = asList("Test", "Hello", "World", "!");

        // When
        IntroStream.printList(inputStrings);

        // Then
        assertThat(outContent.toString()).contains(inputStrings.get(0));
        assertThat(outContent.toString()).contains(inputStrings.get(1));
        assertThat(outContent.toString()).contains(inputStrings.get(2));
    }
}