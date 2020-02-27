package com.pdxm.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
//@ConfigurationProperties(prefix = "user")
//可以作用在类上，也可以作用在方法上，但前提必须是在spring ioc容器中
//获取properties,yml配置文件中的值，通过set方法赋值
public class UserTest {

	// 主键
	//@Value("${user.id}")
	//只能获取基本数据类型、string、date
	private Integer id;
	// 用户名
	private String username;
	// 密码
	private String password;
	// 姓名
	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
