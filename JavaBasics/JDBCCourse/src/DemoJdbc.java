import java.sql.*;

public class DemoJdbc {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        /*
        *
        * import package
        * load package
        * register package
        * create connection
        * create statement
        * execute statement
        * process the result
        * close connection
        *
        * */

        Class.forName("org.postgresql.Driver");

        String url = "jdbc:postgresql://localhost:5432/demo";
        String uname = "postgres";
        String pass = "abcd1234";
//        String sql = "select sname from student where sid=1";
        String sql = "select * from student";

        Connection con = DriverManager.getConnection(url,uname,pass);
        System.out.println("Conection established...");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);

//        rs.next();
//        String name = rs.getString("sname");
//        System.out.println("Name of student: "+name);

        while(rs.next()){
            System.out.print(rs.getInt(1)+" - ");
            System.out.print(rs.getString(2)+" - ");
            System.out.println(rs.getInt(3));
        }

        while(rs.next()){
            for(int i=1; i<=rs)
        }



        con.close();
        System.out.println("Conection closed...");


    }



}
