package com.sunyue.study.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sunyue.study.common.utils.PageUtils;
import com.sunyue.study.order.entity.OrderSettingEntity;

import java.util.Map;

/**
 * 订单配置信息
 *
 * @author sunyue
 * @email sunyue@gmail.com
 * @date 2023-07-31 23:26:11
 */
public interface OrderSettingService extends IService<OrderSettingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

