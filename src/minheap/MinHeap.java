
package minheap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Harshil Shah
 */
public class MinHeap implements Heap{

    private Node root = new HeapNode();
    private int size =0;
//    Node currentNode = root;
//    private StringBuffer traversalString = new StringBuffer();
    public static void main(String[] args) 
    {
        MinHeap minHeap = new MinHeap();
                    
//        String values[] = "a b c d e f g h i".split(" ");
        String values[] = "asking asad barking testing".split(" ");

        minHeap.addDataToMinHeap(values);
//        Iterator<Node> itr=minHeap.iterator();
//        while(itr.hasNext())
//            System.out.print(itr.next().value);
//        System.out.println(minHeap.size());
          IngFilter ing = new IngFilter(new NodeIterator(minHeap.root));
          while(ing.hasNext())
              System.out.println(ing.next());
//        minHeap.printElementsWithEndingCharacter("ing");
//        System.out.println(minHeap.toString());
    }
  
    
    @Override
     public void add(String value) 
    {
        if(size == 0)
            root = new HeapNode(value,new HeapNullNode());
        else
//            root.add(value,root.parent);
            addData(root,value);
        
        size++;
    }
    private void addData(Node currentNode , String value)
    {
        if(currentNode.isNil())
        {
            currentNode.add(value,currentNode.parent);
            return;
        }
        if( currentNode.value.compareTo(value) > 0)
        {
             //swap the values and do the rest further in the tree...
             String swapString = value;
             value = (currentNode.value);
             currentNode.value = swapString;
             System.out.println("Swapping of the values done..");
         }
        if(currentNode.leftChild.isNil())
        {
             currentNode.setLeftChild = true;
             currentNode.leftChild.add(value,currentNode);
             return;
        }
        else if(currentNode.rightChild.isNil())
        {
            currentNode.setRightChild = true;
            currentNode.rightChild.add(value,currentNode);
            return;
        }
            if(currentNode.getHeightDifference() <=0)
                addData(currentNode.leftChild, value);
            else 
               addData(currentNode.rightChild, value);
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
    public NodeIterator iterator(){
        return new NodeIterator(root);
    }
//    public String printElementsWithEndingCharacter(String endingCharacter)
//    {
//       
//        StringBuffer traversalString = new StringBuffer();
//        root.preOrderTraversing(traversalString);
//        String nodeValues[]= traversalString.toString().split(" ");
//        traversalString = new StringBuffer();
//        for(int i=0;i<nodeValues.length;i++)
//        {
//            if(nodeValues[i].matches(".*"+endingCharacter))
//                 traversalString.append(nodeValues[i] + " ");
//        }
//        System.out.println(traversalString.toString());
//        return traversalString.toString();
//    }

 

    public void addDataToMinHeap(String values[]) {
        for (int i = 0; i < values.length; i++) 
            add(values[i]);
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
    public void clear() {
        root = null;
    }
}


