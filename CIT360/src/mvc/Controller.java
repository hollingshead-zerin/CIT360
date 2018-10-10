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
	
    private ArrayList<EmployeeModel> model;
    	
    public Controller(ArrayList<EmployeeModel> model) {
        this.model = model;
    }
    public void startApplication() {
        // Set table column names
        String col[] = {"First Name","Middle Name","Last Name", "Date of Birth", 
           "Place of Birth"};
        
        // Initialize tableModel to populate
        DefaultTableModel tableModel = new DefaultTableModel(col,0);
        
        // Populate model (array of students) to tableModel
        tableModel.addRow(col);
        
        // View the application's GUI
        EmployeeView view = new EmployeeView();
        view.jTableEmployee = new JTable(tableModel);
        view.setVisible(true);
    }
}
