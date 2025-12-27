package com.telusko.spring_boot_rest.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ValidationAspect {

    Logger LOGGER = LoggerFactory.getLogger(ValidationAspect.class);

    @Around("execution(* com.telusko.spring_boot_rest.service.JobService.getJob(..)) && args(postId)")
    public Object validateGetJobParam(ProceedingJoinPoint jp, int postId) throws Throwable {

        if(postId<0){
            LOGGER.info("postId is negative, updating it..");
            postId =- postId;
            LOGGER.info("New value for postId = "+postId);
        }

        Object obj = jp.proceed(new Object[]{postId});
        return obj;
    }
}
