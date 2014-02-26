
package minheap;

import java.util.Iterator;

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
//        minHeap.add("a");
//        minHeap.add("b");
//        minHeap.add("c");
//        System.out.println();
        String values[] = "a b c d e f g h i".split(" ");
        minHeap.addDataToMinHeap(values);
        Iterator<Node> itr=minHeap.iterator();
        while(itr.hasNext())
            System.out.print(itr.next().value);
//        System.out.println(minHeap.size());
                  
//        minHeap.printElementsWithEndingCharacter("ing");
//        minHeap.toString();
    }

/*    public void add(String value) 
    {
        HeapNode currentNode = root;
        HeapNode newNode = new HeapNode(value);
        if (root == null) {
            root = new HeapNode(value);
//            root.value = value;
            currentNode = root;
        } 
        else {
            while (true)
            {
                if (currentNode.compareTo(newNode) > 0) {
                    //swap the values and do the rest further in the tree...
                    String swapString = currentNode.value;
                    currentNode.value = (newNode.value);
                    newNode.value = swapString;
                    System.out.println("Swapping of the values done..");
                } 
                else {
                      //if it comes here means check the height and the left or right 
                      //node 
                    if (currentNode.leftChild == null) {
                        currentNode.leftChild =newNode;
                        break;
                    } 
                    else if (currentNode.rightChild == null) {
                        currentNode.rightChild =newNode;
                        break;
                    } 
                    else{
                        //check the height if its same then add to left else add to 
                        //side which has less height.......
                        if(currentNode.getHeightDifference() <=0)
                            currentNode = currentNode.leftChild;
                        else 
                            currentNode = currentNode.rightChild;
                    }
                }
            }
        }
    }
    */
    
    
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
    public void addData(Node currentNode , String value)
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
//        StringBuffer traversalString = new StringBuffer();
//        root.preOrderTraversing(traversalString);
//        System.out.println(traversalString);
                throw new UnsupportedOperationException("Not supported yet.");

//        return traversalString.toString();
    }
    
    @Override
    public NodeIterator iterator(){
        return new NodeIterator(root);
//                throw new UnsupportedOperationException("Not supported yet.");

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
//        int size =0;
//        Iterator itr = new NodeIterator(root);
//        while(itr.hasNext())
//        {
//            itr.next();
//            size++;
//        }
//        return size;
                throw new UnsupportedOperationException("Not supported yet.");

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


