package com.soft.jianyue.api.controller;

import com.soft.jianyue.api.entity.Follow;
import com.soft.jianyue.api.entity.vo.FollowVO;
import com.soft.jianyue.api.service.FollowService;
import com.soft.jianyue.api.util.ResponseResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/api/follow")
public class FollowController {
    @Resource
    private FollowService followService;

    @PostMapping("/add")
    public ResponseResult followUser(@RequestParam("fromUId") int fromUId, @RequestParam("toUId") int toUId) {
        Follow follow = new Follow();
        follow.setFromUId(fromUId);
        follow.setToUId(toUId);
        followService.insertFollow(follow);
        return ResponseResult.success();
    }

    @PostMapping("/cancel")
    public ResponseResult cancelFollow(@RequestParam("fromUId") int fromUId, @RequestParam("toUId") int toUId) {
        followService.deleteFollow(fromUId, toUId);
        return ResponseResult.success();
    }

    @GetMapping("/getFollowsByUId")
    public ResponseResult getFollowsByUId(@RequestParam("fromUId") int uId) {
        List<FollowVO> list = new ArrayList<> ();
        list = followService.getFollowsByUId(uId);
        return ResponseResult.success(list);
    }
}