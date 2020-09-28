package com.hz.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hz.service.UserService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext3.xml")
public class TestAopXml {
	@Autowired
	@Qualifier(value="userService")
	private UserService userService;
	
	@Test
	public void testName() throws Exception {
		userService.save();
	}
	
	
	@Test
	public void testName2() throws Exception {
		userService.edit();
	}

}
