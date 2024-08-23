package test.service;

import test.dao.JoinDao;
import test.domain.RequestJoinDTO;

public class JoinService {
	
	private JoinDao dao;
	
	public JoinService() {
		dao = new JoinDao();
	}
	
	public String join(RequestJoinDTO params) {
		return dao.joinRow(params);
	}
}
