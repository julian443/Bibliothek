package ch.aprentas.praesentationsschicht;

import org.junit.Test;

import static org.junit.Assert.*;

public class KonsoleTest {

    @org.junit.Test
    public void startProgram() {
    }

    @Test
    public void setNumberNav() {
        Konsole konsole = new Konsole();
        konsole.setNumberNav(1);
        assertEquals(1, konsole.getNumberNav());
    }

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void testSetNumberNav() {
    }
}