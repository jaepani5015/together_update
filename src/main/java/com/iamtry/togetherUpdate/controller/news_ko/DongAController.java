package com.iamtry.togetherUpdate.controller.news_ko;

import com.iamtry.togetherUpdate.controller.enums.Press;
import com.iamtry.togetherUpdate.service.RequestRss;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
    private final String DONGA_ECONOMIC = " https://rss.donga.com/economy.xml";
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
        requestRss.requestRss(DONGA_POLITICS, Press.DONGA);
    }

    @GetMapping("/v1/donganews/economy")
    public void dongaEconomy() {
        requestRss.requestRss(DONGA_ECONOMIC, Press.DONGA);
    }

    @GetMapping("/v1/donganews/national")
    public void dongaNational() {
        requestRss.requestRss(DONGA_NATIONAL, Press.DONGA);
    }

    @GetMapping("/v1/donganews/international")
    public void dongaInternational() {
        requestRss.requestRss(DONGA_INTERNATIONAL, Press.DONGA);
    }

    @GetMapping("/v1/donganews/culture")
    public void dongaCulturelife() {
        requestRss.requestRss(DONGA_CULTURE_LIFE, Press.DONGA);
    }

    @GetMapping("/v1/donganews/opinion")
    public void dongaOpinion() {
        requestRss.requestRss(DONGA_OPINION, Press.DONGA);
    }

    @GetMapping("/v1/donganews/sports")
    public void dongaSport() {
        requestRss.requestRss(DONGA_SPORTS, Press.DONGA);
    }

    @GetMapping("/v1/donganews/entertainments")
    public void dongaEntertainments() {
        requestRss.requestRss(DONGA_ENTERTAINMENTS, Press.DONGA);
    }
}
