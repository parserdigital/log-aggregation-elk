package com.mis;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

@Component
@Slf4j
public class PeriodicLogTask {

    private static final Random random = new Random();
    private static final AtomicInteger counter = new AtomicInteger(1);

    @Scheduled(cron = "${logging.period.info}")
    public void scheduledInfoLog() {
        log.info("Event {}: The wolf {} has just eaten the sheep {}", counter.getAndIncrement(), random.nextInt(10), random.nextInt(100));
    }

    @Scheduled(cron = "${logging.period.warn}")
    public void scheduledWarnLog() {
        log.warn("Event {}: The farmer {} has just noticed the wolf {}", counter.getAndIncrement(), random.nextInt(3), random.nextInt(10));
    }

    @Scheduled(cron = "${logging.period.error}")
    public void scheduledErrorLog() {
        log.error("Event {}: The sheep {} has just escaped the wolf {}", counter.getAndIncrement(), random.nextInt(100), random.nextInt(10));
    }

}
