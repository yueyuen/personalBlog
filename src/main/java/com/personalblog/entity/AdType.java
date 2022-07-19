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
public class AdType implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 广告类型id
     */
    @TableId(value = "ad_type_id")
    private String adTypeId;

    /**
     * 广告类型名称
     */
    private String adTypeTitle;

    /**
     * 广告表示（首页顶部、轮播图、文章详情广告）
     */
    private String adTypeTag;

    /**
     * 广告类型排序（越小越前）
     */
    private Integer adTypeSort;

    /**
     * 广告添加时间
     */
    private LocalDateTime adTypeAddTime;


}
