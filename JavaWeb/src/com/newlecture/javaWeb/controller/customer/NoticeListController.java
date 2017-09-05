package com.newlecture.javaWeb.controller.customer;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.newlecture.javaWeb.dao.NoticeDao;
import com.newlecture.javaWeb.dao.jdbc.JdbcNoticeDao;
import com.newlecture.javaWeb.entity.Notice;

@WebServlet("/customer/notice-list")
public class NoticeListController extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String _title = request.getParameter("title");
		String _page = request.getParameter("p"); 
		//3가지경우
		//notice?title = aa : title="aa"
		//notice?title = 	: title=""
		//notice			: title=null
		
		int page = 1;	//미전달이된 경우 기본값
		//1page에서 넘겨 받은 경우 get
		if(_page != null && !_page.equals(""))//전달 됬을 때
			page = Integer.parseInt(_page);
				
		//int offset = (page-1)*10;
		String title = "";//기본값

		
		if(_title != null && !_title.equals(""))
			title = _title;
		
		//----------------------------------------------------------------
		//List<Notice> list = null;
		//int count = 0;
		//이 내용들은 dao에서 만들어준다.
		/*String sql = "SELECT * FROM Notice where title like ? order by regDate DESC  limit ?,10";
		String sqlCount = "SELECT COUNT(id) count FROM Notice";
		
		String url = "jdbc:mysql://211.238.142.247/newlecture?autoReconnect=true&amp;useSSL=false&characterEncoding=UTF-8";
		
		// JDBC 드라이버 로드
		try {
				Class.forName("com.mysql.jdbc.Driver");
		
				// 연결 / 인증
			    Connection con = DriverManager.getConnection(url, "sist", "cclass");
		
			    // 실행
			    PreparedStatement st = con.prepareStatement(sql);
			    st.setString(1, "%" + title + "%");
			    st.setInt(2, offset);
			    
			    
			    PreparedStatement stCount = con.prepareStatement(sqlCount);
			    ResultSet rsCount = stCount.executeQuery();
			    count = rsCount.getInt("count");
			    // 결과 가져오기
			    ResultSet rs = st.executeQuery();
			    
			    // Model => 출력된 데이터 
			    list = new ArrayList<>();
			      
			    // 결과 사용하기
			    while (rs.next()) {
			       Notice n = new Notice();
			       n.setId(rs.getString("ID"));
			       n.setTitle(rs.getString("TITLE"));
			       //..
			         
			       list.add(n);
			    }
			      rs.close();
			      st.close();
			      con.close();
						
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

		NoticeDao noticeDao = new JdbcNoticeDao();//context.getDao("noticedao");
		/*
		 * NoticeDao getDao(String key){
		 * FileInputStream fis = new fileInputStream("src/config.txt");
		 * Scanner scan = new Scanner(fis);
		 * String line = scan.newLine();
		 * String[] tokens = line.split("");
		 * 
		 * String className="";
		 * if(tokens)
		 * 
		 * }
		 * 
		 * 
		 * */
		
		request.setAttribute("list", noticeDao.getList(page,title));
		request.setAttribute("count", noticeDao.getCount());
		request.getRequestDispatcher("/WEB-INF/views/customer/notice/list.jsp").forward(request, response);
	}
}
