package com.zyd.quartz.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @Author shuxf
 * @Date 2018/4/19 17:08
 */
@SuppressWarnings("ALL")
@Service
public class MinuteJob implements Job {

    private static final Logger logger = LoggerFactory.getLogger(MinuteJob.class);

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        logger.info("JobName: {}", context.getJobDetail().getKey().getName());
    }
}
