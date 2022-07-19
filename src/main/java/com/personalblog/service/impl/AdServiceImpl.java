package com.personalblog.service.impl;

import com.personalblog.entity.Ad;
import com.personalblog.mapper.AdMapper;
import com.personalblog.service.IAdService;
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
public class AdServiceImpl extends ServiceImpl<AdMapper, Ad> implements IAdService {

}
