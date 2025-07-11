package com.zl.mjga.repository;

import static org.jooq.generated.mjga.tables.Permission.PERMISSION;
import static org.jooq.generated.mjga.tables.Role.ROLE;
import static org.jooq.impl.DSL.*;

import com.zl.mjga.dto.PageRequestDto;
import com.zl.mjga.dto.urp.PermissionQueryDto;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.jooq.*;
import org.jooq.Record;
import org.jooq.generated.mjga.tables.daos.PermissionDao;
import org.jooq.generated.mjga.tables.pojos.Permission;
import org.jooq.impl.DSL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PermissionRepository extends PermissionDao {

  @Autowired
  public PermissionRepository(Configuration configuration) {
    super(configuration);
  }

  public Result<Record> pageFetchBy(
      PageRequestDto pageRequestDto, PermissionQueryDto permissionQueryDto) {
    return ctx()
        .select(
            asterisk(),
            permissionQueryDto.getRoleId() != null
                ? when(
                        PERMISSION.ID.in(selectRolesPermissionIds(permissionQueryDto.getRoleId())),
                        true)
                    .otherwise(false)
                    .as("is_bound")
                : noCondition(),
            DSL.count().over().as("total_permission"))
        .from(PERMISSION)
        .where(
            switch (permissionQueryDto.getBindState()) {
              case BIND ->
                  PERMISSION.ID.in(selectRolesPermissionIds(permissionQueryDto.getRoleId()));
              case UNBIND ->
                  PERMISSION.ID.notIn(selectRolesPermissionIds(permissionQueryDto.getRoleId()));
              case ALL -> noCondition();
            })
        .and(
            permissionQueryDto.getPermissionId() == null
                ? noCondition()
                : PERMISSION.ID.eq(permissionQueryDto.getPermissionId()))
        .and(
            StringUtils.isEmpty(permissionQueryDto.getPermissionName())
                ? noCondition()
                : PERMISSION.NAME.like("%" + permissionQueryDto.getPermissionName() + "%"))
        .and(
            StringUtils.isEmpty(permissionQueryDto.getPermissionName())
                ? noCondition()
                : PERMISSION.CODE.eq(permissionQueryDto.getPermissionCode()))
        .orderBy(pageRequestDto.getSortFields())
        .limit(pageRequestDto.getSize())
        .offset(pageRequestDto.getOffset())
        .fetch();
  }

  private SelectConditionStep<Record1<Long>> selectRolesPermissionIds(Long roleId) {
    return DSL.select(ROLE.permission().ID)
        .from(ROLE)
        .leftJoin(ROLE.permission())
        .where(ROLE.ID.eq(roleId));
  }

  public List<Permission> selectByPermissionIdIn(List<Long> permissionIdList) {
    return ctx()
        .selectFrom(PERMISSION)
        .where(PERMISSION.ID.in(permissionIdList))
        .fetchInto(Permission.class);
  }
}
