package com.atguigu.gulimall.member.feign;

import com.atguigu.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 这是一个声明式的远程调用
 */
@FeignClient("gulimall-coupon")
public interface CouponFeignService {

    // 声明接口的每个方法都是调用那个远程服务的那个请求
    @RequestMapping("/coupon/coupon/member/list")
    public R membercoupons();
}
