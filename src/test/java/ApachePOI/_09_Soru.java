package ApachePOI;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _09_Soru {
    /**
      Yeni bir excele merhaba Dünya 1 şeklinde yazdıktan sonra , programı tekrar
      çalıştırdığınızda aynı excelin bir alt satırına devam ediniz.
      Program her çalıştıkça aşağıdaki gibi olmalı
      Merhaba Dünya 1
      Merhaba Dünya 2
      Merhaba Dünya 3
       ....
       ....
       path="";
       File dosya=new File(path)

       if (dosya.exists()  // dosya var mı
     */
    public static void main(String[] args) throws IOException {

        String path="src/test/java/ApachePOI/resource/YeniExcelMerhaba.xlsx";
        File f = new File(path); // dosya kontrolü icin bir dosya degiskeni olusturuldu, sadece varlik kontrolü icin

        if (!f.exists()) // dosya yok ise
        {
            //hafizada olustur yeni oldugu icin
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("Sayfa1");

            //bilgini yaz
            Row yeniSatir = sheet.createRow(0);
            Cell yeniHucre = yeniSatir.createCell(0);
            yeniHucre.setCellValue("Merhaba Dünya 1");

            //save
            FileOutputStream outputStream = new FileOutputStream(path);
            workbook.write(outputStream);
            workbook.close();
            outputStream.close();

            System.out.println("Islem tamamlandi");

        }
        else //dosya var ise
        {
            FileInputStream inputStream = new FileInputStream(path);
            Workbook workbook = WorkbookFactory.create(inputStream);
            Sheet sheet = workbook.getSheetAt(0);

            int rowCnt = sheet.getPhysicalNumberOfRows(); // Kac tane row oldugunu aldim
            //bilgini yaz
            Row yeniSatir = sheet.createRow(rowCnt);
            Cell yeniHucre = yeniSatir.createCell(0);
            yeniHucre.setCellValue("Merhaba Dünya "+(rowCnt+1) );

            inputStream.close();

            FileOutputStream outputStream = new FileOutputStream(path);
            workbook.write(outputStream);
            outputStream.close();

            System.out.println("Islem tamamlandi varolan");
            

            // her "Run" yapildiginda yenisini ekliyecek

        }
    }
}
