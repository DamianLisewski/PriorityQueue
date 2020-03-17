package queuemanager;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.Node;


public class UnorderedLinkedList<T> implements PriorityQueue<T> {
    private ListNode<T> head;
    private ListNode<T> temp;
    
     
    public UnorderedLinkedList() {
        head = null;
        temp = null;
        
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
        else
                {
                    
    ListNode previous = head;
    ListNode current = head;
    ListNode temp = head;

    // Continue iterating till we reach the end of the list.
    for (ListNode<T> node = head; node != null; node = node.getNext()) {

      if (current.getPriority()< head.getPriority()) {
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
     head = previous.getNext();
             
       
      
}

        
         
        }
          
  
    
        
        
        
        
        
    
    
     
   @Override
   public void add(T item, int priority)
   {
    if (head == null) {
            head = new ListNode(item,priority,null);
        } else {
            temp = new ListNode(item,priority,head);
            head = temp.getNext();
            head = temp;
        }
    

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