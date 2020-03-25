
package queuemanager;
//class similar to the priorityqueue class but features methods and variables to store the next idem in the list.
//Next item in list can also be set using the setNext method.
public class ListNode<T> {
    private T item;
    private final int priority;
    
    private ListNode<T> next;
    
    public ListNode(T item, int priority ,ListNode<T> next) {
        this.item = item;
         this.priority = priority;
     
        this.next = next;
    }
    
    public T getItem() {
        return item;
    }
    
    public int getPriority() {
        return priority;
    }
    
  
   
    
    public ListNode<T> getNext() {
        return next;
    }
    
     public void setNext(ListNode nextNode) {
            next = nextNode;
        }
}