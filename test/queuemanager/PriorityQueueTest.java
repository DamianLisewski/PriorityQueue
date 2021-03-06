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
public interface PriorityQueueTest<T> {
    
  
    

    

    
    @Before
    public abstract void setUp(); 
    
    


    /**
     * Test of add method, of class PriorityQueue.
     */
    @Test
    public abstract void testAdd(); 
 
    

    /**
     * Test of head method, of class PriorityQueue.
     */
    @Test
    public abstract void testHead(); 
      
    

    /**
     * Test of remove method, of class PriorityQueue.
     */
    @Test
    public abstract void testRemove(); 

    /**
     * Test of isEmpty method, of class PriorityQueue.
     */
    @Test
    public abstract void testIsEmpty();

    /**
     * Test of toString method, of class PriorityQueue.
     */
    @Test
    public abstract void testToString();

   
}
