package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		while (true) {
			System.out.print("1.회원가입 2.로그인 3.회원목록 4.회원정보수정 5.회원탈퇴 6.종료 >> ");
			int menu = sc.nextInt();
			
			if (menu == 1) {
				System.out.println("======회원가입======");
				//아이디, 비밀번호, 닉네임
				System.out.print("아이디 입력 : ");
				String id = sc.next();
				System.out.print("비밀번호 입력 : ");
				String pw = sc.next();
				System.out.print("닉네임 입력 : ");
				String nick = sc.next();
				
				int cnt = 0;
				Connection conn = null;
				PreparedStatement psmt = null;
				
				
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					
					String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
					String db_id = "shopping";
					String db_pw = "12345";
					
					conn = DriverManager.getConnection(db_url, db_id, db_pw);
					
					
					
					if (conn != null) {
						System.out.println("DB연결 성공!");
					}else {
						System.out.println("DB연결 실패...");
					}
					
					String sql = "INSERT INTO MEMBER1 VALUES(?,?,?)";
					psmt = conn.prepareStatement(sql);
					
					psmt.setString(1, id);
					psmt.setString(2, pw);
					psmt.setString(3, nick);
					
					cnt = psmt.executeUpdate();
					
					
				} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
					// try 잘 실행되거나
					// 또는 중간에 catch로 넘어간다고 하더라고
					// finally에는 마지막에 반드시 넘어오게 되어있다
					// 4. 연결끊기
					// - 연결을 끊을때는 역순으로 끊어준다
					try {
						if (psmt != null) {
							psmt.close();
						}
						if (conn != null) {
							conn.close();
						}
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				if (cnt > 0) {
					System.out.println("회원가입 성공!");
				}else {
					System.out.println("회원가입 실패...");
				}
				
				
			}else if (menu == 2) {
				
			}else if (menu == 3) {
				
			}else if (menu == 4) {
				
				// 회원정보 수정
				System.out.print("비밀번호를 바꾸고 싶은 아이디 입력 >> ");
				String id = sc.next();
				
				
				
				
				
			}else if (menu == 5) {
				
			}else if (menu == 6) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else {
				System.out.println("정확한 숫자를 입력해주세요.");
			}
		}
		
		
	}

}
