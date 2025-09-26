package com.kh.java.pet.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kh.java.pet.model.service.PetService;
import com.kh.java.pet.model.vo.Pet;

@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	public LoginController() {
        super();
   
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String userId = request.getParameter("userId");
		String userPwd = request.getParameter("userPwd");
		
		Pet pet = new Pet();
		pet.setUserId(userId);
		pet.setUserPwd(userPwd);
		
		Pet loginPet = new PetService().login(pet);
		System.out.println(loginPet);
		
		if(loginPet != null) {
			
			// 스텝1. session의 Attribute로 사용자 정보 추가
			HttpSession session = request.getSession();
			session.setAttribute("userInfo", loginPet);
			
			// 스텝2. RequestDispatcher get 해오기
			request.getRequestDispatcher("/index.jsp").forward(request, response);
		} else {
			// 실패하면
			request.setAttribute("msg", "로그인에 실패했습니다.");
			request.getRequestDispatcher("/WEB-INF/views/common/result_page.jsp").forward(request, response);
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
