package BatchTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenTesting {
	public static void main(String[] args)  {
		XSSFWorkbook ExcelWBook=null;
		XSSFSheet ExcelWSheet;
		//XSSFRow Row;
		//XSSFCell Cell;
		
		//Create an object of File Class to open file
		File excelFile=new File("C:\\Users\\himan\\OneDrive\\Desktop\\TestData.xlsx");
		FileInputStream inputStream=null;
		
		//Create an object of FileInputStream to read data from file
	
			try {
				inputStream=new FileInputStream(excelFile);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			    

		
		//create object of XSSFworkbook to handle xlsx file
		try {
			ExcelWBook=new XSSFWorkbook(inputStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//to access workbook sheet
		ExcelWSheet=ExcelWBook.getSheetAt(0);
		
		//get total row count
		int ttlRows=ExcelWSheet.getLastRowNum()+1;
		
		//get total column count
		int ttlCells=ExcelWSheet.getRow(0).getLastCellNum();
		
		for(int CurrentRow=0;CurrentRow<ttlRows;CurrentRow++) {
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.saucedemo.com");
			driver.findElement(By.id("user-name")).sendKeys(ExcelWSheet.getRow(CurrentRow).getCell(0).toString());
			driver.findElement(By.id("password")).sendKeys(ExcelWSheet.getRow(CurrentRow).getCell(1).toString());
			driver.findElement(By.id("login-button")).click();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//			for (int CurrentCell=0;CurrentCell<ttlCells;CurrentCell++) {
//				String data=ExcelWSheet.getRow(CurrentRow).getCell(CurrentCell).toString();
//				System.out.print(data);
//				System.out.print("  ");
//			}
//			
			System.out.println();
			
		}

		try {
			ExcelWBook.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//getStringCellValue--for fetching string type of data
	//getNumericCellValue--for fetching numeric type of data
	//getBooleanCellValue--for fetching boolean type of value
	//toString --converts data into string
	
	}

