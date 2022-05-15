package com.iamtry.togetherUpdate.domain;

import com.iamtry.togetherUpdate.controller.form.NewsForm;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Document("chosun")
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Chosun {

    @Transient
    public static final String SEQUENCE_NAME = "shorturl_sequence";

    private String title;
    private String author;
    private String link;
    private Date pubDate;

    public static List<Chosun> createListOfChosun(List<NewsForm> newsFormList) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
        List<Chosun> chosunList = new ArrayList<>();
        try {
            for (NewsForm newsForm : newsFormList) {
                chosunList.add(Chosun.builder()
                        .title(newsForm.getTitle())
                        .author(newsForm.getAuthor())
                        .link(newsForm.getLink())
                        .pubDate(simpleDateFormat.parse(simpleDateFormat.format(newsForm.getPubDate())))
                        .build());
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return chosunList;
    }
}
