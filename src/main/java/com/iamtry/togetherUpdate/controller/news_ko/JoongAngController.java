package com.iamtry.togetherUpdate.controller.news_ko;

import com.iamtry.togetherUpdate.controller.enums.Press;
import com.iamtry.togetherUpdate.service.RequestRss;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
        requestRss.requestRss(JOONGANG_POLITICS, Press.JOONGANG);
    }

    @GetMapping("/v1/joongangnews/economy")
    public void joongangEconomy() {
        requestRss.requestRss(JOONGANG_ECONOMIC, Press.JOONGANG);
    }

    @GetMapping("/v1/joongangnews/national")
    public void joongangNational() {
        requestRss.requestRss(JOONGANG_NATIONAL, Press.JOONGANG);
    }

    @GetMapping("/v1/joongangnews/international")
    public void joongangInternational() {
        requestRss.requestRss(JOONGANG_INTERNATIONAL, Press.JOONGANG);
    }

    @GetMapping("/v1/joongangnews/opinion")
    public void joongangOpinion() {
        requestRss.requestRss(JOONGANG_OPINION, Press.JOONGANG);
    }

    @GetMapping("/v1/joongangnews/sports")
    public void joongangSport() {
        requestRss.requestRss(JOONGANG_SPORTS, Press.JOONGANG);
    }

    @GetMapping("/v1/joongangnews/entertainments")
    public void joongangEntertainments() {
        requestRss.requestRss(JOONGANG_ENTERTAINMENTS, Press.JOONGANG);
    }

    @GetMapping("/v1/joongangnews/it")
    public void joongangIt() {
        requestRss.requestRss(JOONGANG_IT, Press.JOONGANG);
    }
}
