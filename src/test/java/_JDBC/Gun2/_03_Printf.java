package _JDBC.Gun2;

public class _03_Printf {
    public static void main(String[] args) {

        // printf

        int a=2343;
        double pi=3.14565656565;
        String isim="Gülten Campinari";
        char basHarf='G';

        System.out.printf("%5d", a ); // a yi 5 hane icinde ondalik sistemde getirir
        // virgülden önceki bölüm format
        // virgülden sonraki bölüm datalari temsil ediyor
        System.out.println("Merhaba"); // sonuc : _2343

        System.out.printf("%-5d", a ); // sola dayali
        System.out.println("Merhaba"); // sonuc : 2343 Merhaba

        System.out.printf("%-5d %6.2f \n", a, pi ); // sonuc : 2343    3.15
        // %6.2f : taplamda noktadan sonrasi dahil
        // 6 hane kullan noktadan 2 hane kullan
        System.out.printf("%-5d %6.2f %20s \n", a, pi, isim); // sonuc : 2343    3.15     Gülten Campinari

        System.out.printf("%-6.1f",pi); // sonuc : 3.1   Merhaba
        System.out.println("Merhaba");
    }
}
