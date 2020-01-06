package com.alibaba_tencent.ums.service.impl;

import com.alibaba_tencent.emall.ums.entity.Member;
import com.alibaba_tencent.emall.ums.mapper.MemberMapper;
import com.alibaba_tencent.emall.ums.service.MemberService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 会员表 服务实现类
 * </p>
 *
 * @author ChenYong
 * @since 2020-01-06
 */
@Service
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member> implements MemberService {

}
