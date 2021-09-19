package com.hanul.test;

import java.io.InputStream;
import java.util.HashMap;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

//실제 작업을 하기위한 공간.
public class UserDAO implements MemberService {
	private static SqlSessionFactory sqlmapper;//연결 객체 |conn
	private static SqlSession sql; //전송과 결과를 담당하는 객체 |ps , rs
	static {
		String resource = "data/SqlMapConfig.xml";//Mybatis 설정이 있는 파일
		try {
			InputStream inputStream = Resources.getResourceAsStream(resource);
			sqlmapper = new SqlSessionFactoryBuilder().build(inputStream);
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("마이바티스 SqlSessionFactory 여기 에러");
		}
	}
	
	@Override
	public boolean member_join(UserDTO dto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public UserDTO member_login(HashMap<String, String> map) {
		sql = sqlmapper.openSession();
//		MemberVO vo = sql.selectOne("",map);
//		return vo; test.selectone
		return sql.selectOne("test.mapper.login",map);
	}

	@Override
	public boolean member_update(UserDTO dao) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean member_delete(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean member_id_check(String id) {
		// TODO Auto-generated method stub
		return false;
	}



	

}
