package com.sunyue.study.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sunyue.study.common.utils.PageUtils;
import com.sunyue.study.ware.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author sunyue
 * @email sunyue@gmail.com
 * @date 2023-07-31 23:36:59
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

