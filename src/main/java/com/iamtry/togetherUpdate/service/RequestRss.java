package com.iamtry.togetherUpdate.service;

import com.iamtry.togetherUpdate.controller.enums.Press;
import com.sun.syndication.feed.synd.SyndEntry;
import com.sun.syndication.feed.synd.SyndFeed;
import com.sun.syndication.io.FeedException;
import com.sun.syndication.io.SyndFeedInput;
import com.sun.syndication.io.XmlReader;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

@Service
public class RequestRss {

    public void requestRss(String url, Press press) {
        try {
            URL requestUrl = new URL(url);
            SyndFeedInput syndFeedInput = new SyndFeedInput();
            SyndFeed syndFeed = syndFeedInput.build(new XmlReader(requestUrl));

            /*RSS*/
            List<SyndEntry> entries = syndFeed.getEntries();

            for (SyndEntry entry : entries) {
                System.out.println("entry.getTitle() = " + entry.getTitle());
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (FeedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
