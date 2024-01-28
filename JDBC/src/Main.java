import java.sql.*;

public class Main {
    public static void main(String[] args) {

        try {
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "hakan", "sabanci");
            Statement stmt = conn.createStatement();

            // String sql = "INSERT INTO example_table (id, name, age) VALUES (101, 'Hakan', 32)";
            // stmt.executeUpdate(sql);

            String query = "SELECT * FROM example_table";
            ResultSet res = stmt.executeQuery(query);



            while (res.next()) {

                int id = res.getInt("id");
                String name = res.getString("name");
                int age = res.getInt("age");
                System.out.println(id + name + age);



            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}