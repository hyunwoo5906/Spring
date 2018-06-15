package net.skhu.mapper;

import org.apache.ibatis.annotations.Mapper;

import net.skhu.dto.User;

@Mapper
public interface UserMapper {
	User findOne(int id);

	User findByuserId(String userId);

}
