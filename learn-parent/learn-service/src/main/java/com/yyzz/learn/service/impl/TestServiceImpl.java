package com.yyzz.learn.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yyzz.learn.dao.TestDao;
import com.yyzz.learn.service.TestService;
@Service
public class TestServiceImpl implements TestService {
	@Resource
	private TestDao testDao;

	@Override
	public int queryAll() {
		int a = testDao.queryAll();
		System.out.println(a);
		return 0;
		int q = 1;
		int a = tes;


	}

}
