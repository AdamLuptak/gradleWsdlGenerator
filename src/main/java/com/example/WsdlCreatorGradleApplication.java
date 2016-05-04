package com.example;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.aop.interceptor.SimpleAsyncUncaughtExceptionHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

@SpringBootApplication
@EnableAsync
public class WsdlCreatorGradleApplication  {
	protected final Log logger = LogFactory.getLog(getClass());
	public static void main(String[] args) {
		SpringApplication.run(WsdlCreatorGradleApplication.class, args);
	}

//	@Override
//	public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
//		return (ex, method, params) -> logger.error("Uncaught async error", ex);
//
//
//	}
//
//	@Override
//	public Executor getAsyncExecutor() {
//		ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
//		taskExecutor.setMaxPoolSize(50);
//		taskExecutor.setThreadNamePrefix("LULExecutor-");
//		taskExecutor.initialize();
//		return taskExecutor;
//	}
}
