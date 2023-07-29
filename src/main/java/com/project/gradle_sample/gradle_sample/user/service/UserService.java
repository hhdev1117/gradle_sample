package com.project.gradle_sample.gradle_sample.user.service;

import com.project.gradle_sample.gradle_sample.user.dto.UserDto;
import com.project.gradle_sample.gradle_sample.user.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

  //public static final Logger logger = LogManager.getLogger(UserService.class);

  private final UserMapper userMapper;

  public int insertUser(UserDto userDto) {
    //logger.trace("=============> ID : " + userDto.getId());
    //logger.trace("=============> NAME : " + userDto.getName());
    //logger.trace("=============> PASSWORD : " + userDto.getPassword());
    return userMapper.insertUser(userDto);
  }

  public List<UserDto> selectUser(String id) {
    System.out.println("dd2");
    return userMapper.selectUser(id);
  }
}
