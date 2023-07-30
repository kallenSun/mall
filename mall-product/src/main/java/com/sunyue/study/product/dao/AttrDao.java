package com.sunyue.study.product.dao;

import com.sunyue.study.product.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 * 
 * @author sunyue
 * @email sunyue@gmail.com
 * @date 2023-07-30 23:22:08
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
	
}
