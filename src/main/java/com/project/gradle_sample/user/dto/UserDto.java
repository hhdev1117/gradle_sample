package com.project.gradle_sample.user.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

  @Schema(description = "ID", example = "heehae1117")
  private String id;

  @Schema(description = "이름", example = "박희해")
  private String name;

  @Schema(description = "비밀번호", example = "test123")
  private String password;

}
