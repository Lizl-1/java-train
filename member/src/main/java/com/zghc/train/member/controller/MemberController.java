package com.zghc.train.member.controller;

import com.zghc.train.common.resp.CommonResp;
import com.zghc.train.member.req.MemberRegisterReq;
import com.zghc.train.member.service.MemberService;
import jakarta.annotation.Resource;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Lizl
 * @Description
 * @Data 2023/12/28/0028 12:20
 * @Version 1.0.0
 */
@RestController
@RequestMapping("/member")
public class MemberController {

    @Resource
    MemberService memberService;

    @GetMapping("/count")
    public CommonResp<Integer> count() {
        int count = memberService.count();
        return new CommonResp<>(count);

    }

    @PostMapping("/register")
    public CommonResp<Long> register(@Valid MemberRegisterReq Req) {
        long register = memberService.register(Req);
        return new CommonResp<>(register);
    }

}
