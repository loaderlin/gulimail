package com.atguigu.guilimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.guilimall.ware.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author loaderlin
 * @email loaderlin@163.com
 * @date 2022-09-13 00:07:13
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

