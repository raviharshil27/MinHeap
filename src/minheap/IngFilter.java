/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package minheap;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * @author Harshil
 */
public class IngFilter 
{
    Iterator heapIterator = null;
    String next= null; 
    public IngFilter(Iterator inputIterator) {
        heapIterator = inputIterator;
        getNext();
    }
    
    public String next(){
        if(hasNext()){
            String currentValue = next;
            getNext();
            return currentValue;
        }
        else
            throw new NoSuchElementException("Illegal Access..");
    }
    
    public void getNext(){
        if (heapIterator.hasNext()) {
            while (heapIterator.hasNext()) {
                String value = (String) heapIterator.next();
                if (value.toLowerCase().endsWith("ing")) {
                    next = value;
                    break;
                }
                next = null;
            }
        }
        else
            next = null;
        
//        if(!heapIterator.hasNext())
//            next =null;
    }
    
    public boolean  hasNext()
    {
        return !(next == null);
    }
}
