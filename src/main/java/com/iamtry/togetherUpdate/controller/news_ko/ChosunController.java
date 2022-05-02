package com.iamtry.togetherUpdate.controller.news_ko;

import com.iamtry.togetherUpdate.controller.enums.Press;
import com.iamtry.togetherUpdate.service.RequestRss;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChosunController {

    /**
     * 조선일보
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
    private final String CHOSUN_POLITICS = "https://www.chosun.com/arc/outboundfeeds/rss/category/politics/?outputType=xml";
    private final String CHOSUN_ECONOMIC = "https://www.chosun.com/arc/outboundfeeds/rss/category/economy/?outputType=xml";
    private final String CHOSUN_NATIONAL = "https://www.chosun.com/arc/outboundfeeds/rss/category/national/?outputType=xml";
    private final String CHOSUN_INTERNATIONAL = "https://www.chosun.com/arc/outboundfeeds/rss/category/international/?outputType=xml";
    private final String CHOSUN_CULTURE = "https://www.chosun.com/arc/outboundfeeds/rss/category/culture-life/?outputType=xml";
    private final String CHOSUN_OPINION = "https://www.chosun.com/arc/outboundfeeds/rss/category/opinion/?outputType=xml";
    private final String CHOSUN_SPORTS = "https://www.chosun.com/arc/outboundfeeds/rss/category/sports/?outputType=xml";
    private final String CHOSUN_ENTERTAINMENTS = "https://www.chosun.com/arc/outboundfeeds/rss/category/entertainments/?outputType=xml";

    @Autowired
    private RequestRss requestRss;

    @GetMapping("/v1/chosunnews/politics")
    public void chosunPolitics() {
        requestRss.requestRss(CHOSUN_POLITICS, Press.CHOSUN);
    }

    @GetMapping("/v1/chosunnews/economy")
    public void chosunEconomy() {
        requestRss.requestRss(CHOSUN_ECONOMIC, Press.CHOSUN);
    }

    @GetMapping("/v1/chosunnews/national")
    public void chosunNational() {
        requestRss.requestRss(CHOSUN_NATIONAL, Press.CHOSUN);
    }

    @GetMapping("/v1/chosunnews/international")
    public void chosunInternational() {
        requestRss.requestRss(CHOSUN_INTERNATIONAL, Press.CHOSUN);
    }

    @GetMapping("/v1/chosunnews/culture")
    public void chosunCulture() {
        requestRss.requestRss(CHOSUN_CULTURE, Press.CHOSUN);
    }

    @GetMapping("/v1/chosunnews/opinion")
    public void chosunOpinion() {
        requestRss.requestRss(CHOSUN_OPINION, Press.CHOSUN);
    }

    @GetMapping("/v1/chosunnews/sports")
    public void chosunSport() {
        requestRss.requestRss(CHOSUN_SPORTS, Press.CHOSUN);
    }

    @GetMapping("/v1/chosunnews/entertainments")
    public void chosunEntertainments() {
        requestRss.requestRss(CHOSUN_ENTERTAINMENTS, Press.CHOSUN);
    }
}
