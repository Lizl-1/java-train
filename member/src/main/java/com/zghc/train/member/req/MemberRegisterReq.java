package com.zghc.train.member.req;

import jakarta.validation.constraints.NotBlank;

/**
 * @Author Lizl
 * @Description
 * @Data 2023/12/31/0031 13:50
 * @Version 1.0.0
 */
public class MemberRegisterReq {
    @NotBlank(message = "【手机号】不能为空")
    private String mobile;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "MemberRegisterReq{" +
                "mobile='" + mobile + '\'' +
                '}';
    }
}
