package org.springframework.wx.beans4test;

import org.springframework.stereotype.Component;

/**
 * @author wuxin
 * @date 2022/07/19 21:51:51
 */

@Component("wx")
public class User {

	private Long id;

	private String name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';
	}
}
