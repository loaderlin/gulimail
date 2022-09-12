package com.atguigu.guilimall.ware.dao;

import com.atguigu.guilimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author loaderlin
 * @email loaderlin@163.com
 * @date 2022-09-13 00:07:13
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
