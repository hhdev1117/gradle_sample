package com.project.gradle_sample.user.service;

import com.project.gradle_sample.user.dto.UserDto;
import com.project.gradle_sample.user.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

  public static final Logger logger = LogManager.getLogger(UserService.class);

  private final UserMapper userMapper;

  public int insertUser(UserDto userDto) {
    logger.info("=============> ID : " + userDto.getId());
    logger.info("=============> NAME : " + userDto.getName());
    logger.info("=============> PASSWORD : " + userDto.getPassword());
    return 1;
  }

  public List<UserDto> selectUser(String id) {
    System.out.println("dd2");
    return userMapper.selectUser(id);
  }
}
