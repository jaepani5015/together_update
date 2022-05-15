package com.iamtry.togetherUpdate.controller.news_ko;

import com.iamtry.togetherUpdate.controller.enums.Press;
import com.iamtry.togetherUpdate.service.RequestRss;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HankyorehController {

    /**
     * 경향신문
     *
     * 정치
     * 경제
     * 사회
     * 국제
     * 문화
     * 스포츠
     * 오피니언(사설)
     */
    private final String HANKYOREH_POLITICS = "https://www.hani.co.kr/rss/politics";
    private final String HANKYOREH_ECONOMIC = "https://www.hani.co.kr/rss/economy";
    private final String HANKYOREH_NATIONAL = "https://www.hani.co.kr/rss/society";
    private final String HANKYOREH_INTERNATIONAL = "https://www.hani.co.kr/rss/international";
    private final String HANKYOREH_CULTURE = "https://www.hani.co.kr/rss/culture/";
    private final String HANKYOREH_SPORTS = "https://www.hani.co.kr/rss/sports";
    private final String HANKYOREH_OPINION = "https://www.hani.co.kr/rss/opinion";

    @Autowired
    private RequestRss requestRss;

    @GetMapping("/v1/hankyorehnews/politics")
    public void hankyorehPolitics() {
        log.info("### Start Scheduling hankyorehPolitics ###");
        long startTime = System.currentTimeMillis();
        requestRss.requestRss(HANKYOREH_POLITICS, Press.HANKYOREH);
        log.info("### End Scheduling hankyorehPolitics | Time {} ###", System.currentTimeMillis() - startTime);
    }

    @GetMapping("/v1/hankyorehnews/economy")
    public void hankyorehEconomy() {
        log.info("### Start Scheduling hankyorehEconomy ###");
        long startTime = System.currentTimeMillis();
        requestRss.requestRss(HANKYOREH_ECONOMIC, Press.HANKYOREH);
        log.info("### End Scheduling hankyorehEconomy | Time {} ###", System.currentTimeMillis() - startTime);
    }

    @GetMapping("/v1/hankyorehnews/national")
    public void hankyorehNational() {
        log.info("### Start Scheduling hankyorehNational ###");
        long startTime = System.currentTimeMillis();
        requestRss.requestRss(HANKYOREH_NATIONAL, Press.HANKYOREH);
        log.info("### End Scheduling hankyorehNational | Time {} ###", System.currentTimeMillis() - startTime);
    }

    @GetMapping("/v1/hankyorehnews/international")
    public void hankyorehInternational() {
        log.info("### Start Scheduling hankyorehInternational ###");
        long startTime = System.currentTimeMillis();
        requestRss.requestRss(HANKYOREH_INTERNATIONAL, Press.HANKYOREH);
        log.info("### End Scheduling hankyorehInternational | Time {} ###", System.currentTimeMillis() - startTime);
    }

    @GetMapping("/v1/hankyorehnews/culture")
    public void hankyorehCulture() {
        log.info("### Start Scheduling hankyorehCulture ###");
        long startTime = System.currentTimeMillis();
        requestRss.requestRss(HANKYOREH_CULTURE, Press.HANKYOREH);
        log.info("### End Scheduling hankyorehCulture | Time {} ###", System.currentTimeMillis() - startTime);
    }

    @GetMapping("/v1/hankyorehnews/opinion")
    public void hankyorehOpinion() {
        log.info("### Start Scheduling hankyorehOpinion ###");
        long startTime = System.currentTimeMillis();
        requestRss.requestRss(HANKYOREH_OPINION, Press.HANKYOREH);
        log.info("### End Scheduling hankyorehOpinion | Time {} ###", System.currentTimeMillis() - startTime);
    }

    @GetMapping("/v1/hankyorehnews/sports")
    public void hankyorehSport() {
        log.info("### Start Scheduling hankyorehSport ###");
        long startTime = System.currentTimeMillis();
        requestRss.requestRss(HANKYOREH_SPORTS, Press.HANKYOREH);
        log.info("### End Scheduling hankyorehSport | Time {} ###", System.currentTimeMillis() - startTime);
    }
}
