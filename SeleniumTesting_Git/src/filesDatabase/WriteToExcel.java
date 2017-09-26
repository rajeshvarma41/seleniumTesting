//program to understand writing data to excel sheet

/*
HSSF is prefixed before the class name to indicate operations related to a Microsoft Excel 2003 file.
XSSF is prefixed before the class name to indicate operations related to a Microsoft Excel 2007 file or later.
XSSFWorkbook and HSSFWorkbook are classes which act as an Excel Workbook
HSSFSheet and XSSFSheet are classes which act as an Excel Worksheet
Row defines an Excel row
Cell defines an Excel cell addressed in reference to a row.
*/
package filesDatabase;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteToExcel {

	public static void main(String[] args) throws IOException {
		
		
		//Creating workbook object --Here as it is xlsx we are creating XSSFWorkbook otherwise if its xls we need to create HSSFWorkbook
		Workbook wb=new XSSFWorkbook(); 
		
		//Creating a sheet
		Sheet wbSheet=wb.createSheet("NameAdressSheet");
		
		//Creating a multidimensional array to supply data to sheet
		
		Object[][] dataObj= {
				{"Siddhu","Srikakulam"},  //this to be inserted in 1st row.
				{"Kishore","Calcutta"},   //this to be inserted in 2nd row.
		};
		
		System.out.println("Creating excel");
		
		
		//Storing the above data values workbook sheet
		int rowNum=0;
		for(Object[] rowObj:dataObj) {  //here we are getting row wise from multidimension array i.e each row contains multiple columns 
			rowNum=rowNum+1;            //Incrementing row
		Row row=wbSheet.createRow(rowNum);  // creating row in workbook sheet
		int colNum=0;                   
		for(Object colObj:rowObj) {
			colNum=colNum+1;            //Incrementing column
		Cell cell=row.createCell(colNum);   //creating cell for each row
		cell.setCellValue((String)colObj);;  //storing values in each cell
		
		}
		}
		
		//Create an object of File class to write xlsx file
		
		File file=new File(("C:\\TestFilesSelenium\\sampleWrite.xlsx"));
		
		//Create an object of FileOuputStream class to write into excel file
		FileOutputStream op=new FileOutputStream(file); 
		
         //Writing data from workbook to excel sheet	
		wb.write(op);
		
		System.out.println("Exel sheet created and data inserted. Now validate.");
	}

}
