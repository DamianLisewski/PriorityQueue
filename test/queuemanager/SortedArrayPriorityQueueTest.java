
package queuemanager;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Damian
 * @param <T>
 */
public class SortedArrayPriorityQueueTest<T> implements PriorityQueueTest<T> {
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
    public SortedArrayPriorityQueueTest() {
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
        System.out.println("SortedArray Priority Test:");
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
        System.out.println("SortedArray Priority Test:");
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

    @Override
    public void testRemove() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Test
    @Override
    public void testIsEmpty() throws NullPointerException {
         System.out.println("SortedArray Priority Test:");
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
        System.out.println("SortedArray Priority Test:");
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
