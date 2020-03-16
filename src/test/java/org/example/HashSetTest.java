package org.example;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class HashSetTest {
    private Set<String> hs ;

    @Before
    public void setUp(){
        this.hs = new HashSet<String>();
    }
    @Test
    public void testIsEmpty(){


        assertTrue(hs.isEmpty());
    }

    @Test
    public void testIsEmptyFalse(){
        hs.add("a");
        assertFalse(hs.isEmpty());
    }

    @Test
    public void testSizeIncrementsWhenAddingElements() {
        hs.add("b");
        assertEquals(1, hs.size());

        hs.add("c");
        assertEquals(2, hs.size());
    }
}
