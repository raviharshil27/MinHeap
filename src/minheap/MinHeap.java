
package minheap;


/**
 * @author Harshil Shah
 */
public class MinHeap implements HeapStrategy{

    @Override
    public String swap(Node node, String value) {
       if(node.value.compareTo(value) >0)
       {
           String swapString = value;
             value = (node.value);
             node.value = swapString;
       }
       return value;

    }   

}
