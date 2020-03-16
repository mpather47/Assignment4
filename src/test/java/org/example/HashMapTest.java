package org.example;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class HashMapTest
{
    private Map<String,Integer> hm;
    /**
     * Rigorous Test :-)
     */
     @Before
    public void setUp(){
        this.hm = new HashMap<String,Integer>();
    }
    @Test
    public void testIsEmpty(){


        assertTrue(hm.isEmpty());
    }

    @Test
    public void testIsEmptyFalse(){
        hm.put("a",1);
        assertFalse(hm.isEmpty());
    }

    @Test
    public void testSizeIncrementsWhenAddingElements() {
        hm.put("b", 2);
        assertEquals(1, hm.size());

        hm.put("c", 3);
        assertEquals(2, hm.size());
    }

}
