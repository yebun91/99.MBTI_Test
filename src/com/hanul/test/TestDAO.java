package com.hanul.test;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class TestDAO {
	
	private static SqlSessionFactory sqlmapper;
	private static SqlSession sql; 
	static {
		String resource = "data/SqlMapConfig.xml";
		try {
			InputStream inputStream = Resources.getResourceAsStream(resource);
			sqlmapper = new SqlSessionFactoryBuilder().build(inputStream);
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("마이바티스 TestSqlSessionFactory 에러");
		}
	}
	
	//문제테이블 가져오기
	public List<TestDTO> getTestList(){
		sql = sqlmapper.openSession();
		List<TestDTO> list = sql.selectList("test.mapper.test");
		return list;
	}
	
	//답 가져오기
	public List<planetDTO> getResult(){
		sql = sqlmapper.openSession();
		List<planetDTO> list = sql.selectList("test.mapper.planet");
		return list;
	}
	
}
