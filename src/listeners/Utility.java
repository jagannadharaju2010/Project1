package listeners;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utility {
	public static void writeResultToExcel(String path,int passcount,int failCount,int skipCount) {
		try {
			Workbook w = WorkbookFactory.create(new FileInputStream(path));
			w.getSheet("Sheet1").getRow(1).getCell(0).setCellValue(passcount);
			w.getSheet("Sheet1").getRow(1).getCell(1).setCellValue(failCount);
			w.getSheet("Sheet1").getRow(1).getCell(2).setCellValue(skipCount);
			w.write(new FileOutputStream(path));
			w.close();
		}
		catch(Exception e){
			
		}
	}

}
