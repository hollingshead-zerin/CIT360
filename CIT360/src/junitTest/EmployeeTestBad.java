package junitTest;

import org.junit.Test;
import static org.junit.Assert.*;

public class EmployeeTestBad {

   @Test
   public void testAssertions() {
      //test data
     String emp1 = new String ("Bilbo Baggins");
     String emp2 = new String ("Frodo Baggins");
     String emp3 = new String ("Samwise");
     String emp4 = null;
     String emp5 = "Samwise";
     String emp6 = "Samwise";
     
	 int emp1Sal = 55000;
	 int emp2Sal = 76800;
	 int emp3Sal = 0;
     
	 String[] emp1Array = {"Bilbo Baggins", "Frodo Baggins", "SamWise"};
	 String[] emp2Array = {"Bilbo Baggins", "Frodo Baggins", "SamWise"};


      //Check that two objects are equal
	  assertEquals(emp3Sal, 0);
      

      //Check that a condition is true
      assertTrue(emp2Sal > emp1Sal );

      //Check that a condition is false
      assertFalse(emp2Sal < emp1Sal);
	   
      //Check that an object isn't null
      assertNotNull(emp3);

      //Check that an object is null
	  assertNull(emp4);

      //Check if two object references point to the same object
	  assertSame(emp6, emp5);
	   
      //Check if two object references not point to the same object
	  assertNotSame(emp1,emp2);
	   
      //Check whether two arrays are equal to each other.
	  assertArrayEquals(emp1Array, emp2Array);
   }
}
