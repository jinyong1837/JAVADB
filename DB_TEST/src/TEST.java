import java.sql.*;

public class TEST 
{
	
	public static void main(String[] args) throws ClassNotFoundException{
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        
        try {
        
        	// MySQL 드라이버 로드
            Class.forName("com.mysql.cj.jdbc.Driver");
        	
            // MySQL 연결
            String url = "jdbc:mysql://192.168.166.101:4567/madang";
            String user = "kkjjyy9808";
            String password = "wlsdyd1837##";

            conn = DriverManager.getConnection(url, user, password);
            stmt = conn.createStatement();

//            // 데이터 삽입
//            String insertQuery = "INSERT INTO Book (bookid, bookname, publisher, price) VALUES ('23', '사커노믹스','생능출판사', 15000)";
//            int rowsInserted = stmt.executeUpdate(insertQuery);
//            if (rowsInserted > 0) {
//                System.out.println("데이터가 성공적으로 삽입되었습니다.");
//            }
//
//            // 데이터 삭제
//            String deleteQuery = "DELETE FROM Book WHERE bookname = '스포츠의학'";
//            int rowsDeleted = stmt.executeUpdate(deleteQuery);
//            if (rowsDeleted > 0) {
//                System.out.println("데이터가 성공적으로 삭제되었습니다.");
//            }

            // 데이터 검색
            String selectQuery = "SELECT * FROM Book";
            rs = stmt.executeQuery(selectQuery);

            while (rs.next()) {
                System.out.println(rs.getInt(1) + " | " + rs.getString(2) + " | " + rs.getString(3) + " | " + rs.getDouble(4));
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 리소스 해제
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