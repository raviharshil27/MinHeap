package com.test;

import java.util.*;
import minheap.*;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Harshil
 */
public class HeapTest {
    
    @Test
    public void testMinHeap()
    {
        String values[] = "a b c d e f g h i".split(" ");
        String expectedoutput ="a b d g f c e i h ";
        Heap actualMinHeap = new Heap(new MinHeap());
        actualMinHeap.addDataToMinHeap(values);
        String actualTraversal = actualMinHeap.toString();
        assertEquals(expectedoutput, actualTraversal);
        
    }
    
    @Test
    public void testMaxHeap()
    {
//        String values[] = "asking asad barking testing".split(" ");
//        String expectedoutput ="asking testing barking ";
        String values[] = "a b c d e f g h i".split(" ");
        String expectedoutput ="i f e a c h g b d ";
        Heap actualMinHeap = new Heap(new MaxHeap());
        actualMinHeap.addDataToMinHeap(values);
        String actualTraversal = actualMinHeap.toString();
        assertEquals(expectedoutput, actualTraversal);
        
    }
}
