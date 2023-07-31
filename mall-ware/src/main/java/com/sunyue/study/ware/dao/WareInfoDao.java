package com.sunyue.study.ware.dao;

import com.sunyue.study.ware.entity.WareInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 仓库信息
 * 
 * @author sunyue
 * @email sunyue@gmail.com
 * @date 2023-07-31 23:36:59
 */
@Mapper
public interface WareInfoDao extends BaseMapper<WareInfoEntity> {
	
}
