package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author loaderlin
 * @email loaderlin@163.com
 * @date 2022-09-13 00:03:19
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
