/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package minheap;

/**
 *
 * @author Harshil
 */
public class HeapNullNode extends Node{

    @Override
    public boolean isNil() {
        return true;
    }

    @Override
     public void add(String value,Node parent) {
        Node newHeapNode = new HeapNode(value,parent);
       if(parent.setLeftChild)
       {
           parent.leftChild = newHeapNode;
           parent.setLeftChild = false;
       }
       else if(parent.setRightChild)
       {
           parent.rightChild = newHeapNode;
           parent.setRightChild = false;
       }
           
     }

    @Override
    public int getHeight() {
        return 0;
    }
    
    
}
