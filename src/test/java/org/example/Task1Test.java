package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @Test
    void sayHello() {
        boolean result = new Task1().sayHello();
        assertTrue(result);
    }
}