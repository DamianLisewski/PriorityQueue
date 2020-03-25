/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuemanager;


import org.junit.Before;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Damian
 */
public class PersonTest {
   
    public PersonTest() {
       
    }
    
    
    
    @Before
    public void setUp() {
    }
    
   

    /**
     * Test of getName method, of class Person.
    
     */
    @Test
    public void testGetName() {
            System.out.println("Person Test:");
         System.out.println("GetName()");
        Person instance;
        instance = new Person("Damian");
        String expResult = "Damian";
        String result = instance.getName();
        
        ///System.out.println(result);
        //System.out.println(expResult);
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

    
     //* Test of toString method, of class Person.
     
    @Test
    public void testToString() {
          System.out.println("Person Test:");
       System.out.println("toString()");
        Person instance;
        instance = new Person("Damian");
       String expResult = "Damian";
        String result = instance.toString();
        assertEquals(expResult, result);
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
