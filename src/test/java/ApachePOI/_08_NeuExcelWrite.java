package ApachePOI;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _08_NeuExcelWrite {
    public static void main(String[] args) throws IOException {

        // Workbook varolan excelin workbook u idi, bunu olusmamis bir excel icin kullanamiyor

        XSSFWorkbook workbook = new XSSFWorkbook();   // hafizada bir workbook olusturuldu  ("XSSF"= Apache nin excel adi)
        XSSFSheet sheet = workbook.createSheet("Sayfa1"); // icinde sheet olusturdu


        // HAFIZADA islemlere devam ediliyor.
        Row yeniSatir = sheet.createRow(0);       // hafizada satir olusturuldu 0. yerde
        Cell yeniHücre = yeniSatir.createCell(0); // hafizada yeni satirda ilk hücre olusturuldu
        yeniHücre.setCellValue("Merhaba Dünya");    // hafizada bilgi yazildi.

        for (int i = 1; i < 10; i++) {
            yeniSatir.createCell(i).setCellValue(i); // ("örnek"=) Merhaba Dünya 1 2 3 4 5 6 7 8 9
        }


        // Yazma islemini YAZMA modunda acip öyle yapacagiz. (SAVE)
        String path="src/test/java/ApachePOI/resource/YeniExcel.xlsx";
        FileOutputStream outputStream = new FileOutputStream(path);
        workbook.write(outputStream);   // workbook excel dosyasina yazildi (save) (exele yazildi)
        workbook.close();               // workbook icin ayrilan hafiza bosaltildi. (excel kapatildi)
        outputStream.close();           // yazma icin acilan kanal kapatildi. (program excel kanali kapatildi)
        System.out.println("Islem tamamlandi");


    }
}
