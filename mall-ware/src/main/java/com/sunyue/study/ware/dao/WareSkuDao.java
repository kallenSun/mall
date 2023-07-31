package com.sunyue.study.ware.dao;

import com.sunyue.study.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author sunyue
 * @email sunyue@gmail.com
 * @date 2023-07-31 23:36:59
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
