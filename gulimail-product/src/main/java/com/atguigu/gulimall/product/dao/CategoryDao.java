package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author loaderlin
 * @email loaderlin@163.com
 * @date 2022-09-04 21:12:06
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
