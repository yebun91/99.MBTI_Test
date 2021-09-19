package com.hanul.test;

import java.util.HashMap;

public class MemberServiceImpl implements MemberService {
	UserDAO dao = new UserDAO();
	@Override
	public boolean member_join(UserDTO vo) {
		return dao.member_join(vo);
	}
	//지금 작업중인거 ↓
	@Override
	public UserDTO member_login(HashMap<String, String> map) {
		return  dao.member_login(map);
	}

	@Override
	public boolean member_update(UserDTO vo) {
		return  dao.member_update(vo);
	}

	@Override
	public boolean member_delete(String id) {
		return dao.member_delete(id);
	}

	@Override
	public boolean member_id_check(String id) {
		return dao.member_id_check(id);
	}

	



}
