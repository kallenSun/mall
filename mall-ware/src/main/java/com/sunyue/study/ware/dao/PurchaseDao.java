package com.sunyue.study.ware.dao;

import com.sunyue.study.ware.entity.PurchaseEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 采购信息
 * 
 * @author sunyue
 * @email sunyue@gmail.com
 * @date 2023-07-31 23:36:59
 */
@Mapper
public interface PurchaseDao extends BaseMapper<PurchaseEntity> {
	
}
