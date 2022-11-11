package com.java.sd;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SampleDAOImpl implements SampleDAO{
	
	@Autowired
	private SqlSessionTemplate mybatis;

	public String select() {
		System.out.println("다오");
		return mybatis.selectOne("mm.selectTime");
		
	}
}
