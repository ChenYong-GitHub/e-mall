package com.alibaba_tencent.emall.pms;

import com.alibaba_tencent.emall.pms.entity.Product;
import com.alibaba_tencent.emall.pms.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @ClassName: EmallPmsApplicationTests
 * @Desc:
 * @Author: ChenYong
 * @Date: 2020-01-06 17:19
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class EmallPmsApplicationTests {

    @Resource
    private ProductService productService;

    @Test
    public void contextLoads() {
        Product byId = productService.getById(1);
        System.out.println(byId.getName());
    }
}
