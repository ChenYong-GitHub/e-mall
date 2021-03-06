package com.alibaba_tencent.admin_web.ums.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba_tencent.emall.to.CommonResult;
import com.alibaba_tencent.emall.ums.entity.MemberLevel;
import com.alibaba_tencent.emall.ums.service.MemberLevelService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@CrossOrigin
@RestController
public class UmsMemberLevelController {


    @Reference
    MemberLevelService memberLevelService;
    /**
     * 查出所有会员等级
     * @return
     */
    @GetMapping("/memberLevel/list")
    public CommonResult memberLevelList(){
        List<MemberLevel> list = memberLevelService.list();
        return new CommonResult().success(list);
    }
}
