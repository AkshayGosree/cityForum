package com.procrastinate.city.forum.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.procrastinate.city.forum.dao.HomePageDao;
import com.procrastinate.city.forum.model.Topics;

@Service("HomePageService")
@Transactional
public class HomePageServiceImpl implements HomePageService {

	@Autowired
	private HomePageDao dao;
	
	public List<Topics> returnHome() {
		return dao.returnHome();
	}

}
