package com.personalblog.service.impl;

import com.personalblog.entity.Article;
import com.personalblog.mapper.ArticleMapper;
import com.personalblog.service.IArticleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 文章表 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2022-07-19
 */
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements IArticleService {

}
