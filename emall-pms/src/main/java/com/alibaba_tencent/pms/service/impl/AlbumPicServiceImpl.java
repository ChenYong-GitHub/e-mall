package com.alibaba_tencent.pms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba_tencent.emall.pms.entity.AlbumPic;
import com.alibaba_tencent.pms.mapper.AlbumPicMapper;
import com.alibaba_tencent.emall.pms.service.AlbumPicService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 画册图片表 服务实现类
 * </p>
 *
 * @author ChenYong
 * @since 2020-01-06
 */
@Component
@Service
public class AlbumPicServiceImpl extends ServiceImpl<AlbumPicMapper, AlbumPic> implements AlbumPicService {

}
