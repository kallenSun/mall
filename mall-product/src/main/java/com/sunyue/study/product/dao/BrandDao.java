package com.sunyue.study.product.dao;

import com.sunyue.study.product.entity.BrandEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 品牌
 * 
 * @author sunyue
 * @email sunyue@gmail.com
 * @date 2023-07-30 23:22:08
 */
@Mapper
public interface BrandDao extends BaseMapper<BrandEntity> {
	
}
