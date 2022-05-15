package com.iamtry.togetherUpdate.controller.news_ko;

import com.iamtry.togetherUpdate.controller.enums.Press;
import com.iamtry.togetherUpdate.service.RequestRss;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class DongAController {

    /**
     * 동아일보
     *
     * 정치
     * 경제
     * 사회
     * 국제
     * 문화
     * 스포츠
     * 오피니언(사설)
     * 연애
     */
    private final String DONGA_POLITICS = "https://rss.donga.com/politics.xml";
    private final String DONGA_ECONOMIC = "https://rss.donga.com/economy.xml";
    private final String DONGA_NATIONAL = "https://rss.donga.com/national.xml";
    private final String DONGA_INTERNATIONAL = "https://rss.donga.com/international.xml";
    private final String DONGA_CULTURE_LIFE = "https://rss.donga.com/culture.xml";
    private final String DONGA_SPORTS = "https://rss.donga.com/sports.xml";
    private final String DONGA_OPINION = "https://rss.donga.com/editorials.xml";
    private final String DONGA_ENTERTAINMENTS = "https://rss.joins.com/sonagi/joins_sonagi_star_list.xml";

    @Autowired
    private RequestRss requestRss;

    @GetMapping("/v1/donganews/politics")
    public void dongaPolitics() {
        log.info("### Start Scheduling dongaPolitics ###");
        long startTime = System.currentTimeMillis();
        requestRss.requestRss(DONGA_POLITICS, Press.DONGA);
        log.info("### End Scheduling dongaPolitics | Time {} ###", System.currentTimeMillis() - startTime);
    }

    @GetMapping("/v1/donganews/economy")
    public void dongaEconomy() {
        log.info("### Start Scheduling dongaEconomy ###");
        long startTime = System.currentTimeMillis();
        requestRss.requestRss(DONGA_ECONOMIC, Press.DONGA);
        log.info("### End Scheduling dongaEconomy | Time {} ###", System.currentTimeMillis() - startTime);
    }

    @GetMapping("/v1/donganews/national")
    public void dongaNational() {
        log.info("### Start Scheduling dongaNational ###");
        long startTime = System.currentTimeMillis();
        requestRss.requestRss(DONGA_NATIONAL, Press.DONGA);
        log.info("### End Scheduling dongaNational | Time {} ###", System.currentTimeMillis() - startTime);
    }

    @GetMapping("/v1/donganews/international")
    public void dongaInternational() {
        log.info("### Start Scheduling dongaInternational ###");
        long startTime = System.currentTimeMillis();
        requestRss.requestRss(DONGA_INTERNATIONAL, Press.DONGA);
        log.info("### End Scheduling dongaInternational | Time {} ###", System.currentTimeMillis() - startTime);
    }

    @GetMapping("/v1/donganews/culture")
    public void dongaCulturelife() {
        log.info("### Start Scheduling dongaInternational ###");
        long startTime = System.currentTimeMillis();
        requestRss.requestRss(DONGA_CULTURE_LIFE, Press.DONGA);
        log.info("### End Scheduling dongaInternational | Time {} ###", System.currentTimeMillis() - startTime);
    }

    @GetMapping("/v1/donganews/opinion")
    public void dongaOpinion() {
        log.info("### Start Scheduling dongaOpinion ###");
        long startTime = System.currentTimeMillis();
        requestRss.requestRss(DONGA_OPINION, Press.DONGA);
        log.info("### End Scheduling dongaOpinion | Time {} ###", System.currentTimeMillis() - startTime);
    }

    @GetMapping("/v1/donganews/sports")
    public void dongaSport() {
        log.info("### Start Scheduling dongaSport ###");
        long startTime = System.currentTimeMillis();
        requestRss.requestRss(DONGA_SPORTS, Press.DONGA);
        log.info("### End Scheduling dongaSport | Time {} ###", System.currentTimeMillis() - startTime);
    }

    @GetMapping("/v1/donganews/entertainments")
    public void dongaEntertainments() {
        log.info("### Start Scheduling dongaEntertainments ###");
        long startTime = System.currentTimeMillis();
        requestRss.requestRss(DONGA_ENTERTAINMENTS, Press.DONGA);
        log.info("### End Scheduling dongaEntertainments | Time {} ###", System.currentTimeMillis() - startTime);
    }
}
