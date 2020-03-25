/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuemanager;


import org.junit.Before;

import org.junit.Test;


/**
 *
 * @author Damian
 */

    
   public class PriorityItemTest {
    
    public PriorityItemTest() {
    }
    
   
    
    @Before
    public void setUp() {
    }
    

    /**
     * Test of getItem method, of class ListNode.
     */
    @Test
    public void testGetItem() {
        System.out.println("PriorityItem Test:");
        System.out.println("getItem()");
        
        PriorityItem instance= new PriorityItem("Damian",1);
        Object expResult = "Damian";
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
         System.out.println("PriorityItem Test:");
        System.out.println("GetPriority()");
        
        PriorityItem instance= new PriorityItem("Damian",1);
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
    
     @Test
    public void testToString() {
          System.out.println("Person Test:");
       System.out.println("toString()");
        PriorityItem instance;
        instance = new PriorityItem("Damian",1);
       String expResult = "(Damian, 1)";
        String result = instance.toString();
        // System.out.println(expResult);  
        //System.out.println(result);
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
    

