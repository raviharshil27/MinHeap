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
    public String swap(Node node, String value) {
       if(node.value.compareTo(value) <0)
       {
           String swapString = value;
             value = (node.value);
             node.value = swapString;
       }
       return value;

}
}
