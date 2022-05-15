package com.iamtry.togetherUpdate.controller.form;

import com.sun.syndication.feed.synd.SyndEntry;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class NewsForm {
    private String title;
    private String author;
    private String link;
    private Date pubDate;

    public static List<NewsForm> createNewsFormList(List<SyndEntry> entryListList) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
        List<NewsForm> newsFormList = new ArrayList<>();
        try {
            for (SyndEntry syndEntry : entryListList) {
                newsFormList.add(NewsForm.builder()
                        .title(syndEntry.getTitle())
                        .author(syndEntry.getAuthor())
                        .link(syndEntry.getLink())
                        .pubDate(simpleDateFormat.parse(simpleDateFormat.format(syndEntry.getPublishedDate())))
                        .build());
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return newsFormList;
    }
}