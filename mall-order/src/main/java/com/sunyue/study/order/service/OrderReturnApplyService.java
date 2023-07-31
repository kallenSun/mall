package com.sunyue.study.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sunyue.study.common.utils.PageUtils;
import com.sunyue.study.order.entity.OrderReturnApplyEntity;

import java.util.Map;

/**
 * 订单退货申请
 *
 * @author sunyue
 * @email sunyue@gmail.com
 * @date 2023-07-31 23:26:11
 */
public interface OrderReturnApplyService extends IService<OrderReturnApplyEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

