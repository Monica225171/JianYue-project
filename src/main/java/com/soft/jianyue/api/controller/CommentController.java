package com.soft.jianyue.api.controller;

import com.soft.jianyue.api.entity.Comment;
import com.soft.jianyue.api.service.CommentService;
import com.soft.jianyue.api.util.ResponseResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;

@RestController
@RequestMapping(value = "/api/comments")
public class CommentController {
    @Resource
    private CommentService commentService;

    @PostMapping("/add")
    public ResponseResult addComment(@RequestParam("aId") int aId, @RequestParam("uId") int uId, @RequestParam("content") String content) {
        Comment comment = new Comment();
        comment.setaId(aId);
        comment.setuId(uId);
        comment.setContent(content);
        comment.setCommentTime(new Date());
        commentService.addComment(comment);
        return ResponseResult.success();
    }
}