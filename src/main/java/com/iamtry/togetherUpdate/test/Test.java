package com.iamtry.togetherUpdate.test;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.syndication.feed.synd.SyndEntry;
import com.sun.syndication.feed.synd.SyndFeed;
import com.sun.syndication.io.FeedException;
import com.sun.syndication.io.SyndFeedInput;
import com.sun.syndication.io.XmlReader;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

@RestController
public class Test {

    @GetMapping("/test")
    public String test() {
        return "hello test!!!";
    }

    @GetMapping("/getnews")
    public List<ChosunForm> getNews() {
        String url = "https://www.chosun.com/arc/outboundfeeds/rss/?outputType=xml";
        List<ChosunForm> chosunFormList = new ArrayList<>();
        try {
            URL requestUrl = new URL(url);

            SyndFeedInput syndFeedInput = new SyndFeedInput();
            SyndFeed syndFeed = syndFeedInput.build(new XmlReader(requestUrl));

            /*RSS*/
            List<SyndEntry> entries = syndFeed.getEntries();
            for (SyndEntry entry : entries) {
                chosunFormList.add(ChosunForm.builder()
                        .title(entry.getTitle())
                        .link(entry.getLink())
                        .author(entry.getAuthor())
                        .build());
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (FeedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return chosunFormList;
    }
}

@Builder
@AllArgsConstructor
@NoArgsConstructor
class ChosunForm {
    @JsonProperty
    private String title;
    @JsonProperty
    private String link;
    @JsonProperty
    private String author;
}
