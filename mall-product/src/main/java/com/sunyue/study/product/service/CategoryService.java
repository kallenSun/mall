package com.sunyue.study.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sunyue.study.common.utils.PageUtils;
import com.sunyue.study.product.entity.CategoryEntity;

import java.util.Map;

/**
 * 商品三级分类
 *
 * @author sunyue
 * @email sunyue@gmail.com
 * @date 2023-07-30 22:17:14
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

