/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package minheap;

/**
 *
 * @author Harshil
 */
public class MaxHeap implements HeapStrategy{

    @Override
    public boolean compareTo(String node1, String node2) {
       if(node1.compareTo(node2) <0)
            return true;
       else
           return false;
    }   

}
