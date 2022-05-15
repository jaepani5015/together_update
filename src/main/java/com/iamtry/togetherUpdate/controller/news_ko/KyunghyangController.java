package com.iamtry.togetherUpdate.controller.news_ko;

import com.iamtry.togetherUpdate.controller.enums.Press;
import com.iamtry.togetherUpdate.service.RequestRss;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class KyunghyangController  {

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
     * 연애
     * IT
     */
    private final String KYUNGHYANG_POLITICS = "https://www.kyunghyang.co.kr/rss/rssdata/politic_news.xml";
    private final String KYUNGHYANG_ECONOMIC = "https://www.kyunghyang.co.kr/rss/rssdata/economy_news.xml";
    private final String KYUNGHYANG_NATIONAL = "https://www.kyunghyang.co.kr/rss/rssdata/society_news.xml";
    private final String KYUNGHYANG_INTERNATIONAL = "https://www.kyunghyang.co.kr/rss/rssdata/kh_world.xml";
    private final String KYUNGHYANG_CULTURE = "https://www.kyunghyang.co.kr/rss/rssdata/culture_news.xml";
    private final String KYUNGHYANG_SPORTS = "https://www.kyunghyang.co.kr/rss/rssdata/kh_sports.xml";
    private final String KYUNGHYANG_OPINION = "https://www.kyunghyang.co.kr/rss/rssdata/opinion_news.xml";
    private final String KYUNGHYANG_ENTERTAINMENTS = "https://www.kyunghyang.co.kr/rss/rssdata/kh_entertainment.xml";
    private final String KYUNGHYANG_IT = "https://www.kyunghyang.co.kr/rss/rssdata/it_news.xml";

    @Autowired
    private RequestRss requestRss;

    @GetMapping("/v1/kyunghyangnews/politics")
    public void kyunghyangPolitics() {
        log.info("### Start Scheduling kyunghyangPolitics ###");
        long startTime = System.currentTimeMillis();
        requestRss.requestRss(KYUNGHYANG_POLITICS, Press.KYUNGHYANG);
        log.info("### End Scheduling kyunghyangPolitics | Time {} ###", System.currentTimeMillis() - startTime);
    }

    @GetMapping("/v1/kyunghyangnews/economy")
    public void kyunghyangEconomy() {
        log.info("### Start Scheduling kyunghyangEconomy ###");
        long startTime = System.currentTimeMillis();
        requestRss.requestRss(KYUNGHYANG_ECONOMIC, Press.KYUNGHYANG);
        log.info("### End Scheduling kyunghyangEconomy | Time {} ###", System.currentTimeMillis() - startTime);
    }

    @GetMapping("/v1/kyunghyangnews/national")
    public void kyunghyangNational() {
        log.info("### Start Scheduling kyunghyangNational ###");
        long startTime = System.currentTimeMillis();
        requestRss.requestRss(KYUNGHYANG_NATIONAL, Press.KYUNGHYANG);
        log.info("### End Scheduling kyunghyangNational | Time {} ###", System.currentTimeMillis() - startTime);
    }

    @GetMapping("/v1/kyunghyangnews/international")
    public void kyunghyangInternational() {
        log.info("### Start Scheduling kyunghyangInternational ###");
        long startTime = System.currentTimeMillis();
        requestRss.requestRss(KYUNGHYANG_INTERNATIONAL, Press.KYUNGHYANG);
        log.info("### End Scheduling kyunghyangInternational | Time {} ###", System.currentTimeMillis() - startTime);
    }

    @GetMapping("/v1/kyunghyangnews/culture")
    public void kyunghyangCulture() {
        log.info("### Start Scheduling kyunghyangCulture ###");
        long startTime = System.currentTimeMillis();
        requestRss.requestRss(KYUNGHYANG_CULTURE, Press.KYUNGHYANG);
        log.info("### End Scheduling kyunghyangCulture | Time {} ###", System.currentTimeMillis() - startTime);
    }

    @GetMapping("/v1/kyunghyangnews/opinion")
    public void kyunghyangOpinion() {
        log.info("### Start Scheduling kyunghyangOpinion ###");
        long startTime = System.currentTimeMillis();
        requestRss.requestRss(KYUNGHYANG_OPINION, Press.KYUNGHYANG);
        log.info("### End Scheduling kyunghyangOpinion | Time {} ###", System.currentTimeMillis() - startTime);
    }

    @GetMapping("/v1/kyunghyangnews/sports")
    public void kyunghyangSport() {
        log.info("### Start Scheduling kyunghyangSport ###");
        long startTime = System.currentTimeMillis();
        requestRss.requestRss(KYUNGHYANG_SPORTS, Press.KYUNGHYANG);
        log.info("### End Scheduling kyunghyangSport | Time {} ###", System.currentTimeMillis() - startTime);
    }

    @GetMapping("/v1/kyunghyangnews/entertainments")
    public void kyunghyangEntertainments() {
        log.info("### Start Scheduling kyunghyangEntertainments ###");
        long startTime = System.currentTimeMillis();
        requestRss.requestRss(KYUNGHYANG_ENTERTAINMENTS, Press.KYUNGHYANG);
        log.info("### End Scheduling kyunghyangEntertainments | Time {} ###", System.currentTimeMillis() - startTime);
    }

    @GetMapping("/v1/kyunghyangnews/it")
    public void kyunghyangIt() {
        log.info("### Start Scheduling kyunghyangIt ###");
        long startTime = System.currentTimeMillis();
        requestRss.requestRss(KYUNGHYANG_IT, Press.KYUNGHYANG);
        log.info("### End Scheduling kyunghyangIt | Time {} ###", System.currentTimeMillis() - startTime);
    }
}
