package mvc;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.lang.reflect.Array;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Controller {
	
    public ArrayList<EmployeeModel> model;
    	
    public Controller(ArrayList<EmployeeModel> model) {
        this.model = model;
    }
    public void startApplication() {
        // Set table column names
        String col[] = {"First Name","Middle Name","Last Name", "Salary", 
           "Place of Birth"};
        
        // Initialize tableModel to populate
        DefaultTableModel Tablemodel = new DefaultTableModel(col,0);
        
        // Populate model (array of students) to tableModel
        Object rowData[] = new Object[5];
        for (int i = 0; i < model.size(); i++) {
            rowData[0] = model.get(i).getFirstName();
            rowData[1] = model.get(i).getMiddleName();
            rowData[2] = model.get(i).getLastName();
            rowData[3] = model.get(i).getSalary();
            rowData[4] = model.get(i).getPlaceOfBirth();
            Tablemodel.addRow(rowData);
        }
        
        // View the application's GUI
        EmployeeView view = new EmployeeView();
        view.jTableEmployee.setModel(Tablemodel);
        view.setVisible(true);
        
     
    }
}
