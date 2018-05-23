package Com.Stapels.ExcelLib;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Calendar;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ExcelLib {

	    static String filePath = "C:\\Staples\\Staples\\Utilites\\Data.xlsx";	
		public static String getExcelData(String SheetName,String ColumnName,int rownum) throws InvalidFormatException, IOException{
			FileInputStream fin=null;
			  Workbook wb=null;
			  Sheet sh=null;
			  Row row;
			  Cell cell;
			  int colNum = 0;
			  String strCellData = null;
			  try
			  {
			   fin=new FileInputStream(filePath);
			   wb=new XSSFWorkbook(fin);
			   sh=wb.getSheet(SheetName);
			   if (sh==null) return null;
			   row=sh.getRow(0);
			   for (int c=0;c<row.getLastCellNum();c++)
			   {
			    String colName=row.getCell(c).getStringCellValue();
			    if (colName.trim().equalsIgnoreCase(ColumnName.trim()))
			    {
			     colNum=c;
			    }
			   }
			   row=sh.getRow(rownum-1);
			   cell=row.getCell(colNum);
			   
			   if (cell==null || cell.getCellType()==cell.CELL_TYPE_BLANK)
			   {
			    strCellData="";
			   }
			   else if (cell.getCellType()==cell.CELL_TYPE_STRING)
			   {
			    strCellData=cell.getStringCellValue();
			   }
			   else if (cell.getCellType()==cell.CELL_TYPE_BOOLEAN)
			   {
			    strCellData=String.valueOf(cell.getBooleanCellValue());
			   
			   }
			   else if(cell.getCellType()==cell.CELL_TYPE_NUMERIC)
			   {
			    //strCellData = String.valueOf(cell.getNumericCellValue());
			    
			    int numData=(int)cell.getNumericCellValue();
			    strCellData=String.valueOf(numData);
			   }
			   else if(cell.getCellType()==cell.CELL_TYPE_FORMULA || cell.getCellType()==cell.CELL_TYPE_NUMERIC)
			   {
			    if (HSSFDateUtil.isCellDateFormatted(cell))
			    {
			     double d=cell.getNumericCellValue();
			     Calendar cal=Calendar.getInstance();
			     cal.setTime(HSSFDateUtil.getJavaDate(d));
			     String month=String.valueOf(cal.get(Calendar.MONTH)+1);
			     String day=String.valueOf(cal.get(Calendar.DAY_OF_MONTH));
			     String year=String.valueOf(cal.get(Calendar.YEAR));
			     strCellData=month+"/"+day+"/"+year;
			    }
			    else
			    {
			     strCellData=String.valueOf(cell.getNumericCellValue());
			    }
			   }
			   else
			   {
			    strCellData="UNKNOWN";
			   }
			  }catch(Exception e)
			  {
			   e.printStackTrace();
			  }
			  finally
			  {
			   try
			   {
			    fin.close();
			    // wb.close();
			    
			   }catch(Exception e)
			   {
			    e.printStackTrace();
			   }
			  }
			  return strCellData;
			 }
			
		}
		
		


