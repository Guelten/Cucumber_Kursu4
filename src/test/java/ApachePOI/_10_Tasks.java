package ApachePOI;

import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.*;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _10_Tasks {
    /**  Soru 1:
     *  yeni excel
     *  Çarpım tablosunu excele yazdırınız.
     *  1 x 1 = 1 şeklinde işaretleri de yazdırınız.
     *  sıfırdan excel oluşturarak.
     *  her bir onluktan sonra 1 satır boşluk bırakarak alt alata
     */

    /**  Soru 2:
     * yeni excel
     *  Çarpım tablosunu excele yazdırınız.
     *  1 x 1 = 1 şeklinde işaretleri de yazdırınız.
     *  sıfırdan excel oluşturarak.
     *  her bir onluktan sonra 1 kolon boşluk bırakarak yan yana
     */

    public static void main(String[] args) throws IOException {

        String path="src/test/java/ApachePOI/resource/Carpimtaplosu.xlsx";
        FileOutputStream outputStream = new FileOutputStream(path);

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Sayfa1");

        XSSFRow row=sheet.createRow(0);
        XSSFCell cell=row.createCell(0);


        XSSFCellStyle style=workbook.createCellStyle();
        style.setFillForegroundColor(IndexedColors.TURQUOISE.getIndex());
        style.setFillPattern(FillPatternType.FINE_DOTS);

        cell.setCellValue("Welcome");
        cell.setCellStyle(style);

        for (int i = 0; i < 10; i++) {
            row.createCell(i).setCellValue(i);

        }


        workbook.write(outputStream);
        workbook.close();
        outputStream.close();
        System.out.println("Islem tamamlandi");

    }
}
