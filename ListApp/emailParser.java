import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class emailParser {

	File innerFile;
	
	public emailParser (File outerFile) {
		innerFile = outerFile;
	}
	
	/* 
	 * 
	 * @return array with all the email data.
	 * !- current method will probably get overwritten with [re] and [Fw] values-!
	 * [0] = has data T/F
	 * [1] = Error codes
	 * [2] = From
	 * [3] = Subject
	 * [4] = Date
	 * !- [5] = Subject -!
	 */
	public Object[] getData() {
		
		Object[] someArray = new Object[5];
		
		
		try {
			Scanner emailReader = new Scanner(innerFile);
			
			while(emailReader.hasNextLine()){
				String data = emailReader.nextLine();
				
				
				if(data.startsWith("From:")) {
					someArray[2] = data;
				}
				
				if(data.startsWith("Subject:")) {
					someArray[3] = data;
				}
				
				if(data.startsWith("Date:")) {
					someArray[4] = data;
				}
			}
			
			someArray[0] = true;
			
			emailReader.close();
			
			
		} catch (FileNotFoundException e) {
			someArray[0] =  false;
			someArray[1] = "File Not Found: " + e.toString();
		} catch (Exception e) {
			someArray[0] = false;
			someArray[1] = e.toString();
		}
		
		return someArray;
		
		
		
		
	}
	
	 
}
