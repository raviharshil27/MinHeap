
package minheap;


/**
 * @author Harshil Shah
 */
public class MinHeap implements HeapStrategy{

    @Override
    public boolean compareTo(String node1, String node2) {
       if(node1.compareTo(node2) >0)
            return true;
       else
           return false;
    }   

}
