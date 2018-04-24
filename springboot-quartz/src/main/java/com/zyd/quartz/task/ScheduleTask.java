package com.zyd.quartz.task;

import org.apache.commons.lang3.time.FastDateFormat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @Author shuxf
 * @Date 2018/4/19 14:35
 */
@Service
public class ScheduleTask {

    private static final Logger logger =  LoggerFactory.getLogger(ScheduleTask.class);

    public final static long SECOND = 1 * 1000;

    FastDateFormat fdf = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss");

    @Scheduled(cron = "0/4 * * * * ?")
    public void cronJob() {
        logger.info("开始执行task定时任务");
        logger.info("[CronJob Execute]"+fdf.format(new Date()));
    }

}
