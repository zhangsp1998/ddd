package com.hz.service;

public class UserServiceImpl implements UserService {

	@Override
	public void save() {
		//模拟异常
		int a = 10/0;
		System.out.println("保存用户。。。。");
	}

	@Override
	public void edit() {
	
		System.out.println("修改用户。。。。");
		
	}

	@Override
	public void saveUser() {
		System.out.println("saveUser....");
		
	}

}
