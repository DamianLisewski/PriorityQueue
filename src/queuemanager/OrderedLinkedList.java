//Reference
//https://stackoverflow.com/questions/36046948/sorted-insert-into-singly-linked-list-from-scratch


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
    
    
//when class is instanciated , the crutial variables are set to null.
    public OrderedLinkedList() {
        head = null;
        temp = null;
        newnode = null;
    }
    
    @Override
    //return true is head is null
    public boolean isEmpty() {
        return head == null;
    }
    
    @Override
    //returns object stored in the head.
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
    //removes item in head as sets next item in list to head.
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
    //method used for adding item to list
    //method inserts into head in head is null.
    //then method tranveses the list to find entry point 
    //variables are storing previous current and next element in the data in order to assign value to current variable in loop.
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
    
       
      
      
   
    //Looping throughout the list and collecting and displaying current information stored in listnode variable.
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
    


    

 
}