package org.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest2 {
    @Test
    public void appHasAnOwner() {
        App classUnderTest = new App();
        assertEquals("jeteish", classUnderTest.owner());
    }
}
