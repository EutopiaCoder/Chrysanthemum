package com.eutopia.service;

import com.eutopia.DTO.ArticleCommentDTO;
import com.eutopia.DTO.ArticleDTO;

public interface ArticleService {

    Integer addArticle(ArticleDTO articleDTO);

    Integer addArticleComment(ArticleCommentDTO articleCommentDTO);
}
