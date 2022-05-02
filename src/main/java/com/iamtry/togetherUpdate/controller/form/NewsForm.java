package com.iamtry.togetherUpdate.controller.form;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NewsForm {
    private String title;
    private String link;
    private String author;
}
