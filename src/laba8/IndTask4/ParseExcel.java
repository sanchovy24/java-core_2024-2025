package laba8.IndTask4;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ParseExcel {
    public static void main(String[] args) {
            String filePath = "src/laba8/example/example.xlsx";

            try {
                FileInputStream inputStream = new FileInputStream(new File(filePath));
                XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
                XSSFSheet sheet = workbook.getSheet("Товары");

                if (sheet == null) {
                    System.out.println("Error: Sheet 'Товары' not found in the file.");
                    return;
                }

                for (Row row : sheet) {
                    for (Cell cell : row) {
                        System.out.print(cell.toString() + "\t");
                    }
                    System.out.println();
                }

                workbook.close();
                inputStream.close();
            } catch (IOException e) {
                System.out.println("Ошибка. Проверьте введенный путь.");
                System.out.println("Ошибка: " + e.getMessage());
            }
        }

}
