package com.soft.jianyue.api.service.impl;

import com.soft.jianyue.api.entity.Comment;
import com.soft.jianyue.api.entity.vo.CommentVO;
import com.soft.jianyue.api.mapper.CommentMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CommentServiceImplTest {
    @Resource
    private CommentMapper commentMapper;

    @Test
    public void selectCommentsByAId() {
        List<CommentVO> list = new ArrayList<>();
        list = commentMapper.selectCommentsByAId(1);
        System.out.println(list);
    }
    @Test
    public void addComment(){
        Comment comment=new Comment ();
        comment.setuId ( 2 );
        comment.setaId ( 1 );
        comment.setContent ( "写得好" );
        comment.setCommentTime ( new Date (  ) );
        commentMapper.insert ( comment );

    }
}