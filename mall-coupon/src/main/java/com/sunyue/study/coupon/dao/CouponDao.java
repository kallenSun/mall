package com.sunyue.study.coupon.dao;

import com.sunyue.study.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author sunyue
 * @email sunyue@gmail.com
 * @date 2023-07-30 23:41:31
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
