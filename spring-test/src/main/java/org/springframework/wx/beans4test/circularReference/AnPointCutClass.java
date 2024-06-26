package org.springframework.wx.beans4test.circularReference;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author wuxin
 * @date 2022/09/08 23:37:44
 */
@Aspect
@Component
public class AnPointCutClass {


	@Pointcut("execution(* org.springframework.wx.beans4test.circularReference.A.saySomething(..))")
	public  void pointCut(){

	}

	@Around("pointCut()")
	public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		System.out.println("before................................................................");
		proceedingJoinPoint.proceed();
	}



}
