package org.springframework.wx.beans4test.circularReference;

import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author wuxin
 * @date 2022/09/08 23:26:05
 */
@Component
public class B {

	@Autowired
	public A a;

//	public A getA() {
//		return a;
//	}
//
//	public void setA(A a) {
//		this.a = a;
//	}

	public void saySomething(){
		System.out.println("say something you given upon me");
	}

}
