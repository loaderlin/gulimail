package com.atguigu.guilimall.ware.service;

import com.atguigu.guilimall.ware.entity.PurchaseDetailEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;

import java.util.Map;

/**
 * 
 *
 * @author loaderlin
 * @email loaderlin@163.com
 * @date 2022-09-13 00:07:13
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

