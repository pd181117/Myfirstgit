package com.pdxm.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.pdxm.entity.UserTest;

@Configuration//相当于allication-mapper.xml...
@Import({UserTest.class})//<import resource="xxx.xml">
public class UserConfig {

	@Bean//相当于<bean class="com.pdxm.entity.User"></bean>
	public UserTest getUser() {
		return new UserTest();
	}
}
