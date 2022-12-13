package Utilities;

import io.cucumber.java.Scenario;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class ExcelUtility {
    // kendisine verilen path deki excelin, istenilen, sheetindeki
    // istenilen kolona kadar sütunları okuyup Arraylist formatında geri döndüren fonksiyonu yazınız.
    // getListData("src/test/java/ApachePOI/resources/ApacheExcel2.xlsx","testCitizen", 2); 0-2

    public static ArrayList< ArrayList<String> > getListData(String path, String sheetName, int columnCnt)
    {
        ArrayList< ArrayList<String> > tablo = new ArrayList<>();

        Sheet sheet = null;
        try {
            FileInputStream inputStream = new FileInputStream(path);
            Workbook workbook = WorkbookFactory.create(inputStream);
            sheet = workbook.getSheet(sheetName);
        }
        catch (Exception ex)
        {
            System.out.println("ex.getMessage() = " + ex.getMessage());
        }

        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) { // bütün satirlari getiriyor

            ArrayList<String> satirData = new ArrayList<>();
            for (int j = 0; j < columnCnt; j++) {
                satirData.add(sheet.getRow(i).getCell(j).toString());
            }

            tablo.add(satirData);

        }

        return tablo;

    }

    public static void writeToExcel(String path, Scenario senaryo, String browserName, String time){

        File f=new File(path);

        if (!f.exists()){ // yok ise
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("CampusTest");
            // workbook-sheet-row-cell
            Row yeniSatir = sheet.createRow(0);

            Cell yeniHucre = yeniSatir.createCell(0);
            yeniHucre.setCellValue(senaryo.getName());

            yeniHucre = yeniSatir.createCell(1);
            yeniHucre.setCellValue(senaryo.getStatus().toString());

            yeniHucre = yeniSatir.createCell(2);
            yeniHucre.setCellValue(browserName);

            yeniHucre = yeniSatir.createCell(3);
            yeniHucre.setCellValue(time);

            // file save
            try {
                FileOutputStream outputStream = new FileOutputStream(path);
                workbook.write(outputStream);
                workbook.close();
                outputStream.close();
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
        else // var ise
        {


        }
    }


    // fonksiyonu cagirip test yapmak icin kullanacagimiz main
    public static void main(String[] args) {
        ArrayList< ArrayList<String> > tablo=
                getListData("src/test/java/ApachePOI/resource/ApacheExcel2.xlsx","testCitizen", 2);

        System.out.println("tablo = " + tablo);
    }
}
