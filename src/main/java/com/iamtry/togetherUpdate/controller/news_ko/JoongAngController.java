package com.iamtry.togetherUpdate.controller.news_ko;

import com.iamtry.togetherUpdate.controller.enums.Press;
import com.iamtry.togetherUpdate.service.RequestRss;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class JoongAngController {

    /**
     * 중앙일보
     * <p>
     * 정치
     * 경제
     * 사회
     * 국제
     * 스포츠
     * 오피니언(사설)
     * 연애
     * IT
     */
    private final String JOONGANG_POLITICS = "https://rss.joins.com/sonagi/joins_sonagi_politics_list.xml";
    private final String JOONGANG_ECONOMIC = "https://rss.joins.com/sonagi/joins_sonagi_money_list.xml";
    private final String JOONGANG_NATIONAL = "https://rss.joins.com/sonagi/joins_sonagi_life_list.xml";
    private final String JOONGANG_INTERNATIONAL = "https://rss.joins.com/sonagi/joins_sonagi_world_list.xml";
    private final String JOONGANG_SPORTS = "https://rss.joins.com/sonagi/joins_sonagi_sports_list.xml";
    private final String JOONGANG_OPINION = "https://rss.joins.com/sonagi/joins_sonagi_opinion_list.xml";
    private final String JOONGANG_ENTERTAINMENTS = "https://rss.joins.com/sonagi/joins_sonagi_star_list.xml";
    private final String JOONGANG_IT = "https://rss.joins.com/sonagi/joins_sonagi_it_list.xml";

    @Autowired
    private RequestRss requestRss;

    @GetMapping("/v1/joongangnews/politics")
    public void joongangPolitics() {
        log.info("### Start Scheduling joongangPolitics ###");
        long startTime = System.currentTimeMillis();
        requestRss.requestRss(JOONGANG_POLITICS, Press.JOONGANG);
        log.info("### End Scheduling joongangPolitics | Time {} ###", System.currentTimeMillis() - startTime);
    }

    @GetMapping("/v1/joongangnews/economy")
    public void joongangEconomy() {
        log.info("### Start Scheduling joongangEconomy ###");
        long startTime = System.currentTimeMillis();
        requestRss.requestRss(JOONGANG_ECONOMIC, Press.JOONGANG);
        log.info("### End Scheduling joongangEconomy | Time {} ###", System.currentTimeMillis() - startTime);
    }

    @GetMapping("/v1/joongangnews/national")
    public void joongangNational() {
        log.info("### Start Scheduling joongangNational ###");
        long startTime = System.currentTimeMillis();
        requestRss.requestRss(JOONGANG_NATIONAL, Press.JOONGANG);
        log.info("### End Scheduling joongangNational | Time {} ###", System.currentTimeMillis() - startTime);
    }

    @GetMapping("/v1/joongangnews/international")
    public void joongangInternational() {
        log.info("### Start Scheduling joongangInternational ###");
        long startTime = System.currentTimeMillis();
        requestRss.requestRss(JOONGANG_INTERNATIONAL, Press.JOONGANG);
        log.info("### End Scheduling joongangInternational | Time {} ###", System.currentTimeMillis() - startTime);
    }

    @GetMapping("/v1/joongangnews/opinion")
    public void joongangOpinion() {
        log.info("### Start Scheduling joongangOpinion ###");
        long startTime = System.currentTimeMillis();
        requestRss.requestRss(JOONGANG_OPINION, Press.JOONGANG);
        log.info("### End Scheduling joongangOpinion | Time {} ###", System.currentTimeMillis() - startTime);
    }

    @GetMapping("/v1/joongangnews/sports")
    public void joongangSport() {
        log.info("### Start Scheduling joongangSport ###");
        long startTime = System.currentTimeMillis();
        requestRss.requestRss(JOONGANG_SPORTS, Press.JOONGANG);
        log.info("### End Scheduling joongangSport | Time {} ###", System.currentTimeMillis() - startTime);
    }

    @GetMapping("/v1/joongangnews/entertainments")
    public void joongangEntertainments() {
        log.info("### Start Scheduling joongangEntertainments ###");
        long startTime = System.currentTimeMillis();
        requestRss.requestRss(JOONGANG_ENTERTAINMENTS, Press.JOONGANG);
        log.info("### End Scheduling joongangEntertainments | Time {} ###", System.currentTimeMillis() - startTime);
    }

    @GetMapping("/v1/joongangnews/it")
    public void joongangIt() {
        log.info("### Start Scheduling joongangIt ###");
        long startTime = System.currentTimeMillis();
        requestRss.requestRss(JOONGANG_IT, Press.JOONGANG);
        log.info("### End Scheduling joongangIt | Time {} ###", System.currentTimeMillis() - startTime);
    }
}
