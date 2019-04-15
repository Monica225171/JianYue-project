package com.soft.jianyue.api.service.impl;

import com.soft.jianyue.api.entity.Follow;
import com.soft.jianyue.api.entity.vo.FollowVO;
import com.soft.jianyue.api.mapper.FollowMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

@RunWith( SpringRunner.class)
@SpringBootTest
public class FollowServiceImplTest {
    @Resource
    private FollowMapper followMapper;
    @Test
    public void getFollow() {
        Follow follow=followMapper.getFollow ( 2,1 );
        System.out.println ( follow );
    }

    @Test
    public void getFollowsByUId() {
        List<FollowVO> list=followMapper.getFollowsByUId ( 1 );
        System.out.println ( list );
    }

    @Test
    public void insertFollow() {
        Follow follow=new Follow ();
        follow.setFromUId ( 1 );
        follow.setToUId ( 2 );
        followMapper.insertFollow ( follow );
    }

    @Test
    public void deleteFollow() {
        followMapper.deleteFollow ( 1,2 );
    }
}