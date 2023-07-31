package com.sunyue.study.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sunyue.study.common.utils.PageUtils;
import com.sunyue.study.order.entity.OrderOperateHistoryEntity;

import java.util.Map;

/**
 * 订单操作历史记录
 *
 * @author sunyue
 * @email sunyue@gmail.com
 * @date 2023-07-31 23:26:11
 */
public interface OrderOperateHistoryService extends IService<OrderOperateHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

