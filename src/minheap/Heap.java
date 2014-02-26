/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package minheap;

import java.util.Collection;

/**
 *
 * @author Harshil
 */
public interface Heap  {
    public void add(String value);
    @Override
    public String toString();
    public NodeIterator iterator();
    public int size();
    public boolean isEmpty();
    public boolean contains(Object o);
//    public <T> T[] toArray(T[] a);
    public void clear();
//    public boolean addAll(Collection<T> c);
    
    
    
}
