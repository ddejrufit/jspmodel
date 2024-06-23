package com.kang.nov141.bmi;

import java.awt.Image;
import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

public class Model {
	public static void calculate(HttpServletRequest request) {
		try {
			String path = request.getServletContext().getRealPath("img");
			System.out.println(path);
			
//			String name = request.getParameter("name");	// 사진 없을때
			
			MultipartRequest mr = new MultipartRequest(request, path,
					30*1024*1024,"UTF-8",
					new DefaultFileRenamePolicy());
			
			String name = mr.getParameter("name");  // input name 부분 받아오기
			double height = Double.parseDouble(mr.getParameter("height"));
			double weight = Double.parseDouble(mr.getParameter("weight"));
			height /= 100;
			double bmi = weight / (height * height);
			
			String result = "저체중";
			if (bmi >= 40) {
				result = "고도비만";
			}else if (bmi >= 35) {
				result = "중등도비만";
			}else if (bmi >= 30) {
				result = "경도비만";
			}else if (bmi >= 25) {
				result = "과체중";
			}else if (bmi >= 18.5) {
				result = "정상";
			}
			
			height *= 100;
			//	height, weight, bmi => double
			String height3 = String.format("%.2f", height);
			double height2 = Double.parseDouble(height3);
			
			String weight3 = String.format("%.2f", weight);
			double weight2 = Double.parseDouble(weight3);		
			
			String bmi3 = String.format("%.2f", bmi);
			double bmi2 = Double.parseDouble(bmi3);
			
			String iamge = mr.getFilesystemName("photo");
			image = URLEncoder.encode(image,"UTF-8");
			image = image.replace("+"," ");
			
			// model에서 만든 값은 setAttribute
//			request.setAttribute("name", name);
//			request.setAttribute("height", height2);
//			request.setAttribute("weight", weight2);
//			request.setAttribute("bmi", bmi2);
//			request.setAttribute("result", result);
//			request.setAttribute("image", image);
			
			Guest g = new Guest(name, height2, weight2, bmi2, result, iamge);
			request.setAttribute("g", g);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
