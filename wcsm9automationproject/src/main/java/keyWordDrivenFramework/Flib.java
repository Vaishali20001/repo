package keyWordDrivenFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
//it is use to store generic reusable methods
	public String readDataFromExcel(String excelPath,String sheetName,int rowcount, int i) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
	    Row row = sheet.getRow(rowcount);
	    Cell cell = row.getCell(rowcount);
	    String data = cell.getStringCellValue();
		return data;	    
	    
	}
	

	public void writeExcelData(String excelPath,String sheetName,int rowcount,int cellCount,String data) throws EncryptedDocumentException, IOException
    {
		FileInputStream fis = new FileInputStream(excelPath);	
	    Workbook wb = WorkbookFactory.create(fis);
	    Sheet sheet = wb.getSheet(sheetName);
	    Row row = sheet.createRow(rowcount);
	    Cell cell = row.createCell(cellCount);
	    cell.setCellValue(data);
	    
	  FileOutputStream fos = new FileOutputStream(excelPath);
	  wb.write(fos);	    	    
	}
	
	public int rowCount(String excelPath,String sheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		int rc = sheet.getLastRowNum();
		return rc;
		}
	
	public String readDataFromProperty(String propPath,String key) throws IOException
	{
		FileInputStream fis = new FileInputStream(propPath);
		Properties prop = new Properties();
		prop.load(fis);
		String data = prop.getProperty(key);
		return data;
		}
	
	}
