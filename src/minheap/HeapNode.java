package minheap;

/**
 *
 * @author Harshil
 */
public class HeapNode 
{
    protected String value=null;
     protected HeapNode leftChild = null;
     protected HeapNode rightChild = null;

    public HeapNode() {
    }

   public HeapNode(String value) {
        this.value = value;
    }
    
    public int getHeightDifference()
    {
        int heightOfLeftChild = getHeight(leftChild);
        int heightOfRightChild= getHeight(rightChild);
        return (heightOfLeftChild-heightOfRightChild);
    }
    
    public int getHeight(HeapNode currentNode) {
        if (currentNode == null) 
            return 0;
        else 
            return Math.max( getHeight(currentNode.leftChild),
                                getHeight(currentNode.rightChild)) + 1;
    }
    
    public int compareTo(HeapNode node)    {
        return value.compareTo(node.value);
    }
    public void preOrderTraversing(StringBuffer traversalString) {
        if (value == null) 
            return;
        traversalString.append(value + " ");
        if(leftChild != null)
        leftChild.preOrderTraversing(traversalString);
        if(rightChild != null)
        rightChild.preOrderTraversing(traversalString);
//        preOrderTraversing(node.leftChild,traversalString);
//        preOrderTraversing(node.rightChild,traversalString);
    }
}
