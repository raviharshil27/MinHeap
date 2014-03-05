/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package minheap;

import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @author Harshil
 */
public class Heap implements Collection<String> {

    private Node root = new HeapNode();
    private int size =0;
    private HeapStrategy hs;
    
    public Heap(HeapStrategy hs) {
        this.hs = hs;
    }
    
    public static void main(String[] args) 
    {
        Heap minHeap = new Heap(new MinHeap());
                    
        String values[] = "a b c d e f g h i".split(" ");
//        String values[] = "asking asad barking testing".split(" ");

        minHeap.addDataToMinHeap(values);
        Iterator<String> itr=minHeap.iterator();
        while(itr.hasNext())
            System.out.print(itr.next() + " ");
//        System.out.println(minHeap.size());
//          IngFilter ing = new IngFilter(new NodeIterator(minHeap.root));
//          while(ing.hasNext())
//              System.out.println(ing.next());
//        minHeap.printElementsWithEndingCharacter("ing");
//        System.out.println(minHeap.toString());
    }
  
    @Override
    public String toString() {
        StringBuffer traversalString = new StringBuffer();
        Iterator<String> itr=iterator();
        while(itr.hasNext())
            traversalString.append(itr.next() + " ");
        return traversalString.toString();
    }
    
    @Override
    public int size() {
          return size;
    }

    @Override
    public boolean isEmpty() {
       if(root == null)
            return true;
        else
            return false;
    }

    @Override
    public boolean contains(Object o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Iterator<String> iterator() {
        return new HeapIterator(root);
    }

    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public <T> T[] toArray(T[] a) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean add(String value) {
       if(size == 0)
            root = new HeapNode(value,new HeapNullNode(null));
        else
            root.add(value,hs);
//            addData(root,value);
        
        size++;
        return true;
    }
    
     public void addDataToMinHeap(String values[]) {
        for (int i = 0; i < values.length; i++) 
            add(values[i]);
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean addAll(Collection<? extends String> c) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
}
