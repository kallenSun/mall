package com.sunyue.study.member.dao;

import com.sunyue.study.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author sunyue
 * @email sunyue@gmail.com
 * @date 2023-07-31 21:40:27
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
