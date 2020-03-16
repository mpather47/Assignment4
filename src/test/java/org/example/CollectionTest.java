package org.example;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class CollectionTest {
    private Collection<String> col ;

    @Before
    public void setUp(){
        this.col = new ArrayList<String>();
    }
    @Test
    public void testIsEmpty(){


        assertTrue(col.isEmpty());
    }

    @Test
    public void testIsEmptyFalse(){
        col.add("a");
        assertFalse(col.isEmpty());
    }

    @Test
    public void testSizeIncrementsWhenAddingElements() {
        col.add("b");
        assertEquals(1, col.size());

        col.add("c");
        assertEquals(2, col.size());
    }
}
