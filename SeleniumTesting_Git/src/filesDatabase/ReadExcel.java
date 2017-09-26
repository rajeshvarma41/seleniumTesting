//Program to understand reading data from excel files.
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
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ReadExcel {

	public static void main(String[] args) throws IOException {
	 //Create an object of File class to open xlsx file
	 File file=new File("C:\\TestFilesSelenium\\sample.xlsx");
	 
	 //Create an object of FileInputStream class to read excel file
	 FileInputStream ip=new FileInputStream(file);
	 
	 //creating workbook object --Here as it is xlsx we are creating XSSFWorkbook otherwise if its xls we need to create HSSFWorkbook
	 Workbook wb=new XSSFWorkbook(ip);

	 //Readsheet inside the worksheet by its name
	 Sheet wbSheet = wb.getSheet("Sheet1");
	 
	 Iterator<Row> rowItr= wbSheet.iterator();  //this interator to traverse rows
	 while(rowItr.hasNext()) {
		Row currentRow=rowItr.next();                  //Row defines an excel row
		Iterator<Cell> cellItr=currentRow.iterator();      //his iterator to traverse cells in current row
		while(cellItr.hasNext()) {          
			Cell currentCell=cellItr.next();           //Cell defines an excel cell
			System.out.print(currentCell.getStringCellValue()+"--");  //here we used print instead of println so columns are printed in same line
		}
		System.out.println();
	 }
	 
	}

}
