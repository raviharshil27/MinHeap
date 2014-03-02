package com.test;

import java.util.LinkedList;
import minheap.MinHeap;
import minheap.HeapNode;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Harshil
 */
public class MinHeapTest {
    
    @Test
    public void testMinHeap()
    {
        String values[] = "a b c d e f g h i".split(" ");
        String expectedoutput ="a b d g f c e i h ";
        MinHeap actualMinHeap = new MinHeap();
        actualMinHeap.addDataToMinHeap(values);
        String actualTraversal = actualMinHeap.toString();
        assertEquals(expectedoutput, actualTraversal);
        
    }
    
//    @Test
//    public void testMinHeap1()
//    {
//        String values[] = "asking asad barking testing".split(" ");
//        String expectedoutput ="asking testing barking ";
//        MinHeap actualMinHeap = new MinHeap();
//        actualMinHeap.addDataToMinHeap(values);
//        String actualTraversal = actualMinHeap.printElementsWithEndingCharacter("ing");
//        assertEquals(expectedoutput,actualTraversal );
//    }
}
