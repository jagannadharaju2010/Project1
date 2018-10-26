package fb;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Upload {

	public static void main(String[] args) throws Exception {
		//Workbook w = WorkbookFactory.create(new FileInputStream("./input/Book1.xlsx"));
		/*String v = w.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		System.out.println(v);
		String v1 = w.getSheet("Sheet1").getRow(2).getCell(1).getStringCellValue();
		System.out.println(v1);*/
		
		/*w.getSheet("Sheet1").getRow(1).getCell(1).setCellValue("navya");
		w.getSheet("Sheet1").getRow(2).getCell(1).setCellValue("gayatri");
		w.write(new FileOutputStream("./input/Book1.xlsx"));
		w.close();*/
		Workbook w1 = WorkbookFactory.create(new FileInputStream("./input/Book2.xlsx"));
	//String	s=w1.getSheet("Sheet2").getRow(1).getCell(1).getStringCellValue();
	w1.getSheet("Sheet1").getRow(2).getCell(2).setCellValue("Varma");
	
	w1.write(new FileOutputStream("./input/Book2.xlsx"));
	//System.out.println(s);
	}

}
