//import java.io.File;
//import java.util.Scanner;
import java.awt.event.*;
import java.awt.*;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
/**
 *
 * @author Ben
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    public Main (){
        // Create Frame and Panel to work on
        JFrame MainMenuFrame = new JFrame();
        JPanel panelLeft = new JPanel();
        JPanel topPanel = new JPanel();
        
        String[] columnNames = {
            "Priority",
            "Name",
            "Subject", 
            "Email"
        };
        
        Object[][] data = {
            {"1", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", "3", "4"},
            {"1", "2", "3", "4"}
        };
        
        JTable taskTable = new JTable(data, columnNames);
        JScrollPane centerPanel = new JScrollPane(taskTable);
        taskTable.setFillsViewportHeight(true);
        
        //Button initialization
        JButton NewTaskButton = new JButton("New Task");
        NewTaskButton.addActionListener((ActionEvent e) -> {
            System.out.println("The button is pressed, Gondor calls for Aid!");
        });
        
        panelLeft.add(NewTaskButton);
        
        
        MainMenuFrame.add(topPanel, BorderLayout.PAGE_START);
        MainMenuFrame.add(panelLeft, BorderLayout.LINE_START);
        MainMenuFrame.add(centerPanel, BorderLayout.CENTER);     
        MainMenuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Future setting to minimize to taskbar
        MainMenuFrame.setTitle("TaskMaster");
        MainMenuFrame.pack();
        MainMenuFrame.setVisible(true);
        
    }
    
    public static void main(String[] args) {
        new Main();
        
//        String[] emailList = {"name@mail.com"};
//        
//        Task myfirstTask = new Task("Email Blue about updated field", 1, "This is a description of the task that needs to be completed", emailList);
//        System.out.println(myfirstTask.getTaskPriority());
//        System.out.println(myfirstTask.getTaskName());
//        
//        for (int i = 0; i < emailList.length; i++){
//            System.out.println(emailList[i]);
//        }
//        
        /*
            // Will need to replace this with GUI that takes drag and drop files
		File myEmailFile = new File("Filename.eml");
		
		//Personal Parser... Might want to end up using a library for this
		emailParser parse = new emailParser(myEmailFile);
		
		Object[] myParsedObject = parse.getData();
		
		
		if (myParsedObject[0].equals(true)) {
			//Continue to creating a task and submit to database
			Scanner input = new Scanner(System.in);
			
			//Should display the current data and ask the user if they want to edit anything. Easier when we get a GUI I believe...
			
			System.out.println("What is the priority for this task?");
			int requestedPriority = input.nextInt();
			
			 //[2] = From ... need to parse out first part of all these parameters
			 //[3] = Subject
			 //[4] = Date
			
			System.out.println(myParsedObject[2].toString());
			//task myNewTask = new task(myParsedObject[3].toString(), requestedPriority, myParsedObject[3].toString(), args);
			
			System.out.println("Time to go!");
		}
		else {
			//When we make the GUI, this will prompt the user to re-try with a correct file...
			System.out.println(myParsedObject[0].toString() + " " + myParsedObject[1].toString() + " bummer...");
                        System.out.println(System.getProperty("user.dir"));
		}**/
    }
    
}
