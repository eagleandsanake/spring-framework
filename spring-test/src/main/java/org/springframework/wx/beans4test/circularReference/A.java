package org.springframework.wx.beans4test.circularReference;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author wuxin
 * @date 2022/09/08 23:25:57
 */

@Component
@Order(100)
public class A {

	@Autowired
	public B  b;

//	public B getB() {
//		return b;
//	}
//
//	public void setB(B b) {
//		this.b = b;
//	}

	public void saySomething(){
//		System.out.println("say something you given upon me");
		b.saySomething();
	}



}
