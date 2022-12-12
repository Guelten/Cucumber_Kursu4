package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _07_WriteInTheExcel {
    public static void main(String[] args) throws IOException {
        // var olan Excel e yazma islemi
        String path="src/test/java/ApachePOI/resource/WriteInTheExcelFile.xlsx";
        FileInputStream inputStream = new FileInputStream(path); //okuma modu acildi
        Workbook workbook = WorkbookFactory.create(inputStream); //exceldeki workbook hafizaya aldi
        Sheet sheet = workbook.getSheetAt(0);

        // HAFIZADA islemlere devam ediliyor.
        Row yeniSatir = sheet.createRow(0);       // hafizada satir olusturuldu 0. yerde
        Cell yeniHücre = yeniSatir.createCell(0); // hafizada yeni satirda ilk hücre olusturuldu
        yeniHücre.setCellValue("Merhaba Dünya");    // hafizada bilgi yazildi.

        for (int i = 1; i < 10; i++) {
            yeniSatir.createCell(i).setCellValue(i); //  "örnek"= Merhaba Dünya 1 2 3 4 5 6 7 8 9
        }


        // sira kaydetmeye geldi, bütün bilgiler hafizada buraya kadar, her sey WORKBOOK da
        inputStream.close(); // okuma modu, kanali kapatiliyor.


        // Yazma islemini YAZMA modunda acip öyle yapacagiz. (SAVE)
        FileOutputStream outputStream = new FileOutputStream(path);
        workbook.write(outputStream);   // workbook excel dosyasina yazildi (save) (exele yazildi)
        workbook.close();               // workbook icin ayrilan hafiza bosaltildi. (excel kapatildi)
        outputStream.close();           // yazma icin acilan kanal kapatildi. (program excel kanali kapatildi)
        System.out.println("Islem tamamlandi");



    }
}
