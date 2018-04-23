package com.zyd.quartz.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author shuxf
 * @Date 2018/4/23 17:11
 */
public class Minute2Job implements Job {

    private static final Logger logger = LoggerFactory.getLogger(Minute2Job.class);

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        logger.info("JobName2: {}", context.getJobDetail().getKey().getName());
    }
}
