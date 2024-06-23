package com.kang.nov081.main;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

@WebServlet("/Output")
public class Output extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		request.setCharacterEncoding("UTF-8"); //파일 업로드 할 때 처리!
		response.setCharacterEncoding("UTF-8");
//		String title = request.getParameter("title");// 파일 업로드때는 다른 방법!
		
		// 파일 업로드
		
		// 파일이 없로드 될 서버상 폴더의 절대경로 위치
		String path = request.getServletContext().getRealPath("img");
		
		System.out.println(path);
	
		//  파일 업로드 준비 -cos.jar활용
		//	import com.oreilly.servlet.MultipartRequest;
		MultipartRequest mr = new MultipartRequest(
				request, path,
				10*1024*1024,// 허용할 파일의 최대크기(byte)
				"UTF-8",//요청 파라미터 인코딩 방식(위에서 지운거 여기서 해결)
				// client가 업로드한 파일명이 중복될 경우가 생김
				// 파일명 중복을 자동으로 처리
				// ㄴ 중복시 나중에 업로드한 파일명 뒤에 숫자를 붙이는 방식
				// ㄴ a.png , a1.png, ...
				new DefaultFileRenamePolicy()
				);
	
		//파라미터 읽기
//		String t = request.getParameter("title"); // 기존꺼
		String t = mr.getParameter("title");
		
		//업로드한 파일의 파일명
		String fileName = mr.getFilesystemName("photo");
		// DB에 파일명만 저장 -> 용량을 여유있게 만드는 것을 추천!!
		// f_name varchar2(200 char)
		
		// 그 이유 : Tomcat이 한글로 된 파일명은 인식 못함
		// ㅋ.png -> %2A.png
		// 내 사진.png -> %2A+%2E...
		fileName = URLEncoder.encode(fileName,"UTF-8");
		fileName = fileName.replace(" ", "+");
		
		String fileName2 = mr.getFilesystemName("etc");
		fileName2 = URLEncoder.encode(fileName2,"UTF-8");
		fileName2 = fileName2.replace(" ", "+");
		
		PrintWriter pw = response.getWriter();
		pw.print("<html>");
		pw.print("<head><title>파일업로드</title></head>");
		pw.print("<body>");
		pw.printf("<h1>제목 : %s</h1>",t);
		pw.printf("<h2>파일명 : %s</h2>",fileName);
		pw.printf("<img src='img/%s'><br>",fileName);
		pw.printf("<a href = 'img/%s'>다운받기</a>",fileName2);
		pw.print("</body>");
		pw.print("</html>");
		
	}

}
