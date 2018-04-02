package com.whm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import com.whm.pojo.User;
@Mapper
public interface UserMapper {
		public List<User> getUser();
}
