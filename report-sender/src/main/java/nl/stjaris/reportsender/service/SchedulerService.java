package nl.stjaris.reportsender.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
@EnableScheduling
public class SchedulerService {

  private final DataRetrievalService dataRetrievalService;

  @Scheduled(cron = "* * * * * *")
  public void retrieveData() {
    log.info("*** START RETRIEVING DATA ***");
    dataRetrievalService.retrieveData();
    log.info("*** FINISHED RETRIEVING DATA ***");
  }

}
