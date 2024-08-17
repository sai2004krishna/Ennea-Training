package week2_assignment2;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CollectionsTest {
    private MapExample mapExample;
    private SetExample setExample;
    private ListExample listExample;

    @Before
    public void setUp() {
        mapExample = new MapExample();
        setExample = new SetExample();
        listExample = new ListExample();
    }

    @Test
    public void testAddAndSearchElements() {
       
        listExample.addElement("1");
        assertTrue(listExample.searchElement("1"));

        
        assertTrue(setExample.addElement("Apple"));
        assertTrue(setExample.searchElement("Apple"));

        
        mapExample.addElement(1, "Apple");
        assertTrue(mapExample.searchKey(1));
    }

    @Test
    public void testRemoveElements() {
       
        listExample.addElement("1");
        assertTrue(listExample.removeElement("1"));
        assertFalse(listExample.searchElement("1"));

        
        setExample.addElement("Apple");
        assertTrue(setExample.removeElement("Apple"));
        assertFalse(setExample.searchElement("Apple"));

        
        mapExample.addElement(1, "Apple");
        assertEquals("Apple", mapExample.removeElement(1));
        assertFalse(mapExample.searchKey(1));
    }

    @Test
    public void testRetrieveDataStructures() {
       
        listExample.addElement("1");
        assertNotNull(listExample.getList());

       
        setExample.addElement("Apple");
        assertNotNull(setExample.getSet());

       
        mapExample.addElement(1, "Apple");
        assertNotNull(mapExample.getMap());
    }
}
