package filesDatabase;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

//Program to understand Input and Output Streaming -- this shows both writing to file and reading to file.
//FileOutputStream class is an output stream used for writing bytes to a file and FileInputStream class is to read bytes from file
//BufferedWriter and BufferedReaderare used for effieciency purpose by providing buffer for instances.
//You can write byte-oriented as well as character-oriented data through Input Stream ,
//and OutputStream class. byte-oriented data (streams of raw bytes) such as image data, audio, video etc
/*Imp: for character-oriented data, it is preferred to use FileWriter and FileReader instead of
  FileOutputStream and FileInputStream*/  
public class FileBufferedStreamTest {

	public static void main(String[] args) throws Exception {
		//creating a file
		FileOutputStream fout=new FileOutputStream("C:\\TestFilesSelenium\\test.txt"); //note we should use double quotes for file path
		BufferedOutputStream bout=new BufferedOutputStream(fout);
		
		//Writing to file
		String s="This is testing outputting to the file";
		byte a[]=s.getBytes();  //converting to bytes as write method writes bytes only
		
		bout.write(a);  //write method takes only bytes
		bout.flush(); 
		bout.close();
		fout.close();
		System.out.println("Written to the file. check the file if seeing expected");
		
		//Reading from file
		FileInputStream fin=new FileInputStream("C:\\TestFilesSelenium\\test.txt");
		BufferedInputStream bin=new BufferedInputStream(fin);
		while(bin.read()!=-1) {  //this we can figure from method notes that it returns -1 at end of stream
			
			System.out.println((char)bin.read());  //Imp to note that this read method returns integer value only
						                           //each byte is coming in new line. Later research in how to rebuild the string
											//just looking at method description we can figure that out
		}
		   bin.close();    
		   fin.close();
		}
	}


