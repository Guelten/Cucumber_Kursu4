package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;

public class _04_ApachePOIGetAllData {
    public static void main(String[] args) throws IOException {

        String path = "src/test/java/ApachePOI/resource/ApacheExcel2.xlsx";

        FileInputStream inputStream = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(inputStream);
        Sheet sheet = workbook.getSheetAt(0);

        // calisma sayfasindaki fiziksel kullanilan toplam satir sayisini veriyor.
        int rowCount = sheet.getPhysicalNumberOfRows(); //satirSayisi  zoo.length

        for (int i=0; i<rowCount; i++) {

            Row row = sheet.getRow(i);  // i.Satır alındı

            int cellCount = row.getPhysicalNumberOfCells();  // zoo[i].length

            for (int j = 0; j < cellCount; j++) {
                Cell cell = row.getCell(j);
                System.out.print(cell+"\t");
            }

            System.out.println();

        }

        //2.ci ve kisa Yöntem

        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {

            for (int j = 0; j < sheet.getRow(i).getPhysicalNumberOfCells(); j++) {
                System.out.print(sheet.getRow(i).getCell(j)+"\t");
            }
            System.out.println();
        }

    }
}