package com.project.gradle_sample.user.controller;

import com.project.gradle_sample.user.dto.UserDto;
import com.project.gradle_sample.user.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
@Slf4j
public class UserController {

  private final UserService userService;

  @PostMapping("/add")
  @Operation(summary = "회원등록", description = "회원등록 API입니다.")
  @Parameter(name = "userDTO", description = "입력 파라미터", in = ParameterIn.QUERY)
  public int insertUser(@RequestBody UserDto userDTO) {
    int resultCount = userService.insertUser(userDTO);

    return resultCount;
  }

  @GetMapping("/get")
  @Operation(summary = "회원조회", description = "회원조회 API입니다.")
  public List<UserDto> selectUser(@ModelAttribute UserDto userDTO) {
    List<UserDto> resultList = userService.selectUser(userDTO.getId());

    return null;
  }
}
