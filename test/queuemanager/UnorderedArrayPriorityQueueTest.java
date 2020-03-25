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
public class UnorderedArrayPriorityQueueTest<T> implements PriorityQueueTest<T> {
        private Object[] storage;

    /**
     * The size of the storage array.
     */
    private int capacity;

    /**
     * The index of the last item stored.
     *
     * This is equal to the item count minus one.
     */
    private int tailIndex;
    public UnorderedArrayPriorityQueueTest() {
    }

    
    @Before
    @Override
    public void setUp() {
        int size=10;
        storage = new Object[size];
        capacity = size;
        tailIndex = -1;
    }
    


    /**
     * Test of head method, of class SortedArrayPriorityQueue.
     */
    
    @Test
    @Override
    public void testHead()  {
        Object item = "Damian";
        int priority = 1;
        System.out.println("UnsortedArray Priority Test:");
        System.out.println("testHead");
        
         storage[0] = new PriorityItem<>(item, priority);
        String expResult = "(Damian, 1)";
        String result = storage[0].toString();
       // System.out.println(expResult);
       // System.out.println(result);
            if(expResult.equals(result))
        {
            System.out.println("Passed");
            
        }
        // TODO review the generated test code and remove the default call to fail.
                else
        {
            System.out.println("Failed");
        }
        
      
    }
    @Test
    @Override
    public void testAdd() {
     Object item = "Damian";
        int priority = 1;
        System.out.println("UnsortedArray Priority Test:");
        System.out.println("testAdd");
        
         storage[0] = new PriorityItem<>(item, priority);
        String expResult = "(Damian, 1)";
        String result = storage[0].toString();
        //System.out.println(expResult);
        //System.out.println(result);
            if(expResult.equals(result))
        {
            System.out.println("Passed");
            
        }
        // TODO review the generated test code and remove the default call to fail.
                else
        {
            System.out.println("Failed");
        }   
    }
    @Test
    @Override
    public void testRemove() {
         Object item = "Damian";
        int priority = 1;
        System.out.println("UnsortedArray Priority Test:");
        System.out.println("testRemove");
        
         storage[0] = new PriorityItem<>(item, priority);
         tailIndex=tailIndex+1;
        int expResult = -1;
        int location = 0;
         for (int i = 0; i < tailIndex; i++) {
                while (((PriorityItem<T>) storage[i]).getPriority() > priority) {
                     priority = ((PriorityItem<T>) storage[i]).getPriority();
                      location =  i;                     
            }   
            }
            // System.out.println("Tailindex is "+tailIndex);
            for(int i =location; i<tailIndex;i++ )
            {
                    storage[i]=storage[i+1];
                    tailIndex = tailIndex-1;
                    
            }
            
           tailIndex=tailIndex-1; 
        
        
           
           int result = tailIndex;
            // System.out.println(result);
             if(expResult==result)  {
            System.out.println("Passed");
            
        }
        // TODO review the generated test code and remove the default call to fail.
                else
        {
            System.out.println("Failed");
        }    
      
    }
    @Test
    @Override
    public void testIsEmpty() throws NullPointerException {
         System.out.println("UnsortedArray Priority Test:");
        System.out.println("TestisEmpty");
        
       
         boolean empty = true;
        for (Object ob : storage) {
        if (ob != null) {
         empty = false;
        
  }
       
    }
        if(empty==true)
        {
            System.out.println("Passed");
            
        }
        // TODO review the generated test code and remove the default call to fail.
                else
        {
            System.out.println("Failed");
        }    
        
    }
    @Test
    @Override
    public void testToString() {
        System.out.println("UnsortedArray Priority Test:");
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

