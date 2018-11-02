package junitTest;


import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class EmployeeRunner {
   public static void main(String[] args) {
      Result result = JUnitCore.runClasses(EmployeeTestBad.class);
		
      for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
      }
      System.out.println("Test One was Succesfull: " + result.wasSuccessful());
      
      Result result2 = JUnitCore.runClasses(EmployeeTest.class);
		
      for (Failure failure2 : result2.getFailures()) {
         System.out.println(failure2.toString());
      }
      
      System.out.println("Test two was successful: " + result2.wasSuccessful());
      
   }
} 