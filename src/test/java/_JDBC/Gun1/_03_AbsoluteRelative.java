package _JDBC.Gun1;

import _JDBC.JDBCParent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _03_AbsoluteRelative extends JDBCParent {
    // next(): bulunduğu noktadan bir sonraki row
    // previous() : bulunduğu noktadan bir önceki row
    // absolute(4) : bastan itibaren 4.ROW a gider, direkt veriye ROW a gider
    // relative(4) : bulunduğu noktadan 4 sonraki ROW a gider.

    @Test
    public void test1() throws SQLException {
        ResultSet rs= statement.executeQuery("select * from film");

        rs.absolute(10); // 10.Satira git
        String title = rs.getString("title");
        System.out.println("title = " + title); // ALADDIN CALENDAR

        rs.absolute(15); // bastan itibaren 15.Satira gider.
        title=rs.getString("title");
        System.out.println("title = " + title); // ALADDIN CALENDAR

        rs.absolute(-15); // (-)sondan 15.satira git
        title=rs.getString("title");
        System.out.println("title = " + title); // WONKA SEA

        rs.absolute(10); // 10.Satira git
        title = rs.getString("title");
        System.out.println("title = " + title); // ALADDIN CALENDAR

        rs.relative(5); // en son bulundugun yerden 5 satir ileri
        title= rs.getString("title");
        System.out.println("title = " + title); // ALIEN CENTER




    }
}
