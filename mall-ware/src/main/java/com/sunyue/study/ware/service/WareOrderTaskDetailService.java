package com.sunyue.study.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sunyue.study.common.utils.PageUtils;
import com.sunyue.study.ware.entity.WareOrderTaskDetailEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author sunyue
 * @email sunyue@gmail.com
 * @date 2023-07-31 23:36:59
 */
public interface WareOrderTaskDetailService extends IService<WareOrderTaskDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

