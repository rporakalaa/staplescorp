package Com.Staples.CommonLib;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class ExcelLib {

	String filePath = "C:\\Users\\PorRa001\\Documents\\StapleCorpp\\StapleseLocalRepositry\\Staples\\Utilites\\Data.xlsx";	
		public String getExcelData(String sheetName , int rowNum , int colNum) throws InvalidFormatException, IOException{
			FileInputStream fis = new FileInputStream(filePath);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet(sheetName);
			Row row = sh.getRow(rowNum);
			String data = row.getCell(colNum).getStringCellValue();
			return data;
		}

}
