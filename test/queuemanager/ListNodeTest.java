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
public class ListNodeTest {
    
    public ListNodeTest() {
    }
    
   
    
    @Before
    public void setUp() {
    }
    

    /**
     * Test of getItem method, of class ListNode.
     */
    @Test
    public void testGetItem() {
        System.out.println("ListNode Test:");
        System.out.println("getItem");
        
        ListNode instance= new ListNode("Damian",1,null);
        Object expResult = instance.getItem();
        Object result = instance.getItem();
        
       // System.out.println(expResult);  
       // System.out.println(result);
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

    /**
     * Test of getPriority method, of class ListNode.
     */
    @Test
    public void testGetPriority() {
         System.out.println("ListNode Test:");
        System.out.println("GetPriority");
        
        ListNode instance= new ListNode("Damian",1,null);
        int expResult = 1;
        int result = instance.getPriority();
        
        //System.out.println(expResult);  
       // System.out.println(result);
           if(expResult!=result)
           {
               System.out.println("Failed");
               
           }
           // TODO review the generated test code and remove the default call to fail.
                else
           {
               System.out.println("Passed");
           }

       
    }

    /**
     * Test of getNext method, of class ListNode.
     */
    @Test
    public void testGetNext() {
         System.out.println("ListNode Test:");
        System.out.println("GetNext");
         ListNode next= new ListNode("Damian",1,null);
        ListNode instance= new ListNode("Damian",1,next);
        Object expResult =  next;
        Object result = instance.getNext();
        
        //System.out.println(expResult);  
        //System.out.println(result);
           if(expResult!=result)
           {
               System.out.println("Failed");
               
           }
           // TODO review the generated test code and remove the default call to fail.
                else
           {
               System.out.println("Passed");
           }
    }
    /**
     * Test of setNext method, of class ListNode.
     */
    @Test
    public void testSetNext() {
         System.out.println("ListNode Test:");
        System.out.println("setNext");
        ListNode nextNode = new ListNode("Damian",1,null); ;
        ListNode instance = new ListNode("Damian",1,null);
        instance.setNext(nextNode);
       
         Object expResult = nextNode;
        Object result = instance.getNext();
        
        //System.out.println(expResult);  
        //System.out.println(result);
           if(expResult!=result)
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
