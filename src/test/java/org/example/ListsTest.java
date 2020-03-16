package org.example;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class ListsTest {
    private List<String> list ;

    @Before
    public void setUp(){
        this.list = new ArrayList<String>();
    }
    @Test
    public void testIsEmpty(){


        assertTrue(list.isEmpty());
    }

    @Test
    public void testIsEmptyFalse(){
        list.add("a");
        assertFalse(list.isEmpty());
    }

    @Test
    public void testSizeIncrementsWhenAddingElements() {
        list.add("b");
        assertEquals(1, list.size());

        list.add("c");
        assertEquals(2, list.size());
    }
}
