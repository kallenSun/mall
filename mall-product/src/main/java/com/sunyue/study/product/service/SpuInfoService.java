package com.sunyue.study.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sunyue.study.common.utils.PageUtils;
import com.sunyue.study.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author sunyue
 * @email sunyue@gmail.com
 * @date 2023-07-30 22:17:14
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

