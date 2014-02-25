/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package minheap;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

/**
 *
 * @author Harshil
 */
public class NodeIterator implements Iterator<HeapNode> {
    private Stack stackedNodes = new Stack();
    private HeapNode next;

    public NodeIterator(HeapNode root) {
        stackedNodes.push(root.rightChild);
        stackedNodes.push(root.leftChild);
        next = root;
    }

    
    @Override
    public boolean hasNext() {
        if(next != null)
            return true;
        else
            return false;              
//        return (next != null);
    }

    @Override
    public HeapNode next() {
        if(next == null)
            return next = null;
        HeapNode currentNode = next;
        next = getNext();
        return currentNode;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public HeapNode getNext()
    {
        if(stackedNodes.isEmpty())
            return next = null;
        next = (HeapNode) stackedNodes.pop();
        while(next == null && !stackedNodes.isEmpty())
        {
            next= (HeapNode) stackedNodes.pop();
        }
        if(next.rightChild != null)
            stackedNodes.push(next.rightChild);
        if(next.leftChild != null)
            stackedNodes.push(next.leftChild);
        return next;
    }
}

