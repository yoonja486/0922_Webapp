package com.kh.java.pet.model.service;

import org.apache.ibatis.session.SqlSession;

import com.kh.java.common.Template;
import com.kh.java.pet.model.dao.PetDao;
import com.kh.java.pet.model.vo.Pet;

public class PetService {

	private PetDao pd = new PetDao();
	
	public Pet login(Pet pet) {
		
		SqlSession sqlSession = Template.getSqlSession();
		
		Pet loginPet = pd.login(sqlSession, pet);
		
		sqlSession.close();
		
		return loginPet;
		
	}
	
	public int singUp() {
		
		return 0;
	}
	
}
