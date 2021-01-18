import java.io.File;
import java.util.Scanner;
/**
 *
 * @author Ben
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
		}
    }
    
}
