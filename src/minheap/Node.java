/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package minheap;

/**
 *
 * @author Harshil
 */
public abstract class Node {
    protected String value=null;
    protected Node leftChild = null;
    protected Node rightChild = null;
    protected Node parent = null;
    protected boolean setLeftChild = false;
    protected boolean setRightChild = false;
    public abstract boolean isNil ();
    public abstract void add(String value, Node parent) ;
    public abstract int getHeight();


    
            
    
}
