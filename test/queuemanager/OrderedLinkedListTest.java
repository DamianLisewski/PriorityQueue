/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuemanager;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Damian
 */
public class OrderedLinkedListTest<T> implements PriorityQueueTest<T> {
       private ListNode<T> head;
         private ListNode<T> temp;
         private ListNode<T> newnode;
         
    public OrderedLinkedListTest() {
    }

    
    @Before
      @Override
    public void setUp() {
         head = null;
        temp = null;
        newnode = null;
    }
    
   

    /**
     * Test of isEmpty method, of class OrderedLinkedList.
     */
    
    @Test
    @Override
    public void testIsEmpty() {
        System.out.println("OrderedLinkedList");
        System.out.println("isEmpty");
        
        boolean expResult = true;
        if(head==null){
            
            boolean result = true;
        if(expResult==result){
           System.out.println("Passed");
        }
        // TODO review the generated test code and remove the default call to fail.
        
           
        
        else{ System.out.println("Failed");
                }
                }

        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of head method, of class OrderedLinkedList.
     */
    @Test
      @Override
    public void testHead() {
        System.out.println("OrderedLinkedList");
        System.out.println("testHead");
        Object item="Damian";
        int priority=0;
        head = new ListNode(item,priority, null);
       Object expResult = "Damian";
       Object result = head.getItem();
      // System.out.println(expResult);
      // System.out.println(result); 
      
        if(expResult==result){
           System.out.println("Passed");
       }
         
        
           
        
       else{ System.out.println("Failed");
              }
       
         
    } 

    /**
     * Test of remove method, of class OrderedLinkedList.
     */
    @Test
      @Override
    public void testRemove() {
            System.out.println("OrderedLinkedList");
        System.out.println("testRemove");
        Object item="Damian";
        int priority=1;
        head = new ListNode(item,priority, null);
       Object expResult = null;
     
       head=head.getNext();
       Object result = head;
       
        if(expResult==result){
           System.out.println("Passed");
       }
         
        
           
        
       else{ System.out.println("Failed");
              }
       
    }

    /**
     * Test of add method, of class OrderedLinkedList.
     */
    @Test
      @Override
    public void testAdd() {
        
              System.out.println("OrderedLinkedList");
        System.out.println("testAdd");
        Object item="Damian";
        int priority=1;
        head = new ListNode(item,priority, null);
       Object expResult = "Damian";
     
    
       Object result = head.getItem();
       
        if(expResult==result){
           System.out.println("Passed");
       }
         
        
           
        
       else{ System.out.println("Failed");
              }
      
    }

    /**
     * Test of toString method, of class OrderedLinkedList.
     */
    @Test
      @Override
    public void testToString() {
        System.out.println("OrderedLinkedList Test:");
        System.out.println("toString()");
        PriorityItem instance;
           Object item="Damian";
        int priority=1;
          head = new ListNode(item,priority, null);
       String expResult = "(Damian, 1)";
        String result = "("+head.getItem().toString()+", "+head.getPriority()+")";
        // System.out.println(expResult);  
       // System.out.println(result);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult == null ? result != null : !expResult.equals(result))
        {
            System.out.println("Failed");
            
        }
        // TODO review the generated test code and remove the default call to fail.
                else
        {
            System.out.println("Passed");
        }
    }
    
}
