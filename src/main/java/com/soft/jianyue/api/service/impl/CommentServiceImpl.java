package com.soft.jianyue.api.service.impl;

import com.soft.jianyue.api.entity.Comment;
import com.soft.jianyue.api.entity.vo.CommentVO;
import com.soft.jianyue.api.mapper.CommentMapper;
import com.soft.jianyue.api.service.CommentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    @Resource
    private CommentMapper commentMapper;

    @Override
    public List<CommentVO> selectCommentsByAId(int aId) {
        return commentMapper.selectCommentsByAId(aId);
    }

    @Override
    public void addComment(Comment comment) {
       commentMapper.insert ( comment );
    }
}
