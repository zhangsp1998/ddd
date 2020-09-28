package com.hz.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;


public class MyAspectXml {
	/**
	 * 模拟记录日志的功能
	 * 通知或者增强
	 * 前置通知  不管目标方法是否发生异常，它都会执行，而且是在目标方法执行之前执行
	 */
	public void log(){
		System.out.println("在执行目标方法之前，执行记录日志。。。。。");
	}
	
	
	/**
	 * 最终通知   不管目标方法是否发生异常，它都会执行,而且是在目标方法执行之后它才执行--=
	 */
	public void after(){
		System.out.println("最终通知after执行了。。。。");
	}
	
	
	//后置通知  在目标方法执行之后它才执行,但是如果目标方法发生异常，它不会执行
	public void after_returing(){
		System.out.println("后置通知after_returing执行了。。。。");
	}=
	
	//异常处理通知  只有在目标方法执行过程中，出现异常它才会得到执行
	public void after_throwing(){
		System.out.println("异常处理通知after_throwing执行了。。。。");
	}
	
	
	/**
	 * 环绕处理通知  注意  如果配置了环绕通知，默认的情况下，目标方法不会执行，需要手动让目标方法执行
	 * 不管目标方法是否发生异常，它都会执行
	 * 
	 * @throws Throwable 
	 */
	public void around_method(ProceedingJoinPoint joinPoint){
		System.out.println("环绕处理通知around_method1。。。。");
		try {
			//手动让目标方法执行
			joinPoint.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
		System.out.println("环绕处理通知around_method2。。。。");
	}
	
}
