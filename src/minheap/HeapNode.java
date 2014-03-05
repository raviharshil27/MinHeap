package minheap;

/**
 *
 * @author Harshil
 */
public class HeapNode extends Node
{
//    protected String value=null;
//    protected Node leftChild = null;
//    protected Node rightChild = null;
    
    public HeapNode() {
    }

//   public HeapNode(String value) {
//        this.value = value;
//        leftChild = new HeapNullNode(this);
//        rightChild = new HeapNullNode(this);
//    }
    public HeapNode(String value,Node parent) {
        this.value = value;
        leftChild = new HeapNullNode(this);
        rightChild = new HeapNullNode(this);
        this.parent = parent;
    }
    
    @Override
    public int getHeightDifference()
    {
        int heightOfLeftChild = leftChild.getHeight();
        int heightOfRightChild= rightChild.getHeight();
        return (heightOfLeftChild-heightOfRightChild);
        
    }

    @Override
     public int getHeight() {
            return Math.max( leftChild.getHeight(),
                                rightChild.getHeight()) + 1;
    }
    public int compareTo(HeapNode node)    {
        return value.compareTo(node.value);
    }
//    public void preOrderTraversing(StringBuffer traversalString) {
//        if (value == null) 
//            return;
//        traversalString.append(value + " ");
//        if(leftChild != null)
//        leftChild.preOrderTraversing(traversalString);
//        if(rightChild != null)
//        rightChild.preOrderTraversing(traversalString);
////        preOrderTraversing(node.leftChild,traversalString);
////        preOrderTraversing(node.rightChild,traversalString);
    
//    }

    @Override
    public boolean isNil() {
        return false;
    }

   
    @Override
//     public void add(String value,Node parent) {
     public void add(String value,HeapStrategy hs) {
    
//        if( this.value.compareTo(value) > 0)
//          if(hs.swap(this, value))
//       {
//             //swap the values and do the rest further in the tree...
//             String swapString = value;
//             value = (this.value);
//             this.value = swapString;
////             System.out.println("Swapping of the values done..");
//         }
        
        value= hs.swap(this, value);
            if(getHeightDifference() <=0)
            {
                setLeftChild = true;
                leftChild.add(value,hs);
            }
            else 
            {
                setRightChild = true;
                rightChild.add(value,hs);
            }
    }
}
