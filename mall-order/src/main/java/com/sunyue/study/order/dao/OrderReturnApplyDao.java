package com.sunyue.study.order.dao;

import com.sunyue.study.order.entity.OrderReturnApplyEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单退货申请
 * 
 * @author sunyue
 * @email sunyue@gmail.com
 * @date 2023-07-31 23:26:11
 */
@Mapper
public interface OrderReturnApplyDao extends BaseMapper<OrderReturnApplyEntity> {
	
}
