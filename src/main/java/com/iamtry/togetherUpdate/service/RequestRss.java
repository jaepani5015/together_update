package com.iamtry.togetherUpdate.service;

import com.iamtry.togetherUpdate.controller.enums.Press;
import com.iamtry.togetherUpdate.controller.form.NewsForm;
import com.iamtry.togetherUpdate.domain.*;
import com.iamtry.togetherUpdate.repository.*;
import com.sun.syndication.feed.synd.SyndEntry;
import com.sun.syndication.feed.synd.SyndFeed;
import com.sun.syndication.io.FeedException;
import com.sun.syndication.io.SyndFeedInput;
import com.sun.syndication.io.XmlReader;
import io.netty.handler.codec.spdy.SpdyHttpResponseStreamIdHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

@Service
public class RequestRss {

    @Autowired
    private ChosunRepository chosunRepository;

    @Autowired
    private DongARepository dongARepository;

    @Autowired
    private HankyorehRepository hankyorehRepository;

    @Autowired
    private JoongAnghRepository joongAnghRepository;

    @Autowired
    private KyunghyangRepository kyunghyangRepository;

    @Transactional
    public void requestRss(String url, Press press) {
        try {
            URL requestUrl = new URL(url);
            SyndFeedInput syndFeedInput = new SyndFeedInput();
            SyndFeed syndFeed = syndFeedInput.build(new XmlReader(requestUrl));

            /* Get RSS data */
            List<SyndEntry> entries = syndFeed.getEntries();

            List<NewsForm> newsFormList = NewsForm.createNewsFormList(entries);

            mappingForm(newsFormList, press);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (FeedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    public void mappingForm(List<NewsForm> newsFormList, Press press) {
        switch (press) {
            case CHOSUN:
                List<Chosun> chosunList = Chosun.createListOfChosun(newsFormList);
                for (Chosun chosun : chosunList) {
                    Chosun byTitle = chosunRepository.findByTitle(chosun.getTitle());
                    if (byTitle == null) {
                        chosunRepository.save(chosun);
                    }
                }
                break;
            case DONGA:
                List<DongA> dongAList = DongA.createListOfDongA(newsFormList);
                for (DongA dongA : dongAList) {
                    DongA byTitle = dongARepository.findByTitle(dongA.getTitle());
                    if (byTitle == null) {
                        dongARepository.save(dongA);
                    }
                }
                break;
            case HANKYOREH:
                List<Hankyoreh> hankyorehList = Hankyoreh.createListOfHankyoreh(newsFormList);
                for (Hankyoreh hankyoreh : hankyorehList) {
                    Hankyoreh byTitle = hankyorehRepository.findByTitle(hankyoreh.getTitle());
                    if (byTitle == null) {
                        hankyorehRepository.save(hankyoreh);
                    }
                }
                break;
            case JOONGANG:
                List<JoongAng> joongAngList = JoongAng.createListOfJoongAng(newsFormList);
                for (JoongAng joongAng : joongAngList) {
                    JoongAng byTitle = joongAnghRepository.findByTitle(joongAng.getTitle());
                    if (byTitle == null) {
                        joongAnghRepository.save(joongAng);
                    }
                }
                break;
            case KYUNGHYANG:
                List<Kyunghyang> kyunghyangList = Kyunghyang.createListOfKyunghyang(newsFormList);
                for (Kyunghyang kyunghyang : kyunghyangList) {
                    Kyunghyang byTitle = kyunghyangRepository.findByTitle(kyunghyang.getTitle());
                    if (byTitle == null) {
                        kyunghyangRepository.save(kyunghyang);
                    }
                }
                break;
            default:
                break;
        }
    }
}