package com.hainiuxy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void startTest() {
        String mvn = App.start();
        assertEquals("start", mvn);
    }

    @Test
    public void loginTest(){
        App app = new App();

        boolean login = app.login("hainiu","12345");

        assertTrue(login);

    }
}


