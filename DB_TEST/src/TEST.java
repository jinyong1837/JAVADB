import java.sql.*;

public class TEST 
{
	
	public static void main(String[] args) throws ClassNotFoundException{
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        
        try {
        
        	// MySQL ����̹� �ε�
            Class.forName("com.mysql.cj.jdbc.Driver");
        	
            // MySQL ����
            String url = "jdbc:mysql://192.168.166.101:4567/madang";
            String user = "kkjjyy9808";
            String password = "wlsdyd1837##";

            conn = DriverManager.getConnection(url, user, password);
            stmt = conn.createStatement();

//            // ������ ����
//            String insertQuery = "INSERT INTO Book (bookid, bookname, publisher, price) VALUES ('23', '��Ŀ��ͽ�','�������ǻ�', 15000)";
//            int rowsInserted = stmt.executeUpdate(insertQuery);
//            if (rowsInserted > 0) {
//                System.out.println("�����Ͱ� ���������� ���ԵǾ����ϴ�.");
//            }
//
//            // ������ ����
//            String deleteQuery = "DELETE FROM Book WHERE bookname = '����������'";
//            int rowsDeleted = stmt.executeUpdate(deleteQuery);
//            if (rowsDeleted > 0) {
//                System.out.println("�����Ͱ� ���������� �����Ǿ����ϴ�.");
//            }

            // ������ �˻�
            String selectQuery = "SELECT * FROM Book";
            rs = stmt.executeQuery(selectQuery);

            while (rs.next()) {
                System.out.println(rs.getInt(1) + " | " + rs.getString(2) + " | " + rs.getString(3) + " | " + rs.getDouble(4));
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // ���ҽ� ����
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}