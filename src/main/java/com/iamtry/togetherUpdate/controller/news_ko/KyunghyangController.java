package com.iamtry.togetherUpdate.controller.news_ko;

import com.iamtry.togetherUpdate.controller.enums.Press;
import com.iamtry.togetherUpdate.service.RequestRss;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
        requestRss.requestRss(KYUNGHYANG_POLITICS, Press.KYUNGHYANG);
    }

    @GetMapping("/v1/kyunghyangnews/economy")
    public void kyunghyangEconomy() {
        requestRss.requestRss(KYUNGHYANG_ECONOMIC, Press.KYUNGHYANG);
    }

    @GetMapping("/v1/kyunghyangnews/national")
    public void kyunghyangNational() {
        requestRss.requestRss(KYUNGHYANG_NATIONAL, Press.KYUNGHYANG);
    }

    @GetMapping("/v1/kyunghyangnews/international")
    public void kyunghyangInternational() {
        requestRss.requestRss(KYUNGHYANG_INTERNATIONAL, Press.KYUNGHYANG);
    }

    @GetMapping("/v1/chosunnews/culture")
    public void kyunghyangCulture() {
        requestRss.requestRss(KYUNGHYANG_CULTURE, Press.KYUNGHYANG);
    }

    @GetMapping("/v1/kyunghyangnews/opinion")
    public void kyunghyangOpinion() {
        requestRss.requestRss(KYUNGHYANG_OPINION, Press.KYUNGHYANG);
    }

    @GetMapping("/v1/kyunghyangnews/sports")
    public void kyunghyangSport() {
        requestRss.requestRss(KYUNGHYANG_SPORTS, Press.KYUNGHYANG);
    }

    @GetMapping("/v1/kyunghyangnews/entertainments")
    public void kyunghyangEntertainments() {
        requestRss.requestRss(KYUNGHYANG_ENTERTAINMENTS, Press.KYUNGHYANG);
    }

    @GetMapping("/v1/kyunghyangnews/it")
    public void kyunghyangIt() {
        requestRss.requestRss(KYUNGHYANG_IT, Press.KYUNGHYANG);
    }
}
