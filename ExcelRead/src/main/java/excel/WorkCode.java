package excel;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WorkCode {
	  static FileInputStream f;//file read
	  static XSSFWorkbook w;//workbook read
	  static XSSFSheet s;//sheet read
		

	public static String readStringData(int row, int column) throws IOException {
		f= new FileInputStream("C:\\Users\\ashif\\Desktop\\Excelread.xlsx");
		w= new XSSFWorkbook(f);
		s= w.getSheet("Sheet1");
		Row r= s.getRow(row);
		Cell c= r.getCell(column);
		return c.getStringCellValue();

		
	}

}
