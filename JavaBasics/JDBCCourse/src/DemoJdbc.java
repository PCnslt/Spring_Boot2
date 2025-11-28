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
//        String sql = "select * from student";
//        String sql = "insert into student values (2,'Anna',75)";
//        String sql = "update student set sname='Larry' where sid=2";
//        String sql = "delete from student where sid=1";
        String sql = "insert into student values (?,?,?)";

        Connection con = DriverManager.getConnection(url,uname,pass);
        System.out.println("Conection established...");
//        Statement st = con.createStatement();
        PreparedStatement st = con.prepareStatement(sql);
        st.setInt(1,1);
        st.setString(2, "Shawn");
        st.setInt(3,75);

        System.out.println(st.execute());

//        ResultSet rs = st.executeQuery(sql);
//        boolean rs = st.execute(sql);

//        System.out.println(rs);

//        rs.next();
//        String name = rs.getString("sname");
//        System.out.println("Name of student: "+name);

//        while(rs.next()){
//            System.out.print(rs.getInt(1)+" - ");
//            System.out.print(rs.getString(2)+" - ");
//            System.out.println(rs.getInt(3));
//        }




        con.close();
        System.out.println("Conection closed...");


    }



}
