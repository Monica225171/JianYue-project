package com.soft.jianyue.api.service;

import com.soft.jianyue.api.entity.Comment;
import com.soft.jianyue.api.entity.vo.CommentVO;
import java.util.List;

public interface CommentService {
    List<CommentVO> selectCommentsByAId(int aId);
    void addComment(Comment comment);
}
