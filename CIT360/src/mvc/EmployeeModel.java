package mvc;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


//import java.io.Serializable;
import java.util.Objects;

public class EmployeeModel {

    //class instance variables
    private String firstName;
    private String middleName;
    private String lastName;
    private Integer salary;
    private String placeOfBirth;
    
    //default constructor
    public EmployeeModel(){
        
    }
    
    //overloaded constructor
    public EmployeeModel(String firstName, String middleName, String lastName, 
            int salary, String placeOfBirth){
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.salary = salary;
        this.placeOfBirth = placeOfBirth;
    }

    //public APIs (properties)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final EmployeeModel other = (EmployeeModel) obj;
        if (!Objects.equals(this.firstName, other.firstName)) {
            return false;
        }
        if (!Objects.equals(this.middleName, other.middleName)) {
            return false;
        }
        if (!Objects.equals(this.lastName, other.lastName)) {
            return false;
        }
        if (!Objects.equals(this.placeOfBirth, other.placeOfBirth)) {
            return false;
        }
        if (!Objects.equals(this.salary, other.salary)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Student " + lastName + ", " 
                + firstName + " " 
                + (middleName != null ? middleName : "") 
                + " born on " + salary 
                + " in " + placeOfBirth;
    }
    
}
