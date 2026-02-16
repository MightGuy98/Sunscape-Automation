package utilityPackageCRM;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
 
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
public class LoginUtility 
{
	 
	    public static int getRowCount(String path, String sheetName) {
	        try (FileInputStream fis = new FileInputStream(path);
	             Workbook wb = new XSSFWorkbook(fis)) {
	 
	            return wb.getSheet(sheetName).getPhysicalNumberOfRows();
	 
	        } catch (Exception e) {
	            return 0;
	        }
	    }
	 
	    public static String getCellData(String path, String sheetName, int r, int c) {
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

	    public static Object[][] getExcelData(String path, String sheetName) {
	 
	        int rows = getRowCount(path, sheetName);
	        List<Object[]> dataList = new ArrayList<>();
	 
	        for (int i = 1; i < rows; i++) { 
	 
	            String url  = getCellData(path, sheetName, i, 0);
	            String user = getCellData(path, sheetName, i, 1);
	            String pass = getCellData(path, sheetName, i, 2);
	            if (user == null || user.trim().isEmpty()) {
	                continue;
	            }
	 
	            dataList.add(new Object[] { url, user, pass });
	        }
	 
	        return dataList.toArray(new Object[0][0]);
	    }
	}

