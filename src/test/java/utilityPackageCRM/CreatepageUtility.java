package utilityPackageCRM;



import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class CreatepageUtility 
{    
	public static int getRowCount(String path, String sheetName)
	{
		 try (FileInputStream fis = new FileInputStream(path);
		  Workbook wb = new XSSFWorkbook(fis)) 
		 {
            return wb.getSheet(sheetName).getPhysicalNumberOfRows();
         } catch (Exception e) 
		    {
		      return 0;
		    }
    }
	 public static String getCellData(String path, String sheetName, int r, int c)
	    {
	        try (FileInputStream fis = new FileInputStream(path);
	             Workbook wb = new XSSFWorkbook(fis)) {

	            Sheet sh = wb.getSheet(sheetName);
	            Row row = sh.getRow(r);
	            if (row == null) return "";

	            Cell cell = row.getCell(c);
	            if (cell == null) return "";

	            DataFormatter formatter = new DataFormatter();
	            return formatter.formatCellValue(cell);

	        } catch (Exception e) {
	            return "";
	        }
	    }
	    public static Object[][] getProjectData(String path, String sheetName) 
	    {

	        int rows = getRowCount(path, sheetName);
	        List<Object[]> dataList = new ArrayList<>();

	        for (int i = 1; i < rows; i++) { 
	        	String location    = getCellData(path, sheetName, i, 0);
	            String fname       = getCellData(path, sheetName, i, 1);
	            String lname       = getCellData(path, sheetName, i, 2);
	            String email       = getCellData(path, sheetName, i, 3);
	            String phone       = getCellData(path, sheetName, i, 4);
	            String description = getCellData(path, sheetName, i, 5);

	            if (fname == null || fname.trim().isEmpty()) {
	                continue;
	            }

	            dataList.add(new Object[] 
	            {
	            		 location,  fname, lname, email, phone,description
	            });
	        }

	        return dataList.toArray(new Object[0][0]);
	    }
}
