package com.eutopia.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class ArticleDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer articleDescriptionId;

    private Integer menuId;

    private String title;

    private String summary;

    private String source;

    private String author;

    private Integer sort;

    private String content;
}
