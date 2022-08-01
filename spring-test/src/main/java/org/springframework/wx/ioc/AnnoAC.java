package org.springframework.wx.ioc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author wuxin
 * @date 2022/08/01 21:52:42
 */
public class AnnoAC {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(User.class);
		Object user = annotationConfigApplicationContext.getBean("user");
		User user1 = (User) user;
		((User) user).setId(1L);
		System.err.println(user1);
	}
}
