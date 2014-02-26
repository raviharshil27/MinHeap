package minheap;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

/**
 *
 * @author Harshil
 */
public class NodeIterator implements Iterator<Node> {
    private Stack stackedNodes = new Stack();
    private Node next;

    public NodeIterator(Node root) {
        stackedNodes.push(root.rightChild);
        stackedNodes.push(root.leftChild);
        next = root;
    }

    
    @Override
    public boolean hasNext() {
        return (!next.isNil() && !stackedNodes.isEmpty());
    }

    @Override
    public Node next() {
       
        Node currentNode = next;
        next = getNext();
        return currentNode;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public Node getNext()
    {
        if(stackedNodes.isEmpty())
             throw new java.util.NoSuchElementException();
        next = (Node) stackedNodes.pop();
        while(next.isNil() && !stackedNodes.isEmpty())
        {//if node is nill and staack has some elments then get next elements...
            next= (Node) stackedNodes.pop();
        }
            stackedNodes.push(next.rightChild);
            stackedNodes.push(next.leftChild);
        return next;
    }
}