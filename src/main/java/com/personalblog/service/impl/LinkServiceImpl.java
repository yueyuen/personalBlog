package com.personalblog.service.impl;

import com.personalblog.entity.Link;
import com.personalblog.mapper.LinkMapper;
import com.personalblog.service.ILinkService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jobob
 * @since 2022-07-19
 */
@Service
public class LinkServiceImpl extends ServiceImpl<LinkMapper, Link> implements ILinkService {

}
