package com.sunyue.study.product.dao;

import com.sunyue.study.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author sunyue
 * @email sunyue@gmail.com
 * @date 2023-07-30 22:17:14
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
