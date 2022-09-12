package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author loaderlin
 * @email loaderlin@163.com
 * @date 2022-09-12 23:21:58
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
