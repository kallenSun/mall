package com.sunyue.study.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sunyue.study.common.utils.PageUtils;
import com.sunyue.study.order.entity.PaymentInfoEntity;

import java.util.Map;

/**
 * 支付信息表
 *
 * @author sunyue
 * @email sunyue@gmail.com
 * @date 2023-07-31 23:26:11
 */
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

