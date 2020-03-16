package queuemanager;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.Node;


public class OrderedLinkedList<T> implements PriorityQueue<T> {
    private ListNode<T> head;
    private ListNode<T> temp;
    private ListNode<T> newnode;
     
    public OrderedLinkedList() {
        head = null;
        temp = null;
        newnode = null;
    }
    
    @Override
    public boolean isEmpty() {
        return head == null;
    }
    
    @Override
    public T head() {
        if (isEmpty()) {
            try {
                throw new StackUnderflowException();
            } catch (StackUnderflowException ex) {
                Logger.getLogger(OrderedLinkedList.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return head.getItem();
    }
    
    @Override
    public void remove() {
        if (isEmpty()) {
            try {
                throw new StackUnderflowException();
            } catch (StackUnderflowException ex) {
                Logger.getLogger(OrderedLinkedList.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        head = head.getNext();
    }
     
   @Override
   public void add(T item, int priority)
   {
      // Do null checks on Data.
    if (head == null) {
      // If we have no head, set head and return immediately.
      
      head = new ListNode(item,priority, null);
      return;
    }

    ListNode previous = head;
    ListNode current = head;
    ListNode temp = new ListNode(item,priority, null);

    // Continue iterating till we reach the end of the list.
    while (null != current) {

      if (current.getPriority()< priority) {
        if (current == head) {
          // Special handling for the case when the element being inserted is greater than head.
          head = temp;
          temp.setNext(current);
          return;
        }
        break;
      }
      previous = current;
      current = current.getNext();
    }

    // Break out of the while loop and reset the next pointers. Previous points to immediate 
    // greater element and current points to immediate element that is less than *data* being
    // inserted.
    previous.setNext(temp);
    temp.setNext(current);
  }
    
       
      
      
   
    
    @Override
    public String toString() {
        
        String result = "[";
         for (ListNode<T> node = head; node != null; node = node.getNext()) {
            if (node != head) {
                result += ", ";
            }
            result +="(";
            result += node.getItem();
            result += ", ";
            result += node.getPriority();
             result +=")";
        }
        result += "]";
       
        return result;
    }
    
    private int size() {
        ListNode<T> node = head;
        int result = 0;
        while (node != null) {
            result = result + 1;
            node = node.getNext();
        }
        return result;
    }

    

 
}