package org.example;

public class EmployeeDAO {

    public void saveEmployee(Employee employee){
        System.out.println("Saved employee to the database: " + employee);
    }

    public void deleteEmployee(Employee employee){
        System.out.println("Deleted employee from the database: " + employee);
    }

}
