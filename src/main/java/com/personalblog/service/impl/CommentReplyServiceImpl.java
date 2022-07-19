package com.personalblog.service.impl;

import com.personalblog.entity.CommentReply;
import com.personalblog.mapper.CommentReplyMapper;
import com.personalblog.service.ICommentReplyService;
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
public class CommentReplyServiceImpl extends ServiceImpl<CommentReplyMapper, CommentReply> implements ICommentReplyService {

}
