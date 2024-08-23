package test.dao;

import test.domain.RequestJoinDTO;

public class JoinDao {
	
	public String joinRow(RequestJoinDTO params) {
		
		System.out.println("debug >>> 회원가입 데이터: " + params);
		
		
		return "회원가입 완료되었습니다";
	}
}
