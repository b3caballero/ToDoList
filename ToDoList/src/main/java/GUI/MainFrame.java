/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.SwingConstants;

/**
 *
 * @author Ben
 */
public class MainFrame implements ActionListener{
    public MainFrame (){
        // Create Frame and Panels to hold items
        JFrame MainMenuFrame = new JFrame();
        JPanel panelLeft = new JPanel();
        JPanel topPanel = new JPanel();
        JScrollPane centerPanel = new JScrollPane();        
        
        //Table to display the rows of tasks
        String[] columnNames = {
            "Priority",
            "Name",
            "Subject", 
            "Email"
        };
        
        Object[][] data = {
            {"1", "2", "3", "4"},
            {"1", "2", "3", "4"}
        };
        
        JTable taskTable = new JTable(data, columnNames);
        centerPanel.add(taskTable);
        taskTable.setFillsViewportHeight(true);
        
        //Creating a Menu to utilize higher function
        BoxLayout box = new BoxLayout(topPanel, BoxLayout.X_AXIS);
        topPanel.setLayout(box);
        
        JMenuBar mainMenu = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenuItem newTask = new JMenuItem("New Task");       
        JMenuItem completeTask = new JMenuItem("Complete Task");
        JMenuItem deleteTask = new JMenuItem("Delete Task");
        JMenuItem exitProgram = new JMenuItem("Exit"); 

        //When clicked do...
        newTask.addActionListener((ActionEvent e) -> {
            System.out.println("Create a new task");
        });
        completeTask.addActionListener((ActionEvent e) -> {
            System.out.println("Mark task as complete");
        });
        deleteTask.addActionListener((ActionEvent e) -> {
            System.out.println("Delete a task");
        });
        exitProgram.addActionListener((ActionEvent e) -> {
            System.out.println("Close the program");
        });
        
        file.add(newTask);
        file.add(completeTask);       
        file.add(deleteTask);
        file.addSeparator();                
        file.add(exitProgram);
        
        JMenu view = new JMenu("View");
        JMenuItem currentTasks = new JMenuItem("Current Tasks");
        JMenuItem completedTasks = new JMenuItem("Completed Tasks");
        JMenuItem deletedTasks = new JMenuItem("Deleted Tasks");
        
        view.add(currentTasks);
        view.add(completedTasks);
        view.add(deletedTasks);
        
        mainMenu.add(file);
        mainMenu.add(view);
        
        //Add the Menu to the panel
        topPanel.add(mainMenu);
        
        //Button initialization
        JButton newTaskBttn = new JButton("New Task");
        JButton completeBttn = new JButton("Complete Task");
        
        
        newTaskBttn.addActionListener((ActionEvent e) -> {
            System.out.println("New Task Button");
        });
        
        completeBttn.addActionListener((ActionEvent e) -> {
            System.out.println("Complete button pressed.");
        });
        
        panelLeft.add(newTaskBttn);
        panelLeft.add(completeBttn);
        
        MainMenuFrame.add(topPanel, BorderLayout.PAGE_START);
        MainMenuFrame.add(panelLeft, BorderLayout.LINE_START);
        MainMenuFrame.add(centerPanel, BorderLayout.CENTER);     
        MainMenuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Future setting to minimize to taskbar
        MainMenuFrame.setTitle("TaskMaster");
        MainMenuFrame.pack();
        MainMenuFrame.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
