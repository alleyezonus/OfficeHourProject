package practice;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLOutput;

public class UnderstandingExcelConnection {

    @Test
    public void readingExcelFile() throws IOException {
        //Which file are we calling upon. Location of file
      String filepath = "UnderstandingExcelConnection.xlsx";
      // We must load our excel file as java file (bytecode)
        FileInputStream byteCodeOfExcelFile = new FileInputStream(filepath);
      // Load our workbook as a file
        Workbook workbook = WorkbookFactory.create(byteCodeOfExcelFile);
      // The sheet that we are working on
        Sheet workSheet = workbook.getSheet("Sheet1");

        // Read the Cell data of Cell 1A and Cell 1B
        // To load the cell we need the row and column reference
        // **--> as index numbers row 1 = index 0 and column A  = index 0
        //** as index numbers row 1 = index 0 and column B = index 1
        Cell cell;
         cell = workSheet.getRow(0).getCell(0);
        System.out.println(cell.toString()); // Print the first cell CELL 1A

        Cell cell2 = workSheet.getRow(0).getCell(1);
        //Print the cell 1B
        System.out.println(cell2.toString());

        Cell cell3 = workSheet.getRow(0).getCell(2); //call upon CELL 1C
        if(cell3 == null){
            System.out.println("Cell is empty");
        }else {
            System.out.println(cell3.toString());
        }


    }
}
