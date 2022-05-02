package com.iamtry.togetherUpdate.controller.news_ko;

import com.iamtry.togetherUpdate.controller.enums.Press;
import com.iamtry.togetherUpdate.service.RequestRss;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
        requestRss.requestRss(HANKYOREH_POLITICS, Press.HANKYOREH);
    }

    @GetMapping("/v1/hankyorehnews/economy")
    public void hankyorehEconomy() {
        requestRss.requestRss(HANKYOREH_ECONOMIC, Press.HANKYOREH);
    }

    @GetMapping("/v1/hankyorehnews/national")
    public void hankyorehNational() {
        requestRss.requestRss(HANKYOREH_NATIONAL, Press.HANKYOREH);
    }

    @GetMapping("/v1/hankyorehnews/international")
    public void hankyorehInternational() {
        requestRss.requestRss(HANKYOREH_INTERNATIONAL, Press.HANKYOREH);
    }

    @GetMapping("/v1/chosunnews/culture")
    public void hankyorehCulture() {
        requestRss.requestRss(HANKYOREH_CULTURE, Press.HANKYOREH);
    }

    @GetMapping("/v1/hankyorehnews/opinion")
    public void hankyorehOpinion() {
        requestRss.requestRss(HANKYOREH_OPINION, Press.HANKYOREH);
    }

    @GetMapping("/v1/hankyorehnews/sports")
    public void hankyorehSport() {
        requestRss.requestRss(HANKYOREH_SPORTS, Press.HANKYOREH);
    }
}
