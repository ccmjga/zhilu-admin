package com.zl.mjga.dto.scheduler;

import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobTriggerDto {
  private String name;
  private String group;
  private String className;
  private Map jobDataMap;
  private String triggerName;
  private String triggerGroup;
  private String schedulerType;
  private String cronExpression;
  private long startTime;
  private long endTime;
  private long nextFireTime;
  private long previousFireTime;
  private String triggerState;
  private Map triggerJobDataMap;
}
