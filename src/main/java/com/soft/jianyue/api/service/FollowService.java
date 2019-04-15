package com.soft.jianyue.api.service;

import com.soft.jianyue.api.entity.Follow;
import com.soft.jianyue.api.entity.vo.FollowVO;

import java.util.List;

public interface FollowService {
    Follow getFollow(int fromUId, int toUId);

    List<FollowVO> getFollowsByUId(int fromUId);

    void insertFollow(Follow follow);

    void deleteFollow(int fromUId, int toUId);
}