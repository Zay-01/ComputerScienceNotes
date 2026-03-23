public class ListNode<E>
{
    private <E> value;
    private ListNode<E> next;

    public ListNode(E newValue, ListNode<E> newNext)
    {
        value = newValue;
        next = newNext;
    }

    public E getValue()
    {
        return value;
    }

    public E getNext()
    {
        return next;
    }

    public void setNext(ListNode<E> newNext)
    {
        next = newNext;
    }

}

/**
 * 
 * ListNode<String> list = new ListNode<>("Klus", null);
 * //Second Elements
 * list.setNext(new ListNode<String>("Kluss",null));
 * //Third Elemen
 * list.getNext().setNext(new ListNode<String>("Klussssssss",null));
 */

/**
 * ListNode<String> current = list;
 * 
 * while(current.getNext != null)
 * {
 *      current = current.getNext();
 * }
 * 
 * current.setNext(new ListNode<String>(~~~~,null));
 */

public class LinearLinkedList<E>
{
    private ListNode<E> firstNode;

    
    public LinearLinkedList()
    {

    }

    public boolean isEmpty()
    {
        return firstNode == null;
    }

    public String toString()
    {
        
    }

    public void insertFront()
    {

    }

    public void insertBack(E item)
    {
        if(firstNode == null)
        {
            fn = new listNode<E>(item,null);
        }
        else
        {
            listName<E> cun = firstNode
        }
    }

    public E deleteFront()
    {
        if(fn == null)
        {
            throw new NoSuchElementException;
        }
        else
        {
            E temp = fn.getValue();
            fn = fn.getNext();
            return temp;
        }
    }

    public E deleteBack()
    {
        if(firstNode == null) //0 elements
        {
            throw new NoSuchElementException();
        }
        else if(firstNode.getNext() == null) //1 elements
        {
            E temp = firstNode.getValue();
            firstNode = null;

            return temp;
        }
        else //2 elements
        {
            ListNode<E> cur = firstNode();

            while(cur.getNext().getNext() != null)
            {
                cur = cur.getNext();
            }
        }
        E temp = cur.getNext();
        cur.setNext(null);
        return temp;
    }
}