package com.zl.mjga.repository;

import static org.jooq.generated.public_.Tables.*;
import static org.jooq.impl.DSL.noCondition;

import com.zl.mjga.dto.PageRequestDto;
import com.zl.mjga.dto.scheduler.QueryDto;
import org.apache.commons.lang3.StringUtils;
import org.jooq.*;
import org.jooq.Record;
import org.jooq.generated.public_.tables.daos.QrtzJobDetailsDao;
import org.jooq.impl.DSL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class QrtzJobRepository extends QrtzJobDetailsDao {

  @Autowired
  public QrtzJobRepository(Configuration configuration) {
    super(configuration);
  }

  public Result<Record> fetchPageWithJobAndTriggerBy(
      PageRequestDto pageRequestDto, QueryDto queryDto) {
    return ctx()
        .select(
            QRTZ_JOB_DETAILS.asterisk(),
            QRTZ_JOB_DETAILS.qrtzTriggers().asterisk(),
            QRTZ_JOB_DETAILS.qrtzTriggers().qrtzCronTriggers().asterisk(),
            QRTZ_JOB_DETAILS.qrtzTriggers().qrtzSimpleTriggers().asterisk(),
            DSL.count().over().as("total_job"))
        .from(QRTZ_JOB_DETAILS)
        .leftJoin(QRTZ_JOB_DETAILS.qrtzTriggers())
        .leftJoin(QRTZ_JOB_DETAILS.qrtzTriggers().qrtzCronTriggers())
        .leftJoin(QRTZ_JOB_DETAILS.qrtzTriggers().qrtzSimpleTriggers())
        .where(
            StringUtils.isNotEmpty(queryDto.name())
                ? QRTZ_JOB_DETAILS.SCHED_NAME.eq(queryDto.name())
                : noCondition())
        .orderBy(QRTZ_JOB_DETAILS.qrtzTriggers().TRIGGER_NAME)
        .limit(pageRequestDto.getSize())
        .offset(pageRequestDto.getOffset())
        .fetch();
  }
}
