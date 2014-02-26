package minheap;

/**
 *
 * @author Harshil
 */
public class HeapNullNode extends Node{

    @Override
    public boolean isNil() {
        return true;
    }

    @Override
     public void add(String value,Node parent) {
        Node newHeapNode = new HeapNode(value,parent);
       if(parent.setLeftChild)
       {
           parent.leftChild = newHeapNode;
           parent.setLeftChild = false;
       }
       else if(parent.setRightChild)
       {
           parent.rightChild = newHeapNode;
           parent.setRightChild = false;
       }
           
     }
//    @Override
//    public void add(String value)
//    {
//        Node newHeapNode = new HeapNode(value,parent);
//       if(parent.setLeftChild)
//       {
//           parent.leftChild = newHeapNode;
//           parent.setLeftChild = false;
//       }
//       else if(parent.setRightChild)
//       {
//           parent.rightChild = newHeapNode;
//           parent.setRightChild = false;
//       }
//    }

    @Override
    public int getHeight() {
        return 0;
    }

    @Override
    public int getHeightDifference() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
}
