package node;

/**
 *
 * @author Harshil
 */
public class Node 
{
    public String value ;
     public Node leftChild = null;
     public Node rightChild = null;

    public Node() {
    }

    public Node(String value) {
        this.value = value;
    }
    
    public int getHeightDifference()
    {
        int heightOfLeftChild = getHeight(leftChild);
        int heightOfRightChild= getHeight(rightChild);
        return (heightOfLeftChild-heightOfRightChild);
    }
    
    public int getHeight(Node currentNode) {
        if (currentNode == null) 
            return 0;
        else 
            return Math.max( getHeight(currentNode.leftChild),
                                getHeight(currentNode.rightChild)) + 1;
    }
    
    public int compareTo(Node node)    {
        return value.compareTo(node.value);
    }
}
