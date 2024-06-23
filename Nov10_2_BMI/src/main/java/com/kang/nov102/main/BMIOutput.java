package com.kang.nov102.main;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

/**
 * Servlet implementation class BMIOutput
 */
@WebServlet("/BMIOutput")
public class BMIOutput extends HttpServlet {
	// bmi = weight / (m로 된 height * m로 된 height)
	//	18.5 미만 : 저체중
	//	18.5 이상 : 정상
	//	25이상 : 과체중
	//	30 이상 : 경도비만
	//	35 이상 : 중등도 비만
	//	40이상 : 고도비만
	
	//	계산해서 -> html 형식으로 결과 뽑힐 수 있도록(CSS일단 필요없음)
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// cos.jar파일 필요 (webapp -> WEB-INF -> lib -> cos.jar)
		//	ㄴ webapp  -> img
		response.setCharacterEncoding("UTF-8");
		String path = request.getServletContext().getRealPath("img"); //"업로드 한 사진 담을 폴더명"
		System.out.println(path);// 확인용
		
		MultipartRequest mr = new MultipartRequest(request, path,
								30*1024*1024,"UTF-8", new DefaultFileRenamePolicy());
	
		// <input>에 담긴 내용 받아오기
		String name = mr.getParameter("name");
		double height = Double.parseDouble(mr.getParameter("height"));
		height /= 100; // height = height / 100;
		double weight = Double.parseDouble(mr.getParameter("weight"));
		double bmi = weight / (height * height);
		String result = "저체중"; // 조건문의 else에 둘 저체중은 변수 만드는 김에 미리 넣어두기
		if (bmi >= 40) {
			result ="고도비만";
		}else if (bmi >=35) {
			result ="중등도비만";
		}else if (bmi >=30) {
			result ="경도";
		}else if (bmi >=25) {
			result ="과체중";
		}else if (bmi >=18.5) {
			result ="정상";
		}
		
		String image = mr.getFilesystemName("photo");
		image = URLEncoder.encode(image,"UTF-8");
		image = image.replace(" ", "+");
		
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<head><title>Calculate BMI</title></head>");
		out.print("<body>");
		out.print("<h1>BMI 결과</h1>");
		out.printf("이름 : %s<p>",name);
		out.printf("키 : %.1fcm<p>",height*100);
		out.printf("몸무게 : %.1fkg<p>",weight);
		out.printf("BMI : %.2f<p>",bmi);
		out.printf("<h2>당신은 %s입니다</h2>",result);
		
		out.printf("<img src='img/%s'>",image);
		out.print("</body>");
		out.print("</html>");
	}

}
