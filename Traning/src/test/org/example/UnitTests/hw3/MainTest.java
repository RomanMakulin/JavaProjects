package org.example.UnitTests.hw3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;

class MainTest {

    Main main;

    @BeforeEach
    void setUp() {
        main = new Main();
    }

    @Test
    void evenEvenNumber() {
        Assertions.assertTrue(main.evenNumber(2));
    }
    @Test
    void evenOddNumber() {
        Assertions.assertFalse(main.evenNumber(3));
    }

    @Test
    void numberInInterval() {
        Assertions.assertTrue(main.numberInInterval(26));
    }
    @Test
    void numberOutInterval() {
        Assertions.assertFalse(main.numberInInterval(1));
    }


}