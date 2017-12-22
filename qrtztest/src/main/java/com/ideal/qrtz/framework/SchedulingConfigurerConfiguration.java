package com.ideal.qrtz.framework;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;

/**
 * 
* @ClassName: SchedulingConfigurerConfiguration 
* @Description: java 线程池
* @author liyujie 
* @date 2017年12月22日 下午3:20:12 
*
 */
@Configuration
public class SchedulingConfigurerConfiguration implements SchedulingConfigurer {

	/* (non-Javadoc)
	 * @see org.springframework.scheduling.annotation.SchedulingConfigurer#configureTasks(org.springframework.scheduling.config.ScheduledTaskRegistrar)
	 */
	@Override
	public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
		ThreadPoolTaskScheduler taskScheduler = new ThreadPoolTaskScheduler();
        taskScheduler.setPoolSize(5);
        taskScheduler.initialize();
        taskRegistrar.setTaskScheduler(taskScheduler);
	}

}
