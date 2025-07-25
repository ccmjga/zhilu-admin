package com.zl.mjga.dto.urp;

import com.zl.mjga.model.urp.BindState;
import java.util.List;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PermissionQueryDto {

  private Long roleId;
  private Long permissionId;
  private String permissionCode;
  private String permissionName;
  private List<Long> permissionIdList;
  private BindState bindState = BindState.ALL;
}
