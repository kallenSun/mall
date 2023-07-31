package com.sunyue.study.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sunyue.study.common.utils.PageUtils;
import com.sunyue.study.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author sunyue
 * @email sunyue@gmail.com
 * @date 2023-07-31 21:40:27
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

