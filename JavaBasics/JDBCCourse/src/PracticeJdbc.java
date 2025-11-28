import java.sql.*;

public class PracticeJdbc {


    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("org.postgresql.Driver");

        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/demo","postgres","abcd1234");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("Select * from student");

        rs.next();
        System.out.println(rs.getString(2));
        con.close();
    }

}
