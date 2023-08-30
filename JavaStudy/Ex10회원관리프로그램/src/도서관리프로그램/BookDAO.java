package 도서관리프로그램;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class BookDAO {
	
	// 데이터베이스에 접근해서 도서등록에 필요한 데이터들
	public int insert(BookVO vo) {
		int row = 0;
		Connection conn = null;
		PreparedStatement psmt = null;
		
		// 1) 드라이버 동적로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 준비물 3가지 : 주소, 아이디, 비밀번호
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "shopping";
			String db_pw = "12345";
			
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
			
			// 2) SQL문 준비
			String sql = "insert into book values(?, ?, ?, ?)";
			psmt = conn.prepareStatement(sql);
			// ?인자 채워주기
			psmt.setString(1, vo.getTitle());
			psmt.setString(2, vo.getName());
			psmt.setInt(3, vo.getPrice());
			psmt.setString(4, vo.getNum());
			
			row = psmt.executeUpdate(); // 영향을 받은 행이 있는지에대한
			// 결과값!!!!!!!!!
			
			// 3) 결과값 처리
			// 4) 자원반납
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("데이터베이스 연결 실패");
			e.printStackTrace();
		}finally {
			try {
			if (psmt != null)
				psmt.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
			
		return row; // 데이터베이스 저장 성공여부결과값 처리는
		// Controller로 보내주기
		
	}
	
	
	public ArrayList<BookVO> select() {
		
		// 테이블에 있는 책 정보들을 저장하는 가변 배열
		ArrayList<BookVO> bookList = new ArrayList<>();
		
		// executeQuery() = ResultSet
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 준비물 3가지 : 주소, 아이디, 비밀번호
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "shopping";
			String db_pw = "12345";
			
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
			
			// 2) SQL문 준비
			String sql = "select * from book";
			psmt = conn.prepareStatement(sql);
			// ?인자 채워주기
			
			rs = psmt.executeQuery(); 
			// 결과값!!!!!!!!!
			while (rs.next() ) {
				String title = rs.getString(1);
				String name = rs.getString(2);
				int price = rs.getInt(3);
				String num = rs.getString(4);
				
				BookVO vo = new BookVO(title, name, price, num);
				bookList.add(vo);
				
			}
			
			// 3) 결과값 처리
			// 4) 자원반납
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("데이터베이스 연결 실패");
			e.printStackTrace();
		}finally {
			
			try {
				if (rs != null)
					rs.close();
				if (psmt != null)
					psmt.close();
				if (conn != null)
					conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
			
		return bookList; // ArrayList<BookVO>
		
		
		
	}
	
	
	public BookVO selectOne(BookVO vo) {
		
		
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 준비물 3가지 : 주소, 아이디, 비밀번호
			
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "shopping";
			String db_pw = "12345";
			
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
			// 2) SQL문 준비
			String sql = "select * from book where title = ?";
			
			psmt = conn.prepareStatement(sql);
			// ? 인자를 채워주자
			psmt.setString(1, vo.getTitle());
			rs = psmt.executeQuery();
			
			if (rs.next()) {
				String title = rs.getString(1);
				String name = rs.getString(2);
				int price = rs.getInt(3);
				String num = rs.getString(4);
				
				vo = new BookVO(title, name, price, num);
				
			}
				
	
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
				
		return vo;
	
	}
	
	
	
	
	
}
