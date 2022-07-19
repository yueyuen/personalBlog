package com.personalblog.entity;

import java.time.LocalDateTime;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author jobob
 * @since 2022-07-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class ArticleTag implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 文章标签id
     */
    @TableId(value = "article_tag_id")
    private String articleTagId;

    /**
     * 标签名称
     */
    private String articleTagName;

    /**
     * 添加时间
     */
    private LocalDateTime artcileTagAddTime;


}
