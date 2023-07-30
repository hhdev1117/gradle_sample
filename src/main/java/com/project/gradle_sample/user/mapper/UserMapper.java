package com.project.gradle_sample.user.mapper;

import com.project.gradle_sample.user.dto.UserDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

  public List<UserDto> selectUser(String id);

  public int insertUser(UserDto userDto);

}
