package com.pdxm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.pdxm.entity.User;

public interface UserMapper {

	@Select("select * from user")
	List<User> queryUserAll();
	
}
