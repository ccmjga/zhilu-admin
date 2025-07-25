package com.zl.mjga.dto.position;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class PositionUpsertDto {
  private Long id;
  @NotEmpty private String name;
  private Long parentId;
  @NotNull private Boolean enable;
}
