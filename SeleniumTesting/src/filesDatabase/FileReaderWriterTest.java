package filesDatabase;
import java.io.*;

//Program to understand File Reader and File Writer
//FileWriter class is use to write character-oriented data to a file and FileReader class used to write character-oriented data to a file
public class FileReaderWriterTest {

	public static void main(String[] args) throws Exception {
		
		//creating a file
		FileWriter fw=new FileWriter("C:\\TestFilesSelenium\\test1.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		
		//writing to file.
		bw.write("This is sample data for testing");  //This adds one line to the file.
		bw.newLine();  //this adds seperator for new linw
		bw.write("This is second line"); //this add second line to the file
		bw.close();
		fw.close();
		System.out.println("Created and tezt written to file. Go to path and verify");
		
		//reading from file
		FileReader fr=new FileReader("C:\\TestFilesSelenium\\test1.txt");
		BufferedReader br=new BufferedReader(fr);
		System.out.println(br.readLine());  //this one gives only one line from the files
		
		//reading multiple lines from file
		System.out.println("Reading all lines from file");
		while(br.read()!=-1) {
			System.out.println(br.readLine());  //first letter missing while retrievin. research later
		}
	}

}
