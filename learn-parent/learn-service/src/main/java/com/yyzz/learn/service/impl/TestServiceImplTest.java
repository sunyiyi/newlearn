package com.yyzz.learn.service.impl;


import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yyzz.learn.service.TestService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath*:spring/spring-config.xml")
public class TestServiceImplTest {
	@Resource
	private TestService testService;
	@Test
	public void testQueryAll() {
		testService.queryAll();
	}

}
