package com.atguigu.guilimall.ware.service;

import com.atguigu.guilimall.ware.entity.WareOrderTaskEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author loaderlin
 * @email loaderlin@163.com
 * @date 2022-09-13 00:07:13
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

