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
public class Link implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 友情连接id
     */
    @TableId(value = "link_id")
    private String linkId;

    /**
     * 连接标题
     */
    private String linkTitle;

    /**
     * 链接地址
     */
    private String linkUrl;

    /**
     * 链接logo
     */
    private String linkLogoUrl;

    /**
     * 添加链接时间
     */
    private LocalDateTime linkAddTime;


}
