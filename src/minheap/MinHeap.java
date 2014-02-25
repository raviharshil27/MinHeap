
package minheap;

import java.util.Iterator;

/**
 * @author Harshil Shah
 */
public class MinHeap {

    private HeapNode root = null;
//    Node currentNode = root;
//    private StringBuffer traversalString = new StringBuffer();
    public static void main(String[] args) 
    {
        MinHeap minHeap = new MinHeap();
        String values[] = "a b c d e f g h i".split(" ");
        minHeap.addDataToMinHeap(values);
        NodeIterator itr= new NodeIterator(minHeap.root);
        while(itr.hasNext())
            System.out.println(itr.next());
                  
//        minHeap.printElementsWithEndingCharacter("ing");
//        minHeap.toString();
    }

    public void add(String value) 
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
    
    @Override
    public String toString() {
        StringBuffer traversalString = new StringBuffer();
        root.preOrderTraversing(traversalString);
        System.out.println(traversalString);
        return traversalString.toString();
    }
    
    public String printElementsWithEndingCharacter(String endingCharacter)
    {
       
        StringBuffer traversalString = new StringBuffer();
        root.preOrderTraversing(traversalString);
        String nodeValues[]= traversalString.toString().split(" ");
        traversalString = new StringBuffer();
        for(int i=0;i<nodeValues.length;i++)
        {
            if(nodeValues[i].matches(".*"+endingCharacter))
                 traversalString.append(nodeValues[i] + " ");
        }
        System.out.println(traversalString.toString());
        return traversalString.toString();
    }

 

    public void addDataToMinHeap(String values[]) {
        for (int i = 0; i < values.length; i++) 
            add(values[i]);
    }
}


