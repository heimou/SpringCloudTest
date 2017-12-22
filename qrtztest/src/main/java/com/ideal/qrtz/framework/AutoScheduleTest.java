package com.ideal.qrtz.framework;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalTime;


/**
 * 
* @ClassName: AutoScheduleTest 
* @Description: 测试调度方法 
* @author liyujie 
* @date 2017年12月22日 下午3:21:44 
*
 */

@Component
public class AutoScheduleTest {
	private static final Logger logger = LoggerFactory
			.getLogger(AutoScheduleTest.class);
	
	@Scheduled(cron="${spring.job.test.cron}")
	public void sync(){
		
		logger.info("测试自动调度任务!"+LocalTime.now());
	}
}
