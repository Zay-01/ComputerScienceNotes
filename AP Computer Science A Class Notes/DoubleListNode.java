

/**
 * Traverse in BOTH direction 
 * Delete elements your pointing to
 */
public class DoubleListNode<E>
{    
    private DoubleListNode<E> previous;
    private DoubleListNode<E> next;
    private E value;


    /**
     * @param item is inserted in order
     */
    public void insert(Comparable<E> item)
    {
        if(firstNode == null)
        {
            firstNode = new DoubleListNode(null,item,null);
        }
        else if(item.compareTo(firstNode.getValue()) < 0)
        {
            DoubleListNode<E> temporary = new DoubleListNode<>();
            firstNode.setPrevious(temp);
        }
        else
        {
            DoubleListNode<E> current = fn;
            while(current.getNext() != null && item.compareTo(cur.getNext().getValue));
            {
                current = current.getNext();
            }
            if(cur.getNext() == null)
            {
                cur.setNext(new DoubleListNode(cur,item,null));
            }
            else
            {
                cur.setNext(new DoubleListNode(cur,item,cur.getnext));
                cur.getNext().getNext().setPrev(cur.getNext());
            }
        }
    }

    public void delete(E item)
    {
        if(firstNode == null)
        {
            throw new ArrayIndexOutOfBoundsException();
        }
        else if(firstNode.getValue().equals(item))
        {
            firstNode = firstNode.getNext();
            if(fn != null)
            {
                firstNode.setPrevious = null;
            }
        }
        else
        {
            ListNode<E> current = fn.getNext()
            while(current != null && !current.getValue().equals(item))
            {
                current = current.getNext()
            }
            if(current == null)
            {
                return null;
            }
            else
            {
                current.getPrevious.setNext(current.getNext())
                if(current.getNext() != null)
                current.getNext.setprev(current.getprev);
            }
        }
    }

    //Getters and Setters!
    //Not circular, linear start from front of back
}
