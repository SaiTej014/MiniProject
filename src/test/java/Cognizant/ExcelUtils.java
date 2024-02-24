package Cognizant;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	public static String[] readExcelData(String SheetName) throws IOException{
		// TODO Auto-generated method stub
		String path="C:\\Users\\2304133\\eclipse-workspace\\2304133\\TestData\\inputdata.xlsx";
		FileInputStream fi=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet(SheetName);
		XSSFRow r=ws.getRow(0);
		int c_no=r.getLastCellNum();
		String Data[]=new String[c_no];
		for(int j=0;j<c_no;j++)
		{
			Data[j]=String.valueOf(r.getCell(j));
		}
		return Data;
		
	}
	
}
