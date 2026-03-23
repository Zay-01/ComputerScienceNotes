public class CircularLinkedList<E>
{
    ListNode<E> lastNode = new ListNode<E>(value, null);
    lastNode.setNext(lastNode);

    public void addEnd()
    {
        lastNode.getNext(new listNode<E>(value, lastNode.getNext()));
        lastNode = lastNode.getNext();
    }

    public void addFront()
    {
        lastNode.setNext(new listNode<E>(value, lastNode.getNext()));
    }

    @Override
    public String toString() 
    {
        String s = "[";

        if(lastNode == null)
        {
            return "[]";
        }
        else
        {
            ListNode<E> current = lastNode.getNext();
            
            while(current != lastNode)
            {
                s += current.getValue + ", ";
                current = current.getNext();
            }
        }

        return s + lastNode.getValue() + "]";
    }
}