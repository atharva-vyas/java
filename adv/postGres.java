import java.sql.Connection;
// import java.sql.Statement;
// import java.sql.*;

public class postGres {
    public static void main(String[] args) {
        String url="jdbc:postgresql://localhost:5432/test";
        Connection conn = null;

        int rollno = 1;
        String name = "John";
        int age = 20;
        String sql = "insert into student(rollno, name, age)" + " values(" + rollno + ",'" + name + "'," + age + ")";

        try {
            conn = DriverManager.getConnection(url, "postgres", "7193");

            Statement st = conn.createStatement();
            int m = st.executeUpdate(sql);
            if (m == 1) {
                System.out.println("inserted successfully : " + sql);
            } else {
                System.out.println("insert failed");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
