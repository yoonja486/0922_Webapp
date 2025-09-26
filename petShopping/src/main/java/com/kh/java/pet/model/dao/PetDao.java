package com.kh.java.pet.model.dao;

import org.apache.ibatis.session.SqlSession;

import com.kh.java.pet.model.vo.Pet;

public class PetDao {

	public Pet login(SqlSession sqlSession, Pet pet) {
		
		return sqlSession.selectOne("petMapper.login", pet);
	}
	
	
	public int signUp() {
		
		return 0;
	}
	
}
