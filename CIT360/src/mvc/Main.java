package mvc;

	
import java.util.ArrayList;
import java.util.Iterator;

public class Main {


    private static ArrayList<EmployeeModel> employees;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            // Java Collections demo
            initializeJavaCollections();
            
            // MVC demo
            initializeMVC();
            
        } catch (Exception e) {
            System.out.println("Exception: " + e.toString() +
                                    "\nCause: " + e.getCause() +
                                    "\nMessage: " + e.getMessage());
                
                e.printStackTrace();
        }
    }
    
    public static void initializeMVC() {
        // Initialize controller
        Controller ctrl = new Controller(employees);
        ctrl.startApplication();
    }
    
    public static void initializeJavaCollections() {
        // Initialize collection
            employees = new ArrayList<>();
            initializeAndLoadEmployee();
        
            // Iterate through Students collection and print each student
            printEmployee();
            
            System.out.println();
            
            // Initialize student we need to find in the ArrayList
            EmployeeModel jackbower = new EmployeeModel("Jack", null, "Bower", 
                    65000, "Paris, France");
            
            // Loop through Students collection to find our student
            findEmployee(jackbower);
            
            System.out.println();
    }

    public static void initializeAndLoadEmployee() {
        
        // Add collection elements
        employees.add(new EmployeeModel("Jack", null, "Bower", 78000, 
                "Los Angeles, CA, United States"));
        employees.add(new EmployeeModel("Clark", "Kal-El", "Kent", 46706, 
                "Smallville, KS, United States"));
        
        EmployeeModel batman = new EmployeeModel();
        batman.setFirstName("Bruce");
        batman.setLastName("Wayne");
        batman.setSalary(65000);
        batman.setPlaceOfBirth("Gotham City, NY, United States");
        
        EmployeeModel spiderman = new EmployeeModel();
        spiderman.setFirstName("Peter");
        spiderman.setLastName("Parker");
        spiderman.setSalary(97800);
        spiderman.setPlaceOfBirth("Queens, NY, United States");
        
        employees.add(batman);
        employees.add(spiderman);
    }
    
    // Iterate through collection and print its elements
    public static void printEmployee() {
        
        Iterator<EmployeeModel> iterator = employees.iterator();
        
        while(iterator.hasNext()) {
            EmployeeModel employee = (EmployeeModel)iterator.next();
            System.out.println(employee);
        }
    }
    
    // Loop through collection and find matching elements
    public static void findEmployee(EmployeeModel employeeToFind) {
        
        for (int i = 0; i < employees.size(); i++) {
            
            EmployeeModel currentEmployee = employees.get(i);
            if (employeeToFind.equals(currentEmployee)) {
                System.out.println("Student match found...");
                System.out.println("Student " + currentEmployee.getFirstName() + 
                        currentEmployee.getLastName() +
                        " and " + employeeToFind.getFirstName() + 
                        employeeToFind.getLastName() + " are equal.");
            }
        }
    }
    
  
    
}
